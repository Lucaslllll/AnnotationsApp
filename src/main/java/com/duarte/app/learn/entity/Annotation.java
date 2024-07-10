/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duarte.app.learn.entity;

/**
 *
 * @author Lucas
 */
public class Annotation extends Entity{
    private String name;
    private String details;
    private boolean isCompleted;

    public Annotation(String name, String details, boolean isCompleted){
        this.name = name;
        this.details = details;
        this.isCompleted = isCompleted;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
    
}
