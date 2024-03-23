/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vjezba_za_faks.demonstrature;

import javax.swing.JOptionPane;

/**
 *
 * @author Lale
 */
public class Zadatak01 {
    
    //1.	Program unosi jedan decimalni i jedan cijeli broj te 
    //ispisuje unesene brojeve jedan ispod drugoga.
    
    public static void main(String[] args) {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Unesi decimalni"));
        
        System.out.println(a);
        System.out.println(b);
    }
    
    
}
