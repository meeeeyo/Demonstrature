/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vjezba_za_faks.demonstrature;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Meeeyo
 */
public class Zadatak05 {
    //5.	Deklarirati niz od tri elementa i od korisnika unijeti 
    //tri decimalne vrijednosti u deklarirani niz.
    
    public static void main(String[] args) {
        
        double [] niz = new double [3];
        
        niz [0] = Double.parseDouble(JOptionPane.showInputDialog("Unesi prvi broj"));
        niz [1] = Double.parseDouble(JOptionPane.showInputDialog("Unesi drugi broj"));
        niz [2] = Double.parseDouble(JOptionPane.showInputDialog("Unesi treći broj"));
        
        System.out.println(Arrays.toString(niz));
    }
}
