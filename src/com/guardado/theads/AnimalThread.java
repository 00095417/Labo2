/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guardado.theads;

import javax.swing.JLabel;

/**
 *
 * @author LN710Q
 */
public class AnimalThread extends Thread{
    
    private String nombre;
    private int limite;
    private JLabel animal;
    private int x;
    private int y;
    
    public AnimalThread(){}

    public AnimalThread(String nombre, int limite, int x, int y, JLabel animal) {
        this.nombre = nombre;
        this.limite = limite;
        this.x = x;
        this.y = y;
        this.animal = animal;
    }
    
    @Override
    
    public void run(){
        
        for (int i = x; i <= this.limite; i +=10){
            System.out.println(this.nombre + " avanza");
            this.animal.setLocation(i,y);
            try {
                sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(this.animal + " a llegadrdo a la meta");
        
        yield();    
    }
    
    
    
}
