package PortoTuristico;

class PortoTuristico {
    private Barca[] postiBarca;

    public PortoTuristico() {
        postiBarca = new Barca[100];
    }

    public boolean assegnaPosto(int numeroPosto, Barca barca){
        try{
            String nomeBarca = barca.getTipologia();
            nomeBarca.toUpperCase();
            if(numeroPosto<1 || numeroPosto > 100){
                System.out.println("Errore, numero posto non valido");
                return false;
            }else if(numeroPosto <=20 && barca.getLunghezza() > 10){
                System.out.println("Questo posto non può superare ");
            }
                postiBarca[numeroPosto - 1] = barca;
                System.out.println("La barca " + barca.getNome() + " è stata assegnata al posto " + numeroPosto);
                return true;
        }catch(NullPointerException e){
            System.out.println("Errore");
            return false;
        }
    }

    public void liberaPosto(int numeroPosto, int numeroGiorni) {
        if (postiBarca[numeroPosto - 1] == null) {
            System.out.println("Il posto " + numeroPosto + " non è occupato");
            return;
            }
            Barca barca = postiBarca[numeroPosto - 1];
            postiBarca[numeroPosto - 1] = null;
            double costoAffitto;
            if (barca.getTipologia().equals("vela")) {
                costoAffitto = barca.getLunghezza() * 10 * numeroGiorni;
            }
            else {
                costoAffitto = barca.getStazza() * 20 * numeroGiorni;
            }
            System.out.println("La barca " + barca.getNome() + " ha lasciato il posto " + numeroPosto + " e deve pagare un affitto di $" + costoAffitto);
        }
        
        public Barca trovaBarca(int numeroPosto) {
            if (postiBarca[numeroPosto - 1] == null) {
                System.out.println("Il posto " + numeroPosto + " è vuoto");
                return null;
            }
            return postiBarca[numeroPosto - 1];
        }
    }
