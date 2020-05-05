/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;

/**
 *
 * @author vigon
 */
public class VitorGMaula0405 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String nomeUsuario;
      // Exercício 1
      Scanner scan = new Scanner(System.in);
        System.out.println("Olá!informe seu nome: ");
        nomeUsuario = scan.next();
        System.out.println("Olá" + nomeUsuario + "! seja bem vindo"); 
        
        // Exercício 2
        
        String nomeUsuario2;
        
        float num1, num2, num3, num4, média;
        
        System.out.println("Digite seu nome:");
        nomeUsuario2 = scan.next();
         System.out.println ( " Digite sua primeira nota de matematica: " );
        num1 = scan.nextFloat ();
        System.out.println ( " Digite sua segunda nota de matematica: " );
        num2 = scan.nextFloat ();
        System.out.println ( " Digite sua terceira nota de matematica: " );
        num3 = scan.nextFloat ();
        System.out.println ( " Digite sua quarta nota de matematica: " );
        num4 = scan.nextFloat ();
        média = (num1 + num2 + num3 + num4) /  4 ;
        System.out.println ( " Sua média final é: "  + média);
        // Exercicio 3
        
    int in;

        Scanner scan2 =  new  Scanner(System.in);
        System.out.println ( " Informar um número no qual deseja saber a tabuada: " );
        in = scan.nextInt ();

        int multiplicador =  0 ;
        while (multiplicador <=  10 )
        {
            int resultado = in * multiplicador;
            System.out.println ( " A tabuada é: " + resultado);   
            multiplicador ++ ;
        }
        
        // Exercicio 5
        
        int meses, dias;
        
        System.out.println ( " Digite a quantidade de meses:" );
        meses = scan.nextInt ();
        
        dias = meses *  30 ;
        System.out.println ( " Nessa quantidade de meses têm: "  + dias +  " dias " );
        
    
    }     
    
}
