/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ie1interfazgrafica;

/**
 *
 * @author miafi
 */

/*
La clase Libro hereda de MaterialBiblioteca utilizando extends
*/
class Libro extends MaterialBiblioteca {
    
    private String autor;
    
    public Libro(String titulo, int anio, boolean prestado, String autor){
        super(titulo, anio, prestado);
        this.autor =autor;
    
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    @Override
    public void prestar() {

    if(!getPrestado()){
        setPrestado(true);
        System.out.println("Libro prestado");
    } else {
        System.out.println("El libro ya está prestado");
    }
    }
    
    @Override
    public void devolver() {

    if (getPrestado()) {

        setPrestado(false);
        System.out.println("El libro fue devuelto correctamente.");

    } else {

        System.out.println("El libro no estaba prestado.");

    }

    }
}
