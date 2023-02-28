package Training;

public class ParolaConTutto {
    private Nodo head;
    private int elementi;

    public ParolaConTutto(){
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
        if(head == null)
            return null;
        Nodo eliminato = new Nodo(head);
        head = head.getLink();
        elementi--;
        return eliminato;
    }

    public void aggiungiInCoda(char lettera){
        Nodo pn = new Nodo(lettera);

        if(head == null)
            head = pn;
        Nodo p = head;
        while(p.getLink() != null){
            p = p.getLink();
        }
        p.setLink(pn);
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
        elementi--;
        p.setLink(null);
        return eliminato;
    }

    public void inserisciInPosizione(int pos, char lettera){
        Nodo pn = new Nodo(lettera);
        if(pos < 0){
            head = pn;
            return;
        }else if(pos > elementi){
            aggiungiInCoda(lettera);
            return;
        }
        Nodo p = head;
        for(int i = 0; i < pos -1 ; i++){
            p = p.getLink();
        }
        pn.setLink(p.getLink());
        p.setLink(pn);
        elementi++;
        return;
    }

    public Nodo eliminaInPosizione(int pos){
        if(pos < 0 || pos > elementi){
            return null;
        }
        Nodo eliminato;
        if(pos == 0){
            eliminato = new Nodo(head);
            head = head.getLink();
            elementi--;
            return eliminato;
        }
        Nodo p = head;
        for(int i = 0; i < pos -1; i++){
            p = p.getLink();
        }
        eliminato = new Nodo(p.getLink());
        p.setLink(p.getLink().getLink()); //qui punto al nodo successivo al nodo da eliminare
        elementi--;
        return eliminato;
    }
    
    public void scambia(int pos1, int pos2){
        if(pos1 < 0 || pos1 > elementi || pos2 < 0 || pos2 > elementi){
            return;
        }
        Nodo p1 = head;
        Nodo p2 = head;
        for(int i = 0; i < pos1; i++){
            p1 = p1.getLink();
        }
        for(int i = 0; i < pos2; i++){
            p2 = p2.getLink();
        }
        //scambia i due nodi non le info
        Nodo temp = p1.getLink();
        p1.setLink(p2.getLink());
        p2.setLink(temp);
    }

    //metodo che avendo una lista a->b->c->d scambia i nodi in modo b->a->d->c
    public void scambiaNodi(){
        Nodo p = head;
        Nodo p2 = head;
        for(int i = 0; i < elementi -1; i++){
            p2 = p2.getLink();
        }
        Nodo temp = p.getLink(); 
        p.setLink(p2.getLink());    
        p2.setLink(temp);
    }

    //sostiusci il primo nodo con l'ultimo
    public void inverti(){
        Nodo p = head;
        Nodo p2 = head;
        for(int i = 0; i < elementi -1; i++){
            p2 = p2.getLink();
        }
        char temp = p.getInfo();
        p.setInfo(p2.getInfo());
        p2.setInfo(temp);
    }

    public void queue(){
        Nodo p = head;
        while(p != null){
            System.out.print(p.getInfo() + " ");
            p = p.getLink();
        }
        System.out.println();
    }
}
