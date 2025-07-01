package oop_basic.basic01;

public class Book {

    private long bookId;
    private String title;
    private boolean isAvailable;


    public Book(long bookId, String title, Boolean isAvailable){
        this.bookId = bookId;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
