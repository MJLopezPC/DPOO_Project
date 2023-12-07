package JUZGADO;

import java.io.Serializable;

public class Autor implements Serializable{
    private String nombre;
    private int edad;
    private String numExp;
    private String animos_lucro;
    private String antecedentes_penales;
    private String arrepentimiento;
    private String concepto_vecinal;
    private String educacion;
    private String trabajo;
    private String venganza;

    public Autor(String animos_lucro, String antecedentes_penales, String arrepentimiento, String concepto_vecinal, String educacion, String trabajo, String venganza, String nombre, int edad, String numExp) {
        this.animos_lucro = animos_lucro;
        this.antecedentes_penales = antecedentes_penales;
        this.arrepentimiento = arrepentimiento;
        this.concepto_vecinal = concepto_vecinal;
        this.educacion = educacion;
        this.trabajo = trabajo;
        this.venganza = venganza;
        this.nombre = nombre;
        this.edad = edad;
        this.numExp = numExp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumExp() {
        return numExp;
    }
    
}
