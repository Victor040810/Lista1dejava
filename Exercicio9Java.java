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
public class Exercicio9Java {
    public static void main(String[] args) {
        Scanner result = new Scanner(System.in);
            
            System.out.println("Informe 2 números:");
            float n1 = result.nextFloat();
            float n2 = result.nextFloat();
             if(n1%n2==0){
                  System.out.printf(" Número %.0f é multiplo de %.0f\n",n1,n2);
               }else if(n1%n2!=0){
                    System.out.printf(" Número %.0f  não e multiplo de %.0f\n",n1,n2);
    }
  }
}
  