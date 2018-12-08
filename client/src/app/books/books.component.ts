import { Component, OnInit } from '@angular/core';
import {BOOKS} from "../mock-books";
import {Book} from "../book";
import {BookService} from "../book.service";

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit {

  constructor(private bookService: BookService) { }

  ngOnInit() {
    this.getBooks();
  }

  // book: Book= {
  //   id:'',
  //   name:'',
  //   edition:'',
  //   author:''
  // };
  // books = BOOKS;
  books:Book[];
  selectedBook: Book;

  // onSelect(book: Book): void {
  //   this.selectedBook = book;
  // }

  getBooks(): void {
    this.bookService.getBooks().subscribe(books => this.books = books);
  }

  add(name: string, author: string, edition: string): void {
    name = name.trim();
    author = author.trim();
    edition = edition.trim();
    if (!name)
      return;
    if (!author)
      return;
    if (!edition)
      return;
    this.bookService.addBook({name, author, edition} as Book).subscribe(book => this.books.push(book));
  }

  delete(book: Book): void {
    this.books = this.books.filter(b => b != book);
    this.bookService.deleteBook(book).subscribe();
  }
}
