package oop_basic.basic01_feedback;

import java.time.LocalDateTime;

public class Loan {

    private final User user;
    private final Book book;
    private final LocalDateTime startTime;
    private final LocalDateTime endTime;

    public Loan(User user, Book book, LocalDateTime startTime) {
        this.user = user;
        this.book = book;
        this.startTime = startTime;
        this.endTime = startTime.plusDays(5);
    }

    public boolean isOverdue() {
        return LocalDateTime.now().isAfter(endTime);
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "user=" + user +
                ", book=" + book +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
