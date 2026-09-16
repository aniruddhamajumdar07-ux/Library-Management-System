package model;
//book model lol...
public class Book {
public String id;
public String title;
public String author;
public int available;

public Book(String id, String title, String author, int available) {
this.id = id;
this.title = title;
this.author = author;
this.available = available;
}

public String toString() {
return id + " | " + title + " | " + author + " | Available: " + available;
}
}
