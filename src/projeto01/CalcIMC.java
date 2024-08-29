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
public class CalcIMC {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float altura, peso, imc;
        String resultado = null;
        Scanner ler = new Scanner(System.in);

        System.out.println(".: Calculadora de IMC :.");
        System.out.print("Digite a altura: ");
        altura = ler.nextFloat();
        System.out.print("Digite o peso: ");
        peso = ler.nextFloat();
        //imc = peso / (altura * altura);
        imc = calcIMC(altura, peso);
        ler.close();

        /*
        resultados menores que 16 — magreza grave;
        resultados entre 16 e 16,9 — magreza moderada;
        resultados entre 17 e 18,5 — magreza leve;
        resultados entre 18,6 e 24,9 — peso ideal;
        resultados entre 25 e 29,9 — sobrepeso;
        resultados entre 30 e 34,9 — obesidade grau I;
        resultados entre 35 e 39,9 — obesidade grau II ou severa;
        resultados maiores do que 40 — obesidade grau III ou mórbida.
         */
        if (imc < 16) {
            resultado = "magreza grave";
        } else if (imc < 16.9) {
            resultado = "magreza moderada";
        } else if (imc < 18.5) {
            resultado = "magreza leve";
        } else if (imc < 24.9) {
            resultado = "peso ideal";
        } else if (imc < 29.9) {
            resultado = "sobrepeso";
        } else if (imc < 34.9) {
            resultado = "obesidade grau I";
        } else if (imc < 39.9) {
            resultado = "obesidade grau II";
        } else {
            resultado = "obesidade grau III";
        }

        System.out.println("Seu IMC é: " + imc + " e o resultado é " + resultado);

    }// fim main
    
    /**
     * Função calcIMC calcula o IMC de um individuo
     * Recebe os seguintes parâmetros:altura e peso
     * @param altura
     * @param peso
     * @return 
     */
    public static float calcIMC(float altura, float peso){
        return (float) (peso / Math.pow(altura, 2));
    }

}//fim classe
