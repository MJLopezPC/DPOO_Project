package JUZGADO;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Archivo {
    public void escribirExpediente(){
        try {
            FileOutputStream archivo = new FileOutputStream("expediente.bin");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            
            escritura.writeObject(GUI_PRINCIPAL.expedientes);
            escritura.close();
        } catch (FileNotFoundException ex) {
            System.err.println("El error es "+ex);
        } catch (IOException ex) {
            System.err.println("El error es "+ex);
        }
    }
    
    public void escribirAutor(){
        try {
            FileOutputStream archivo = new FileOutputStream("autor.bin");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            
            escritura.writeObject(GUI_PRINCIPAL.autores);
            escritura.close();
        } catch (FileNotFoundException ex) {
            System.err.println("El error es "+ex);
        } catch (IOException ex) {
            System.err.println("El error es "+ex);
        }
    }
    
    public void escribirVictima(){
        try {
            FileOutputStream archivo = new FileOutputStream("victima.bin");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            
            escritura.writeObject(GUI_PRINCIPAL.victimas);
            escritura.close();
        } catch (FileNotFoundException ex) {
            System.err.println("El error es "+ex);
        } catch (IOException ex) {
            System.err.println("El error es "+ex);
        }
    }
    
    public void escribirHecho(){
        try {
            FileOutputStream archivo = new FileOutputStream("hecho.bin");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            
            escritura.writeObject(GUI_PRINCIPAL.hecho);
            escritura.close();
        } catch (FileNotFoundException ex) {
            System.err.println("El error es "+ex);
        } catch (IOException ex) {
            System.err.println("El error es "+ex);
        }
    }
    
    public void escribirAgravante(){
        try {
            FileOutputStream archivo = new FileOutputStream("agravante.bin");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            
            escritura.writeObject(GUI_PRINCIPAL.agravantes);
            escritura.close();
        } catch (FileNotFoundException ex) {
            System.err.println("El error es "+ex);
        } catch (IOException ex) {
            System.err.println("El error es "+ex);
        }
    }
    
    public void escribirAtenuante(){
        try {
            FileOutputStream archivo = new FileOutputStream("atenuante.bin");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            
            escritura.writeObject(GUI_PRINCIPAL.atenuantes);
            escritura.close();
        } catch (FileNotFoundException ex) {
            System.err.println("El error es "+ex);
        } catch (IOException ex) {
            System.err.println("El error es "+ex);
        }
    }
    
    public void leerExpediente(){
        try {
            FileInputStream archivo = new FileInputStream("expediente.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            
            while(true){
                GUI_PRINCIPAL.expedientes = (ArrayList<Expediente>) lectura.readObject();
            }
            
        } catch(EOFException ex){
            System.err.println("El error es "+ex);
        } catch (FileNotFoundException ex) {
            System.err.println("El error es "+ex);
        } catch (IOException ex) {
            System.err.println("El error es "+ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("El error es "+ex);
        }
    }
    
    public void leerAutor(){
        try {
            FileInputStream archivo = new FileInputStream("autor.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            
            while(true){
                GUI_PRINCIPAL.autores = (ArrayList<Autor>) lectura.readObject();
            }
            
        } catch(EOFException ex){
            System.err.println("El error es "+ex);
        } catch (FileNotFoundException ex) {
            System.err.println("El error es "+ex);
        } catch (IOException ex) {
            System.err.println("El error es "+ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("El error es "+ex);
        }
    }
    
    public void leerVictima(){
        try {
            FileInputStream archivo = new FileInputStream("victima.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            
            while(true){
                GUI_PRINCIPAL.victimas = (ArrayList<Victima>) lectura.readObject();
            }
            
        } catch(EOFException ex){
            System.err.println("El error es "+ex);
        } catch (FileNotFoundException ex) {
            System.err.println("El error es "+ex);
        } catch (IOException ex) {
            System.err.println("El error es "+ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("El error es "+ex);
        }
    }
    
    public void leerHecho(){
        try {
            FileInputStream archivo = new FileInputStream("hecho.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            
            while(true){
                GUI_PRINCIPAL.hecho = (ArrayList<Hecho>) lectura.readObject();
            }
            
        } catch(EOFException ex){
            System.err.println("El error es "+ex);
        } catch (FileNotFoundException ex) {
            System.err.println("El error es "+ex);
        } catch (IOException ex) {
            System.err.println("El error es "+ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("El error es "+ex);
        }
    }
    
    public void leerAgravantes(){
        try {
            FileInputStream archivo = new FileInputStream("agravante.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            
            while(true){
                GUI_PRINCIPAL.agravantes = (ArrayList<Agravante>) lectura.readObject();
            }
            
        } catch(EOFException ex){
            System.err.println("El error es "+ex);
        } catch (FileNotFoundException ex) {
            System.err.println("El error es "+ex);
        } catch (IOException ex) {
            System.err.println("El error es "+ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("El error es "+ex);
        }
    }
    
    public void leerAtenuante(){
        try {
            FileInputStream archivo = new FileInputStream("atenuante.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            
            while(true){
                GUI_PRINCIPAL.atenuantes = (ArrayList<Atenuante>) lectura.readObject();
            }
            
        } catch(EOFException ex){
            System.err.println("El error es "+ex);
        } catch (FileNotFoundException ex) {
            System.err.println("El error es "+ex);
        } catch (IOException ex) {
            System.err.println("El error es "+ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("El error es "+ex);
        }
    }
}
