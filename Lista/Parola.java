package Lista;
public class Parola {
    private Nodo head;
    private int elementi;
  
    public Parola(){
      head = null;
      elementi = 0;
    }
  
    public void inserisciInTesta(char lettera){
      Nodo z = new Nodo(lettera);
      z.setLink(head);
      head = z;
      elementi++;
    }

    //elimina in testa
    public void eliminaInTesta(){
      if(head == null)
        return;
      head = head.getLink();
      elementi--;
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

    public void eliminaInCoda(){
      if(head == null)
        return;
      if(head.getLink() == null){
        head = null;
        elementi--;
        return;
      }
      Nodo p = head;
      while(p.getLink().getLink() != null)  
        p = p.getLink();
      p.setLink(null);
      elementi--;
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

    public int eliminaInPosizione(int posizione){
      int i = 0;
      if(posizione < 0)
        return -1;
      if(posizione == 1){
        eliminaInTesta();
        elementi--;
        return 0;
      }
      else{
        Nodo p = head;
        if(posizione > elementi)
          eliminaInCoda();
        else{
          while(i < posizione -1){
            p = p.getLink();
          }
          p.setLink(p.getLink().getLink());
          elementi--;
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
  
    public void sostituisciLettera(int k, int h){
      if(k>h)
        return;
      Nodo p = head;
      int i = 0;
      while(i < k){
        p = p.getLink();
        i++;
      }
      sostituisciLettera(k+1, h);
    }

    //elimina il penultimo nodo
    public void eliminaPenultimo(){
      if(head == null)
        return;
      }
      Nodo p = head, pn = head;
      while(p.getLink().getLink() != null){
        pn = p;
        p = p.getLink();
      }
      p.setLink(pn.getLink());
}