
package exercicio1java;

/**
 *
 * @author Vycto
 */
public class Exercicio1Java {


    public static void main(String[] args) {
    
        float aluguel=550;
        for (int ano = 1; ano<=6; ) {
            for (int mes=1; mes <=12; mes++){
                System.out.printf("O aluguel do mês %d do %dº ano é = %.2f \n",mes,ano,aluguel);                 
            }
            aluguel= (float) ((aluguel*0.1)+aluguel);
            ano++;
        }
        
    }
    
}