package Albero;
/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Albero a = new Albero();
        a.aggiungiFiglio('a', 'a');
        //a.visitaAnticipata();

        a.aggiungiFiglio('a', 'b');
        //a.visitaAnticipata();
        a.aggiungiFiglio('a', 'c');
        //a.visitaAnticipata();
        a.aggiungiFiglio('a', 'd');
        //a.visitaAnticipata();

        a.aggiungiFiglio('b', 'e');
        a.aggiungiFiglio('b', 'f');
        a.aggiungiFiglio('b', 'g');

        a.aggiungiFiglio('c', 'h');
        a.aggiungiFiglio('c', 'i');

        a.aggiungiFiglio('d', 'l');

        a.visitaAnticipata();

    }
    
}
