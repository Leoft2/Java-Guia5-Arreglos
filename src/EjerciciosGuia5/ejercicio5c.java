/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosGuia5;

import java.util.Scanner;


public class ejercicio5c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
       int [] [] matriz = new int[3][3];
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor para su ubicacion: " + i +", "+ j);
                matriz [i][j]= leer.nextInt() ;
                               
            }         
        }
        System.out.println("Su matriz original es: ");
       for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                    System.out.print("[" + matriz [i][j]+ "]") ;        
            } System.out.println(" ");         
        }
       
       int [][] matrizTranspuesta = new int[3][3];
       
       for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
               matrizTranspuesta [j][i] = matriz [i][j];
                               
            }         
        }
        System.out.println("Su matriz transpuesta es : ");
       
       for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                    System.out.print("[" + matrizTranspuesta [i][j]+ "]") ;        
            } System.out.println(" ");         
        }
         int contador = 0;
         
      for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                if (matriz[i][j]!= -matrizTranspuesta [i][j]) {
                    System.out.println("NO es antiasimetrico");
                    i=6;
                break;
                }
            contador++;
                            
            }          
        } 
      if (contador == 9) {
          System.out.println("Su matriz es antisimetrica");
            
        }
       }
     }
      
 