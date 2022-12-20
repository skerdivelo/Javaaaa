import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //li chiamo con il nome della classe poichè sono statici
        Scanner s = new Scanner(System.in);
        MultaTutor.setVelocitàLimite(2.);
        MultaTutor.setSpazio(45.);
        MultaTutor.setMulta(5);
        MultaTutor m1 = new MultaTutor(" ", 0);
        MultaTutor m2 = new MultaTutor(" ", 0);
        MultaTutor m3 = new MultaTutor(" ", 0);
        String targa;
        double tempo;
        //inserisco i dati della prima macchina
        System.out.println("Inserisci la targa della macchina: ");
        targa = s.nextLine();
        m1.setTarga(targa);
        System.out.println("Inserisci il tempo di percorrenza della macchina: ");
        tempo = s.nextDouble();
        s.nextLine();
        m1.setTempo(tempo);
        //inserisco i dati della seconda macchina
        System.out.println("Inserisci la targa della macchina: ");
        targa = s.nextLine();
        m2.setTarga(targa);
        System.out.println("Inserisci il tempo di percorrenza della macchina: ");
        tempo = s.nextDouble();
        m2.setTempo(tempo);
        s.nextLine();
        //inserisco i dati della terza macchina
        System.out.println("Inserisci la targa della macchina: ");
        targa = s.nextLine();
        m3.setTarga(targa);
        System.out.println("Inserisci il tempo di percorrenza della macchina: ");
        tempo = s.nextDouble();
        m3.setTempo(tempo);
        s.nextLine();



        //verifico se è da multare
        if(m1.multare()){
            System.out.println("La macchina con targa: " + m1.getTarga() + " deve essere multata");
        }else{
            System.out.println("Nulla da multare");
        }
        System.out.println("La velocità della macchina: " + m2.getTarga() + " è di: " + m2.calcoloVelocita());
        if(m3.multare()){
            System.out.println("La macchina: " + m3.getTarga()+ " deve pagare: " +m3.importoMulta());
        }
        
    }   
}