package JUZGADO;

import java.io.Serializable;

public class Hecho implements Serializable{
    private String horario;
    private String influencia_drogas;
    private String lugar;
    private String medios_empleados;
    private String planificacion;
    private String numExp;

    public Hecho(String horario, String influencia_drogas, String lugar, String medios_empleados, String planificacion, String numExp) {
        this.horario = horario;
        this.influencia_drogas = influencia_drogas;
        this.lugar = lugar;
        this.medios_empleados = medios_empleados;
        this.planificacion = planificacion;
        this.numExp = numExp;
    }

    public String getNumExp() {
        return numExp;
    }
    
    
}
