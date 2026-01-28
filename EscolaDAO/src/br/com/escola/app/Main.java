/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.escola.app;

import br.com.escola.model.Aluno;
import br.com.escola.dao.AlunoDAO;

import java.util.Scanner;        



/**
 *
 * @author JORGEJUNIORDEOLIVEIR
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        AlunoDAO dao = new AlunoDAO();
        
        System.out.println("Quantos alunos deseja cadastrar");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        
        
        for(int i = 1; i <= quantidade; i++) {
            System.out.println("Digite o nome do aluno" + i + " :");
            String nome = scanner.nextLine();
            
            Aluno aluno = new Aluno(nome);
            
            dao.cadastrar(aluno);
        }
        
        System.out.println(" \n===ALUNOS CADASTRADOS ===");
        dao.listar().forEach( aluno -> {
            System.out.println(aluno.getId() + " - " + aluno.getNome());
        });
    scanner.close();
    }
    
}
