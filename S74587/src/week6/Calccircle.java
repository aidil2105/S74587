/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calccircle;
import javax.swing.JOptionPane;


public class Calccircle {

    public static void main(String[] args) {
        String radius =JOptionPane.showInputDialog("Enter the radius of cirlce :");
        double ci1 = Double.parseDouble(radius);
        
        double diameter = ci1*ci1;
        double circumference = ci1 * 3.142 * 2;
        double area = 3.142 * ci1 *ci1;
        
        JOptionPane.showMessageDialog(null,"The circle diameter is :"+diameter);
        JOptionPane.showMessageDialog(null,"The circle circumference is :"+String.format("%.2f", circumference));
        JOptionPane.showMessageDialog(null,"The circle area is :"+String.format("%.2f", area));
        
    }
    
}
