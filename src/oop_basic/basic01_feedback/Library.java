package oop_basic.basic01_feedback;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Library implements BookLender, BookLifecycleManager {

    private final Map<Long, Book> books = new HashMap<>();
    private final LoanRepository loanRepository;

    public Library(LoanRepository loanRepository){
        this.loanRepository = loanRepository;
    }

    @Override
    public Book borrow(User user, String name) {
        Book book = getBookByName(name);

        if(!isLoaned(book)){
            loanRepository.save(new Loan(user, book, LocalDateTime.now()));
            return book;
        }

        throw new RuntimeException("이미 해당 책은 대출되었습니다.");
    }

    @Override
    public void register(Book book) {
        books.put(book.getBookId(), book);
    }

    @Override
    public int deleteByBookId(Long bookId) {
        if(books.containsKey(bookId)){
            books.remove(bookId);
            return 1;
        }

        return 0;
    }


    private Book getBookByName(String name){
        return books.values().stream()
                .filter(b -> b.getTitle().equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당 제목의 책이 없습니다."));
    }

    private boolean isLoaned(Book book){
        Optional<Loan> loanByBook = loanRepository.getLoanByBook(book);
        return loanByBook.isEmpty();
    }

    public void printAllLoan(){
        System.out.println("===== 도서관 대출 현황 =====");
        loanRepository.printAll();
    }

    public void printAllBooks(){
        System.out.println("===== 도서관 책 목록 =====");
        books.entrySet().forEach(System.out::println);
    }
}
