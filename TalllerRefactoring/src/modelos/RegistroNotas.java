package modelos;

import java.util.ArrayList;

public class RegistroNotas {
    private double examen;
    private double deberes;
    private double lecciones;
    private double talleres;

    public double getExamen(){
        return examen;
    }

    public double getDeberes(){
        return deberes;
    }

    public double getLecciones(){
        return lecciones;
    }

    public double getTalleres(){
        return talleres;
    }

    public void setExamen(double e){
        examen = e;
    }

    public void setDeberes(double d){
        deberes = d;
    }
    
    public void setLecciones(double l){
        lecciones = l;
    }

    public void setTalleres(double t){
        talleres = t;
    }
}