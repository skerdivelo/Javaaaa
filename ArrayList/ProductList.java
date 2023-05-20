package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

public class ProductList {
    //creo arraylist di tipo Negozio
    private ArrayList<Product> listaProdotti;
    
    //costruttore
    public ProductList(){
        listaProdotti = new ArrayList<Product>();
    }
    //metodo per aggiungere un prodotto
    /*
    public void addProduct(Product prodotto){
        listaProdotti.add(prodotto);
    } */

    //aggiungo un prodotto con ciclo iterativo
    public void addProduct(Product prodotto){
        listaProdotti.add(prodotto);
    }

    //metodo per rimuovere un prodotto
    /*
    public void removeProduct(String nome){
        for(Product prodotto : listaProdotti){
            if(prodotto.getNome().equals(nome)){
                listaProdotti.remove(prodotto);
                break;
            }
        }
    }
    */
    //rimuvo un prodotto con ciclo for each
    public void removeProduct(String nome){
        //ciclo for each
        for(Product prodotto : listaProdotti){
            if(prodotto.getNome().equals(nome)){
                listaProdotti.remove(prodotto);
                break;
            }
        }
    }

    //rimuovo con iteratore
    public void removeProduct2(String nome){
        Iterator<Product> iter = listaProdotti.iterator();
        while(iter.hasNext()){
            Product prodotto = iter.next();
            if(prodotto.getNome().equals(nome)){
                iter.remove();
                break;
            }
        }
    }

    public void ordina1(){
        Collections.sort(listaProdotti);
    }

    public void ordina(){
        Collections.sort(listaProdotti, new Comparator<Product>(){
            public int compare(Product p1, Product p2){
                return p1.getNome().compareTo(p2.getNome());
            }
        });
    }

    //metodo per stampare la lista dei prodotti
    public void printProduct(){
        //ciclo for each
        for(Product prodotto : listaProdotti){
            System.out.println(prodotto.getNome() + " " + prodotto.getPrezzo());
        }
    }
    
}
