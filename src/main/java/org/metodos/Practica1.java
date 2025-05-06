package org.metodos;

import java.util.Scanner;

/*
. Realizar un programa modularizado que lea datos de 100 productos de una tienda de ropa. Para cada
producto debe leer el precio, código y tipo (pantalón, remera, camisa, medias, campera, etc.). Informar:
● Código de los dos productos más baratos.
● Código del producto de tipo “pantalón” más caro.
● Precio promedio.*/
public class Practica1 {

    public static void main(String[] args) {
        leerProductos();
        }
    public static void leerProductos(){
        Double min1 = Double.MAX_VALUE;
        Double min2 = Double.MAX_VALUE;
        int codMin1 = 0;
        int codMin2 = 0;

        int codPantalonMasCaro = 0;
        Double precioPantalonMasCaro = Double.MIN_VALUE;

        Double precio;
        int codProducto;
        String tipoProducto;

        Scanner leerDatos = new Scanner(System.in);

        for (int i =0;i <5;i++ ) {
            System.out.print("Ingrese el precio del producto: ");
            precio = leerDatos.nextDouble();
            System.out.print("Ingrese el codigo del producto: ");
            codProducto = leerDatos.nextInt();
            System.out.print("Ingrese el tipo de producto: ");
            tipoProducto = leerDatos.next();

            if(precio < min1){
                min2 = min1;
                codMin2 = codMin1;
                min1 = precio;
                codMin1 = codProducto;
            } else if (precio < min2) {
                min2 = precio;
                codMin2 = codProducto;
            }
            if (tipoProducto.equals("pantalon" ) && precio > precioPantalonMasCaro){
                codPantalonMasCaro =codProducto;
                precioPantalonMasCaro =precio;

            }
        }
        System.out.println("Código del producto más barato: " + codMin1);
        System.out.println("Código del segundo producto más barato: " + codMin2);
        System.out.println("Código del pantalón más caro: " + codPantalonMasCaro);

    }


}
