
package exercicio1java;

import java.util.Scanner;

/**
 *
 * @author Vycto
 */
public class Exercicio3Java {
    
    public static void main(String[] args) {
        Scanner result = new Scanner (System.in);
        System.out.println(" Informe a quantidade de números que vc quer : ");
        int num =  result.nextInt();
        int cont=0;
         String es="";
        do{
            System.out.println(" Informe um número para a seguência ");   
            String num2 =  result.next();
            
            String z = num2;
            es += z;
        cont += 1;
  }while (cont < num); 
        
         System.out.println(" A ordem inversa : " + es );
}
    
   
}
    

    

    
  
        