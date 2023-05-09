import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Acquirente {
    private String nome;
    private String cognome;
    private String email;
    private String telefono;
    private String chiVende;
    private double renditaCatastale;
    private double prezzo;
    private double caparra;
    private boolean acquistoConMutuo;

    public Acquirente(String nome, String cognome, String email, String telefono, String chiVende,
            double renditaCatastale, double prezzo, double caparra, boolean acquistoConMutuo) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.telefono = telefono;
        this.chiVende = chiVende;
        this.renditaCatastale = renditaCatastale;
        this.prezzo = prezzo;
        this.caparra = caparra;
        this.acquistoConMutuo = acquistoConMutuo;
    }

    //setter e getter
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }
    
}
