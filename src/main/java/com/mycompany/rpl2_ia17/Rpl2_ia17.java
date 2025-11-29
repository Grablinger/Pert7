/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rpl2_ia17;

/**
 *
 * @author Eri Maulana
 */
public class Rpl2_ia17 {

    public static void main(String[] args) {
        user user = new user();
        user.login();
        user.logout();
        
        Buyer buyer = new Buyer();
        buyer.login();
        buyer.logout();
        
        Seller seller = new Seller();
        seller.addProduct("Nasi Goreng");
        
        Admin admin = new Admin();
        admin.login();
        admin.manageUser();
        admin.logout();
    }
}
