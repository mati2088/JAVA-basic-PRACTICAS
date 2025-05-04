package org.condicionales;

import java.util.Scanner;

/*
* Realizar un programa que lea un número real X. Luego, deberá leer números reales hasta que se ingrese
uno cuyo valor sea exactamente el doble de X (el primer número leído).
* */
public class Practica3 {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        Integer num;
        Integer doble = 0;

        System.out.println("Por favor ingrese un numero");
        num = leerDatos.nextInt();
        num =num*2;
        while (doble != num) {
            System.out.println("Por favor ingrese un numero");
            doble = leerDatos.nextInt();
        }
    }
}
