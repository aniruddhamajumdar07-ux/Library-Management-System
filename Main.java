import java.util.Scanner;
import service.Library;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Library lib = new Library();

lib.addBook("Java The Complete Reference", "Herbert Schildt", 5);
lib.addBook("Clean Code", "Robert C. Martin", 3);
lib.addMember("Rahul Sharma", "B.Tech CSE");
lib.addMember("Priya Patel", "B.Tech IT");

while (true) {
System.out.println("\n===== LIBRARY MANAGEMENT =====");
System.out.println("1. Add Book");
System.out.println("2. Show Books");
System.out.println("3. Add Member");
System.out.println("4. Show Members");
System.out.println("5. Issue Book");
System.out.println("6. Return Book");
System.out.println("7. Exit");
System.out.print("Enter choice: ");

int choice = sc.nextInt();
sc.nextLine();

if (choice == 1) {
System.out.print("Enter title: ");
String title = sc.nextLine();
System.out.print("Enter author: ");
String author = sc.nextLine();
System.out.print("Enter copies: ");
int copies = sc.nextInt();
sc.nextLine();
lib.addBook(title, author, copies);
}
else if (choice == 2) {
lib.showBooks();
}
else if (choice == 3) {
System.out.print("Enter name: ");
String name = sc.nextLine();
System.out.print("Enter course: ");
String course = sc.nextLine();
lib.addMember(name, course);
}
else if (choice == 4) {
lib.showMembers();
}
else if (choice == 5) {
System.out.print("Enter Book ID: ");
String bid = sc.nextLine();
System.out.print("Enter Member ID: ");
String mid = sc.nextLine();
lib.issueBook(bid, mid);
}
else if (choice == 6) {
System.out.print("Enter Book ID: ");
String bid = sc.nextLine();
System.out.print("Enter Member ID: ");
String mid = sc.nextLine();
lib.returnBook(bid, mid);
}
else if (choice == 7) {
System.out.println("Exiting...");
break;
}
else {
System.out.println("Invalid choice.");
}
}

sc.close();
}
}
