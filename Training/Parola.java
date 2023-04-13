package Training;

public class Parola{
    private Nodo head;
    private int elementi;
//fghjk
    public Parola(){
        head = null;
        elementi = 0;
    }

    public void aggiungiInTesta(char lettera){
        Nodo p = new Nodo(lettera);
        p.setLink(head);
        head = p;
        elementi++;
    }

    public Nodo eliminaInTesta(){
        if(head == null){
            return null;
        }
        Nodo eliminato = new Nodo(head);
        head = head.getLink();
        elementi--;
        return eliminato;
    }

    public void inserisciInCoda(char lettera){
        Nodo pn = new Nodo(lettera);
        if(head == null){
            head = pn;
        }
        Nodo p = head;
        while(p.getLink() != null){
            p = p.getLink();
        }
        p.setLink(pn);
        pn.setLink(null);
        elementi++;
    }

    public Nodo eliminaInCoda(){
        if(head == null){
            return null;
        }
        Nodo eliminato;
        if(head.getLink() == null){
            eliminato = new Nodo(head);
            head = null;
            elementi--;
            return eliminato;
        }
        Nodo p = head;
        while(p.getLink().getLink() != null){
            p = p.getLink();
        }
        eliminato = new Nodo(p);
        p.setLink(null);
        elementi--;
        return eliminato;
    }

    public void inserisciInPosizione(char lettera, int pos){
        Nodo pn = new Nodo(lettera);
        if(pos > elementi){
            inserisciInCoda(lettera);
        }
        if(pos < 0){
            aggiungiInTesta(lettera);
        }
        Nodo p = head;
        for(int i = 0; i < pos-1; i++){
            p = p.getLink();
        }
        pn.setLink(p.getLink());
        p.setLink(pn);
        elementi++;
    }

    public Nodo eliminaInPosizione(){
        
    }
}
