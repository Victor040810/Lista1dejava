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
public class Exercicio7Java {
    public static void main(String[] args) {
       Scanner result= new Scanner(System.in);
        System.out.println("Informe 1 número ");
        int n1 = result.nextInt();
        System.out.println("Informe 1 número ");
        int n2 =  result.nextInt();
        
        if ( n1== n2){
            System.out.printf("These numbers are equal %d////%d \n",n1,n2);
        }else {
            if (n1 > n2){
                System.out.println( "number "+n1+" is larger");
            }else {
                if(n2>n1){
                System.out.println( "number"+n2+ " is larger");
                
            }
            }
        }
    }
}
        
        
                


    
    

