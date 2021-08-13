package modelos;

import java.util.ArrayList;

public class Estudiante extends Persona{
    protected String matricula;
    protected String facultad;
    private ArrayList<Paralelo> paralelos;
    private ArrayList<RegistroNotas> NotasParcial;
    private ArrayList<RegistroNotas> NotasFinal;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    public double CalcularNota(Paralelo p, RegistroNotas notas){
        double nota=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                double notaTeorico=(notas.getExamen()+notas.getDeberes()+notas.getLecciones())*0.80;
                double notaPractico=(notas.getTalleres())*0.20;
                nota=notaTeorico+notaPractico;
            }
        }
        return nota;
    }
    
    public double CalcularNotaTotal(Paralelo p){
        double notaTotal=0;
        for(Paralelo par:paralelos){
            if(p.equals(par)){
                notaTotal=(p.getMateria().notaInicial+p.getMateria().notaFinal)/2;
                
            }
        }
        return notaTotal;
        
    }
}