/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
import java.util.Arrays;
import java.util.Objects;
/**
 *
 * @author ESFOT
 */
public class Libro {
    private String titulo;
    private int anio;
    //private Boolean favorito;
    
    Libro(String titulo, int anio){
        this.titulo =titulo;
        this.anio=anio;
        //this.favorito=favorito;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    /*public Boolean getFavorito() {
        return favorito;
    }

    public void setFavorito(Boolean favorito) {
        this.favorito = favorito;
    }
*/
    
    
    /*@Override
    public String toString() {
    String stringLibro= "Titulo: "+this.titulo+ "\anio: "+this.anio +"\n";
        
                
        return stringLibro;
    }*/

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", anio=" + anio + '}';
    }
    
    
}

