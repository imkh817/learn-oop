package oop_basic.basic01;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class LoanRepository {

    private final Map<Long, Loan> loanRepository = new HashMap<>();

    public void saveLoan(Book book, Loan loan){
        loanRepository.put(book.getBookId(), loan);
    }

    public Loan findLoan(Long bookId){
        return Optional.of(loanRepository.get(bookId))
                .orElseThrow(() -> new IllegalArgumentException("해당 책의 대출 정보가 없습니다."));
    }
}
