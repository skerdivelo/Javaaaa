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
        try{
            for(int i = 0; i < 100; i++){
                t1.run();
                t2.run();
                t3.run();
                t4.run();
                if(magazzino.getProdotto() <= 10){
                    JOptionPane.showMessageDialog(null, "Prodotto in esaurimento");
                }
            }
        }catch(Exception e){
            return;
        }
    }
}
