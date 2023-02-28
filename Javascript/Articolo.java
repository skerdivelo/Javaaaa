public class Articolo {
    private int codice; //codice contatore
    private String nome; //nome
    private double peso; //peso
    private double prezzo;  //prezzo

    public Articolo(String nome, double peso, double prezzo){
        this.nome = nome;
        this.peso = peso;
        this.prezzo = prezzo;
        this.codice = codice + 1; //incremento di 1
    }

    public Articolo(Articolo a){
        this.nome = a.nome;
        this.peso = a.peso;
        this.prezzo = a.prezzo;
        this.codice = codice + 1;
    }

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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String toString(){
        return "Codice: "+codice+"\nNome: " + nome+"\nPeso: "+peso+"\nPrezzo: "+prezzo;
    }
}
