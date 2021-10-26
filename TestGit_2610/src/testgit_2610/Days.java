/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testgit_2610;

/**
 *
 * @author diese
 */
public enum Days {
    
    MONDAY("Tired from weekend"),
    TUESDAY("Getting there"),
    WEDNESDAY("Go for pints today"),
    THURSDAY("Can't wait to be over"),
    FRIDAY("Let's party"),
    SATURDAY("Let's keep partying"),
    SUNDAY("Hungover");
    
    private final String emotion;
    
    Days(String emotion){
        this.emotion = emotion;
    }
    
    public String getEmotion(){
        return emotion;
    }
    
}
