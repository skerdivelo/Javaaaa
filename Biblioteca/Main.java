public class Main {
    public static void main(String[] args) {
        Biblioteca a = new Biblioteca();
        Libro l = new Libro("Ciao", "skerdi", 234, "editore");
        a.aggiungiLibro(l);
        Libro trovato = new Libro(a.cercaLibro("Cia"));
        System.out.println(trovato.toString());
        a.cercaAuore("skerdi");
    }
}
