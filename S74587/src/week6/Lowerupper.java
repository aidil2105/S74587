/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lowerupper;
import javax.swing.JOptionPane;

public class Lowerupper {
    public static void main(String[] args) {
        String inputString = JOptionPane.showInputDialog("Enter words:");
        
        String upper = inputString.toUpperCase();
        String lower = inputString.toLowerCase();
        
        JOptionPane.showMessageDialog(null,"Uppercase :"+ upper +"\nLowercase :"+lower);
        
    }   
    
}
