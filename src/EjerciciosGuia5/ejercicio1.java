/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia5;

/**
 *
 * @author Leonel
 */


/*
Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
*/
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100];

        // Bucle para llenar vector
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
        }

        // Ordenar el vector en orden descendente
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] < vector[j]) {
                    int n = vector[i];
                    vector[i] = vector[j];
                    vector[j] = n;
                }
            }
        }

        // Bucle para imprimir en pantalla
        System.out.println("Vector en orden descendente:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}

    
    

