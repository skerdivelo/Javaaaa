package Tambainte;

import javax.lang.model.element.Element;

public class Pila {
    private Nodo head;

    public Pila(){
        head=null;
    }

    public boolean isEmpty(){
        if(head==null){
            return true;  
        } 
        else{
            return false;
        }
    }

    public void push(char oggetto){
        Nodo p=new Nodo(oggetto);
        p.setLink(head);
        head=p;
    }

    public char pop(){
        if(isEmpty()){
            return ' ';
        }
        Nodo eliminato=head;
        head=head.getLink();
        return eliminato.getInfo();
    }

    public String toString(){
        Nodo p=head;
        String s=" ";
        if(isEmpty()){
            s+="null";
        }
        else{
            
            while(p!= null){
                s+=p.getInfo();
                p=p.getLink();

            }
            

        }
        return s;
    }
}
