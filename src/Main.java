public class Main {

    public static void main(String[] args) {
        Author jamesKlawel = new Author("James", "Klawel");
        Author rodgerZhelyazni = new Author("Rodjer", "Zhelyazni");

        Book segun = new Book("Segun", jamesKlawel, 2007);
        segun.publishYear = 2007;
        System.out.println(segun);
        segun.setPublishYear(2009);
        System.out.println("segun.getPublishYear() = " + segun.getPublishYear());

        Book chonicsOfAmber = new Book("Chronics of Amber", rodgerZhelyazni, 2010);
        chonicsOfAmber.publishYear = 2010;
        System.out.println(chonicsOfAmber);

    }
}