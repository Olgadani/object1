public class Main {

    public static void main(String[] args) {

        Book segun = new Book("Segun", 2007);
        segun.name = "Segun";
        segun.publishYear = 2007;
        segun.author = new Author("James", "Klawel");
        System.out.println("Книга: " + segun.getName() + " " + segun.getPublishYear() + " " + segun.author.getAuthorName() + " " + segun.author.getAuthorSurname());
        segun.setPublishYear(2009);
        System.out.println("segun.getPublishYear() = " + segun.getPublishYear());

        Book chonicsOfAmber = new Book("Chronics of Amber", 2010);
        chonicsOfAmber.name = "Chronics of Amber";
        chonicsOfAmber.publishYear = 2010;
        chonicsOfAmber.author = new Author("Rodjer", "Zhelyazni");
        System.out.println("Книга: " + chonicsOfAmber.getName() + " " + chonicsOfAmber.getPublishYear() + " " + chonicsOfAmber.author.getAuthorName() + " " + chonicsOfAmber.author.getAuthorSurname());

    }
}