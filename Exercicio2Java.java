
 
package exercicio1java;

import java.util.Scanner;

/**
 *
 * @author Vycto
 */
public class Exercicio2Java {
    
       public static void main(String[] args) {
     
          Scanner num = new Scanner(System.in);
           float t, d;
           double vonda = 20;
           System.out.println(" Informe quantos Kms a onda pecorreu : ");
           d = num.nextFloat();
           if(d<=12){
                     t = (float) (d/vonda);
                     t= t*60;
                    System.out.printf(" A onda percorreu  %.1fkms em : %.2f minutos \n",d,t);
            }else if( d>12){
                    System.out.println(" A onda não passou de 12kms ");}
             
}
}

