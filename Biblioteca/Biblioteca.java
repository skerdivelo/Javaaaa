import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Biblioteca {
    private static int MAX_LIBRI = 1000;
    private Libro[] libri;

    public Biblioteca() {
        libri = new Libro[MAX_LIBRI];
    }

    public void aggiungiLibro(Libro libro) {
        for (int i = 0; i < MAX_LIBRI; i++) {
            if (libri[i] == null) {
                libri[i] = libro;
                break;
            }
        }
    }

    public Libro cercaLibro(String titolo) {
        for (int i = 0; i < MAX_LIBRI; i++) {
            if (libri[i] != null && libri[i].getTitolo().equals(titolo)) {
                System.out.println("Libro trovato!");
                return libri[i];
            }
        }
        return null;
    }

    public Libro cercaLibriAutore(String autore) {
        for (int i = 0; i < MAX_LIBRI; i++) {
            if (libri[i] != null && libri[i].getAutore().equals(autore)) {
                return libri[i];
            }
        }
        return null;
    }

    public int contaLibri(){
        int count = 0;
        for (int i = 0; i < MAX_LIBRI; i++) {
            if (libri[i] != null) {
                count++;
            }
        }
        return count;
    }

    public void caricaVettore(String titolo, String autore, int annoDiPubblicazione, String editore) {
        Libro libro = new Libro(titolo, autore, annoDiPubblicazione, editore);
        aggiungiLibro(libro);
    }
    
    public void salvaFile() throws IOException{
        FileOutputStream file = new FileOutputStream("/workspaces/Javaaaa/Biblioteca/Libri.dat");
        ObjectOutputStream oos = new ObjectOutputStream(file);
        oos.writeObject(libri);
        oos.close();
    }
    
}
