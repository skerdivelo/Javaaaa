package ProntoSoccorso;

public class Paziente {
    private Persona paziente;
    private char colore; //r g v

    public Paziente(Persona paziente, char colore) {
        this.paziente = paziente;
        this.colore = colore;
    }

    public Persona getPaziente() {
        return paziente;
    }

    public void setPaziente(Persona paziente) {
        this.paziente = paziente;
    }

    public char getColore() {
        return colore;
    }

    public void setColore(char colore) {
        this.colore = colore;
    }

    @Override
    public String toString() {
        return "Paziente{" + "paziente=" + paziente + ", colore=" + colore + '}';
    }
}
