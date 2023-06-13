public class Main {

    public static void main(String[] args) {
        Author tolstoy = new Author("lev", "Tolstoy");
        Book warAndPeace = new Book(" War and Peace ", tolstoy, 1859);
        System.out.println(tolstoy.toString());
        System.out.println(warAndPeace.toString());

        warAndPeace.setPuplicationYear(1859);
        System.out.println(warAndPeace.getPuplicationYear());
        Author author = new Author("lev", "Tolstoy");
        Book book = new Book(" War and Peace ", tolstoy, 1859);
        System.out.println(warAndPeace.equals(book));


    }
}