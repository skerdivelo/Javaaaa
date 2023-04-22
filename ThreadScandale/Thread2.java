package ThreadScandale;

public class Thread2 implements Runnable {

    public void EsempioDiThread(){
        Thread primoT = Thread.currentThread();
        System.out.println("Thread in esecuzione: " + primoT);
        Thread nuovoT = new Thread(this, "Thread figlio");
        System.out.println("\t\tThread figlio: " + nuovoT);
        nuovoT.start();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Primo thread: Mi hanno interrotto");
        }
        System.out.println("\t\tLavoro finito");
    }
    
    public void run(){
        try{
            for(int i = 1; i <= 10; i++){
                System.out.println("\t\t"+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Thread figlio: Mi hanno interrotto");
        }
        System.out.println("Thread figlio: Lavoro finito");
    }

    public static void main(String[] args) {
        Thread2 t = new Thread2();
        t.EsempioDiThread();
    }
}
