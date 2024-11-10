/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kmh;
import javax.swing.JOptionPane;

public class Kmh {

    public static void main(String[] args) {
        String meters = JOptionPane.showInputDialog("Enter meters :");
        double meter = Double.parseDouble(meters);

        String hours = JOptionPane.showInputDialog("Enter hours :");
        double hour = Double.parseDouble(hours);

        String minutes = JOptionPane.showInputDialog("Enter minutes :");
        double minute = Double.parseDouble(minutes);

        String seconds = JOptionPane.showInputDialog("Enter seconds :");
        double second = Double.parseDouble(seconds);

        // Correct calculation of total time in seconds
        double totalTimeInSeconds = hour * 3600 + minute * 60 + second;
        double speedInMetersPerSecond = meter / totalTimeInSeconds;
        double speedInKilometersPerHour = (speedInMetersPerSecond * 3600) / 1000;
        double speedInMilesPerHour = (speedInMetersPerSecond * 3600) / 1609;

        JOptionPane.showMessageDialog(null, "Speed in meters per second: " + String.format("%.2f", speedInMetersPerSecond) +
                                            "\nSpeed in kilometers per hour: " + String.format("%.2f", speedInKilometersPerHour) +
                                            "\nSpeed in miles per hour: " + String.format("%.2f", speedInMilesPerHour));
    }
}


