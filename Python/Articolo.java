public class Articolo{
    private int codice; // incrementato automaticamente
    private String nome;
    private double peso;
    private double prezzo;

    public Articolo(String nome, double peso, double prezzo){
        this.nome = nome;
        this.peso = peso;
        this.prezzo = prezzo;
        this.codice = codice + 1;
    }

    public Articolo(Articolo a){
        this.nome = a.nome;
        this.peso = a.peso;
        this.prezzo = a.prezzo;
        this.codice = codice + 1;
    }

    public void setCodice(int codice){
        this.codice = codice;
    }

    public int getCodice(){
        return codice;
    }

    public String getNome(){
        return nome;
    }

    public double getPeso(){
        return peso;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }

    public String toString(){
        return "Codice: " + codice + " Nome: " + nome + " Peso: " + peso + " Prezzo: " + prezzo;
    }
}