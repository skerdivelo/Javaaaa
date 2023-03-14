package Lista;

import java.security.Timestamp;

public class Email {
    private String mittente;
    private String oggetto;
    private Timestamp data;
    private Timestamp ora;

    public Email(String mittente, String oggetto, Timestamp data, Timestamp ora) {
        this.mittente = mittente;
        this.oggetto = oggetto;
        this.data = data;
        this.ora = ora;
    }

    public String getMittente() {
        return mittente;
    }

    public void setMittente(String mittente) {
        this.mittente = mittente;
    }

    public String getOggetto() {
        return oggetto;
    }

    public void setOggetto(String oggetto) {
        this.oggetto = oggetto;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    public Timestamp getOra() {
        return ora;
    }

    public void setOra(Timestamp ora) {
        this.ora = ora;
    }

    @Override
    public String toString() {
        return "Email{" + "mittente=" + mittente + ", oggetto=" + oggetto + ", data=" + data + ", ora=" + ora + '}';
    }
}
