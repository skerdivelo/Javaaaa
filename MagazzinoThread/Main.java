package MagazzinoThread;

public class Main {
    public static void main(String[] args) {
        Magazzino magazzino = new Magazzino();
        ThreadClass threadClass = new ThreadClass(magazzino, 0, true);
        ThreadClass threadClass2 = new ThreadClass(magazzino, 0, true);
        Thread t1 = new Thread(threadClass);
        Thread t2 = new Thread(threadClass2);
        t1.start();
        t2.start();

        try {
            for (int i = 0; i < 100; i++) {
                t1.run();
                t2.run();
            }
            if (magazzino.getProdotto() < 2) {
                System.out.println("************************************");
                System.out.println("|                                  |");
                System.out.println("|                                  |");
                System.out.println("|                                  |");
                System.out.println("|     LE SCORTE STANNO FINENDO     |");
                System.out.println("|                                  |");
                System.out.println("|                                  |");
                System.out.println("|                                  |");
                System.out.println("************************************");
            }
            
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println(magazzino);
    }
}
