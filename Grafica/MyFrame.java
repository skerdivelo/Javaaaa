package Grafica;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
    private CustomPanel ilMioPannello; // Dichiarazione di un pannello

    public MyFrame(String titolo) {
        super(titolo); // Richiamo il costruttore della classe padre
        ilMioPannello = new CustomPanel(); // Inizializzo il mio pannello
        setUpFrame(); // Richiamo il metodo che mi permette di aggiungere i miei oggetti alla finestra
    }
    
    private void setUpFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Imposto il comportamento del frame quando viene chiuso
        this.setContentPane(ilMioPannello); // Imposto il mio pannello come contenuto del frame
        this.setSize(300, 300); // Imposto la dimensione del frame
        this.setResizable(true);
        this.setLocation(5, 5); // Imposto la posizione del frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true); // Imposto la visibilità del frame
    }

    public void cambiaBackground(String colore) {
        ilMioPannello.setBackground(java.awt.Color.decode(colore));
    }

}

