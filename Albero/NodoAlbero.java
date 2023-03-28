package Albero;



public class NodoAlbero {

    private char inf
    private NodoAlbero pfc;
    private NodoAlbero pfs;
   
    public NodoAlbero(char info) {
     this.info = info;
     pfc = null;
     pfs = null;
    }
   
    public void setInfo(char info) {
     this.info = info;
    }
   
    public char getInfo() {
     return info;
    }
   
    public void setFirstChild(NodoAlbero pfc) {
     this.pfc = pfc;
    }
   
    public NodoAlbero getFirstChild() {
     return pfc;
    }
   
    public void setFirstSibling(NodoAlbero pfs) {
     this.pfs = pfs;
    }
   
    public NodoAlbero getFirstSibling() {
     return pfs;
    }
   }
