package Lista;

import Parola;

public class Main {
    public static void main(String []args){
        Parola p = new Parola();

        p.inserisciInCoda('s');
        p.inserisciInCoda('k');
        p.inserisciInCoda('e');
        p.inserisciInCoda('r');
        p.inserisciInCoda('d');
        p.inserisciInCoda('i');
        System.out.println(p.toString());
        p.scambiaPrimoUltimo();
        System.out.println(p.toString());
    }
}
