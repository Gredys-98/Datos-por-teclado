/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1;

import java.util.Scanner;

/**
 *
 * @author PAOLA CARRILLO
 */
public class ingresardatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
           Scanner sc = new Scanner(System.in);
        
        String nombre = "";
        double cantidad = 0;
        int clases = 0;
        
        System.out.println("introduzca su nombre");
        nombre = sc.nextLine();
        System.out.println("intruduzca una catidad de dinero");
        cantidad = sc.nextInt();
        System.out.println("");
      
        System.out.println("quieres convertir tu dinero en");
        System.out.println("1. dolares");
        System.out.println("2. euros");
        System.out.println("3. yuanes");
        clases = sc.nextInt();
        System.out.println("");
        
         switch(clases){
            case 1: 
                double dolares = cantidad * 7.65;
                System.out.println("hola "+nombre+" la cantidad en dolares es: "+ dolares);
            break;
                
            
            case 2:
                double euros = cantidad * 9.15;
                System.out.println("hola "+nombre+" la cantidad en euros es: "+ euros);
            break;
                
            case 3:
                double yuanes = cantidad * 1.20;
                System.out.println("hola "+nombre+" la cantidad en yunes es: "+ yuanes);
            break;
        }
       
            
}   }   
    

