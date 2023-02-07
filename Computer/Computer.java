package Computer;

public class Computer {
    private String codice;
    private String marca;
    private String modello;
    private String processore;
    private int ram;
    private int hdd;
    private int dimensioniSchermo;
    private int annoDiAcquisto;

    public Computer(String codice, String marca, String modello, String processore, int ram, int hdd, int dimensioniSchermo, int annoDiAcquisto) {
        this.codice = codice;
        this.marca = marca;
        this.modello = modello;
        this.processore = processore;
        this.ram = ram;
        this.hdd = hdd;
        this.dimensioniSchermo = dimensioniSchermo;
        this.annoDiAcquisto = annoDiAcquisto;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getProcessore() {
        return processore;
    }

    public void setProcessore(String processore) {
        this.processore = processore;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getDimensioniSchermo() {
        return dimensioniSchermo;
    }

    public void setDimensioniSchermo(int dimensioniSchermo) {
        this.dimensioniSchermo = dimensioniSchermo;
    }

    public int getAnnoDiAcquisto() {
        return annoDiAcquisto;
    }

    public void setAnnoDiAcquisto(int annoDiAcquisto) {
        this.annoDiAcquisto = annoDiAcquisto;
    }

}
