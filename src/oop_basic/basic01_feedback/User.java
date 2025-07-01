package oop_basic.basic01_feedback;

public class User {

    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void borrowBook(String name, Library library){
        library.borrow(this, name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
