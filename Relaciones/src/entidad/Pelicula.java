/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Archer
 */
public class Pelicula {
    private String titulo;
    private int duracion;
    private int edad_minima;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, int duracion, int edad_minima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edad_minima = edad_minima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdad_minima() {
        return edad_minima;
    }

    public void setEdad_minima(int edad_minima) {
        this.edad_minima = edad_minima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", edad_minima=" + edad_minima + ", director=" + director + '}';
    }
    
}
