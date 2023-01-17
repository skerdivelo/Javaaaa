public class GestioneOrari extends Exception{
    private int h;
    private int m;
    private int s;

    public GestioneOrari(int h, int m, int s){
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public GestioneOrari(String string) {
        System.out.println("Orario sbagliato");
    }

    public int getOre() {
        return h;
    }

    public int getMinuti() {
        return m;
    }

    public int getSecondi() {
        return s;
    }

    public void setOre(int h) {
        this.h = h;
    }

    public void setMinuti(int m) {
        this.m = m;
    }

    public void setSecondi(int s) {
        this.s = s;
    }

    public String toString() {
        String str = h+":"+m+":"+s;
        return str;
    }

    // fai metodo orarioValido
    public static boolean orarioValido(int h, int m, int s){
        if(h>24 || h<0 || m>60 || m<0 || s>60 || s<0){
            return false;
        }else{
            return true;
        }
    }
    public int differenzaOrari(int h1, int m1, int s1, int h2, int m2, int s2) throws GestioneOrari{
        //check if orarioValido
        if(orarioValido(h1, m1, s1) && orarioValido(h2, m2, s2)){
            int tot1 = h1*3600 + m1*60 + s1;
            int tot2 = h2*3600 + m2*60 + s2;
            if(tot1<tot2){
                int temp = tot1;
                tot1 = tot2;
                tot2 = temp;
            }
            int diff = tot1 - tot2;
            return diff;
        }else{
            throw new GestioneOrari("Orario sbagliato");
        }
    }
        
}
