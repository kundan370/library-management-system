import { Component, OnInit } from '@angular/core';
import {Observable, Subject} from "rxjs";
import {BookService} from "../book.service";
import {debounceTime, distinctUntilChanged, switchMap} from "rxjs/operators";
import {Book} from "../book";

@Component({
  selector: 'app-book-search',
  templateUrl: './book-search.component.html',
  styleUrls: ['./book-search.component.css']
})
export class BookSearchComponent implements OnInit {

  constructor(private bookService: BookService) { }

  books$: Observable<Book[]>;
  private searchTerms = new Subject<string>();

  search(term: string): void {
    this.searchTerms.next(term);
  }

  ngOnInit(): void {
    this.books$ = this.searchTerms.pipe(

      // wait 300ms after each keystroke before considering the term
      debounceTime(300),

      // ignore new term if same as previous term
      distinctUntilChanged(),

      // switch to new search observable each time the term changes
      switchMap((term: string) => this.bookService.searchBook(term))
    )
  }

}
