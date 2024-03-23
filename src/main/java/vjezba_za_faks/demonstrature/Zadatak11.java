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
public class Zadatak11 {
    // 11.	Napravi program koji će na temelju brojčane ocjene 
    //koju smo unijeli ispisati njezin ekvivalent riječima.
    public static void main(String[] args) {
        
        int ocjena = Integer.parseInt(JOptionPane.showInputDialog("Unesi ocjenu"));
        
        switch (ocjena){
            case 1: 
                System.out.println("Nedovoljan");
                break;
                
                case 2: 
                System.out.println("Dovoljan");
                break;
                
                case 3: 
                System.out.println("Dobar");
                break;
                
                case 4: 
                System.out.println("Vrlo dobar");
                break;
                
                case 5: 
                System.out.println("Odličan");
                break;
            
                default:
                    System.out.println("Unesite ocjenu od 1 do 5");
            
            
        }
        
    }
    
}
