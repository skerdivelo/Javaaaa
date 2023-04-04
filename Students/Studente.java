package Students;

public class Studente {
    private String nome;
    private String cognome;
    private int voto1;
    private int voto2;
    private int voto3;

    public Studente(String nome, String cognome, int voto1, int voto2, int voto3) {
        this.nome = nome;
        this.cognome = cognome;
        this.voto1 = voto1;
        this.voto2 = voto2;
        this.voto3 = voto3;
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

    public int getVoto1() {
        return voto1;
    }

    public void setVoto1(int voto1) {
        this.voto1 = voto1;
    }

    public int getVoto2() {
        return voto2;
    }

    public void setVoto2(int voto2) {
        this.voto2 = voto2;
    }

    public int getVoto3() {
        return voto3;
    }

    public void setVoto3(int voto3) {
        this.voto3 = voto3;
    }

    public int getMedia() {
        return (voto1 + voto2 + voto3) / 3;
    }

    @Override
    public String toString() {
        return "Studente{" + "nome=" + nome + ", cognome=" + cognome + ", voto1=" + voto1 + ", voto2=" + voto2 + ", voto3=" + voto3 + '}';
    }
}