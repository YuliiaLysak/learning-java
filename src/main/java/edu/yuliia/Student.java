package edu.yuliia;

public class Student {
    public String firstName;
    private String lastName;
    protected int age;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void changeLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + age + " years old.";
    }
}
