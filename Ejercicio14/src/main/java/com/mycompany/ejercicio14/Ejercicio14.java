package com.mycompany.ejercicio14;

import java.util.Scanner;


public class Ejercicio14 {
    public static void main(String[] args) {
        int vd1, vd2, vd3, salario, totventas;
       double porventas, salario1, salario2, salario3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de la venta 1: ");
        vd1 = entrada.nextInt();
        System.out.println("Ingrese el valor de la venta 2: ");
        vd2 = entrada.nextInt();
        System.out.println("Ingrese el valor de la venta 3: ");
        vd3 = entrada.nextInt();
        System.out.println("Ingrese el valor del salario del trabajador: ");
        salario = entrada.nextInt();
        System.out.println(totventas = vd1 + vd2 + vd3);
        System.out.println(porventas = 0.33 * totventas);
        
        if (vd1>porventas){
            System.out.println(salario1 = salario + 0.2 * salario);
        }else {
            System.out.println(salario1 = salario);
        }if (vd2>porventas){
            System.out.println(salario2 = salario + 0.2 * salario);
        }else {
            System.out.println(salario2 = salario);
        }if (vd3>porventas){
            System.out.println(salario3 = salario + 0.2 * salario);
        }else {
        System.out.println(salario3 = salario);}  
        
        System.out.println("SALARIO VENDEDORES DEPTO. 1 " + salario1 + 
        " SALARIO VENDEDORES DEPTO. 2 " + salario2 + " SALARIO VENDEDORES DEPTO. 3 " + salario3);       
        
  
    }
}
