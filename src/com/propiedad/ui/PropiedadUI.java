/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.propiedad.ui;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class PropiedadUI {

    static Scanner read = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mostarMenu();
    }
    
    public static void mostarMenu(){
        int opc;
        do{
            System.out.println("Digite la opcion que dese");
            System.out.println("1. Registrar propiedad");
            System.out.println("2. Listar propiedades");
            System.out.println("3. Buscar propiedades");
            System.out.println("4. Total de alquiler");
            System.out.println("5.Salir");
            opc = read.nextInt();
            procesarOpcion(opc);
        }while(opc != 6);
    }
    
    public static void procesarOpcion(int opcion){
        switch(opcion){
            
            case 1:
                registrarPropiedad();
            break;
            
            case 2:
                listarPropiedad();
            break;
            
            case 3:
                buscarPropiedad();
            break;
            
            case 4:
                totalAquileres();
            break;
            
            case 5:
                System.out.println("Adios");
            break;
            
            default:
                System.out.println("Opcion no valida");
            break;
        }
    }
    
    public 
}
