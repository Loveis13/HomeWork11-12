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

    public boolean equals(Object authors) {

        if (authors == null) {
            return false;
        }
        if (this == authors) {
            return true;
        }
        if (this.getClass() != authors.getClass()) {

            return false;
        }
        Author author = (Author) authors;
        return name.equals(author.getName()) && lastName.equals(author.getLastName());
    }

    public int hashCode() {
        return java.util.Objects.hash(name, lastName);
    }
}
