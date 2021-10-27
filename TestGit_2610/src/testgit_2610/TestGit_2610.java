/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testgit_2610;

/**
 *
 * @author diese
 */
public class TestGit_2610 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Days d = Days.TUESDAY;
        
        System.out.println(d.getEmotion());
        
        String dayString = "SATURDAY";
        
        Days d2= Days.valueOf(dayString);
        System.out.println(d2);
        System.out.println(d2.getEmotion());
    }
    
}
