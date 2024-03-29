package Lista;


public class Nodo{
    private Email info;
    private Nodo link;
  
    public Nodo(Email info){
      this.info = info;
      link = null;
    }
  
    public void setInfo(Email info){
      this.info = info;
    }
  
    public Email getInfo(){
      return info;
    }
  
    public void setLink(Nodo link){
      this.link = link;
    }
  
    public Nodo getLink(){
      return link;
    }

    @Override
    public String toString() {
        return "Nodo{" + "info=" + info + ", link=" + link + '}';
    }
  }