package VerficaVelo16_05;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main {
    public static void main(String[] args) {
        /* Scanner sc = new Scanner(System.in);
        String nome= "",cognome= "",dataNascita= "",codiceFiscale="",dataVisita="",diagnosi="";
        int numeroTelefono = 0;
        CartellaClinica c = new CartellaClinica(nome, cognome, dataNascita, codiceFiscale, numeroTelefono, dataVisita, diagnosi);
        
        int scelta = 0;
        do{
            System.out.println("1)Aggiungi un Paziente\n2)Rimuovi Paziente\n3)Visualizza tutti i pazienti\n4)Cerca per cognome\n5)Ordina\n99)Esci");
            
            scelta = sc.nextInt();
            switch(scelta){
                case 1:
                    System.out.println("Inserisci nome paziente");
                    nome = sc.next();
                    System.out.println("Inserisci cognome paziente");
                    cognome = sc.next();
                    System.out.println("Inserisci data di nascita");
                    dataNascita = sc.next();
                    System.out.println("Inserisci codice fiscale");
                    codiceFiscale = sc.next();
                    System.out.println("Inserisci numero di telefono");
                    numeroTelefono = sc.nextInt();
                    System.out.println("Inserisci data visita");
                    dataVisita = sc.next();
                    System.out.println("Inserisci diagnosi");
                    diagnosi = sc.next();
                    c = new CartellaClinica(nome, cognome, dataNascita, codiceFiscale, numeroTelefono, dataVisita, diagnosi);
                    clinica.add(c);
                    break;
                case 2:
                    System.out.println("Inserisci cognome del paziente da rimuovere");
                    cognome = sc.next();
                    clinica.rimuovi(cognome);
                    break;
                case 3:
                    if(clinica.isEmpty()){
                        System.out.println("Clinica vuota");
                        break;
                    }
                    clinica.stampaClinica();
                    break;
                case 4:
                    System.out.println("Inserisci cognome del paziente da cercare");
                    cognome = sc.next();
                    clinica.cerca(cognome);
                    break;
                case 5:
                    clinica.ordina();
                    break;
                case 99:
                    System.out.println("Grazie per aver usato Skerdi Velo code");
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }
        }while(scelta != 99);
        sc.close(); */
        Clinica clinica = new Clinica();
        JFrame frame = new JFrame("Verifica");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        JButton buttonAggiungi = new JButton("Aggiungi paziente");
        JButton buttonRimuovi = new JButton("Rimuovi paziente");
        JButton buttonVisualizza = new JButton("Visualizza tutti i pazienti");
        JButton buttonCerca = new JButton("Cerca per cognome");
        JButton buttonOrdina = new JButton("Ordina");
        JButton buttonEsci = new JButton("Esci");
        //change size of the buttons
        buttonAggiungi.setSize(100, 50);
        buttonRimuovi.setSize(100, 50);
        buttonVisualizza.setSize(100, 50);
        buttonCerca.setSize(100, 50);
        buttonOrdina.setSize(100, 50);
        buttonEsci.setSize(100, 50);
        JPanel panel = new JPanel();
        panel.add(buttonAggiungi);
        panel.add(buttonRimuovi);
        panel.add(buttonVisualizza);
        panel.add(buttonCerca);
        panel.add(buttonOrdina);
        panel.add(buttonEsci);
        frame.add(panel);
        
        //if button aggiungi is pressed ask for name, surname, date of birth, fiscal code, phone number, date of visit and diagnosis. The input is input dialog
        buttonAggiungi.addActionListener(e -> {
            String nome= "",cognome= "",dataNascita= "",codiceFiscale="",dataVisita="",diagnosi="";
            int numeroTelefono = 0;
            CartellaClinica c = new CartellaClinica(nome, cognome, dataNascita, codiceFiscale, numeroTelefono, dataVisita, diagnosi);
            nome = JOptionPane.showInputDialog("Inserisci nome paziente");
            cognome = JOptionPane.showInputDialog("Inserisci cognome paziente");
            dataNascita = JOptionPane.showInputDialog("Inserisci data di nascita");
            codiceFiscale = JOptionPane.showInputDialog("Inserisci codice fiscale");
            numeroTelefono = Integer.parseInt(JOptionPane.showInputDialog("Inserisci numero di telefono"));
            dataVisita = JOptionPane.showInputDialog("Inserisci data visita");
            diagnosi = JOptionPane.showInputDialog("Inserisci diagnosi");
            c = new CartellaClinica(nome, cognome, dataNascita, codiceFiscale, numeroTelefono, dataVisita, diagnosi);
            clinica.add(c);
        });
        
        //if button rimuovi is pressed ask for surname of the patient to remove. The input is input dialog
        buttonRimuovi.addActionListener(e -> {
            String cognome = "";
            cognome = JOptionPane.showInputDialog("Inserisci cognome del paziente da rimuovere");
            clinica.rimuovi(cognome);
        });

        //if button visualizza is pressed show all the patients
        buttonVisualizza.addActionListener(e -> {
            if(clinica.isEmpty()){
                JOptionPane.showMessageDialog(null, "Clinica vuota");
            }
            JFrame frame2 = new JFrame("Visualizza");
            //frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame2.setSize(500, 500);
            JPanel panel2 = new JPanel();
            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);
            textArea.setText(clinica.stampaClinica());
            panel2.add(textArea);
            frame2.add(panel2);
            frame2.setVisible(true);

        });

        //if button cerca is pressed ask for surname of the patient to search. The input is input dialog
        buttonCerca.addActionListener(e -> {
            String cognome = "";
            cognome = JOptionPane.showInputDialog("Inserisci cognome del paziente da cercare");
            clinica.cerca(cognome);
        });

        //if button ordina is pressed sort the patients by surname
        buttonOrdina.addActionListener(e -> {
            clinica.ordina();
        });

        //if button esci is pressed close the program
        buttonEsci.addActionListener(e -> {
            System.exit(0);
        });

        frame.setVisible(true);
    }
}
