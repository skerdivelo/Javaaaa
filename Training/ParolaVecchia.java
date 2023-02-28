package Training;

public class ParolaVecchia {
    private NodoVecchio head;
    private int elementi;
    
    public ParolaVecchia(){
        head = null;
        elementi = 0;
    }

    public void inserisciInTesta(char lettera){
        NodoVecchio p = new NodoVecchio(lettera);
        p.setLink(head);
        head = p;
        elementi++;
    }

    public NodoVecchio eliminaInTesta(){
        NodoVecchio eliminato;
        if(head == null){
            return null;
        }
        eliminato = new NodoVecchio(head);
        head = head.getLink();
        elementi--;
        return eliminato;
    }

    public void aggiungiInCoda(char lettera){
        NodoVecchio pn = new NodoVecchio(lettera);
        NodoVecchio p = head;
        if(head == null)
            head = pn;
        while(p.getLink() != null){
            p = p.getLink();
        }
        p.setLink(pn);
        elementi++;
    }
    public NodoVecchio eliminaInCoda(){
        if(head == null){
            return null;
        }

        NodoVecchio eliminato;
        if(head.getLink()==null){
            eliminato = new NodoVecchio(head);
            head = null;
            elementi--;
            return eliminato;
        }
        NodoVecchio p = head;
        while(p.getLink().getLink() != null){
            p = p.getLink();
        }
        eliminato = new NodoVecchio(p);
        p.setLink(null);
        elementi--;
        return eliminato;
    }
 

    public String toString(){
        NodoVecchio p = head;
        String s = " ";
        while(p != null){
            s+=(" "+p.getInfo());
            p = p.getLink();
        }
        return s;
    }
}
