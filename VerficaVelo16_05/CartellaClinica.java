package VerficaVelo16_05;

public class CartellaClinica implements Comparable<CartellaClinica>{
    private String nomePaziente;
    private String cognomePaziente;
    private String dataNascita;
    private String codiceFiscale;
    private int numeroTelefono;
    private String dataVisita;
    private String diagnosi;

    public CartellaClinica(String nomePaziente, String cognomePaziente, String dataNascita, String codiceFiscale, int numeroTelefono, String dataVisita, String diagnosi){
        this.nomePaziente = nomePaziente;
        this.cognomePaziente = cognomePaziente;
        this.dataNascita = dataNascita;
        this.codiceFiscale = codiceFiscale;
        this.numeroTelefono = numeroTelefono;
        this.dataVisita = dataVisita;
        this.diagnosi = diagnosi;
    }

    //getters and setters

    public String getNomePaziente() {
        return nomePaziente;
    }

    public String getCognomePaziente() {
        return cognomePaziente;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getDataVisita() {
        return dataVisita;
    }

    public String getDiagnosi() {
        return diagnosi;
    }

    public void setNomePaziente(String nomePaziente) {
        this.nomePaziente = nomePaziente;
    }

    public void setCognomePaziente(String cognomePaziente) {
        this.cognomePaziente = cognomePaziente;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void setDataVisita(String dataVisita) {
        this.dataVisita = dataVisita;
    }

    public void setDiagnosi(String diagnosi) {
        this.diagnosi = diagnosi;
    }

    @Override
    public String toString() {
        return "Nome Paziente: " +getNomePaziente()+" Cognome: "+getCognomePaziente()+" Codice Fiscale: "+getCodiceFiscale()+" Data di Nascita: " +getDataNascita()+" Numero di Telefono: "+getNumeroTelefono()+" Data Visita: "+getDataVisita()+" Diagnosi: "+getDiagnosi()+"\n----------------------------------------------------";
    }

    @Override
    public int compareTo(CartellaClinica p) {
        return this.getCognomePaziente().compareTo(p.getCognomePaziente());
    }

}