/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosGuia5;

import java.util.Random;
import java.util.Scanner;


/*
EJERCICIO  **ERROR FALTA COMPLETAR***
Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
*/

public class ejercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Ingrese el tamaño del vector 1");
        int a = leer.nextInt();
        int [] vector1 = new int [a];
        int [] vector2 = new int [a];
        for (int i = 0; i < vector2.length; i++) {
            vector1[i] = rnd.nextInt(3);
            vector2[i] = rnd.nextInt(3);
            System.out.print(vector1[i]);
            
        }
        System.out.println("");
        for (int i = 0; i < vector1.length; i++) {
             System.out.print(vector2[i]);
            if (vector1[i] != vector2[i]) {
                System.out.println("No son iguales");
                break;
                }
//                else { 
//                System.out.println("Son iguales"); 
//                break;
//                    }  
                
                      
//            if (vector1[vector1.length-1] == (vector2[vector2.length-1])) {
//                System.out.println("Son iguales");
//            }
            }
    }

}
