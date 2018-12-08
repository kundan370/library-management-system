import {Feedback} from "./feedback";

export class Issue {
  id: string;
  bookId: string;
  issuerId: string;
  dateOfRequestGenerated: string;
  dateOfIssue: string;
  expectedDateOfReturn: string;
  dateOfReturn: string;
  penalty: number;
  issuedBy: string;
  approved: boolean;
  feedback: Feedback;
}
