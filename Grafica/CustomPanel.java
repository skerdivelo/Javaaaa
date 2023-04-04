package Grafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CustomPanel extends JPanel implements ActionListener{
    private JButton ilMioBottone; // Dichiarazione di un bottone
    private JLabel ilMioLabel; // Dichiarazione di un label //un label è un testo che non può essere modificato dall'utente

    public CustomPanel() {
        super(new BorderLayout()); // Utilizzo il BorderLayout come layout manager
        ilMioLabel = new JLabel("Ciao"); 
        ilMioBottone = new JButton("Premimi"); 
        ilMioBottone.addActionListener(this); // Aggiungo l'ascoltatore di eventi al bottone
        setUpPanel(); 
    }
    
    private void setUpPanel() {
        this.add(ilMioLabel, BorderLayout.NORTH); // Posiziono il label in alto al centro
        this.add(ilMioBottone, BorderLayout.SOUTH); // Posiziono il bottone in basso al centro
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.setBackground(Color.BLUE);
    }
}    
