package br.senai.sp.jandira.imc.model;

import javax.swing.*;

public class Imc {

    private double imc;
    private Aluno aluno;

    //metodo construtor padrao
    public Imc(Aluno aluno){
        //this significa desta classe ou seja o do public class IMC
        this.aluno = aluno;
    }

    public Imc (){

    }

    private void calcularImc(){
        imc = aluno.getPeso()/ Math.pow(aluno.getAltura(), 2.0);
    }
    public void definirEstadoImc(){
        String estado = "Calculando resultado...";

    }

    public void exibirDados(){
        System.out.println("-------------------------");
        System.out.println("DADOS DO ALUNO");
        System.out.printf("Nome: %s\n", aluno.getNome());
        System.out.printf("Peso: %s\n", aluno.getPeso());
        System.out.printf("Altura: %s\n", aluno.getAltura());
        calcularImc();
        System.out.printf("Email: %s\n", aluno.getEmail());
        System.out.printf("Data de nascimento: %s\n", aluno.getDataNascimento());
        System.out.printf("IMC: %s\n",imc);

    }

}
