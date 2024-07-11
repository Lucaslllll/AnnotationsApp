/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duarte.app.learn.view;

import com.duarte.app.learn.database.Database;
import com.duarte.app.learn.entity.Annotation;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Lucas
 */
public class ListAnnotationView extends JFrame {

    
    public void startView() {
        try{
            // definindo esse quadro principal
            setTitle("Listagem das Anotações");
            setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
            setSize(600,400);
            setLayout(new BorderLayout());
            
            // Definindo um fonte
            Font fontePadrao = new Font("Times New Roman", Font.PLAIN, 18);
            
            JPanel painel = new JPanel();
            painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
            
            // setando um borda para servir como padding
            painel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
            
            // Label de boas vindas inicial
            JLabel title = new JLabel();
            title.setText("Listagem");
            title.setAlignmentX(Component.CENTER_ALIGNMENT);
            title.setFont(fontePadrao);
            painel.add(title);
            
            
            // listagem component
            DefaultListModel items = new DefaultListModel();
            for(Annotation note : Database.getInstance().list()){
                items.addElement(note.getName());
            }
            
            
            JList list = new JList(items); //data has type Object[]
            list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            list.setLayoutOrientation(JList.VERTICAL);
            list.setVisibleRowCount(-1);
            
            
            JScrollPane listScroller = new JScrollPane(list);
            listScroller.setPreferredSize(new Dimension(250, 80));
            painel.add(listScroller);
            
            
            
            
            add(painel);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
