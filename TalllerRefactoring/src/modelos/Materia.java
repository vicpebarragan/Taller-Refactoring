package modelos;

public class Materia {
    private String codigo;
    private String nombre;
    private String facultad;
    private double notaInicial;
    private double notaFinal;
    
    public double getNotaInicial(){
        return notaInicial;
    }

    public double getNotaFinal(){
        return notaFinal;
    }

    public String getFacultad(){
        return facultad;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCodigo(){
        return codigo;
    }
}
