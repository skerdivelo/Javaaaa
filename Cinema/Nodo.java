package Cinema;

public class Nodo{
    private Persona info;
    private Nodo link;

    public Nodo(Persona info){
        this.info = info;
        this.link = null;
    }

    public Persona getInfo() {
        return info;
    }

    public Nodo getLink() {
        return link;
    }

    public void setInfo(Persona info) {
        this.info = info;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }
}