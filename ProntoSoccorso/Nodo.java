package ProntoSoccorso;

public class Nodo{
    private Nodo link;
    private Paziente info;
  
    public Nodo(Paziente info){
        this.info=info;
        link=null;
    }
  
    public void setLink(Nodo link){
        this.link=link;
    }
  
    public Nodo getLink(){
        return link; 
    }
  
    public void setinfo(Paziente info){
        this.info=info;
    }
  
    public Paziente getInfo(){
        return info;
    }
}