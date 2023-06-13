public class Main {

    public static void main(String[] args) {
        Author tolstoy = new Author("lev", "Tolstoy");
        Book warAndPeace = new Book(" War and Peace ", tolstoy, 1859);
        System.out.println(tolstoy.toString());
        System.out.println(warAndPeace.toString());
        System.out.println("Книга:" + warAndPeace.getTitle() + ", опубликована " + warAndPeace.getPuplicationYear() +
                ". Автор книги: " + warAndPeace.getAuthor().getName() + " " + warAndPeace.getAuthor().getLastName());


    }
}