package org.condicionales;

import java.util.Scanner;
/*Realizar un programa que lea el número de legajo y el promedio de cada alumno de la facultad. La lectura
finaliza cuando se ingresa el legajo -1, que no debe procesarse. Por ejemplo: se lee la siguiente secuencia:
33423
8.40
19003
6.43
-1
En el ejemplo anterior, se leyó el legajo 33422, cuyo promedio fue 8.40, luego se leyó el legajo 19003, cuyo
promedio fue 6.43, y finalmente el legajo -1 (para el cual no es necesario leer un promedio).
Al finalizar la lectura, informar:
a. La cantidad de alumnos leída (en el ejemplo anterior, se debería informar 2).
b. La cantidad de alumnos cuyo promedio supera 6.5 (en el ejemplo anterior, se debería informar 1).
c. El porcentaje de alumnos destacados (alumnos con promedio mayor a 8.5) cuyo legajo sean menor
al valor 2500 (en el ejemplo anterior, se debería informar 0%)*/
public class Practica4 { public static void main(String[] args) {
    Scanner leerDatos = new Scanner(System.in);
    int legajo;
    double promedio;
    int cantAlumnos = 0;
    int cantAlumnosSeis=0;
    int cantDestacados = 0;
    double porcentajeDestacados;

    System.out.print("Por favor ingrese el n\u00FAmero del legajo: ");
    legajo = leerDatos.nextInt();
    while(legajo !=-1){
        System.out.print("Por favor ingrese el promedio: ");

        promedio = leerDatos.nextDouble();

        cantAlumnos++;

        if (promedio > 6.5){
            cantAlumnosSeis++;
        }
        if (promedio >8.5 && legajo<2500){
            cantDestacados++;
        }

        System.out.print("Por favor ingrese el n\u00FAmero del legajo: ");

        legajo = leerDatos.nextInt();
    }
    porcentajeDestacados = (cantDestacados * 100.0)/cantAlumnos;
    System.out.println("la cantidad de alumnos leidos fue: "+cantAlumnos);
    System.out.println("La cantidad de alumnos que superan el promedio 6.5 fue: "+cantAlumnosSeis);
    System.out.println("Porcentaje de alumnos destacados: "+porcentajeDestacados);
}
}
