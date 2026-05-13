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
Usamos ArrayList<MaterialBiblioteca> 
para aplicar polimorfismo y almacenar distintos 
tipos de materiales en una misma lista.
*/

import java.util.ArrayList;
public class Biblioteca {
    // Lista dinamica de materiales
    private ArrayList<MaterialBiblioteca> materiales;

    // Constructor
    public Biblioteca() {
        //inicializo la lista donde va a haber materiales de biblioteca 
        materiales = new ArrayList<>();

    }
/*
    La clase Biblioteca maneja la lógica del sistema y administra los materiales
    */
    // 1. Agregar material
    public void agregarMaterial(MaterialBiblioteca m) {

        materiales.add(m);
        System.out.println("Material agregado correctamente.");

    }

    // 2. Listar materiales
    public void listarMateriales() {

        if (materiales.isEmpty()) {

            System.out.println("No hay materiales cargados.");

        } else {

            for (MaterialBiblioteca m : materiales) {

                System.out.println(m);
                System.out.println("------------------");

            }

        }

    }
    
    // 3. Buscar por título
    public MaterialBiblioteca buscarPorTitulo(String titulo) {

        for (MaterialBiblioteca m : materiales) {
            //recorre la lista y con el equals comparo ignorando minus y mayus
            if (m.getTitulo().equalsIgnoreCase(titulo)) {

                return m;

            }

        }

        return null;

    }

     // 4. Prestar material
    public void prestarMaterial(String titulo) {
        //guardo el libro y lo guardo en material
        MaterialBiblioteca material = buscarPorTitulo(titulo);

        if (material != null) {
            //si no esta vacio, quiere decir que lo encontro y ejecuta el metodo prestar()
            material.prestar();

        } else {

            System.out.println("Material no encontrado.");

        }

    }
    // 5. Devolver material
    public void devolverMaterial(String titulo) {

        MaterialBiblioteca material = buscarPorTitulo(titulo);

        if (material != null) {

            material.devolver();

        } else {

            System.out.println("Material no encontrado.");

        }

    }
}
