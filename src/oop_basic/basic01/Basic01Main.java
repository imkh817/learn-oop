package oop_basic.basic01;

public class Basic01Main {
    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        Library library = new Library(new LoanRepository());
        librarian.registerBook(new Book(1,"객체 지향의 사실과 오해", true), library);
        librarian.registerBook(new Book(2,"오브젝트", true), library);
        library.printAllBooks();

        User user = new User();
        //Book choiceBook = user.choiceBook("객체 지향의 사실과 오해", library);
        Book borrowBook = user.borrowBook("오브젝트", library);

    }
}
