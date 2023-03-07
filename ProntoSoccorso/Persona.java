package ProntoSoccorso;

public class Persona {
    private String nome;
    private String cognome;
    private int nascita;
    private char sesso;

    public Persona(String nome, String cognome, int nascita, char sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.nascita = nascita;
        this.sesso = sesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getNascita() {
        return nascita;
    }

    public void setNascita(int nascita) {
        this.nascita = nascita;
    }
    
    public char getSesso() {
        return sesso;
    }

    public void setSesso(char sesso) {
        this.sesso = sesso;
    }

    @Override
    public String toString() {
        return "Persona{" + "nome=" + nome + ", cognome=" + cognome + ", nascita=" + nascita + ", sesso=" + sesso + '}';
    }
}
