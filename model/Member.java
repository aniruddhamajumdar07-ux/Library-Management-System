package model;

public class Member {
public String id;
public String name;
public String course;
public int booksIssued;
//member model lol....
public Member(String id, String name, String course) {
this.id = id;
this.name = name;
this.course = course;
this.booksIssued = 0;
}

public String toString() {
return id + " | " + name + " | " + course + " | Books Issued: " + booksIssued;
}
}
