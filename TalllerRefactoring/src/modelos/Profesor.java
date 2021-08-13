package modelos;

import java.util.ArrayList;

public class Profesor extends Persona{
    private String codigo;
    private ArrayList<Paralelo> paralelos;
    private int añosdeTrabajo;
    private String facultad;
    private double BonoFijo;

    public Profesor(String codigo, String nombre, String apellido, int edad, String direccion, String telefono) {
        this.codigo = codigo;
        super(nombre,apellido,edad,direccion, telefono)
        paralelos= new ArrayList<>();
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    } 
}