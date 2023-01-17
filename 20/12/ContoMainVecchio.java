import java.util.InputMismatchException;
import java.util.Scanner;


public class ContoMainVecchio{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ContoCorrente c1 = new ContoCorrente(2500);
        String scelta;
        do{
            scelta = "";
            System.out.println("Inserisci il comando (versa,preleva,esci): ");
            try{
                scelta = s.nextLine();
            }
            catch(Exception e){
                System.out.println("Errore devi inserire un comando di quelli elencati");
                scelta = "esci";
            }
            switch (scelta){
                case "versa":
                    try{
                        System.out.println("Inserisci l'importo da versare: ");
                        double importo = s.nextDouble();
                        c1.versa(importo);
                        System.out.println(c1.stampaSaldo());
                    }catch(InputMismatchException e){
                        System.out.println("Errore devi inserire un numero");
                    }
                    
                    break;
                case "preleva":
                    try{
                        System.out.println("Inserisci l'importo da prelevare: ");
                        double importo1 = s.nextDouble();
                        c1.preleva(importo1);
                        System.out.println(c1.stampaSaldo());
                    }
                    catch(InputMismatchException e){
                        System.out.println("Errore devi inserire un numero");
                    }
                case "esci":
                    System.out.println("Arrivederci");
                    break;
                default:
                    System.out.println("Errore devi inserire un comando di quelli elencati");
            }
        }while(c1.getSaldo() != 0);
    }
}




        /*
        int dividendo = 0;
        Scanner s = new Scanner(System.in);
        int divisore = 0;
        do{
            System.out.println("Inserisci un numero: ");
            dividendo = s.nextInt();
            System.out.println("Inserisci il divisore: ");
            divisore = s.nextInt();
            try{
                System.out.println(dividendo/divisore);
            }
            catch(ArithmeticException e){
                System.out.println("Non puoi dividere per 0");
            }
        }while(dividendo != 99 || divisore !=99);
        
    }
}
    
    public static void main(String[] args) {
        //li chiamo con il nome della classe poichè sono statici
        Scanner s = new Scanner(System.in);
        MultaTutor.setVelocitàLimite(2.);
        MultaTutor.setSpazio(455.);
        MultaTutor.setMulta(5);
        MultaTutor m1 = new MultaTutor(" ", 0);
        MultaTutor m2 = new MultaTutor(" ", 0);
        MultaTutor m3 = new MultaTutor(" ", 0);
        String targa;
        double tempo;
        boolean tempoo = true;
        //inserisco i dati della prima macchina
        System.out.println("Inserisci la targa della macchina: ");
        targa = s.nextLine();
        m1.setTarga(targa);
        System.out.println("Inserisci il tempo di percorrenza della macchina: ");
        tempo = s.nextDouble();
        m1.setTempo(tempo);
        s.nextLine();
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
        while(tempoo){
            if(m1.getTempo()<=0 || m2.getTempo()<=0 || m3.getTempo()<=0){
                System.out.println("Il tempo non può essere negativo o uguale a 0");
                System.out.println("Inserisci il tempo di percorrenza della macchina: ");
                tempo = s.nextDouble();
                m1.setTempo(tempo);
                m2.setTempo(tempo);
                m3.setTempo(tempo);
                s.nextLine();
            }else{
                tempoo = false;
            }
        }


        //verifico se è da multare
        if(m1.multare()){
            System.out.println("La macchina con targa: " + m1.getTarga() + " deve essere multata");
        }else{
            System.out.println("La macchina con targa: " + m1.getTarga() + " non deve essere multata");
        }
        System.out.println("La velocità della macchina: " + m2.getTarga() + " è di: " + m2.calcoloVelocita());
        if(m3.multare()){
            System.out.println("La macchina: " + m3.getTarga()+ " deve pagare: " +m3.importoMulta());
        }
        
    }   
}
 */