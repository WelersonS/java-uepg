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
        int somaPares = 0, somaImpares = 0;
        String listaNumerosPares = "";
        String listaNumerosImpares = "";
        String resposta;
        do {
            System.out.print("Informe um número inteiro(0 SAIR): ");
            numero = teclado.nextInt();
            
            if(numero % 2 == 0) {
                somaPares += numero;               
                listaNumerosPares += " " + numero;
            } else {
                somaImpares += numero;
                listaNumerosImpares += " " + numero;
            }
                        
            System.out.print("Deseja continuar? ");
            resposta = teclado.next();
        } while ( resposta.toUpperCase().equals("S"));
        
        System.out.println("A soma dos números pares é: " + somaPares);
        System.out.println("Os números pares são:" + listaNumerosPares);
        System.out.println("");
        System.out.println("A soma dos números ímpares é: " + somaImpares);
        System.out.println("Os números ímpares são:" + listaNumerosImpares);
    }
    
}
