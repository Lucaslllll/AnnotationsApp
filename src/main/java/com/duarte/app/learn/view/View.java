/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.duarte.app.learn.view;

/**
 *
 * @author Lucas
 */
public interface View {
    default void print(String s){
        System.out.print(s);
    }
    
    void startView();
}
