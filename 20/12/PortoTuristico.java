import java.io.*;
public class PortoTuristico {

// Attributi
 private static final int MAX_NUM_POSTI=100;
 private Barca posti[];
 public PortoTuristico() {
  posti=new Barca[MAX_NUM_POSTI];
 }

// Metodi
 public int setBarca(Barca barca) {
  int posto;
  try { 
      if(barca.getTipologia().equals("Vela")){
         for (posto=51;posto<MAX_NUM_POSTI;posto++) 
             if (posti[posto]==null){
                   // inserimento copia di Barca in posto relativa al posto
               posti[posto]=new Barca(barca);
               return posto; // restituisce la posto di inserimento
             }
       return -1;
      }
      if(barca.getLunghezza()>10){
         for (posto=21;posto<MAX_NUM_POSTI;posto++) 
             if (posti[posto]==null){
                   // inserimento copia di Barca in posto relativa al posto
               posti[posto]=new Barca(barca);
               return posto; // restituisce la posto di inserimento
             } 
      }
      else {
        for (posto=0;posto<MAX_NUM_POSTI;posto++) 
          if (posti[posto]==null){
                   // inserimento copia di Barca in posto relativa al posto
            posti[posto]=new Barca(barca);
            return posto; // restituisce la posto di inserimento
          }  
      }
  }
  catch (ArrayIndexOutOfBoundsException exception) {
   return -1; // posto non valida
  }
  return -1;
 }
 public Barca getBarca(int posto) {
  try {
  // restituisce una copia del Barca in posto
   return new Barca(posti[posto]);
  }
 catch (ArrayIndexOutOfBoundsException exception) {
  return null; // posto non valida: nessuna Barca restituito
 }
  catch (NullPointerException exception) {
   return null; // posto vuota: nessuna Barca restituito
  }
 }
 
 public double rimuoviBarca(int posto,int giorni) {
 double importo=0;   
 try {
  if (posti[posto].getTipologia().equals("Vela"))
      importo=giorni*10*posti[posto].getLunghezza();
  else    
      importo=giorni*20*posti[posto].getStazza();
  posti[posto]=null; // rimozione Barca in posto
   
  return importo; // restituisce la posto liberata
 }
 catch (ArrayIndexOutOfBoundsException exception) {
  return -1; // posto non valida
 }
}

public int getNumMaxposti() {
 return MAX_NUM_POSTI;
}
public int getNumPosti() {
 int posto, n=0;
 for (posto=0; posto<MAX_NUM_POSTI; posto++)
  if (posti[posto]!=null)
   n++;
  return n;
 }

public void salvaPortoTuristico() throws java.io.IOException {
  ObjectOutputStream stream =new ObjectOutputStream(new FileOutputStream("posti.bin"));
  stream.writeObject(this.posti);
  stream.close();
 }

public void caricaPortoTuristico() throws java.io.IOException {
 ObjectInputStream stream = new ObjectInputStream(new FileInputStream("posti.bin"));
 try {
     this.posti = (Barca[])stream.readObject();
 }
 catch (ClassNotFoundException exception) {
 }
  stream.close();
 }

public String[] inventarioBarcheNazione(String nazione){
  int i;  
  String elenco[]=new String[100];
  for (i=0;i<MAX_NUM_POSTI;i++)
     if (posti[i]!=null)
         if(posti[i].getNazione().equals(nazione)) {
             elenco[i]=posti[i].getNome();
         }    
    return elenco;
}


 public static void main (String[] args) throws java.io.IOException {  
   PortoTuristico porto1 = new PortoTuristico();
   Barca b1 = new Barca("Luna Rossa","Italia",20,30,"Vela");
   Barca b2 = new Barca("BMW Oracle","USA",20,30,"Vela");
   Barca b3 = new Barca("Alfa","Italia",15,35,"Motore");
   Barca b4 = new Barca("Beta","Francia",18,40,"Motore");
   Barca b5 = new Barca("Gamma","Italia",18,42,"Motore");
   Barca b6 = new Barca("Delta","Italia",8,5,"Motore");
   System.out.println("Numero posti: "+porto1.getNumPosti());
   // inserimento posti
   porto1.setBarca(b1);
   porto1.setBarca(b2);
   porto1.setBarca(b3);
   porto1.setBarca(b4);
   porto1.setBarca(b5);
   porto1.setBarca(b6);
   System.out.println("\nNumero posti occupati: "+porto1.getNumPosti());
   // visualizzazione elenco posti
   for ( int posto=0; posto<porto1.getNumMaxposti(); posto++) {
     Barca barca = porto1.getBarca(posto);
     if (barca != null)
       System.out.println( "Posto: "+posto+" -> "+barca.toString());
   }
   String nomi[]=porto1.inventarioBarcheNazione("Italia");
   for ( int posto=0; posto<porto1.getNumMaxposti(); posto++) {
     if (nomi[posto] != null)
       System.out.println( "Posto: "+posto+" -> "+nomi[posto]);
   }
   
   // salvataggio posti su file
   porto1.salvaPortoTuristico();
   // creazione nuova PortoTuristico vuota
   PortoTuristico porto2 = new PortoTuristico();
   System.out.println("\nNumero posti occupati porto2: "+porto2.getNumPosti());
   // caricamento posti da file
   System.out.println("\nCaricamento da file dati porto2: ");
   porto2.caricaPortoTuristico();
   System.out.println("\nNumero posti occupati porto2: "+porto2.getNumPosti());
   //elimina barca per targa
   Barca barca=porto2.getBarca(23);
   if (barca!=null){
       
    double importo=porto2.rimuoviBarca(23,10);
    if (importo>0)
     System.out.println("\nBarca posto 23 "+barca.toString()+". Rimossa.Importo totale sosta:"+importo+" euro");
    else
     System.out.println("\nNessuna barca nel posto 23 ");  
   } 
   // visualizzazione elenco posti
   System.out.println("\nElenco barche rimanenti porto2");
   for ( int posto=0; posto<porto2.getNumMaxposti();posto++) {
     Barca b = porto2.getBarca(posto);
     if (b != null)
      System.out.println( "Posto: "+posto+" -> "+b.toString()); 
   } 
 }
}