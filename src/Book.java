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


}
