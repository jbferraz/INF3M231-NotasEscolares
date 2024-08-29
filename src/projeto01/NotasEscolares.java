/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto01;

import java.util.Scanner;

/**
 *
 * @author jbferraz
 */
public class NotasEscolares {

    /**
     * Receber 4 notas de 0 a 10 e fazer a média dos 
     * 4 bimestres, considerando média maior que 7 para aprovação
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        float notas[] = new float[5];
        String aluno, resultado;
        
        System.out.println(".: Notas Escolares :.");
        System.out.print("Informe o nome do aluno: ");
        aluno = ler.nextLine();
        aluno = aluno.toUpperCase();
        
        for (int i = 0; i < 4; i++) {//No portugol é o Para
            System.out.print("Informa a " + (i+1) + "ª nota: ");
            notas[i] = ler.nextFloat();
            notas[4] += notas[i];
        }
        notas[4] = notas[4]/4; //calcula média
        
        if (notas[4]>=7) {//If no portugol é o Se
            resultado = "aprovado";
        }else{//else no portugol é o Senão
            resultado = "reprovado";
        }
        
        System.out.println("O(a) aluno(a) " + 
                aluno + " teve a média " + 
                notas[4] + " e foi " + resultado + ".");
    }
    
}
