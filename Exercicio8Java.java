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
public class Exercicio8Java {

    public static void main(String[] args) {
        Scanner result = new Scanner(System.in);

        int n1,n2, n3;
     
        System.out.println( "Informe 3 numeros( inteiros) ");
        n1 =result.nextInt();
        n2 = result.nextInt();
        n3 = result .nextInt();
        
       int soma = n1 + n2 + n3;
       int produto = n1*n2*n3;
       float media = (n1+n2+n3)/3;
        
        System.out.println("Soma dos números: "+soma);
        System.out.println("Produto dos números : "+produto);
        System.out.printf("Media dos números : %.0f\n", media);
      
        if (n1>n2 && n2>n3){
            System.out.printf("Maior: "+n1+"\nMenor: "+n3);      
        }else if (n1>n3 && n3>n2){
            System.out.println("Maior: "+n1+"\nMenor: "+n2);
        }else if (n2>n1 && n1>n3){
            System.out.println("Maior: "+n2+"\nMenor: "+n3);
        }else if (n2>n3 && n3>n1){
            System.out.println("Maior: "+n2+"\nMenor: "+n1);
        }else if (n3>n1 && n1>n2){
            System.out.println("Maior: "+n3+"\nMenor: "+n2);
        }else if (n3>n2 && n2>n1){
            System.out.println("Maior: "+n3+"\nMenor: "+ n1);
        }else if (n1==n2 && n2==n3){
            System.out.println("Maior: "+n3+"\nMenor: "+ n1);
            
           
         
    
     }
    }  
  }
       
       