package MagazzinoThread;

import javax.swing.*;

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
        JFrame frame = new JFrame("Magazzino");
        //align the frame in the center of the screen
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label;
        JProgressBar progressBar;
        
        frame.setSize(500, 200);
        label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        progressBar = new JProgressBar(0, 100);
        //increase size of the progress bar
        progressBar.setForeground(new java.awt.Color(102, 255, 102));
        //progressBar.setForeground(java.awt.Color.GREEN);
        frame.add(label);
        frame.add(progressBar, "South");
        boolean productFinished = false;
        boolean productAlmostFinished = false;
        try {
            for (int i = 0; i < 100; i++) {
                //progress bar that goes from green to red smoothly
                int red =  (int) (255 * ((100 - i) / 100.0));
                int green = (int) (255 * (i / 100.0));
                progressBar.setForeground(new java.awt.Color(red, green, 0));
                label.setText(magazzino.toString());
                if (productAlmostFinished == false && magazzino.getProdotto() <= 10) {
                    JOptionPane.showMessageDialog(null, "Prodotto in esaurimento");
                    productAlmostFinished = true;
                }else if (productFinished == false && magazzino.getProdotto() == 0) {
                    JOptionPane.showMessageDialog(null, "Prodotto esaurito");
                    productFinished = true;
                }
                progressBar.setValue(magazzino.getProdotto());
                frame.repaint();
                
            }
            frame.setVisible(true);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
