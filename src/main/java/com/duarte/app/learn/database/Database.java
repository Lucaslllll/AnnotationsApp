/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duarte.app.learn.database;

import com.duarte.app.learn.entity.Annotation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class Database {
    private static Database instance;
    private String url = "jdbc:sqlite:database.db";

    public Database() {
        // Criar tabela se não existir
        String sqlCreateTable = "CREATE TABLE IF NOT EXISTS Annotation (\n"
                              + " id INTEGER PRIMARY KEY AUTOINCREMENT,\n"
                              + " name TEXT NOT NULL,\n"
                              + " details TEXT NOT NULL,\n"
                              + " isCompleted BOOLEAN \n"
                              + ");";
        
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sqlCreateTable);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static Database getInstance(){
        if (Database.instance == null) {
              Database.instance = new Database();
        }
        
        return Database.instance;
    }
    
    public void create(Annotation note) {
        String sql = "INSERT INTO Annotation(name, details, isCompleted) VALUES (?, ?, ?);";
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, note.getName());
            pstmt.setString(2, note.getDetails());
            pstmt.setBoolean(3, false);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Annotation> list() {
        List<Annotation> annotations = new ArrayList<>();
        String sql = "SELECT * FROM Annotation;";
        
        try (Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Annotation note = new Annotation(
                        rs.getString("name"),
                        rs.getString("details"),
                        rs.getBoolean("isCompleted")
                );
                annotations.add(note);
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        
        }
        
        return annotations;
    }

//    public void atualizarUsuario(Usuario usuario) {
//        String sql = "UPDATE usuarios SET nome = ?, email = ? WHERE id = ?";
//        try (Connection conn = DriverManager.getConnection(url);
//             PreparedStatement pstmt = conn.prepareStatement(sql)) {
//            pstmt.setString(1, usuario.getNome());
//            pstmt.setString(2, usuario.getEmail());
//            pstmt.setInt(3, usuario.getId());
//            pstmt.executeUpdate();
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public void deletarUsuario(int id) {
//        String sql = "DELETE FROM usuarios WHERE id = ?";
//        try (Connection conn = DriverManager.getConnection(url);
//             PreparedStatement pstmt = conn.prepareStatement(sql)) {
//            pstmt.setInt(1, id);
//            pstmt.executeUpdate();
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
    
    
}
