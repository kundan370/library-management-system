import { Component, OnInit, Input } from '@angular/core';
import {Book} from "../book";
import {ActivatedRoute} from "@angular/router";
import {BookService} from "../book.service";
import {Location} from "@angular/common";
import {IssueService} from "../issue.service";
import {Issue} from "../issue";
import {IssuerService} from "../issuer.service";
import {Issuer} from "../issuer";

@Component({
  selector: 'app-book-detail',
  templateUrl: './book-detail.component.html',
  styleUrls: ['./book-detail.component.css']
})
export class BookDetailComponent implements OnInit {

  constructor(
    private route: ActivatedRoute,
    private bookService: BookService,
    private issueService: IssueService,
    private issuerService: IssuerService,
    private location: Location
  ) { }

  ngOnInit() {
    this.getBook();
  }

  @Input() book: Book;
  issuer: Issuer;

  getBook(): void {
    const id = this.route.snapshot.paramMap.get('id');
    this.bookService.getBook(id).subscribe(book => this.book = book);
  }

  goBack(): void {
    this.location.back();
  }

  goToIssue(): void {
    this.location.go('issue');
  }

  save(): void {
    this.bookService.updateBook(this.book).subscribe(() => this.goBack());
  }

  issue(): void {
    while (this.issuer == undefined) {
      console.log("attempting");
      this.issuerService.getIssuerByName('kundan kumar').subscribe(issuer => this.issuer = issuer);
    }
    let bookId = this.book.id;
    let issuerId = this.issuer.id;
    console.log({bookId, issuerId} as Issue)
    // this.issueService.addIssue({bookId, issuerId} as Issue).subscribe(() => this.goToIssue());
  }

}
