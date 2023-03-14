package NabilLista;

public class Lista {
    private Nodo head;
    private int elementi;

    public Lista(){
        head = null;
        elementi = 0;
    }

    public int getElementi() {
        return elementi;
    }

    public Nodo getHead() {
        return head;
    }

    public void InserisciInTesta(char lettera){
        Nodo p = new Nodo(lettera);
        p.setLink(head);
        head = p;
        elementi++;
    }

    public void Duplica(){
        if(head == null){
            return;
        }
        Nodo i;
        if(elementi == 1){
            i = new Nodo(head);
            head.setLink(i);
            elementi++;
            return;
        }

        Nodo p = head;
        while (p != null) {
            i = new Nodo(p);
            i.setLink(p.getLink());
            p.setLink(i);

            p = p.getLink().getLink();
            elementi++;
        }


    }



    public String toString(){
        String s = " ";
        if (head == null) {
            s = "Parola vuota";
        } else {
            Nodo p = head;
            while(p != null){
                s += p.getInfo();
                p = p.getLink();
            }
        }

        return s;
    }

    
    public void EliminaInPosizione(int posizione){
        if(head == null){
            return;
        }
        if(posizione == 1){
            head = head.getLink();
            elementi--;
            return;
        }

        Nodo p = head;
        int i = 0;
        while (i < posizione - 1) {
            p = p.getLink();
            i++;
        }
        
        p.setLink(p.getLink().getLink());
        elementi--;
    }

    public int trovaVocale(char vocale, Nodo p){
        int n = 1;
        
        if(p.getInfo() == vocale){
            return n;
        }
        else{
            n++;
            trovaVocale(vocale, p.getLink());
        }
        return 0;
    }
}
