package server.model;

public class Person {


    private String firstName;
    private String lastname;
    private int age;

    public Person() {}

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastname = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return String.format("Name: %s %s - age: %d", firstName, lastname, age);
    }

}
