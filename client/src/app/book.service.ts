import { Injectable } from '@angular/core';
import {Book} from "./book";
// import {BOOKS} from "./mock-books";
import {Observable, of} from "rxjs";
import {MessagesService} from "./messages.service";
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {catchError, tap} from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(
    private httpClient: HttpClient,
    private messagesService: MessagesService
  ) {}

  private booksUrl = 'api/books';
  httpOptions = {
    headers: new HttpHeaders({'Content-Type': 'application/json'})
  };

  getBooks(): Observable<Book[]> {
    const url = `${this.booksUrl}/all`;
    this.messagesService.add('BookService: fetching all books');
    // return of(BOOKS);
    return this.httpClient.get<Book[]>(url).pipe(
      tap(books=> this.log('fetched all books')),
      catchError(this.handleError('getBooks', []))
    );
  }

  getBook(id: string): Observable<Book> {
    const url = `${this.booksUrl}/${id}`;
    this.messagesService.add(`BookService: fetching book id=${id}`);
    return this.httpClient.get<Book>(url).pipe(
      tap(_ => this.log(`fetched book id=${id}`)),
      catchError(this.handleError<Book>(`getBook id=${id}`))
    );
  }

  updateBook(book: Book): Observable<any> {
    this.messagesService.add(`BookService: updating book id=${book.id}`);
    return this.httpClient.put(this.booksUrl, book, this.httpOptions).pipe(
      tap(_ => this.log(`updated book id=${book.id}`)),
      catchError(this.handleError<Book>(`updateBook id=${book.id}`))
    );
  }

  addBook(book: Book): Observable<any> {
    this.messagesService.add(`BookService: adding new book = ${book.name}`);
    return this.httpClient.post(this.booksUrl, book, this.httpOptions).pipe(
      tap((book: Book) => this.log(`added book id=${book.id}`)),
      catchError(this.handleError<Book>('addBook'))
    );
  }

  deleteBook(book: Book | string): Observable<any> {
    const id = typeof book === "string" ? book : book.id;
    const url = `${this.booksUrl}/${id}`;
    this.messagesService.add(`BookService: deleting book id=${id}`);
    return this.httpClient.delete(url, this.httpOptions).pipe(
      tap(_ => this.log(`deleted book id=${id}`)),
      catchError(this.handleError<Book>('deleteBook'))
    );
  }

  searchBook(term: string): Observable<Book[]> {
    if (!term.trim()) {
      return of([]);
    }
    this.messagesService.add(`BookService: searching books matching ${term}`);
    return this.httpClient.get<Book[]>(`${this.booksUrl}/?name=${term}`).pipe(
      tap(_ => this.log(`found books matching ${term}`)),
      catchError(this.handleError<Book[]>('searchBook', []))
    );
  }

  public log(message: string) {
    this.messagesService.add(`BookService: ${message}`);
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
