package NabilLista;

public class Nodo{
    private char info;
    private Nodo link;
  
    public Nodo(char info){
      this.info = info;
      link = null;
    }
    public Nodo(Nodo n){
        this.info = n.info;
        link = null;
    }
  
    public void setInfo(char info){
      this.info = info;
    }
  
    public char getInfo(){
      return info;
    }
  
    public void setLink(Nodo link){
      this.link = link;
    }
  
    public Nodo getLink(){
      return link;
    }
}
