
package com.mycompany.ejercicio13;

import java.util.Scanner;


public class Ejercicio13 {
    public static void main(String[] args) {
        String color;
        int valor_compra,valor_pagar,descuento_porcentaje;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de su compra: ");
        valor_compra = entrada.nextInt();
        System.out.println("Ingrese el color de su bolita: ");
        color = entrada.next();
        color = color.toUpperCase();
        if (color.equals("BLANCO") == true) {
            System.out.println(descuento_porcentaje = 0);
        }else if (color.equals("VERDE")==true){
            System.out.println(descuento_porcentaje = 10);
        }else if (color.equals("AMARILLO")==true){
            System.out.println(descuento_porcentaje = 25);
        }else if (color.equals("AZUL")==true){
            System.out.println(descuento_porcentaje = 50);
        }else{
            System.out.println(descuento_porcentaje = 100);}
        
        valor_pagar = valor_compra - descuento_porcentaje * valor_compra / 100;
        System.out.println("EL CLIENTE DEBE PAGAR: $" + valor_pagar);
        
        
    }
}
