/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula7;

import java.util.Scanner;

/**
 *linguagem de programação
 * @author Duda
 *  materia: entrada de dados
 * data: 15/08/23
 */
public class aula7 {
    public static   void main (String[]args) {
    Scanner ler = new Scanner (System.in);

    System.out.println("qual nome do aluno?");
        String nome = ler.next();
    
System.out.println("qual a primeira nota?");
float nota1 = ler.nextFloat();
System.out.println("qual a segunda nota?");
float nota2 = ler.nextFloat();
System.out.println("qual a terceira nota?");
float nota3 = ler.nextFloat();
System.out.println("qual a quarta nota?");
float nota4 = ler.nextFloat();
float soma = nota1 + nota2 + nota3 + nota4;
float media = soma / 4;
System.out.println("a média:" +  media);
    }

}