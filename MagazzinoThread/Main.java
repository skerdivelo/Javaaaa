package MagazzinoThread;
//import java swing
import javax.swing.*;


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
        try{
            t1.run();
            Thread.sleep(1000);
            t2.run();
            t3.run();
            t4.run();
        }catch(Exception e){
            return;
        }
    }
}
