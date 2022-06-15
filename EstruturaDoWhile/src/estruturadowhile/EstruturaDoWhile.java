/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadowhile;

import java.util.Scanner;

/**
 *
 * @author weler
 */
public class EstruturaDoWhile {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*
        int c = 0;
        
        do {
            System.out.println("Do while " + c);
            c++;
        } while(c <= 20);
        */
        
        int numero;
        int soma = 0;
        do {
            System.out.print("Informe um número inteiro(0 SAIR): ");
            numero = teclado.nextInt();
            soma += numero;
        } while ( numero != 0);
        
        System.out.println("A soma dos números é: " + soma);
    }
    
}
