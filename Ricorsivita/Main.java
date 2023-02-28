package Ricorsivita;

public class Main {
    public static void main(String[] args) {
        Parola p = new Parola();
        p.aggiungiInTesta('a');
        p.aggiungiInTesta('b');
        p.aggiungiInTesta('c');
        p.aggiungiInTesta('d');
        p.queueRicorsiva(p.getHead());
    }
}
