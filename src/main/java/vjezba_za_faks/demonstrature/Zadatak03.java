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
public class Zadatak03 {
    
    // 3.	Program unosi godine osobe te ispisuje je li osoba punoljetna.
    // može biti na kolokviju / ispitu
    public static void main(String[] args) {
        
        int dob = Integer.parseInt(JOptionPane.showInputDialog("Unesi dob"));
        
        if (dob < 18){
            System.out.println("Maloljetna osoba");
        }else{
            System.out.println("Punoljetna osoba");
        }
        
    }
    
}
