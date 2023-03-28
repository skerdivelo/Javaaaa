package TODOLIST;

public class Attivita {
    private String attività;
    private int priorità;

    public Attivita(String attività, int priorità){
        this.attività = attività;
        this.priorità = priorità;
    }

    public String getAttivita() {
        return attività;
    }

    public int getPriorita() {
        return priorità;
    }

    public void setAttivita(String attività) {
        this.attività = attività;
    }

    public void setPriorita(int priorità) {
        if(priorità > 0 && priorità <= 5){
            this.priorità = priorità;
        }else{
            System.out.println("Priorità non valida");
        }
    }
}
