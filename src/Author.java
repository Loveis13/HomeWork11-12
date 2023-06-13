import java.util.Objects;

public class Author {
    private String name;
    private String lastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return "Автор " + name + " " + this.lastName;
    }

    public boolean equals(Author author) {
        return this.name.equals(author.name) && this.lastName.equals(author.lastName);
    }
}
