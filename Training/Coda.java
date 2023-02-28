package Training;

public class Coda {
    private Nodo head;
    private Nodo tail;
    public Coda(){
        head = null; //elimino
        tail = null; //inserisco
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void queue(char lettera){
        Nodo p = new Nodo(lettera);
        if(isEmpty()){
            tail = p;
            head = p;
        }else{
            tail.setLink(p);
            tail = p;
        }
    }

    public Nodo dequeue(){
        Nodo elimino;
        if(isEmpty()){
            return null;
        }else{
            elimino = new Nodo(head);
            head = head.getLink();
            return elimino;
        }
    }

    public String toString(){
        String s = " ";
        if(isEmpty()){
            s = "Vuota";
            return s;
        }
        Nodo p = head;
        while(p != null){
            s+=p.getInfo();
            p = p.getLink();
        }
        return s;
    }
}
