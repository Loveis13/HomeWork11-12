import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int puplicationYear;

    public Book(String title, Author author, int puplicationYear) {
        this.title = title;
        this.author = author;
        this.puplicationYear = puplicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPuplicationYear() {
        return puplicationYear;
    }

    public void setPuplicationYear(int year) {
        this.puplicationYear = year;
    }

    public String toString() {
        return " Книга " + this.title + " опубликовано " + this.puplicationYear + " Автор " + this.author.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return puplicationYear == book.puplicationYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, puplicationYear);
    }
}
