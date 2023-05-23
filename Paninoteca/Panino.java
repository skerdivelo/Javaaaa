package Paninoteca;

import java.util.ArrayList;

public class Panino implements Comparable<Panino> {
    private String tipoPanino;
    private ArrayList<String> ingredienti = new ArrayList<String>();
    //crudo, cotto, salame, tonno, pomodoro, mozzarella, lattuga, insalata iceberg e capperi

    public Panino(String tipoPanino) {
        this.tipoPanino = tipoPanino;
    }

    public void aggiungiIngrediente(String ingrediente) {
        System.out.println("Aggiungo " + ingrediente);
        switch (ingrediente) {
            case "crudo":
                ingredienti.add("crudo");
                break;
            case "cotto":
                ingredienti.add("cotto");
                break;
            case "salame":
                ingredienti.add("salame");
                break;
            case "tonno":
                ingredienti.add("tonno");
                break;
            case "pomodoro":
                ingredienti.add("pomodoro");
                break;
            case "mozzarella":
                ingredienti.add("mozzarella");
                break;
            case "lattuga":
                ingredienti.add("lattuga");
                break;
            case "insalata iceberg":
                ingredienti.add("insalata iceberg");
                break;
            case "capperi":
                ingredienti.add("capperi");
                break;
            default:
                System.out.println("Ingrediente non disponibile");
                break;
        }
    }

    public void rimuoviIngrediente(String ingrediente) {
        if (ingredienti.contains(ingrediente)) {
            ingredienti.remove(ingrediente);
        }
    }

    public String getTipoPanino() {
        return tipoPanino;
    }

    public ArrayList<String> getIngredienti() {
        return ingredienti;
    }

    public String toString() {
        String s = "Panino " + tipoPanino + " con ";
        for (String ingrediente : ingredienti) {
            s += ingrediente + ", ";
        }
        return s;
    }

    @Override
    public int compareTo(Panino o) {
        return this.tipoPanino.compareTo(o.tipoPanino);
    }

}
