# Problem Statement

Paper Registers are used to keep tract of the books borrowed by people and the book borrowing and returning process. This method is a bit time-consuming and error-inducing, as it becomes hard to keep tract of which books are available and which ones have been borrowed by whom. The problem statement of this project is to devise a solution to the above-mentioned issues by developing a console based application that can automate the process of borrowing and returning books.

## Scope

The features that fall under the scope of this project are as follows:

- Addition of books with auto-generated Book ID
- Addition of members with auto-generated Member ID
- Lending of books to the members with checks for availability and member’s borrowing limit of 3 books at a time
- Return of the books with checks on availability and member’s count of books

The features that are not part of the scope of this project are as follows:

- Data persistence i.e. data is saved permanently (This is not required for this project as no data has to be stored permanently)
- User login and user password
- Calculation of fines for late return of books
- Visual or Web based interface (The project will be console based)

## Target Users

The target users for this project are the Librarian who will use this application for day-to-day management tasks such as adding books, adding members, and managing the borrowing and returning of books. The members will not be using the application directly, rather they will have to communicate with the librarian about the books they wish to borrow or return.

## Level 1 Features

- Book Management: Adding new books with titles, authors, and number of copies and viewing the list of books along with number of copies available.
- Member Management: Adding members with their name and course and viewing the list of members along with number of books borrowed.
- Lending of Book: Lend a book to a member with checks for a valid Book ID, valid Member ID, availability of Book and borrowing limit of 3 Books for a Member.
- Returning of Book: Return a Book with update in availability of Book and number of books for the Member.
- Menu Based System: A console based menu to perform any of the above-mentioned operations multiple times until the user decides to exit the application.
