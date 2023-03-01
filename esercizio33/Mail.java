package esercizio33;

import java.security.Timestamp;

public class Mail {
    private String mittente;
    private String oggetto;
    private double dataora;
    private String testo;

    public Mail(String mittente, String oggetto, double dataora, String testo){
        this.mittente = mittente;
        this.oggetto = oggetto;
        this.dataora = dataora;
        this.testo = testo;
    }

    public void setMittente(String mittente){
        this.mittente = mittente;
    }
    public String getMittente(){
        return mittente;
    }
    public void setOggetto(String oggetto){
        this.oggetto = oggetto;
    }
    public String getOggetto(){
        return oggetto;
    }

    public String toString(){
        String s = "Mail: {" + mittente + ", " + oggetto + ", " + dataora + ", " + testo + "}";
        return s;
    }
    
}
