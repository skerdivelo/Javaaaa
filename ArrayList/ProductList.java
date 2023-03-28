package ArrayList;

import java.util.ArrayList;

public class ProductList {
    //creo arraylist di tipo Negozio
    private ArrayList<Product> listaProdotti;
    
    //costruttore
    public ProductList(){
        listaProdotti = new ArrayList<Product>();
    }
    //metodo per aggiungere un prodotto
    public void addProduct(Product prodotto){
        listaProdotti.add(prodotto);
    }

    //metodo per rimuovere un prodotto
    public void removeProduct(String nome){
        for(Product prodotto : listaProdotti){
            if(prodotto.getNome().equals(nome)){
                listaProdotti.remove(prodotto);
                break;
            }
        }
    }

    //stampo la lista dei prodotti
    public void printProductList(){
        for(Product prodotto : listaProdotti){
            System.out.println(prodotto.getNome() + " " + prodotto.getPrezzo());
        }
    }

}
