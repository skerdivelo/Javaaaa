package ContoCorrente;


public class ContoCorrente {
    private double saldo;
    private int num = 543;

    public ContoCorrente(double saldo) {
        this.saldo = saldo;
    }

    public void versa(double importo){
        saldo += importo;
    }

    public void preleva(double importo) throws IllegalArgumentException{
        if(importo>saldo){
            throw new IllegalArgumentException("Non hai abbastanza soldi");
        }else if(importo-saldo<saldo){
            throw new IllegalArgumentException("Non puoi prelevare più di quanto hai");
        }else{
            saldo -= importo;
        }
    }

    public int getNum() {
        return num;
    }

    public double getSaldo() {
        return saldo;
    }

    public String stampaSaldo(){
        String s = "Il tuo saldo è: " + saldo;
        return s;
    }
}
