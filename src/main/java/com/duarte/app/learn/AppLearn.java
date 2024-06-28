/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.duarte.app.learn;

import com.duarte.app.learn.view.MainView;
import javax.swing.JFrame;

/**
 *
 * @author Lucas
 */
public class AppLearn {

    public static void main(String[] args) {
        // obs: ctrl + j = ctrl + d do sublime
        MainView main = new MainView();
        // adicionar primeiro os componentes
        main.startView();
        // depois habilitá-los
        main.setVisible(true);
        
    }
}
