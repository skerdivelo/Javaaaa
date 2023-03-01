package esercizio33;

public class Nodo {
    private Nodo link;
    private Mail info;

    public Nodo(Mail info){
        link = null;
        this.info = info;
    }
    public void setLink(Nodo link){
        this.link = link;
    }
    public Nodo getLink(){
        return link;
    }
    public void setInfo(Mail info){
        this.info = info;
    }
    public Mail getInfo(){
        return info;
    }

}
