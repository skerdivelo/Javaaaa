public class Libro {
    private String titolo;
    private String autore;
    private int annoDiPubblicazione;
    private String editore;

    public Libro(String titolo, String autore, int annoDiPubblicazione, String editore) {
        this.titolo = titolo;
        this.autore = autore;
        this.annoDiPubblicazione = annoDiPubblicazione;
        this.editore = editore;
    }

    public Libro(Libro libro) {
        this.titolo = libro.titolo;
        this.autore = libro.autore;
        this.annoDiPubblicazione = libro.annoDiPubblicazione;
        this.editore = libro.editore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.titolo = autore;
    }

    public int getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public void setAnnoDiPubblicazione(int annoDiPubblicazione) {
        this.annoDiPubblicazione = annoDiPubblicazione;
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        this.editore = editore;
    }

    public String toString() {
        return "Titolo: " + titolo + ", Autore: " + autore + ", Anno di pubblicazione: " + annoDiPubblicazione + ", Editore: " + editore;
    }
}