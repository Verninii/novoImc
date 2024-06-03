package br.senai.sp.jandira.imc.model;

import javax.swing.*;

public class Imc {
    public int peso;
    private double altura;
    private double imc;
    public String nomeAluno;

    private void calcularImc(){
        imc = peso / Math.pow(altura,2.0);
    }
    public void definirEstadoImc(){
        String estado = "Calculando resultado...";

    }

    public boolean setAltura(double novoValor){
        if (novoValor >= 1.0 && novoValor < 2.5) {
            altura = novoValor;
            return true;
        } else {
            return false;
        }
    }

    public void exibirDados(){
        System.out.println("-------------------------");
        System.out.println("DADOS DO ALUNO");
        System.out.printf("Nome: %s\n", nomeAluno);
        System.out.printf("Peso: %s\n", peso);
        System.out.printf("Altura: %s\n", altura);
        calcularImc();
        System.out.printf("IMC: %s\n",imc);

    }

}
