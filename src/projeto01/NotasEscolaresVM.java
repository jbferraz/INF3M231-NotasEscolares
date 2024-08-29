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
public class NotasEscolaresVM {

    /**
     * Criar Algoritmo para receber as notas de 5 alunos de 4 bimestres, a freq.
     * do aluno e apresentar o resultado final considerando média >= 7 e freq.
     * >= 75%
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        String alunos[][] = new String[5][2];
        float notas[][] = new float[5][6];
        float r = (float) Math.random();

        System.out.println(".: Nostas Escolares 2 :.");
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o nome do " + (i + 1) + "º aluno: ");
            alunos[i][0] = ler.next();
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a " + (j + 1) + "ª nota: ");
                notas[i][j] = randomNumberGenerator(0, 10);
                notas[i][5] += notas[i][j];//Acumula/soma 4 notas
            }//fim do for notas
            notas[i][5] = notas[i][5] / 4;//Calcula a média das notas
            System.out.print("Digite a freq. do aluno "
                    + alunos[i][0] + ": ");
            notas[i][4] = ler.nextFloat();
            if (notas[i][4] < 75) {
                alunos[i][1] = "Rep. por Falta";
            } else if (notas[i][5] < 7) {
                alunos[i][1] = "Reprovado por nota";
            } else {
                alunos[i][1] = "☺ Aprovado ☺";
            }
            System.out.println("-----");
        }//fim do 1º for
        System.out.println("-- Resultados --");
        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno(a): " + alunos[i][0]
                    + ":\nMédia: " + notas[i][5]
                    + "\nFreq.: " + notas[i][4]
                    + "\nResultado final: " + alunos[i][1] + ".\n----");
        }
        System.out.println(".: Sistema de Notas encerrado :.");
    }

    public static float randomNumberGenerator(int min, int max) {
        double r = Math.random();
        float randomNum = (float) (r * (max - min)) + min;
        return randomNum;
    }
}
