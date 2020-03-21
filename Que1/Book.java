package Que1;

public class Book implements Issue {
    private int id;
    private String Bookname;

    public Book(int id, String bookname) {
        this.id = id;
        Bookname = bookname;
    }

    public int getId() {
        return id;
    }

    public String getBookname() {
        return Bookname;
    }

    @Override
    public void issue() {
        System.out.println(this.id+ " is issued and cannot be further Issued");

    }
}
