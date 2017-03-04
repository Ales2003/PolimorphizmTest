/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mail.ales2003.polimorphizm;

/**
 *
 * @author admin
 */
public class Child extends AbstractParent implements IPrintable{
    
    
    /*   @Override
    public void print(){
    System.out.println("Print: Child");
    }
    */
    public void run(){
        System.out.println("Run: Child");
    }
            
}
