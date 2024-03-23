/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vjezba_za_faks.demonstrature;

import javax.swing.JOptionPane;

/**
 *
 * @author Meeeyo
 */
public class Zadatak02 {
    // 2.	Za unesena dva cijela broja ispišite njihov zbroj.
    
    public static void main(String[] args) {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
        
        System.out.println(a+b);
    }
}
