/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10;

import java.util.Scanner;

/**
 *
 * @author 16856313632
 */
public class Aula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
                int escolha;
                
       do {
           System.out.println("MENU");
           System.out.println("1. opção 1");
           System.out.println("2. opção 2 ");
           System.out.println("3. opção 3");
           System.out.println("0. sair");
           System.out.println("escolha uma opção");
           escolha = scanner.nextInt();
           
           switch(escolha){
            case 1:
               System.out.println("você escolheu a opção 1.");
               break;
                       case 2:
                           System.out.println("você escolheu a opção 2.");
                           break;
                                   case 3:
                                       System.out.println("você escolheu a opção 3.");
                                       break;
                                               case 0:
                                                   System.out.println("saindo do programa.");
                                                   break;
                                                           default:
                                                               System.out.println("opção inválida.");
                                                               break;
           }
           System.out.println();
           // Linha em branco para separar as interações
       } while(escolha != 0);
                                                   
           }
    }
    

