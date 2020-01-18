package edu.yuliia;

public class Main {
    public static void main(String[] args) {
        Student yuliia = new Student("Yuliia", "Lysak");

        String s = yuliia.toString();
        yuliia.firstName = "Julia";
        yuliia.changeLastName("Roberts");
        yuliia.age = 27;

        System.out.println(s);
        System.out.println(yuliia.toString());
        System.out.println(yuliia);
    }

}
