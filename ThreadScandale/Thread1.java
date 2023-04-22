package ThreadScandale;

//thread1 con classe Thread

public class Thread1 {
    public static void main(String[] args) {
        Thread tic = Thread.currentThread();
        tic.setName("Thread in esecuzione");
        System.out.println("Thread in esecuzione: " + tic);
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrotto");
        }
        System.out.println("Thread terminato");
    }
}
