
package operadoresaritmeticos;

import java.util.Scanner;

/**
 *
 * @author weler
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //System.out.print("Informe numerador: ");
        //int numerador = teclado.nextInt();
        
        //System.out.print("Informe denominador: ");
        //int denomidador = teclado.nextInt();
        
        //float result = numerador / denomidador;
        //float resto = numerador % denomidador;
        //System.out.printf("O resultado da divisão é %.2f\n", result);
        //System.out.println("O resto é " + resto);
        
        teclado.close();
        
        /**
         * Math.PI
         * Math.pow(5,2)
         * Math.sqrt(25)
         * Math.cbrt() //raiz cubica
         */
        
        int numero2 = 6;
        int pow = (int) Math.pow(numero2, 2);
        System.out.println(pow);
        
        /**
         * Math.abs(-10) = 10 retorna valor absoluto 
         * Math.floor(3.9) = 3 truncar para baixo
         * Math.ceil(4.2) = 5 truncar para cima
         * Math.round(5.6) = 6 truncar para mais próximo
         * Math.random() * (10-5) 
         * random -> gera um numero aleatório entre 0 e 1;
         */
        
        //System.out.println(Math.round(5.4));
        double randomNumber = Math.random();
        int randomNumber2 = (int) (randomNumber * (60 - 1)); //entre 1 e 60
        System.out.println(randomNumber2);
    }
    
}
