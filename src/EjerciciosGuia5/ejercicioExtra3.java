/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosGuia5;

import java.util.Random;
import java.util.Scanner;


public class ejercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
         
          Random rnd = new Random();
          
          System.out.println("Ingrese el tamaño del vector.");
          
          int a = leer.nextInt();
          
          int[] vector1 = new int [a];
          
          rellenar(vector1);
          
          mostrar(vector1);
  
        
    } //////// separa el main de la class
    
     public static void rellenar (int[] vector)
        {
            //Scanner leer = new Scanner(System.in);
            
           for (int i=0; i < vector.length; i++)
           {
              // System.out.println("Ingrese los valores del vector.");
               vector[i] = (int)(Math.random()*10);
           }
                
        }
     
     public static void mostrar (int [] vector ) 
     {
     
           for (int i=0; i < vector.length; i++)
           {
               System.out.print("[" + vector[i] + "] ");
               
           }
     
     }
    }


