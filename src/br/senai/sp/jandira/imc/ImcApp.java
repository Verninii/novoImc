package br.senai.sp.jandira.imc;

import br.senai.sp.jandira.imc.model.Imc;

import javax.swing.*;
import java.util.Scanner;

public class ImcApp {

    public static void main(String[] args) {

        //JOptionPane.showMessageDialog(null,"Teste de mensagem");

        Scanner leitor = new Scanner(System.in);

        Imc imcMaria = new Imc();
        Imc imcJoao = new Imc();

        System.out.println("Digite sua altura");
        double novaAltura = leitor.nextDouble();

        if (imcMaria.setAltura(novaAltura)){

        }else {
            JOptionPane.showMessageDialog(null,"Valor Incorreto");
            System.exit(0);
        }

        imcMaria.peso = 55;
        imcMaria.nomeAluno = "Maria da Silva";

        System.out.println("Digite a sua altura");
        imcJoao.setAltura(leitor.nextDouble());

        imcJoao.peso = 76;
        imcJoao.nomeAluno = "João de Oliveira";

        imcMaria.exibirDados();
        imcJoao.exibirDados();

    }
}
