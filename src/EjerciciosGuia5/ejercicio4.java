/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia5;

import java.util.Random;

/**
 *
 * @author Leonel
 */


/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).

*/
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random num = new Random();

        // Rellenar la matriz con valores aleatorios de 0 a 10
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = num.nextInt(10);
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }

        // Calcular la matriz traspuesta 
        int[][] matrizTraspuesta = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTraspuesta[j][i] = matriz[i][j];
            }
        }

        //Mostrar la matriz transpuesta
        System.out.println("Matriz traspuesta:");
        for (int i = 0; i < matrizTraspuesta.length; i++) {
            for (int j = 0; j < matrizTraspuesta[i].length; j++) {
                System.out.print(matrizTraspuesta[i][j] + "|");
            }
            System.out.println();
        }
    }
}
    
    
