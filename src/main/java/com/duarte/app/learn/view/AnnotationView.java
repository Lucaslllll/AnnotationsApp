/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duarte.app.learn.view;

import com.duarte.app.learn.entity.Annotation;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Lucas
 */
public class AnnotationView extends JFrame{
    public void startView(Annotation note){
        try{
            
            setTitle("Sobre: "+note.getName());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(600, 400);
            setLayout(new BorderLayout());
            
            // Definindo um fonte
            Font fontePadrao = new Font("Times New Roman", Font.PLAIN, 18);
            
            JPanel painel = new JPanel();
            painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
            painel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
            
            JTextArea area = new JTextArea();
            area.setFont(fontePadrao);
            area.setText(note.getDetails());
            painel.add(area);
            
            
            add(painel);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }
}
