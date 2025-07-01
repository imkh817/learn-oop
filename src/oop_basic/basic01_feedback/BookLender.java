package oop_basic.basic01_feedback;

/**
 * 책을 대출해주는 책임
 */
public interface BookLender {
    Book borrow(User user, String name);
}
