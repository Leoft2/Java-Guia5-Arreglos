/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosGuia5;

import java.util.Scanner;


public class ejercicioExtra2b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE LA DIMENSION DEL VECTOR");
        int dimension = entrada.nextInt();
        int aux = 0;
        int[] vectorA = new int[dimension];
        int[] vectorB = new int[dimension];

        System.out.println("INGRESE LOS VALORES DEL VECTOR A");
        for (int i = 0; i < dimension; i++) {
            vectorA[i] = entrada.nextInt();
        }

        System.out.println("INGRESE LOS VALORES DEL VECTOR B");
        for (int i = 0; i < dimension; i++) {
            vectorB[i] = entrada.nextInt();
        }

        for (int i = 0; i < dimension; i++) {
            if (vectorA[i] != vectorB[i]) {
                System.out.println("LOS ELEMENTOS DE LOS VECTORES SON DIFERENTES");
                aux += 1;
                break;
            }
        }

        if (aux < 1) {
            System.out.println("LOS VECTORES SON IGUALES");
        }
    }
}
    


 