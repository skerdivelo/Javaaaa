package ArrayList;

public class Product  implements Comparable<Product>{
    private String nome;
    private int prezzo;

    public Product(String nome, int prezzo){
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public int compareTo(Product o) {
        return this.nome.compareTo(o.getNome());
    }

}
