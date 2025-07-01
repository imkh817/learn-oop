package oop_basic.basic01_feedback;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class LoanRepository implements Repository<Loan>{

    private final Map<Long, Loan> loanRepository = new HashMap<>();
    private long sequence = 0;

    @Override
    public void save(Loan loan) {
        loanRepository.put(sequence, loan);
        sequence ++;
    }

    @Override
    public Optional<Loan> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Loan> findAll() {
        return List.of();
    }


    public Optional<Loan> getLoanByBook(Book book){
        return loanRepository.values().stream()
                .filter(b -> b.getBook().getBookId().equals(book.getBookId()))
                .findFirst();
    }

    public void printAll(){
        loanRepository.entrySet().forEach(System.out::println);
    }


}
