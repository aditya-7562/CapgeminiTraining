/**
 * Q1. Write a Java program to create a class called Person with private
 * instance variables name, age. and country. Provide public getter and setter
 * methods to access and modify these variables.
 * ------------------------------------------------------------------------------------------
 */



public class Person {

    public static void main(String[] args) {
        person p1 = new person();
        p1.setName("Aditya");
        p1.setAge(24);
        p1.setCountry("India");
        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
        System.out.println("Country: " + p1.getCountry());
    }
}


class person {

    private String name;
    private int age;
    private String country;

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}