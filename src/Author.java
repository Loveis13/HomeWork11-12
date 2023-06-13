import java.util.Objects;

public class Author {
    private String name;
    private String LastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.LastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return LastName;
    }

    public String toString() {
        return " Автор " + name + " " + this.LastName;
    }
//    public boolean equals(Author author) {
//        return this.name.equals(author.name) && this.LastName.equals(author.LastName);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(LastName, author.LastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, LastName);
    }
}
