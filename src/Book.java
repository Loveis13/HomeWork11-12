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

    public boolean equals(Book book) {
        return this.title.equals(book.title) && this.author.equals(book.author) && this.puplicationYear == book.puplicationYear;

    }

}
