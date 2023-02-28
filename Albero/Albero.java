package Albero;
public class Albero {
    private NodoAlbero ptr;
    
    public Albero(){
        ptr=null;
    }
    
    public void visitaAnticipata() {
        visitaAnticipata(ptr);
    }
    
    private void visitaAnticipata(NodoAlbero p) {
     if (p == null)
       return;
     System.out.println(p.getInfo());
     if (p.getFirstChild() != null)
       visitaAnticipata(p.getFirstChild());
     if (p.getFirstSibling() != null)
       visitaAnticipata(p.getFirstSibling());
    }
    
    private NodoAlbero cercaNodo(NodoAlbero p,char chiave) {
     
       NodoAlbero p1=null; 
     if (p == null)
       return null;
    
     if (p.getInfo()==chiave) return p;  //ricerca con successo
     if (p.getFirstChild() != null)      //ricerca verso il figlio
       p1=cercaNodo(p.getFirstChild(),chiave);
     if (p1!=null) return p1; //interruzione della ricorsione  
     if (p.getFirstSibling() != null) //ricerca verso il fratello
        p1=cercaNodo(p.getFirstSibling(),chiave);
     if (p1!=null) return p1; //interruzione della ricorsione  
     return null;
    }
    
    public void aggiungiFratello(char chiave, char info) {
     NodoAlbero n=new NodoAlbero(info) ;
     if (ptr==null){ //albero vuoto inserimento radice
      ptr=n;
      return;
     } 
     NodoAlbero p;
     p=cercaNodo(ptr,chiave);
     if (p!=null) p.setFirstSibling(n);
     else System.out.println ("nodo  "+chiave+" non trovato!" );
     
    }
    public void aggiungiFiglio(char chiave, char info) {
     NodoAlbero n=new NodoAlbero(info) ;
     if (ptr==null){ //albero vuoto inserimento radice
      ptr=n;
      return;
     } 
     NodoAlbero p;
     p=cercaNodo(ptr,chiave);
     if (p!=null) p.setFirstChild(n);
     else System.out.println ("nodo  "+chiave+" non trovato!" );
    }
    
    
       /*  public static void main(String[] args) {
            Albero a=new Albero();
            a.aggiungiFiglio('a', 'a');
            
            a.aggiungiFiglio('a', 'b');
            a.aggiungiFratello('b','c');
            a.aggiungiFratello('c','d');
            
            a.aggiungiFiglio('b', 'e');
            a.aggiungiFratello('e','f');
            a.aggiungiFratello('f','g');
            
            a.aggiungiFiglio('c', 'h');
            a.aggiungiFratello('h','i');
            
            a.aggiungiFiglio('d','l');
            a.visitaAnticipata();
        }*/
    }