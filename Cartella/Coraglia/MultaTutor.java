package Cartella.Coraglia;

public class MultaTutor{
    private String targa;
    private double tempo;
    private static double spazio;
    private static double velocitàLimite; 
    private static double multa; // multa sarebbe l'importo che uso per calcolarmi quanto devo pagare dopo aver superato il limite di velocità

    //costrutore
    public MultaTutor(String targa, double tempo){
        this.targa = targa;
        this.tempo = tempo;
    }

    //metodi get
    public String getTarga() {
        return targa;
    }
    public double getTempo() {
        return tempo;
    }
    public static double getSpazio() {
        return spazio;
    }
    public static double getVelocitàLimite() {
        return velocitàLimite;
    }
    public static double getMulta() {
        return multa;
    }

    //metodi set
    public void setTarga(String targa) {
        this.targa = targa;
    }
    public void setTempo(double tempo) {
        if(tempo<=0){
            System.out.println("Il tempo non può essere negativo o uguale a 0");
        }else{
            this.tempo = tempo;
        }
    }
    public static void setSpazio(double spazio) {
        MultaTutor.spazio = spazio;
    }
    public static void setVelocitàLimite(double velocitàLimite) {
        MultaTutor.velocitàLimite = velocitàLimite;
    }
    public static void setMulta(double multa) {
        MultaTutor.multa = multa;
    }

    //calcolo la velocità facendo spazio/tempo
    public double calcoloVelocita(){
        double v = spazio/tempo;
        return v;
    }
    //metodo che mi serve per capire se un auto è da multare
    public boolean multare(){
        if(calcoloVelocita()>velocitàLimite){
            return true;
        }else{
            return false;
        }
    }

    public double importoMulta(){
        //faccio la differenza fra la velocità e il limite
        //ad esempio se il limite è 50 e sto andando a 54, 54-50=4;
        double kmEcc = calcoloVelocita()-velocitàLimite;
        double multaPagare;
        //controllo la sottrazione, cioè se è negativo non dico che l'utente deve pagare -180
        if(kmEcc<=0){
            multaPagare = 0;
            return multaPagare;
        }else{
            multaPagare = multa*kmEcc;
            return multaPagare;
        }
        //qua faccio la multa. Cioè il mio attributo multa vale 20 e se io supero di 4 faccio: 20*4
        
    }
}