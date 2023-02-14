package Allenamento;

public class Main {
    public static void main(String[] args) {
        Parola p = new Parola();
        p.inserisciInTesta('a');
        p.inserisciInTesta('b');
        p.inserisciInTesta('c');
        p.inserisciInTesta('d');
        System.out.println(p.toString());
        p.inserisciInPos(2, 2);
        System.out.println(p.toString());
    }
}
