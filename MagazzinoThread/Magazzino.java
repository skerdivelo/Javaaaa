package MagazzinoThread;

public class Magazzino {
    private static int prodotto;
    private static int quantita = 5;

    public Magazzino() {
        prodotto = 100;
    }

    public synchronized int preleva(int quantita) {
        //può prelevare da 0 a 5
        if (quantita > 0 && quantita <= 5) {
            if (prodotto >= quantita) {
                prodotto -= quantita;
                return prodotto;
            } else {
                return -1;
            }
        } else {
            return -2;
        }
    }
    @Override
    public String toString() {
        return "Magazzino{" + "prodotti=" + prodotto + '}';
    }

    public int getProdotto() {
        return prodotto;
    }
}
