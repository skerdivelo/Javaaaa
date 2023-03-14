package esercizio33;

public class Mailbox{

    private Nodo head;
    private int elementi = 0;

    public Mailbox(){
        head = null;
    }

    public void aggiungiMail(Mail m){
        Nodo pn = new Nodo(m);
        pn.setLink(head);
        head = pn;
        elementi++;
    }

    public void eliminaMail(int pos){
        Nodo pp = head, p = head;
        if(head == null){
            System.out.println("La lista e vuota!");
        }else{
            int i=0;
            while(i != pos-1){
                pp = p;
                p = p.getLink();
                i++;
            }
            pp.setLink(p.getLink());
            elementi--;
        }    
    }

    public void ricercaMail(String txt){
        Nodo p = head;
        while (p != null){
            if (p.getInfo().getOggetto().contains(txt) == true){
                System.out.println(p.getInfo().toString() + "\n");
            }
        p = p.getLink();    
        }
    }

    public String toString(){
        Nodo p = head;
        String s = "Lista: \n";

        while(p != null){
            s = s + p.getInfo().toString() + "\n";
            p = p.getLink();
        }
        return s;
    }


}