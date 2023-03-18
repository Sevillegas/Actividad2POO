

package com.mycompany.ejercicio15;

import java.util.Scanner;


public class Ejercicio15 {

    public static void main(String[] args) {
        int pesoa, pesob, pesoc, pesod;
       
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del peso A : ");
        pesoa = entrada.nextInt();
        System.out.println("Ingrese el valor del peso B : ");
        pesob = entrada.nextInt();
        System.out.println("Ingrese el valor del peso C : ");
        pesoc = entrada.nextInt();
        System.out.println("Ingrese el valor del peso D : ");
        pesod = entrada.nextInt();
        
        if (pesoa == pesob & pesoa == pesoc){
            System.out.println("Entonces la esfera D es DIFERENTE ");
            if(pesod>pesoa){
                System.out.println("Entonces la esfera D es MAYOR ");
            }else{
                System.out.println("Entonces la esfera D es MENOR ");
            }
        }else if(pesoa == pesob & pesoa == pesod) {
            System.out.println("Entonces la esfera C es DIFERENTE ");
            if(pesoc>pesoa){
                System.out.println("Entonces la esfera C es MAYOR ");
            }else{
                System.out.println("Entonces la esfera C es MENOR ");
            }
        }else if(pesoa == pesoc & pesoa == pesod) {
            System.out.println("Entonces la esfera B es DIFERENTE ");
            if(pesob>pesod){
                System.out.println("Entonces la esfera B es MAYOR ");
            }else{
                System.out.println("Entonces la esfera B es MENOR ");
            }
        }else{
            System.out.println("LA ESFERA A ES LA DIFERENTE");
            if(pesoa>pesob){
                System.out.println("Entonces la esfera A es MAYOR");
            }else{
                System.out.println("Entonces la esfera A es MENOR");
            }
        }
        
          
    
    }
    
}
