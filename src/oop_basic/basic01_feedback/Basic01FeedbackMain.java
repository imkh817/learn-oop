package oop_basic.basic01_feedback;

public class Basic01FeedbackMain {
    public static void main(String[] args) {
        Library library = new Library(new LoanRepository());
        library.register(new Book(1L, "객체 지향의 사실과 오해", "조영호"));
        library.register(new Book(2L, "오브젝트", "조영호"));
        library.register(new Book(3L, "자바의 정석", "남궁석"));

        User user = new User("조건희", 28);
        user.borrowBook("오브젝트", library);
        user.borrowBook("자바의 정석", library);

        library.deleteByBookId(2L);
        library.printAllLoan();

        library.printAllBooks();
    }
}
