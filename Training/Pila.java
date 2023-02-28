package Training;

public class Pila {
    private Nodo head;

    public Pila(){
        head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }
    public void push(char lettera){
        Nodo p = new Nodo(lettera);
        p.setLink(head);
        head = p;
    }

    public Nodo pop(){
        if(isEmpty()){
            return null;
        }else{
            Nodo p = new Nodo(head);
            head = head.getLink();
            return p;
        }
        
    }

    public String toString(){
        String s = " ";
        Nodo p = head;
        if(isEmpty()){
            s = "Pila Vuota";
            return s;
        }else{
            while(p != null){
                s+=p.getInfo();
                p = p.getLink();
            }
            return s;
        }
    }
}
