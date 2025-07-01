package oop_basic.basic01;

import java.time.LocalDateTime;

public class Loan {

    private User user;
    private Book book;
    private LocalDateTime startTime; // 대출 시작일
    private LocalDateTime endTime; // 대출 종료일
    private boolean isOverdue; // 연체 여부

    public Loan(User user,Book book, LocalDateTime startTime){
        this.user = user;
        this.book = book;
        this.startTime = startTime;
        this.endTime = startTime.plusDays(5);
    }

    public boolean isOverdue(){
        return LocalDateTime.now().isAfter(endTime);
    }


}
