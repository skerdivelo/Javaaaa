package Notaio1;

public class Acquirente {
    private String nome;
    private String cognome;
    private String email;
    private String telefono;
    private String chiVende;
    private double renditaCatastale;
    private double prezzo;
    private double caparra;
    private boolean acquistoConMutuo;

    public Acquirente(String nome, String cognome, String email, String telefono, String chiVende,
            double renditaCatastale, double prezzo, double caparra, boolean acquistoConMutuo) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.telefono = telefono;
        this.chiVende = chiVende;
        this.renditaCatastale = renditaCatastale;
        this.prezzo = prezzo;
        this.caparra = caparra;
        this.acquistoConMutuo = acquistoConMutuo;
    }

    //setter e getter
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getChiVende() {
        return chiVende;
    }

    public double getRenditaCatastale() {
        return renditaCatastale;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getCaparra() {
        return caparra;
    }

    public boolean isAcquistoConMutuo() {
        return acquistoConMutuo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setChiVende(String chiVende) {
        this.chiVende = chiVende;
    }

    public void setRenditaCatastale(double renditaCatastale) {
        this.renditaCatastale = renditaCatastale;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setCaparra(double caparra) {
        this.caparra = caparra;
    }

    public void setAcquistoConMutuo(boolean acquistoConMutuo) {
        this.acquistoConMutuo = acquistoConMutuo;
    }

    @Override
    public String toString(){
        return "Acquirente{nome: " +nome+" cognome: "+cognome+" email: "+email+" telefono: "+telefono+" chiVende: "+chiVende+" renditaCatastale: "+renditaCatastale+" prezzo: "+prezzo+" caparra: "+caparra+" acquistoConMutuo: "+acquistoConMutuo+"}";
    }
}
