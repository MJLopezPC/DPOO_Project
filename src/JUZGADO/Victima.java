package JUZGADO;

import java.io.Serializable;

public class Victima implements Serializable{
    private String nombre;
    private int edad;
    private String numExp;
    private String dano_fisicos;
    private String dano_morales;
    private String dano_psiquicos;
    private String dano_materiales;

    public Victima(String dano_fisicos, String dano_morales, String dano_psiquicos, String dano_materiales, String nombre, int edad, String numExp) {
        this.dano_fisicos = dano_fisicos;
        this.dano_morales = dano_morales;
        this.dano_psiquicos = dano_psiquicos;
        this.dano_materiales = dano_materiales;
        this.nombre = nombre;
        this.edad = edad;
        this.numExp = numExp;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumExp() {
        return numExp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
