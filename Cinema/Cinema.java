package Cinema;

public class Cinema {
    private Nodo head;
    private Nodo tail;
    private int elementi;

    public Cinema() {
        this.head = null;
        this.tail = null;
        this.elementi = 0;
    }

    public void enqueue(Persona p) {
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

    public Persona dequeue() {
        if (head == null) {
            return null;
        } else {
            Persona p = head.getInfo();
            head = head.getLink();
            elementi--;
            return p;
        }
    }

    public int getElementi() {
        return elementi;
    }

    public void stampa() {
        Nodo n = head;
        while (n != null) {
            System.out.println(n.getInfo());
            n = n.getLink();
        }
    }

}
