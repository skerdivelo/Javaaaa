package esercizio33;

public class Main {
    public static void main(String[]args){
        Mailbox box = new Mailbox();

        Mail m1, m2, m3, m4;
        m1 = new Mail("Giovanni", "File PDF", 10.30, "Ciao");
        m2 = new Mail("Giovanni", "File WORD", 10.40, "Ciaooo");
        m3 = new Mail("Giovanni", "File TXT", 10.45, "Ciao!!!");
        m4 = new Mail("Giovanni", "File CMD", 10.50, "Ciao Andrea");

        box.aggiungiMail(m1);
        box.aggiungiMail(m2);
        box.aggiungiMail(m3);
        box.aggiungiMail(m4);
        System.out.println(box.toString());

        box.eliminaMail(2);
        System.out.println(box.toString());

        box.ricercaMail("File PDF");


    }
}
