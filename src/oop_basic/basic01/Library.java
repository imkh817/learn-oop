package oop_basic.basic01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {

    List<Book> books = new ArrayList<>();
    private final LoanRepository loanRepository;

    public Library(LoanRepository loanRepository){
        this.loanRepository = loanRepository;
    }

    public Book lendBookTo(User user, String name){
        Book book = getBook(name);
        if(!book.isAvailable()){
            throw new IllegalArgumentException("대출 불가능한 책입니다.");
        }

        book.setAvailable(false);
        Loan loan = new Loan(user, book ,LocalDateTime.now());
        loanRepository.saveLoan(book,loan);
        return book;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void printAllBooks(){
        books.forEach(System.out::println);
    }


    public Book getBook(String name) {
        return books.stream()
                .filter(book -> name.equals(book.getTitle()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당 제목의 책은 없습니다."));
    }
}
