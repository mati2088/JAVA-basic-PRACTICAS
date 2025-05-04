package org.condicionales;

import java.util.Scanner;

/*
Realizar un programa que lea 3 números enteros y los imprima en orden descendente. Por ejemplo: si se
ingresan los valores 4, -10 y 12, deberá imprimir: 12 4 -10
*/


public class Practica2 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner leerDatos = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        num1 = leerDatos.nextInt();
        System.out.println("Ingrese el segundo número:");
        num2 = leerDatos.nextInt();
        System.out.println("Ingrese el tercer número:");
        num3 = leerDatos.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        } else {
            if (num1 >= num2) {
                System.out.println(num3 + " " + num1 + " " + num2);
            } else {
                System.out.println(num3 + " " + num2 + " " + num1);
            }
        }

        leerDatos.close();
    }
}
