/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Leonel
 */



/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
*/
public class ejercicio5b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Random rnd = new Random();
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        int [][] matrizb = new int [3][3];
        
         for (int i = 0; i < 3; i++) {
            for (int l = 0; l < 3; l++) {
                 System.out.println("ingrese el valor " + i + "," + l);
                  matriz[i][l] = leer.nextInt();
                  
            }
            System.out.println("");
        }
         
        System.out.println("Transpuesta");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                matrizb[i][j] = matriz[i][j];
                System.out.print(matrizb[i][j]+" ");
            }
            System.out.println("");
        }
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != -matrizb[i][j]) {
                    System.out.println("no es antisimetrico");
                     i = 9;
                     break;
                     
           
               
                }
               cont++;
               
            }
           
        }
        
        if (cont == 9) {
            System.out.println("la matriz es antisimetrica");
        }
 
        
        
        
    }
    
}
