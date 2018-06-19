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
public class Exercicio6 {
    
    public static void main(String[] args) {
         Scanner result = new Scanner(System.in);
            System.out.println(" Informe dois números ");
            int n1= result.nextInt();
            int n2 = result.nextInt();
            int res = n1+n2;
            int res1 = n1 - n2;
            int res2 = n1*n2;
            float res3 = n1/n2;  
        
            System.out.printf("A soma :%d\n",res);
            System.out.println("O produto: "+ n1*n2);
            System.out.println("A diferença : "+ res1 );
            System.out.println("O quoeficiente : "+ res3);
        
    }


}

