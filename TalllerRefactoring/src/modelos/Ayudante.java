package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante{
    private ArrayList<Paralelo> paralelosAyudantia;

    Ayudante(ArrayList<Paralelo> paralelos)){
    	paralelosAyudantia = paralelos;
    }

    public void anadirParalelos(Paralelo p){
        paralelosAyudantia.add(p);
    } 

    public void MostrarParalelos(){
        for(Paralelo par:paralelosAyudantia){
            //Muestra la info general de cada paralelo
        }
    }
}
