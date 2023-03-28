package TODOLIST;

import java.util.ArrayList;

public class TodoList {
    //arraylist di tipo Attività
    private ArrayList<Attivita> listaAttività;

    //costruttore
    public TodoList(){
        listaAttività = new ArrayList<Attivita>();
    }

    //metodo per aggiungere un'attività
    public void addAttivita(Attivita attività){
        listaAttività.add(attività);
    }

    //metodo per rimuovere un'attività dato l'indice
    public void removeAttivita(int indice){
        listaAttività.remove(indice);
    }

    //modifica la priorità di un'attività dato l'indice
    public void modificaPriorita(int indice, int priorità){
        listaAttività.get(indice).setPriorita(priorità);
    }

    //stampo la lista dalla più alta priorità alla più bassa
    public void printTodoList(){
        for(int i = 0; i < listaAttività.size(); i++){
            for(int j = 0; j < listaAttività.size(); j++){
                if(listaAttività.get(i).getPriorita() > listaAttività.get(j).getPriorita()){
                    Attivita temp = listaAttività.get(i);
                    listaAttività.set(i, listaAttività.get(j));
                    listaAttività.set(j, temp);
                }
            }
        }
        for(Attivita attività : listaAttività){
            System.out.println(attività.getAttivita() + " " + attività.getPriorita());
        }
    }
}
