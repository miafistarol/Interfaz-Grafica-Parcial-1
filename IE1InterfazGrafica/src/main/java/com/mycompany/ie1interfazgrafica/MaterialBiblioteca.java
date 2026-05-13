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
Esta clase contiene atributos comunes como título, año y estado de préstamo.
También métodos abstractos prestar y devolver para obligar a las clases hijas a implementarlos.
*/
public abstract class MaterialBiblioteca implements Prestable {
//con el implements me dice que debe cumplir el contrato de la interfaz
    private String titulo;
    private int anio;
    private boolean prestado;
//atributos encapsulados
    public MaterialBiblioteca(String titulo, int anio, boolean prestado){
       
        this.titulo = titulo;
        this.anio = anio;
        this.prestado = prestado;
    
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public int getAnio() {
        return anio;
    }
    
    public boolean getPrestado(){
        return prestado;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAnio(int anio){
        this.anio = anio;
    }
    
    public void setPrestado(boolean prestado){
        this.prestado = prestado;
    }
  
    //Obligan a las clases hijas a programarlos
    @Override public abstract void prestar();
    @Override public abstract void devolver();
    

//reemplazo el comportamiento de toString(), metodo propio de JAVA heredado 
//de Object y lo sobreescribo con uno personalizado
    
    @Override
    public String toString() {
    return "Titulo: " + getTitulo() +
           "\nAño: " + getAnio() +
           "\nPrestado: " + getPrestado();

    }
    
}

