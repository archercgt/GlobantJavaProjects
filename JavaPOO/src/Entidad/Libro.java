/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Archer
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int num_paginas;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int num_paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.num_paginas = num_paginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNum_paginas() {
        return num_paginas;
    }

    public void setNum_paginas(int num_paginas) {
        this.num_paginas = num_paginas;
    }
}