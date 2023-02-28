package Training;

public class NodoVecchio{
    private char info;
    private NodoVecchio link;

    public NodoVecchio(char info){
        this.info = info;
        this.link = null;
    }

    public NodoVecchio(NodoVecchio nodo){
        this.info = nodo.getInfo();
        this.link = nodo.getLink();
    }
    
    public char getInfo(){
        return info;
    }

    public NodoVecchio getLink(){
        return link;
    }

    public void setInfo(char info){
        this.info = info;
    }

    public void setLink(NodoVecchio link){
        this.link = link;
    }
}