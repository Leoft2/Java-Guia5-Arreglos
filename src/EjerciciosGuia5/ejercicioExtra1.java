/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosGuia5;

import java.util.Scanner;
/*
EJERCICIO SUMA ELEMENTOS VECTOR
Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
*/

public class ejercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int [] vector = new int [leer.nextInt()];
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un valor en la coordenada: " + i);
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de todos los valores es: " + suma);
    }

}
