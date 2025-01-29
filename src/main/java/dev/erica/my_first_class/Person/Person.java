package dev.erica.my_first_class.Person;

public class Person {
    public String name;
    public String surname;
    public int age;
    public int numID;

    // Constructor
    public Person(String name, String surname, int age, int numID) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.numID = numID;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumID() {
        return numID;
    }

    public void setNumID(int numID) {
        this.numID = numID;
    }
}
