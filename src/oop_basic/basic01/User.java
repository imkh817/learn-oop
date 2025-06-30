package oop_basic.basic01;

import java.util.Optional;

public class User {

    public Book borrowBook(String name, Library library){
        return library.lendBookTo(this, name);
    }

    public Book choiceBook(String name, Library library){
        return library.getBook(name);
    }
}
