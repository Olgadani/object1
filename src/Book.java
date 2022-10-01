public class Book {
    String name;
    int publishYear;
    Author author;
    public Book (String name, int publishYear) {
        this.name = name;
        this.publishYear = publishYear;
    }

    public String getName() {
        return name;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        if (publishYear < 1900 || publishYear > 2030) {
            System.out.println("Invalid publishing year parametr" + publishYear);
            return;
        }
        this.publishYear = publishYear;
    }
}
