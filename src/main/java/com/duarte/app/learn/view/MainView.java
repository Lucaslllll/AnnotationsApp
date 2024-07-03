/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duarte.app.learn.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author Lucas
 */
public class MainView extends JFrame{
    

    public void startView() {
        try{
            
            // definindo esse quadro principal
            setTitle("AppLearn");
            setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
            setSize(600,400);
            setLayout(new BorderLayout());
            
            // Definir uma fonte maior
            Font fonteGrande = new Font("Arial", Font.PLAIN, 18);
            
            // painel principal
            JPanel painel = new JPanel();
            painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
            
            // Padding ao redor do painel 
            painel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 
            
            // Label de boas vindas inicial
            JLabel nameApp = new JLabel();
            nameApp.setText("Bem-vindo ao App Learn");
            nameApp.setAlignmentX(Component.CENTER_ALIGNMENT);
            nameApp.setFont(fonteGrande);
            painel.add(nameApp);
            
             // padding vertical
            painel.add(Box.createRigidArea(new Dimension(0, 20)));
            
            // label para o meu o campo nome da anotacao
            JLabel sobre = new JLabel();
            sobre.setText("Digite uma anotação: ");
            sobre.setAlignmentX(Component.CENTER_ALIGNMENT);
            painel.add(sobre);
            
            
            // textfield name das anotacoes
            JTextField tf1 = new JTextField();
            tf1.setMaximumSize(new Dimension(Integer.MAX_VALUE, tf1.getPreferredSize().height+10));
            tf1.setAlignmentX(Component.CENTER_ALIGNMENT);
            painel.add(tf1);
            
            
             // padding vertical
            painel.add(Box.createRigidArea(new Dimension(0, 20)));
            
            
            // label para textarea details da anotação
            JLabel sobreDetails = new JLabel();
            sobreDetails.setText("Digite os detalhes da anotação: ");
            sobreDetails.setAlignmentX(Component.CENTER_ALIGNMENT);
            painel.add(sobreDetails);
            
            // textfield details
            JTextArea ta = new JTextArea("Detalhes", 5, 20);
            JScrollPane scrollPane = new JScrollPane(ta);
            scrollPane.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
            painel.add(scrollPane);
            
             // padding vertical
            painel.add(Box.createRigidArea(new Dimension(0, 40)));
            
            // Botão enviar 
            JButton bt1 = new JButton();
            bt1.setText("Enviar");
            bt1.setAlignmentX(Component.CENTER_ALIGNMENT);
            bt1.setMaximumSize(new Dimension(200, 50));
            bt1.setBackground(Color.CYAN);
            painel.add(bt1);
            
            
            bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    // Fechar o JFrame atual
                    dispose();
                    
                    // Abrir novo JFrame
                    ListAnnotationView listnotes = new ListAnnotationView();
                    listnotes.startView();
                    listnotes.setVisible(true);
                    
                }
            });
            
            
            
            
            // adicionando componentes ao painel
            add(painel, BorderLayout.CENTER);
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
                
        
    }
    
    
}
