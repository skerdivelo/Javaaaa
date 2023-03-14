package Thread;

public class CodaProcessi {
    private int testa;
    private int coda;
    private int[] codaProcessi;
    
    public CodaProcessi() {
        testa = 0;
        coda = 0;
        codaProcessi = new int[10];
    }
    
    public void inserisci(int processo) {
        codaProcessi[coda] = processo;
        coda = (coda + 1) % 10;
    }
    
    public int estrai() {
        int processo = codaProcessi[testa];
        testa = (testa + 1) % 10;
        return processo;
    }
    
    public boolean vuota() {
        return testa == coda;
    }
    
    public boolean piena() {
        return (coda + 1) % 10 == testa;
    }
}
