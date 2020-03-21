package Que1;

public class Student implements Issue{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public void issue() {
        System.out.println(this.id+ " "+this.name + " has issued a book and cannot issue further" );

    }
}