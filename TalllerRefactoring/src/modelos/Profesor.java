package modelos;

import java.util.ArrayList;

public class Profesor extends Persona{
    public String codigo;
    public InformacionAdicionalProfesor info;
    public ArrayList<Paralelo> paralelos;
    public int añosdeTrabajo;
    public String facultad;
    public double BonoFijo;

    public Profesor(String codigo, String nombre, String apellido, int edad, String direccion, String telefono) {
        this.codigo = codigo;
        super(nombre,apellido,edad,direccion, telefono)
        paralelos= new ArrayList<>();
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    
    
}
