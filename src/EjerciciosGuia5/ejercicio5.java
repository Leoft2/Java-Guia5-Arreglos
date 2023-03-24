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
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
*/

public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random num = new Random();

        // Generar una matriz aleatoria de 4x4
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = num.nextInt(10);
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }

        // Calcular la transpuesta de la matriz
        int[][] transpuesta = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }

        // Mostrar la matriz transpuesta
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(transpuesta[i][j] + "|");
            }
            System.out.println();
        }

        // Comprobar si la matriz es antisimétrica
        boolean Antisimetrica = true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] != -transpuesta[j][i]) {
                    Antisimetrica = false;
                    break;
                }
            }
            if (!Antisimetrica) {
                break;
            }
        }

        // Mostrar el resultado
        if (Antisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }
}
    
    

 