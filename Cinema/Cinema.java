package Cinema;

import Students.Studente;

public class Cinema {
    private Nodo head;
    private Nodo tail;
    private int elementi;

    public Cinema() {
        this.head = null;
        this.tail = null;
        this.elementi = 0;
    }

    public void enqueue(Studente p) {
        Nodo n = new Nodo(p);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.setLink(n);
            tail = n;
        }
        elementi++;
    }

    public Studente dequeue() {
        if (head == null) {
            return null;
        } else {
            Studente p = head.getInfo();
            head = head.getLink();
            elementi--;
            return p;
        }
    }

    public int getElementi() {
        return elementi;
    }

    public void stampa() {
        //stampo tail
        System.out.println("La persona che sta per entrare è: "+tail.toString()+"\n--------------------------------------------");
        //stampo la lista
        Nodo n = head;
        while (n != null) {
            System.out.println(n.toString());
            n = n.getLink();
        }
    }

}
