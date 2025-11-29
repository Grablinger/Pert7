/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpl2_ia17;

/**
 *
 * @author Eri Maulana
 */
public class Buyer extends user{
    
    @Override
    public void login(){
        System.out.println("Buyer melakukan login");
    }
    
    @Override
    public void logout(){
        System.out.println("Buyer melakukan logout");
    }
}