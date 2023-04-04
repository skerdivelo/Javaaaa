package Cinema;

import Students.Studente;

public class Nodo{
    private Studente info;
    private Nodo link;

    public Nodo(Studente info){
        this.info = info;
        this.link = null;
    }

    public Studente getInfo() {
        return info;
    }

    public Nodo getLink() {
        return link;
    }

    public void setInfo(Studente info) {
        this.info = info;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "info=" + info;
    }
}