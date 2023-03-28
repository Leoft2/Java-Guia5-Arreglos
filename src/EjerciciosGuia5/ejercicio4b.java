/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosGuia5;

import java.util.Random;


public class ejercicio4b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random rnd = new Random();
        int [][] matriz = new int [4][4];
        int [][] matrizb = new int [4][4];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rnd.nextInt(10);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Transpuesta");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                matrizb[i][j] = matriz[i][j];
                System.out.print(matrizb[i][j]+" ");
            }
            System.out.println("");
        }
    }

}
