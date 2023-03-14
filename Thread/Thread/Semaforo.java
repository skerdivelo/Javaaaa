package Thread;

public class Semaforo {
    int valore;
    CodaProcessi coda = new CodaProcessi();
    
    public Semaforo(int valore) {
        this.valore = valore;
    }

    public synchronized void P() {
        valore--;
        if (valore < 0) {
            coda.inserisci((int) Thread.currentThread().getId());
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void V() {
        valore++;
        if (valore <= 0) {
            notify();
        }
    }

    public synchronized void V(int n) {
        valore += n;
        if (valore <= 0) {
            notify();
        }
    }

    public synchronized void P(int n) {
        valore -= n;
        if (valore < 0) {
            coda.inserisci((int) Thread.currentThread().getId());
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
