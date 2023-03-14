package NabilLista;

public class Main {
    public static void main(String[] args) {
        Lista parola = new Lista();

        parola.InserisciInTesta('l');
        parola.InserisciInTesta('i');
        parola.InserisciInTesta('b');
        parola.InserisciInTesta('a');
        parola.InserisciInTesta('n');

        parola.Duplica();

        parola.trovaVocale('l');
        parola.EliminaInPosizione(5);
        System.out.println(parola.toString());
        
    }
}