/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vjezba_za_faks.demonstrature;

import java.util.Arrays;

/**
 *
 * @author Meeeyo
 */
public class Zadatak10 {
    // 10.	Pomoću niza napravi program koji 5 puta ispisuje broj 7.
    
    public static void main(String[] args) {
        
        int [] niz = new int [5];
        
        for (int i = 0; i <= niz.length-1; i++){
            niz [i] = 7;
        }
        System.out.println(Arrays.toString(niz));
    }
    
}
