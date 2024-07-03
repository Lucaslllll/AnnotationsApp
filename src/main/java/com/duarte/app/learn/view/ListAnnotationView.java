/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duarte.app.learn.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Lucas
 */
public class ListAnnotationView extends JFrame {

    
    public void startView() {
        try{
            // definindo esse quadro principal
            setTitle("AppLearn");
            setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
            setSize(600,400);
            setLayout(new BorderLayout());
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
