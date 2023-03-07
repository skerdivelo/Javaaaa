package ProntoSoccorso;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Mario", "Rossi", 1990, 'm');
        Persona p2 = new Persona("Luigi", "Verdi", 1991, 'm');
        Persona p3 = new Persona("Giuseppe", "Bianchi", 1992, 'm');
        Paziente paz1 = new Paziente(p1, 'r');
        Paziente paz2 = new Paziente(p2, 'g');
        Paziente paz3 = new Paziente(p3, 'v');
        ProntoSoccorso ps = new ProntoSoccorso();
        ps.enqueue(paz2);
        ps.enqueue(paz1);
        ps.enqueue(paz3);
        ps.stampa();
        ps.dequeueAll();
        ps.stampa();
        ps.enqueue(paz3);
        ps.enqueue(paz1);
        ps.enqueue(paz2);
        ps.stampa();
        ps.salva();
        ps.dequeueAll();
        ps.stampa();
        
    }
}
