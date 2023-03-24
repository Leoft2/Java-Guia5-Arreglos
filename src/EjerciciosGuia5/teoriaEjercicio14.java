/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia5;

import java.util.Scanner;

/**
 *
 * @author Leonel
 */


/*
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
compañeros de equipo
*/
public class teoriaEjercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] Equipo = new String[8];
        System.out.println("Ingrese los nombres de los participantes");
        for (int i = 0; i < 8; i++) {
            Equipo[i] = leer.nextLine();
        }
         for (int i = 0; i < 8; i++) {
             System.out.print ("[ " + Equipo[i] + " ]");
         }

    }

}
    
    

