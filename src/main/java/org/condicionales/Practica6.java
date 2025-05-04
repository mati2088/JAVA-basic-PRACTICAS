package org.condicionales;

import java.util.Scanner;

/*Realizar un programa que lea desde teclado información de autos de carrera. Para cada uno de los autos
 se
lee el nombre del piloto y el tiempo total que le tomó finalizar la carrera. En la carrera participaron
100
autos. Informar en pantalla:
● Los nombres de los dos pilotos que finalizaron en los dos primeros puestos.
● Los nombres de los dos pilotos que finalizaron en los dos últimos puestos.
*/
public class Practica6 {
    public static void main(String[] args) {
    Scanner leerDatos = new Scanner(System.in);
    String nombrePiloto;
    int tiempoCarrera;
    int totalPilotos = 5;
    int max1 = -1;
    int max2 = -1;
    int min1 = 999999;
    int min2=  999999;
    String nomMax1 = "";
    String nomMax2= "";
    String nomMin1= "";
    String nomMin2= "";
        for (int i = 1; i < totalPilotos; i++) {
            System.out.print("Ingrese el nombre del "+i+" piloto: ");
            nombrePiloto = leerDatos.next();

            System.out.print("Ingrese el tiempo de carrera del "+i+" piloto: ");
            tiempoCarrera = leerDatos.nextInt();

            if (tiempoCarrera > max1){
                max2 = max1;
                nomMax2 = nomMax1;
                max1 = tiempoCarrera;
                nomMax1 = nombrePiloto;
            } else if (tiempoCarrera > max2) {
                max2 = tiempoCarrera;
                nomMax2 = nombrePiloto;
            }

            if (tiempoCarrera < min1){
                min2 = min1;
                nomMin2 = nomMin1;
                min1 = tiempoCarrera;
                nomMin1 = nombrePiloto;
            } else if (tiempoCarrera < min2) {
                min2 = tiempoCarrera;
                nomMin2 = nombrePiloto;
            }
        }
        System.out.println("Nombre del ultimo piloto en terminar la carrera: "+nomMax1+" con tiempo de carrera "+max1);
        System.out.println("Nombre del ante piloto en terminar la carrera: "+nomMax2+" con tiempo de carrera "+max2);
        System.out.println("Nombre del segundo ultimo piloto piloto en terminar la carrera: "+nomMin2+" con tiempo de carrera "+min2);
        System.out.println("Nombre del primer piloto en terminar la carrera: "+nomMin1+" con tiempo de carrera "+min1);
        }
}
