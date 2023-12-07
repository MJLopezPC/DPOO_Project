package JUZGADO;

import java.io.Serializable;

public class Circunstancia implements Serializable{
    protected int valor;
    protected String num_exp;

    public Circunstancia(int valor, String num_exp) {
        this.valor = valor;
        this.num_exp = num_exp;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public String getNum_exp() {
        return num_exp;
    }
    
}
