package Lista;

public class Parola {
    private Nodo head;
    private int elementi;
  
    public Parola(){
      head = null;
      elementi = 0;
    }
  
    public void inserisciInTesta(char lettera){
      Nodo l = new Nodo(lettera);
      l.setLink(head);
      head = l;
      elementi++;
    }
  
    public void inserisciInCoda(char lettera){
      Nodo pn = new Nodo(lettera);
      
      if(head == null)
        head = pn;
      else{
        Nodo p = head;
        while(p.getLink() != null)
          p = p.getLink();
  
        p.setLink(pn);
      }
      elementi++;
    }
  
    public int inserisciInPosizione(char lettera, int posizione){
      Nodo pn = new Nodo(lettera);
      int i = 0;
  
      if(posizione < 0)
        return -1;
      if(posizione == 1){
        inserisciInTesta(lettera);
        return 0;
      }
      else{
        Nodo p = head;
  
        if(posizione > elementi)
          inserisciInCoda(lettera);
        else{
          while(i < posizione -1){
            p = p.getLink();
            pn.setLink(p.getLink());
          }
          
          p.setLink(pn);
          elementi++;
        }
        
        return 0;
      }
      
    }
  
    public String toString(){
      Nodo p = head;
      String s = "Parola: ";
      while(p != null){
        s = s + p.getInfo();
        p = p.getLink();
      }
      return s;
    }
  
    
  }