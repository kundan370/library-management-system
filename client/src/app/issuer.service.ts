import { Injectable } from '@angular/core';
import {MessagesService} from "./messages.service";
import {HttpClient} from "@angular/common/http";
import {Observable, of} from "rxjs";
import {catchError, tap} from "rxjs/operators";
import {Issuer} from "./issuer";

@Injectable({
  providedIn: 'root'
})
export class IssuerService {

  constructor(
    private httpClient: HttpClient,
    private messageService: MessagesService
  ) { }

  private issuerUrl = 'api/issuer';
  public issuer: Issuer;

  getIssuers(): Observable<Issuer[]> {
    const url = `${this.issuerUrl}/all`;
    this.messageService.add('IssuerService: fetching all issuers');
    return this.httpClient.get<Issuer[]>(url).pipe(
      tap(_ => this.log('fetched all issuers')),
      catchError(this.handleError('getIssuers', []))
    );
  }

  getIssuerByName(name: string): Observable<Issuer> {
    const url = `${this.issuerUrl}?name=${name}`;
    this.messageService.add(`IssuerService: fetching issuer w/ name=${name}`);
    return this.httpClient.get<Issuer>(url).pipe(
      tap((issuer: Issuer) => this.log(`fetched ${issuer.name}`)),
      catchError(this.handleError<Issuer>(`getIssuer name=${name}`))
    );
  }

  public log(message: string) {
    this.messageService.add(`IssuerService: ${message}`);
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
