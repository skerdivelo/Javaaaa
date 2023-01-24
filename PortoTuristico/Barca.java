package PortoTuristico;
//ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("barca.bin"));
//stream.writeObject(barca);
//stream.close();

public class Barca{
    private String nome;
    private String nazione;
    private int lunghezza;
    private int stazza;
    private String tipologia;

    public Barca(String nome, int lunghezza, int stazza, String tipologia) {
        this.nome = nome;
        this.lunghezza = lunghezza;
        this.stazza = stazza;
        this.tipologia = tipologia;
    }


    public Barca(Barca barca) {
        this.nome = barca.getNome();
        this.nazione = barca.getNazione();
        this.lunghezza = barca.getLunghezza();
        this.stazza = barca.getStazza();
        this.tipologia = barca.getTipologia();
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    public String getNazione() {
        return nazione;
    }

    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getStazza() {
        return stazza;
    }

    public void setStazza(int stazza) {
        this.stazza = stazza;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }
        
    public String toString(){
        return "Nome: "+getNome()+" Nazionalità: "+getNazione()+" Lunghezza: "+getLunghezza()+"m Stazza: "+stazza+ "ton Tipologia: "+getTipologia();
    }
}