package Computer;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class GestioneComputer {
    public static int MAX_COMPUTER = 1000;
    private Computer[] computer;
    private int codiceIdentificativo;

    public GestioneComputer(){
        computer = new Computer[MAX_COMPUTER];
    }

    public void aggiungiComputer(Computer c){
        int i = 0;
        while(computer[i]!=null){
            i++;
        }
        computer[i]=new Computer(c);
        computer[i].setCodice(codiceIdentificativo);
        codiceIdentificativo++;
    }

    public Computer cercaComputer(int codice){
        int i = 0;
        Computer c;
        while(computer[i]!=null){  
            if(computer[i].getCodice()==codice){
                c = new Computer(computer[i]);
                return c;
            }
            i++;
        }
        return null; 
    }
    
    public Computer ricercaComputerMigliore(){
        int i=0,somma=0;
        while(computer[i]!=null){
            somma = computer[i].getHdd()+computer[i].getRam()+computer[i].getProcessore();
            if(somma>computer[i+1].getHdd()+computer[i+1].getRam()+computer[i+1].getProcessore()){
                Computer c = new Computer(computer[i]);
                return c;
            }
            i++;
        }
        return null;
    }

    public Computer eliminaComputer(int codice){
        int i = 0;
        while(computer[i]!=null || i<MAX_COMPUTER){
            if(computer[i].getCodice()==codice){
                Computer c = new Computer(computer[i]);
                computer[i]=null;
                codiceIdentificativo--;
                return c;
            }
            i++;
        }
        return null;
    }
    
    public void salva() {
        try (Scanner scanner = new Scanner(System.in)) {
            String nomeFile;
            System.out.println("Come vuoi chiamare il file? ");
            nomeFile = scanner.nextLine();
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeFile + ".txt"))) {
                for (int i = 0; i < MAX_COMPUTER; i++) {
                    if (computer[i] != null) {
                        bw.write(computer[i].getCodice() + " " + computer[i].getMarca() + " " + computer[i].getModello() + " "+ computer[i].getProcessore() + " " + computer[i].getRam() + " " + computer[i].getHdd() + " "+ computer[i].getDimensioniSchermo() + " " + computer[i].getAnnoDiAcquisto());
                        bw.newLine();
                    }
                }
                System.out.println("Computer salvati con successo");
            } catch (IOException e) {
                e.printStackTrace();
            }
            // salvataggio su file dat
            try (FileOutputStream fos = new FileOutputStream(nomeFile + ".dat");
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(computer);
                System.out.println("Inventario salvato con successo");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Errore");
            }
        }

    }
    public void ripristina() {
        String nomeFile;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Da quale file vuoi effettuare il ripristino? ");
        nomeFile = scanner.next() + ".txt";
        try (FileInputStream fis = new FileInputStream(nomeFile); ObjectInputStream ois = new ObjectInputStream(fis)) {
            computer = (Computer[]) ois.readObject();
            System.out.println("Ripristino effettuato con successo");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Il file indicato non esiste");
        }

    }
}
