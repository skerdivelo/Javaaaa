package Training;

public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();
        /*
        Coda c = new Coda();
        c.queue('a');
        c.queue('b');
        c.queue('c');
        c.queue('d');
        System.out.println(c.toString());
        c.dequeue();
        System.out.println(c.toString());
        c.dequeue();
        System.out.println(c.toString());
        c.dequeue();
        System.out.println(c.toString());
        c.dequeue();
        c.queue('e');
        c.queue('f');
        Nodo p = c.dequeue();
        System.out.println(p.getInfo());
        */
        //-------------------------------//
        pila.push('i');
        pila.push('d');
        pila.push('r');
        pila.push('e');
        pila.push('k');
        pila.push('s');
        System.out.println(pila.toString());
        pila.pop();
        System.out.println(pila.toString());
        pila.pop();
        System.out.println(pila.toString());
        pila.pop();
        System.out.println(pila.toString());
        pila.pop();
        System.out.println(pila.toString());
        pila.pop();
        System.out.println(pila.toString());
    }
}
