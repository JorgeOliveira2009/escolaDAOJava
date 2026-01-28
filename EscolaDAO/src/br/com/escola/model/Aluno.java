/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.escola.model;

/**
 *
 * @author JORGEJUNIORDEOLIVEIR
 */
public class Aluno {
    //Colunas da tabela
    private int id;
    private String nome; 
    
    //Contructor vazio 
    public Aluno() {
        
    }
    
    // Contrutor para criar um novo aluno sem id ainda
    public Aluno (String nome) {
        this.nome = nome;
    }
    //Contructor para quando vem do banco ja com id
    public Aluno (int id, String nome) {
        this.id = id;
        this.nome = nome;

    }
    // getter e setter do id
    public int getId() {
        return id;
        
    }
    public void setId(int id) {
        this.id = id;
        
    }
    // getter e setter do nome
    public String getNome() {
        return nome;
    }
public void setNome(String nome) {
    this.nome = nome;
}
    
}
