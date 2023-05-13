package MagazzinoThread;

public class Main {
    public static void main(String[] args) {
        Magazzino magazzino = new Magazzino();
        ThreadClass threadClass = new ThreadClass(magazzino, 0, true);
        ThreadClass threadClass2 = new ThreadClass(magazzino, 0, true);
        ThreadClass threadClass3 = new ThreadClass(magazzino, 0, true);
        ThreadClass threadClass4 = new ThreadClass(magazzino, 0, true);
        Thread t1 = new Thread(threadClass);
        Thread t2 = new Thread(threadClass2);
        Thread t3 = new Thread(threadClass3);
        Thread t4 = new Thread(threadClass4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            for (int i = 0; i < 100; i++) {
                t1.run();
                t2.run();
                if(magazzino.getProdotto() >= 90){
                    System.out.println("*********");
                } else if(magazzino.getProdotto() >= 50){
                    System.out.println("********");
                } else if(magazzino.getProdotto() >= 20){
                    System.out.println("*******");
                } else if(magazzino.getProdotto() >= 10){
                    System.out.println("******");
                } else if(magazzino.getProdotto() >= 5){
                    System.out.println("*****");
                } else if(magazzino.getProdotto() >= 2){
                    System.out.println("****");
                } else if(magazzino.getProdotto() >= 1){
                    System.out.println("**");
                } else if(magazzino.getProdotto() == 0){
                    System.out.println("*");
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
            }
            
            
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println(magazzino);
    }
}
