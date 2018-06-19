/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1java;

import java.util.Scanner;

/**
 *
 * @author Vycto
 */
public class Exercicio10Java {
     public static void main(String[] args) {
        Scanner result = new Scanner(System.in);
        int n1;
        System.out.println("Informe o raio");
        n1 = result.nextInt();
        double d = 2*n1;
        double c= 2*(Math.PI*n1);
        double a = (Math.PI*Math.PI)*n1;
        
        System.out.println("Diametro: "+d);
        System.out.printf("Circunferência:%.3f\n",c);
        System.out.printf("Area:%.2f\n",a);
    }
}

