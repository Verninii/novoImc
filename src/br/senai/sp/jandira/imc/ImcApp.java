package br.senai.sp.jandira.imc;

import br.senai.sp.jandira.imc.model.Imc;
import br.senai.sp.jandira.imc.model.Aluno;
import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.Scanner;

public class ImcApp {

    public static void main(String[] args) {

        JFrame tela = new JFrame();
        tela.setSize(500, 300);
        tela.setTitle("Cálculo de IMC");
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLayout(null);

        JTextField txtNome = new JTextField();
        tela.getContentPane().add(txtNome);
        txtNome.setBounds(10,20,120,30);

        tela.setVisible(true);


        Scanner leitor = new Scanner(System.in);

        Imc imcMaria = new Imc();

        Aluno joao = new Aluno();
        joao.setNome("João Pereira");
        joao.setEmail("joao@gmail.com");
        joao.setCelular("(11)96369-9987");
        joao.setPeso(78);
        joao.setAltura(1.72);
        joao.setDataNascimento(LocalDate.of(1999,5,15));

        Imc imcJoao = new Imc(joao);

        //imcMaria.exibirDados();
        imcJoao.exibirDados();

    }
}
