# Library Management System

A simple console based Library Management System made as a part of the VITyarthi "Build your own project" evaluation.
## About

This project is a console based application to manage the everyday operations of a small library including cataloging of the books, registration of members and issuing and returning of the books. Its written in a modular fashion following a layered architecture (model / service / util). It follows a menu driven pattern where the user can perform multiple operations till he/she decides to exit.

## Features

- Add / View Books: The books can be added to the library with their respective authors and number of copies. The books also get assigned a unique Book ID. The user can view all the books present in the library with their availability.
- Add / View Members: The members can be added to the library with their respective courses. They are also assigned a unique Member ID. The user can view all the members present in the library along with the number of books that the member currently has issued.
- Issue Book: This feature allows the user to issue a book to a member. The following validations are present:

1. Valid Book ID
2. Valid Member ID

3. Availability of the book (number of copies > 0)

4. The member should not have issued 3 books already (a member can only hold 3 books at a time)
- Return Book: This feature allows the user to return a book which has been issued to a member.
- The application has a menu driven console interface which allows the user to repeat operations until they decide to exit.
## Technologies / Tools
- Java
- Git and GitHub
## Project Structure
```
Library-Management-System/
├── Main.java       # Main class for the application
├── model/
│  ├── Book.java     # Book class
│  └── Member.java    # Member class
├── service/
│  └── Library.java    # Library class
├── util/
│  └── Constants.java   # Constants class
├── diagrams/       # UML and other diagrams for the project report
├── statement.md      # Problem statement, scope, target users, features
└── README.md
```
## Installation
1. Clone this repository
git clone https://github.com/aniruddhamajumdar07-ux/Library-Management-System.git
cd Library-Management-System
2. Compile the code
javac -d out Main.java model/Book.java model/Member.java service/Library.java util/Constants.java
3. Run the application
java -cp out Main
4. Follow the on-screen instructions to perform any of the following functions:
- Add a book
- Add a member
- Issue a book
- Return a book
- Exit
The application comes with two pre-seeded books and two members which can be used to perform the Issue Book and Return Book operations.
## Testing
Since this is a simple console application, we can test it by manually performing the steps mentioned below:
1. Launch the application as mentioned in the Installation section
2. Use option 1 to add a new book and verify if it shows up when using option 2 to view all books
3. Use option 3 to add a new member and verify if it shows up when using option 4 to view all members
4. Use option 5 to issue a book to a member and verify:
- The book's availability reduces by 1 when successfully issued
- The member's issued books increases by 1 when successfully issued
- An error message is shown when attempting to issue a book with an invalid book ID
- An error message is shown when attempting to issue a book with an invalid member ID
- An error message is shown when attempting to issue a 4th book to a member who already has 3 books issued
5. Use option 6 to return a book to a member and verify:
- The book's availability increases by 1 when successfully returned
- The member's issued books decreases by 1 when successfully returned
6. Use option 7 to exit the application and verify that it prints an exit message and closes

## Screenshots

Add screenshots of the application here before submitting.

## Author

Aniruddha Majumdar
