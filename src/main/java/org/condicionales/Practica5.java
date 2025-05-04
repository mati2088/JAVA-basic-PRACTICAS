package org.condicionales;

import java.util.Scanner;
 /*Realizar un programa que lea información de 200 productos de un supermercado. De cada producto se lee
código y precio (cada código es un número entre 1 y 200). Informar en pantalla:
● Los códigos de los dos productos más baratos.
● La cantidad de productos de más de 16 pesos con código par.
*/
public class Practica5 {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);

    int codProducto;
    int cantPares=0;
    int cod1=0;
    int cod2=0;
    double min1 = Double.MAX_VALUE;
    double min2 = Double.MAX_VALUE;
    double precio;

    for (int i = 0; i<5;i++){
        System.out.print("Por favor ingrese el c\u00F3digo del producto: ");
        codProducto = leerDatos.nextInt();
        System.out.print("Por favor ingrese el precio del producto: ");
        precio = leerDatos.nextDouble();

        if (precio < min1){
            cod2 = cod1;
            min2 = min1;
            min1 = precio;
            cod1=codProducto;
        } else if (precio < min2) {
            min2 = precio;
            cod2 = codProducto;
        }

        if (precio >16 && codProducto % 2 == 0){
            cantPares++;
        }
    }
        System.out.println("La cantidad de productos de más de 16 pesos con código par: "+cantPares);
        System.out.println("Los códigos de los dos productos más baratos. :"+cod1+" y codigo "+cod2);
}
}
