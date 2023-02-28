package Computer;

public class Computer {
    private int codice;
    private String marca;
    private String modello;
    private int processore;
    private int ram;
    private int hdd;
    private int dimensioniSchermo;
    private int annoDiAcquisto;

    public Computer(String marca, String modello, int processore, int ram, int hdd, int dimensioniSchermo, int annoDiAcquisto) {
        this.marca = marca;
        this.modello = modello;
        this.processore = processore;
        this.ram = ram;
        this.hdd = hdd;
        this.dimensioniSchermo = dimensioniSchermo;
        this.annoDiAcquisto = annoDiAcquisto;
    }

    public Computer(Computer computer) {
        this.codice = computer.codice;
        this.marca = computer.marca;
        this.modello = computer.modello;
        this.processore = computer.processore;
        this.ram = computer.ram;
        this.hdd = computer.hdd;
        this.dimensioniSchermo = computer.dimensioniSchermo;
        this.annoDiAcquisto = computer.annoDiAcquisto;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
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

    public int getProcessore() {
        return processore;
    }

    public void setProcessore(int processore) {
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
