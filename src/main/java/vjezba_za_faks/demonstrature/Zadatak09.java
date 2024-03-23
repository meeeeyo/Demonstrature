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
public class Zadatak09 {
    // 9.	Deklarirajte niz od 3 elementa i postavite svakom od ta tri elementa vrijednost „Programiranje 2“.
    
    public static void main(String[] args) {
        
        String [] niz = new String [3];
        
        for (int i =0; i < niz.length; i++){
            niz[i] = "Programiranje 2";
        }
        System.out.println(Arrays.toString(niz));
        
    }
    
    
}
