package Training;

public class Nodo{
    private char info;
    private Nodo link;

    public Nodo(char info){
        this.info = info;
        this.link = null;
    }

    public Nodo(Nodo p){
        this.info = p.getInfo();
        this.link = p.getLink();
    }

    public char getInfo() {
        return info;
    }

    public Nodo getLink() {
        return link;
    }

    public void setInfo(char info) {
        this.info = info;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }
}