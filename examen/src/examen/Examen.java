/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
 import java.util.Scanner;

/**
 *
 * @author ESFOT
 */
public class Examen {
private String libro;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Libro[]libros=new Libro[10];
        
        int opc;
        do{
            System.out.println("   MENU  ");
            System.out.println(" 1.- INGRESA NUEVO LIBRO  ");
            System.out.println(" 2.- IMPRIMIR LISTA DE LIBROS FAVORITOS  ");
            System.out.println(" 3.- CONTAR LIBROS DEL AUTOR  ");
            System.out.println(" 4.- SALIR  ");
            System.out.println(" Digite una opcion  ");
            opc = scan.nextInt();
            scan.nextLine();
            
            switch(opc){
                case 1:
                    
                 if(libros.equals (10)){
                    System.out.println("Biblioteca llena no se puede ingresar mas libros");
                      }
                 
                 else{
                     
                     System.out.println("ingrese titulo del libro "); 
                     String titulo=scan.nextLine();
                     System.out.println("Ingrese el autor del libro");
                     String autor=scan.nextLine();
                     System.out.println("Ingrese el pais");
                     String pais=scan.nextLine();
                     System.out.println("ingrese anio de publicacion");
                     int anio=scan.nextInt();
                     System.out.println("es un libro favorito?");
                     System.out.println("press 's'  'n'");
                     String favorito=scan.nextLine();
                    // System.out.println("");
                     //System.out.println();
                    }
                
                 
                break;
                case 2:
                 
                 libro = new Libro(titulo, anio, nombre,pais);
                  
                  System.out.println("informacion de favoritos");
                  System.out.println(libro[]);
                  
                  
                 break;
                case 3:
                        
                  
                  
                 break;
                case 4:
                    System.out.println("ADIOS");
                    break;
                default:
                System.out.println("Opcion no valida digite otra opcion");
                
            }
        }while(opc!=4);
    }
    
}
