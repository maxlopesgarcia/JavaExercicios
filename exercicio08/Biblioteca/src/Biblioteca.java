public class Biblioteca {
    public static void main(String[] args) throws Exception {
        Livro livro = new Livro("Robbit", 1995, "max", 10);
        Dvd dvd = new Dvd("musica", 1998, "danca", 10);
        System.out.println(livro);
        System.out.println(dvd);
    }
}
