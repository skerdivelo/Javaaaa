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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label;
        JProgressBar progressBar;
        
        frame.setSize(500, 500);
        label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        progressBar = new JProgressBar(0, 100);
        //increase size of the progress bar
        progressBar.setPreferredSize(new java.awt.Dimension(500, 50));
        //color of the progress bar is green
        progressBar.setForeground(java.awt.Color.GREEN);
        frame.add(label);
        frame.add(progressBar, "South");
        try {
            for (int i = 0; i < 100; i++) {
                label.setText(magazzino.toString());
                progressBar.setValue(magazzino.getProdotto());
                frame.repaint();
                
            }
            frame.setVisible(true);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
