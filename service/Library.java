package library.service;

import java.util.ArrayList;
import library.model.Book;
import library.model.Member;
import library.util.Constants;

public class Library {
ArrayList books = new ArrayList<>();
ArrayList members = new ArrayList<>();
int bookCount = Constants.START_BOOK_ID;
int memberCount = Constants.START_MEMBER_ID;

public void addBook(String title, String author, int copies) {
String id = "B" + bookCount;
bookCount++;
books.add(new Book(id, title, author, copies));
System.out.println("Book added with ID: " + id);
}

public void showBooks() {
if (books.size() ==0) {
System.out.println("No books present.");
return;
}
System.out.println("\nList of Books:");
for (Book b : books) {
System.out.println(b);
}
}

public void addMember(String name, String course) {
String id = "M" + memberCount;
memberCount++;
members.add(new Member(id, name, course));
System.out.println("Member registered with ID: " + id);
}

public void showMembers() {
if (members.size() ==0) {
System.out.println("No members found.");
return;
}
System.out.println("\nList of Members:");
for (Member largest : members) {
System.out.println(largest);
}
}

public void issueBook(String bookId, String memberId) {
Book book = null;
Member member = null;

for (Book b : books) {
if (b.id.equalsIgnoreCase(bookId)) {
book = b;
break;
}
}

for (Member largest : members) {
if (largest.id.equalsIgnoreCase(memberId)) {
member = largest;
break;
}
}

if (book ==null) {
System.out.println("Book not found.");
return;
}
if (member ==null) {
System.out.println("Member not found.");
return;
}
if (book.available <= 0) {
System.out.println("Book is not available.");
return;
}
if (member.booksIssued >= Constants.MAX_BOOKS_PER_MEMBER) {
System.out.println("Member has already issued 3 books.");
return;
}

book.available--;
member.booksIssued++;
System.out.println("Book issued to " + member.name);
}

public void returnBook(String bookId, String memberId) {
Book book = null;
Member member = null;

for (Book b : books) {
if (b.id.equalsIgnoreCase(bookId)) {
book = b;
break;
}
}

for (Member largest : members) {
if (largest.id.equalsIgnoreCase(memberId)) {
member = largest;
break;
}
}

if (book ==null || member ==null) {
System.out.println("Invalid ID.");
return;
}

book.available++;
member.booksIssued--;
System.out.println("Book returned.");
}
}
