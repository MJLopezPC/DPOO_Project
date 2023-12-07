package JUZGADO;

import java.io.Serializable;

public class Expediente implements Serializable{
    private String numero;
    private int anno;
    private String delito;
    private int estimacion;
    private String autor;
    private String victima;
    private int pena;

    public void setPena(int pena) {
        this.pena = pena;
    }

    public Expediente(String numero, int anno, String delito, int estimacion, String autor, String victima) {
        this.numero = numero;
        this.anno = anno;
        this.delito = delito;
        this.estimacion = estimacion;
        this.autor = autor;
        this.victima = victima;
    }

    public String getNumero() {
        return numero;
    }

    public int getAnno() {
        return anno;
    }

    public String getDelito() {
        return delito;
    }

    public int getEstimacion() {
        return estimacion;
    }

    public String getAutor() {
        return autor;
    }

    public String getVictima() {
        return victima;
    }

    public int getPena() {
        return pena;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setVictima(String victima) {
        this.victima = victima;
    }
    
    
}
