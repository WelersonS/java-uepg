package tiposprimitivos;

import java.util.Scanner;


/**
 *
 * @author weler
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        //int idade = 3;
        //float salario = 1840.45f;
        //char letra = 'C';
        //boolean casado = false;
        
        //int idade1 = (int) 3;
        //float salario1 = (float) 1840.45;
        //char letra1 = (char) 'C';
        //boolean casado1 = (boolean) false;
        
        //Integer idade2 = 4;
        //Float salario2 = 1834.21f;
        //String letra2 = "C";
        //Boolean casado2 = false;
        
        //float nota = (float)8.5;
        //String nome = "Welerson";
        
        //System.out.println("A nota é " + nota);
        //System.out.print("A nota é " + nota);
        //System.out.println("");
        //System.out.printf("A nota vale %.2f \n", nota);
        //System.out.format("A nota de %s vale %.2f \n", nome, nota);
        
        //Entrada de dados
        //Scanner teclado = new Scanner(System.in);
        
        //System.out.println("Informe o nome: ");
        //String nome = teclado.nextLine();
        
        //System.out.println("Informe a nota: ");
        //float nota = teclado.nextFloat();
        
        //System.out.format("A nota de %s vale %.2f \n", nome, nota);
        //System.out.println("A nota de " + nome + " é " + nota);
        
        //teclado.close();
        
        //Conversão de Tipos
        int idade = 30;
        
        //String valor = idade;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        
        String valor1 = "30";
        idade = Integer.parseInt(valor1);
        System.out.println(valor1);
    }
    
}
