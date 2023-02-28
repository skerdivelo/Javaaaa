package Verifica_Velo28_02; //commentare in caso

public class Articolo {
    private int codice;
    private String nome;
    private double peso;
    private double prezzo;

    //costruttore
    public Articolo(String nome, double peso, double prezzo){
        this.nome = nome;
        this.peso = peso;
        this.prezzo = prezzo;
        this.codice = codice + 1;
    }
    //costruttore di copia
    public Articolo(Articolo a){
        this.nome = a.nome;
        this.peso = a.peso;
        this.prezzo = a.prezzo;
        this.codice = codice + 1;
    }
    //set e get
    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String toString(){
        return "Codice: "+codice+"\nNome: "+nome+"\nPeso: "+peso+"\nPrezzo: "+prezzo+"\n-------------------------------------------------";
    }

}
