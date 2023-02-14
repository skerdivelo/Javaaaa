package Allenamento;

public class Parola {
    private Nodo head; 
    private int elementi;

    public Parola(){
        head = null;
        elementi = 0; 
    }

    public void inserisciInTesta(char lettera){
        Nodo l = new Nodo(lettera);
        l.setLink(head);
        head = l;
        elementi++;
    }

    public Nodo eliminiaInTesta(){
        Nodo cancellato;
        cancellato = head;
        head = head.getLink();
        elementi--;
        return cancellato;
    }

    public void inserisciInPos(int k,int h){
        Nodo p = head;
        int i=0;
        while(p.getLink()!=null){
            
        }
    }

    public String toString(){
        String s = "";
        Nodo p = head;
        while(p != null){
            s += p.getInfo();
            p = p.getLink();
        }
        return s;
    }
}
