/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia5;

import java.util.Random;
import java.util.Scanner;

public class ejercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        int nota, nota1, integrador, integrador1, promedio, aux, aprobados, desaprobados;

        aux = 0;
        aprobados = 0; //inicializo
        desaprobados = 0; //inicializo

        do {
            System.out.println("Ingrese la nota del primer trabajo");
            nota = rnd.nextInt(11);
            System.out.println(nota);
            System.out.println("Ingrese la nota del segundo trabajo");
            nota1 = rnd.nextInt(11);
            System.out.println(nota1);
            System.out.println("Ingrese la nota del primer integrador");
            integrador = rnd.nextInt(11);
            System.out.println(integrador);
            System.out.println("Ingrese la nota del segundo integrador");
            integrador1 = rnd.nextInt(11);
            System.out.println(integrador1);

            promedio = (int) ((nota * 0.1) + (nota1 * 0.15) + (integrador * 0.25) + (integrador1 * 0.5));

            System.out.println("Promedio: " + promedio);

            if (promedio > 7) {

                aprobados += 1;
            } else {

                desaprobados += 1;

            }

            aux += 1;

        } while (aux < 10);

        System.out.println("Los alumnos aprobvados son: " + aprobados + ".\nLos alumnos desaprobados son: " + desaprobados);
    }

}
