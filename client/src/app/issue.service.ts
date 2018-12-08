import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {MessagesService} from "./messages.service";
import {Observable, of} from "rxjs";
import {Issue} from "./issue";
import {catchError, tap} from "rxjs/operators";
import {Feedback} from "./feedback";
import {Issuer} from "./issuer";

@Injectable({
  providedIn: 'root'
})
export class IssueService {

  constructor(
    private httpClient: HttpClient,
    private messageService: MessagesService
  ) { }

  private issueUrl = 'api/issue';

  httpOptions = {
    headers: new HttpHeaders({'Content-Type': 'application/json'})
  };

  getIssues(): Observable<Issue[]> {
    const url = `${this.issueUrl}/all`;
    this.messageService.add('IssueService: fetching all issues');
    return this.httpClient.get<Issue[]>(url).pipe(
      tap(_ => this.log('fetched all issues')),
      catchError(this.handleError('getIssues', []))
    );
  }

  getIssue(id: string): Observable<Issue> {
    const url = `${this.issueUrl}/${id}`;
    this.messageService.add(`IssueService: fetching issue id=${id}`);
    return this.httpClient.get<Issue>(url).pipe(
      tap(_ => this.log(`fetched issue id=${id}`)),
      catchError(this.handleError<Issue>(`getIssue id=${id}`))
    );
  }

  returnIssue(issue: Issue, feedback: Feedback): Observable<any> {
    const url = `${this.issueUrl}/return/${issue.id}`;
    this.messageService.add(`IssueService: returning book w/ issue id=${issue.id}`);
    return this.httpClient.put(url, feedback, this.httpOptions).pipe(
      tap(_ => this.log(`returned book w/ issue id=${issue.id}`)),
      catchError(this.handleError<Issue>('returnBook'))
    );
  }

  approveIssue(issue: Issue, issuer: Issuer): Observable<any> {
    const url = `${this.issueUrl}/approve/${issuer.id}`;
    this.messageService.add(`IssueService: approving book issue id=${issue.id}`);
    return this.httpClient.put(url, issue, this.httpOptions).pipe(
      tap(_ => this.log(`approved issue w/ id=${issue.id}`)),
      catchError(this.handleError<Issue>('approveBook'))
    );
  }

  addIssue(issue: Issue): Observable<any> {
    this.messageService.add(`IssueService: adding new issue for book id = ${issue.bookId}`);
    return this.httpClient.post(this.issueUrl, issue, this.httpOptions).pipe(
      tap((issue: Issue) => this.log(`added issue w/ id=${issue.id}`)),
      catchError(this.handleError<Issue>('addIssue'))
    );
  }


  public log(message: string) {
    this.messageService.add(`IssueService: ${message}`);
  }

  /**
   * Handle Http operation that failed.
   * Let the app continue.
   * @param operation - name of the operation that failed
   * @param result - optional value to return as the observable result
   */
  public handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      console.log(error); // log the error to console

      this.log(`${operation} failed: ${error.message}`); // transform error message to user readable

      return of(result as T); // app keeps running by returning empty result
    }
  }

}
