import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Biblioteca {
    private static int MAX_LIBRI = 1000;
    private Libro[] libri;

    public Biblioteca(){
        libri = new Libro[MAX_LIBRI];
    }
    
    public void aggiungiLibro(Libro l){
        int i = 0;
        while(libri[i]!=null){
            i++;
        }
        libri[i]=l;
    }

    public Libro cercaLibro(String titolo){
        int i = 0;
        while(libri[i]!=null || i<MAX_LIBRI){
            if(libri[i].getTitolo().equals(titolo)){
                Libro l = new Libro(libri[i]);
                return l;
            }
            i++;
        }
        return null;
    }

    public Libro[] cercaAuore(String autore){
        int i = 0, j = 0;
        Libro l[] = new Libro[MAX_LIBRI];
        while(libri[i]!=null || i<MAX_LIBRI){
            if(libri[i].getAutore().equals(autore)){
                l[j]=libri[i];
                j++;
            }
            i++;
        }
        j=0;
        while(l[j]!=null){
            System.out.println(l[j].getTitolo());
        }
        if(l[0]==null){
            return null;
        }else{
            return l;
        }
    }


    public void stampaVettore(){
        int i = 0;
        while(libri[i]!=null){
            System.out.println("L'autore è: "+libri[i].getAutore()+", il titolo è: "+libri[i].getTitolo());
            i++;
        }
    }
}
