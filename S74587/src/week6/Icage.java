/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icage;
import javax.swing.JOptionPane;

public class Icage {

    public static void main(String[] args) {
        
        String ICnum = JOptionPane.showInputDialog("Enter your IC (Only 12 digits :");
        int day = Integer.parseInt(ICnum.substring(4, 6));
        int month = Integer.parseInt(ICnum.substring(3, 4));
        int year = Integer.parseInt(ICnum.substring(1, 2)) + 2000;

      
        int currentYear = 2024; 
        int age = currentYear - year;

        JOptionPane.showMessageDialog(null, "Your birth date is: " + day + "/" + month + "/" + year + "\nYour age is: " + age + " years old");
    }
}
    
