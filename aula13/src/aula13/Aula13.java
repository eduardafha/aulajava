/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula13;

import java.util.Scanner;

/**
 *
 * @author 16856313632
 */
public class Aula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner (System.in);
        int numero;
        
        System.out.println("digite um numero  inteiro");
        numero = ler.nextInt();
        
        numero = numero % 2;
        
        if(numero != 0){
           System.out.println("o numero  é impar");  
        }else{
         System.out.println("o numero  é par");
                   
        
    }
                
    }
    
}
