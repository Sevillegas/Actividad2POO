
package com.mycompany.ejercicio12;

import java.util.Scanner;


public class Ejercicio12 {

    public static void main(String[] args) {
        String nombre;
        int numero_horas,valor_hora, hora_extras, horas_extras_ocho, salario;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del trabajador: ");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el número de horas trabajas: ");
        numero_horas = entrada.nextInt();
        
        System.out.println("Ingrese el valor de hora de trabajo: ");
        valor_hora = entrada.nextInt();
        
        if (numero_horas>40) {
            System.out.println(hora_extras = numero_horas - 40);
            if(hora_extras>8){
                System.out.println( horas_extras_ocho = hora_extras - 8);
                System.out.println(salario = 40 * valor_hora + 16 * valor_hora + horas_extras_ocho * 3 * valor_hora);
            }else {
                System.out.println(salario = 40 * valor_hora+ hora_extras * 2 * valor_hora);
            }
        }else {
            System.out.println(salario = numero_horas * valor_hora );
        }
        System.out.println("EL TRABAJADOR: " + nombre + " DEVENGO: $" + salario);       
    }
}
