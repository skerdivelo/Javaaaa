package MagazzinoThread;

public class ThreadClass implements Runnable{
    private Magazzino magazzino;

    public ThreadClass(Magazzino magazzino, int quantita, boolean preleva) {
        this.magazzino = magazzino;
    }

    @Override
    //run, utente può solo prelevare da 0 a 5
    public void run() {
        int quantita = (int) (Math.random() * 5);
        int preleva = magazzino.preleva(quantita);
        if (preleva == -1) {
            System.out.println("Non ci sono abbastanza prodotti");
        } else if (preleva == -2) {
            System.out.println("Non puoi prelevare più di 5 prodotti");
        } else {
            System.out.println("Hai prelevato " + quantita + " prodotti");
        }
    }
}
