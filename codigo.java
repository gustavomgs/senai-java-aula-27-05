import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class MinhaAtividade {
    
    public static void main(String args[]){  
   
        Scanner teclado = new Scanner(System.in);
        
        int quantidade;
        
        System.out.print("Por favor insira a quantidade de repeticoes:\n");
        
        quantidade = teclado.nextInt();
        
        Double[] numeros = new Double[quantidade];
        
        for(int i = 0; i < quantidade; i++){
            numeros[i] = teclado.nextDouble();
        }
        
        for(int i = 0; i < quantidade; i++){
             System.out.printf("Numero: %f", numeros[i]);
        }
                
    	System.exit(0);
		
    }
}
