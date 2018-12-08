import { Component, OnInit } from '@angular/core';
import {Issue} from "../issue";
import {IssueService} from "../issue.service";

@Component({
  selector: 'app-issue',
  templateUrl: './issue.component.html',
  styleUrls: ['./issue.component.css']
})
export class IssueComponent implements OnInit {

  constructor(private issueService: IssueService) { }

  ngOnInit() {
    this.getIssues();
  }

  issues: Issue[];

  getIssues(): void {
    this.issueService.getIssues().subscribe(issues => this.issues = issues);
  }

}
