package Que1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Book b1= new Book(100,"name1");
        Book b2= new Book(101,"name2");
        Book b3= new Book(102,"name3");
        Student s1= new Student(501,"Anil");
        Student s2= new Student(502,"SUnil");
        Student s3= new Student(503,"AKhil");
        b1.issue();
        s1.issue();
        b2.getBookname();
        s2.issue();
    }
}