/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vjezba_za_faks.demonstrature;

/**
 *
 * @author Meeeyo
 */
public class Zadatak06 {
    // 6.	Napravi program koji ispisuje sve parne brojeve od 78 do 23.
    
    public static void main(String[] args) {
        
        for (int i = 78; i>=23; i--){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        
    }
}
