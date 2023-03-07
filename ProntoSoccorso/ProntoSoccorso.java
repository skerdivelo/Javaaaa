package ProntoSoccorso;

import java.io.*;

public class ProntoSoccorso {
    private Nodo head;
    private Nodo tail;

    public ProntoSoccorso() {
        head = null;
        tail = null;
    }

    public void enqueue(Paziente p) {
        Nodo n = new Nodo(p);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.setLink(n);
            tail = n;
        }
    }


    public void dequeueAll() {
        Nodo n = head;
        Nodo prev = null;
        while (n != null) {
            if (n.getInfo().getColore() == 'r') {
                if (n == head) {
                    head = head.getLink();
                    n = head;
                } else {
                    prev.setLink(n.getLink()); //cambia il link del nodo precedente al nodo da eliminare
                    n = n.getLink(); //passa al nodo successivo
                }
            } else {
                prev = n; //salva il nodo precedente
                n = n.getLink(); //passa al nodo successivo
            }
        }
        n = head;
        prev = null;
        while (n != null) {
            if (n.getInfo().getColore() == 'g') {
                if (n == head) {
                    head = head.getLink();
                    n = head;
                } else {
                    prev.setLink(n.getLink());
                    n = n.getLink();
                }
            } else {
                prev = n; //salva il nodo precedente
                n = n.getLink(); //passa al nodo successivo
            }
        }
        n = head;
        prev = null;
        while (n != null) {
            if (n.getInfo().getColore() == 'v') {
                if (n == head) {
                    head = head.getLink();
                    n = head;
                } else {
                    prev.setLink(n.getLink());
                    n = n.getLink();
                }
            } else {
                prev = n;
                n = n.getLink();
            }
        }
    }
    

    public void stampa() {
        Nodo n = head;
        if (n == null) {
            System.out.println("Lista vuota");
        }
        while (n != null) {
            System.out.println(n.getInfo());
            n = n.getLink();
        }
    }

    //salva la lista su file
    public void salva() {
        try {
            FileWriter fw = new FileWriter("ProntoSoccorso.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            Nodo n = head;
            while (n != null) {
                bw.write(n.getInfo().toString());
                bw.newLine();
                n = n.getLink();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Errore di I/O");
        }
    }
}
