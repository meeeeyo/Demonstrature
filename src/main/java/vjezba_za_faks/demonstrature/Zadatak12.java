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
// 12.	Prethodni program preoblikuj tako da ukoliko se unese riječima „Nedovoljan“ program ispiše „Pad“,
//a ukoliko se unese ocjena dovoljan, dobar, vrlo dobar ili odličan tada program ispisuje „Prolaz“.
public class Zadatak12 {
    
    public static void main(String[] args) {
        
        String ocjena = JOptionPane.showInputDialog("Unesite ocjenu riječima");
        
        switch (ocjena){
            case "Nedovoljan":
                System.out.println("Pad");
                break;
            case "Dovoljan":
            case "Dobar":
            case "Vrlo dobar":
            case "Odličan":
                System.out.println("Prolaz");
                break;
                
                default:
        System.out.println("Unesite traženu vrijednost");
        
        }
        
    }
    
}
