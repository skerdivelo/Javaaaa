package Thread;

public class NegozioDelBarbiere {
    static int numClienti;
    static Semaforo cliente = new Semaforo(0);
    static Semaforo barbiere = new Semaforo(1);
    static Semaforo mutex = new Semaforo(1);
    static final int MAX_CLIENTI = 5;

    public static void main(String[] args) {
        numClienti = 0;
        barbiere();
        cliente(); cliente(); cliente(); cliente(); cliente(); cliente(); cliente();
    }

    private static void cliente() {
        new Thread(() -> {
            mutex.P();
            if (numClienti < MAX_CLIENTI) {
                numClienti++;
                System.out.println("Il cliente entra nel negozio");
                cliente.V();
                mutex.V();
                barbiere.P();
                System.out.println("Il cliente esce dal negozio");
            } else {
                System.out.println("Il cliente esce dal negozio");
                mutex.V();
            }
        }).start();
    }

    private static void barbiere() {
        new Thread(() -> {
            while (true) {
                cliente.P();
                mutex.P();
                numClienti--;
                System.out.println("Il barbiere taglia i capelli al cliente");
                mutex.V();
                barbiere.V();
            }
        }).start();
    }
}