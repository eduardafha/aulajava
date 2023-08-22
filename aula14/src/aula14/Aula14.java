/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula14;

import java.util.Scanner;

/**
 *
 * @author 16856313632
 */
public class Aula14 {

    /**
     * exercicio:o cardapio de uma lanchonete é dado abaixo
     * 1 - Hambúrguer............... R$ 30,00
2 - Cheeseburger.............. R$ 35,50
3 - Fritas............................ R$ 20,50
4 - Refrigerante................. R$ 10,00
5 - Milkshake..................... R$ 30,00
     * @author Duda
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int escolha;
        
        do{
            System.out.println("cardapio");
            System.out.println("1 - hamurguer");
            System.out.println("2 - cheeseburguer");
            System.out.println("3 - fritas");
            System.out.println("4 - refrigerante");
            System.out.println("5- milkshake");
            System.out.println("6 - sair");
           System.out.println("0 - sair");
           System.out.println("4 - escolha seu lanche");
           escolha = ler.nextInt();
           switch (escolha){
               case 1:
                   System.out.println("hamburguer: R$ 30,00 ");
                   break;
               case 2:
                   System.out.println("cheeseburguer: 35,00");
                   break;
                           case 3:
                   
                   System.out.println(" fritas: 20,50");
                   break;
                           case 4:
                   System.out.println("refrigerante: 10,00"); 
                   break;
                           case 5:
                   
                   System.out.println("5- milkshake: 30,00");
                   break;
                           default:
                   System.out.println("opção invalida"); 
                   break;
            } 
                   System.out.println("-----------------");
            }while (escolha !=0);
                
                   
                   
                   
                   
                   
                   
           }
        }
        
    
    

