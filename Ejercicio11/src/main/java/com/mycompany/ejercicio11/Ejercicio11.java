/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
     int num1, num2, num3;
       Scanner entrada = new Scanner(System.in);
       
       
       System.out.println("Ingrese el valor del primer número: ");
        num1 = entrada.nextInt();
        
       System.out.println("Ingrese el valor del segundo número: ");
        num2 = entrada.nextInt();
        
       System.out.println("Ingrese el valor del tercer número: ");
        num3 = entrada.nextInt();
        
        if (num1>num2 & num1>num3){
            System.out.println("El número mayor es: " + num1);
        }else if (num2>num3){
            System.out.println("El número mayor es: " + num2);
        }else {
            System.out.println("El número mayor es: " + num3);}
        
        
        
        
     }
}
