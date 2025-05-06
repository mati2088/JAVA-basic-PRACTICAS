package org.metodos;

import java.util.Scanner;

/*
* Realizar un programa modularizado que lea secuencia de números enteros. La lectura finaliza cuando
llega el número 123456, el cual no debe procesarse. Informar en pantalla para cada número la suma de sus
dígitos pares y la cantidad de dígitos impares que posee.
*/
public class Practica2 {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Ingrese un número (123456 para terminar): ");
            numero = leerDatos.nextInt();

            if (numero == 123456) {
                System.out.println("Fin del programa.");
                break;
            }

            int sumaPares = sumarDigitosPares(numero);
            int cantidadImpares = contarDigitosImpares(numero);

            System.out.println("Suma de dígitos pares: " + sumaPares);
            System.out.println("Cantidad de dígitos impares: " + cantidadImpares);
            System.out.println("-----");
        }
    }

    public static int sumarDigitosPares(int numero) {
        int suma = 0;
        while (numero != 0) {
            int digito = numero % 10;
            if (digito % 2 == 0) {
                suma += digito;
            }
            numero /= 10;
        }
        return suma;
    }

    public static int contarDigitosImpares(int numero) {
        int contador = 0;
        while (numero != 0) {
            int digito = numero % 10;
            if (digito % 2 != 0) {
                contador++;
            }
            numero /= 10;
        }
        return contador;
    }}