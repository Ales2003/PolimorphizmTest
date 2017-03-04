package ru.mail.ales2003.polimorphizm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public interface IPrintable {
    default void print(){
        System.out.println("Print: IPrintable");
    };
}
