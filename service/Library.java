package service;

import java.util.ArrayList;
import model.Book;
import model.Member;
import util.Constants;

public class Library {

private ArrayList books = new ArrayList<>();
private ArrayList members = new ArrayList<>();

private int bookCount = Constants.START_BOOK_ID;
private int memberCount = Constants.START_MEMBER_ID;

public void addBook(String title, String author, int copies) {
String id = "B" + bookCount;
bookCount++;

books.add(new Book(id, title, author, copies));
System.out.println("Book added with ID: " + id);
}

public void showBooks() {
if (books.isEmpty()) {
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
if (members.isEmpty()) {
System.out.println("No members found.");
return;
}

System.out.println("\nList of Members:");
for (Member end : members) {
System.out.println(end);
}
}

public void issueBook(String bookId, String memberId) {
Book book = findBook(bookId);
Member member = findMember(memberId);

if (book == null) {
System.out.println("Book not found.");
return;
}
if (member == null) {
System.out.println("Member not found.");
return;
}
if (book.available <= 0) {
System.out.println("Book is not available right now.");
return;
}
if (member.booksIssued >= Constants.MAX_BOOKS_PER_MEMBER) {
System.out.println("Member has already issued the maximum allowed books.");
return;
}

book.available--;
member.booksIssued++;
System.out.println("Book issued to " + member.name);
}

public void returnBook(String bookId, String memberId) {
Book book = findBook(bookId);
Member member = findMember(memberId);

if (book == null || member == null) {
System.out.println("Invalid book ID or member ID.");
return;
}

book.available++;
member.booksIssued--;
System.out.println("Book returned.");
}

private Book findBook(String bookId) {
for (Book b : books) {
if (b.id.equalsIgnoreCase(bookId)) {
return b;
}
}
return null;
}

private Member findMember(String memberId) {
for (Member end : members) {
if (end.id.equalsIgnoreCase(memberId)) {
return end;
}
}
return null;
}
}
