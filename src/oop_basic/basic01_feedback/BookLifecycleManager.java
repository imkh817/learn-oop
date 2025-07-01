package oop_basic.basic01_feedback;

/**
 * 책의 생명주기를 관리하는 책임
 */
public interface BookLifecycleManager {

    void register(Book book);

    int deleteByBookId(Long bookId);
}
