package org.condicionales;


import java.util.Scanner;

/*
Realizar un programa que lea 2 números enteros desde teclado e informe en pantalla cuál de los dos
números es el mayor. Si son iguales debe informar en pantalla lo siguiente:
Los números leídos son iguales
*/
public class Practica1 {

    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        Integer num1;
        Integer num2;

        System.out.print("Ingrese un n\u00FAmero: ");
        num1 = leerDatos.nextInt();
        System.out.print("Ingrese un segundo n\u00FAmero: ");
        num2 = leerDatos.nextInt();

        if (num1>num2) {
            System.out.println(num1+ " es mayor a " + num2);
        } else if (num2>num1) {
            System.out.println( num2+ " es mayor a " +num1);
        } else {
            System.out.println("los n\u00FAmeros son iguales");
        }
}

}