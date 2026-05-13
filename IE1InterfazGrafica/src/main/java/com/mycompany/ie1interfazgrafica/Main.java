/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ie1interfazgrafica;

/**
 *
 * @author miafi
 */
/*

El sistema funciona mediante un menú interactivo implementado con do-while y switch.
El usuario puede ingresar distintas opciones desde consola y el programa valida las acciones realizadas.
Los materiales se almacenan utilizando un ArrayList.

*/
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
/*
tuve que revisar bien algunos problemas con Scanner al leer distintos tipos 
        de datos y con la validación del menú        
*/
        Scanner scanner = new Scanner(System.in); //leo los datos ingresados por teclado

        Biblioteca biblioteca = new Biblioteca(); //objecto de la clase biblioteca 

        int opcion;
        
        //hago un ciclo que al menos entra una vez
        do { 

            System.out.println("\n===== BIBLIOTECA =====");
            System.out.println("1 - Agregar libro");
            System.out.println("2 - Listar materiales");
            System.out.println("3 - Buscar por titulo");
            System.out.println("4 - Prestar material");
            System.out.println("5 - Devolver material");
            System.out.println("6 - Salir");
            System.out.print("Ingrese una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            //va a evaluar la opcion ingresada por el usuario
            switch (opcion) {

                case 1:

                    System.out.print("Ingrese el titulo: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Ingrese el año: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el autor: ");
                    String autor = scanner.nextLine();

                    Libro libro = new Libro(titulo, anio, false, autor); //almaceno los datos en un objeto de la clase libro
                    //le pongo false porque aun no esta prestado
                    biblioteca.agregarMaterial(libro); 

                    break;

                case 2:

                    biblioteca.listarMateriales();

                    break;

                case 3:

                    System.out.print("Ingrese el titulo a buscar: ");
                    titulo = scanner.nextLine();
                    
                    //objeto de tipo MaterialBiblioteca en una variable llamada material
                    MaterialBiblioteca material = biblioteca.buscarPorTitulo(titulo);

                    if (material != null) {

                        System.out.println(material);

                    } else {

                        System.out.println("Material no encontrado.");

                    }

                    break;

                case 4:

                    System.out.print("Ingrese el titulo del material a prestar: ");
                    titulo = scanner.nextLine();

                    biblioteca.prestarMaterial(titulo);

                    break;

                case 5:

                    System.out.print("Ingrese el titulo del material a devolver: ");
                    titulo = scanner.nextLine();

                    biblioteca.devolverMaterial(titulo);

                    break;

                case 6:

                    System.out.println("Saliendo del sistema...");

                    break;

                default:

                    System.out.println("Opcion invalida. Intente nuevamente.");

            }

        } while (opcion != 6); // compara numeros diferentes a 6 y si aprieta 6 se cierra

        scanner.close();

    }
        
        
    
}
