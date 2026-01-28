/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.escola.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author JORGEJUNIORDEOLIVEIR
 */
public class ConnectionFactory {
    // enderço do banco
    private static final String URL = "jdbc:mysql://localhost:3306/escoladao";
    // usuario do mysql
    private static final String USER = "root";
    //senha
    private static final String PASS = "root";
    //metodo que devolve uma conexao pronta
    public static Connection getConnection() throws SQLException{
        // abre a conexao e retorna para quem chamou
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
