package PortoTuristico;

class PortoTuristico {
    private Barca[] postiBarca;

    public PortoTuristico() {
        postiBarca = new Barca[100];
    }

    public boolean assegnaPosto(Barca barca, int numeroPosto) {
        if (numeroPosto < 1 || numeroPosto > 100) {
            System.out.println("Numero posto non valido");
            return false;
        }
        if (numeroPosto <= 20 && barca.getLunghezza() > 10) {
            System.out.println("Questo posto non può ospitare barche più lunghe di 10 metri");
            return false;
        }
        if (barca.getTipologia().equals("vela")) {
            postiBarca[numeroPosto - 1] = barca;
            System.out.println("La barca " + barca.getNome() + " è stata assegnata al posto " + numeroPosto);
            return true;
        }
        else if (barca.getTipologia().equals("motore")) {
            postiBarca[numeroPosto - 1] = barca;
            System.out.println("La barca " + barca.getNome() + " è stata assegnata al posto " + numeroPosto);
            return true;
        }
        else {
            System.out.println("Questo posto non è disponibile per le barche a vela");
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
