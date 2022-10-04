import java.util.Objects;

public class Book {
    private final String name;
    int publishYear;
    private final Author author;
    public Book (String name, Author author, int publishYear) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }



    public int getPublishYear() {
        return this.publishYear;
    }


    public void setPublishYear(int publishYear) {
        if (publishYear < 1900 || publishYear > 2030) {
            System.out.println("Invalid publishing year parametr" + publishYear);
            return;
        }
        this.publishYear = publishYear;
    }

    public String toString() {
        return "Книга: " + this.name + " Год издания: " + this.publishYear + " Автор: " + this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, publishYear, author);
    }
}
