/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package square;
import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
      
      System.out.print("Enter Integer 1 :");
        int sq1 = scanner.nextInt();
        
      System.out.print("Enter Integer 2 :");
        int sq2 = scanner.nextInt();
        
      int square1 = sq1 * sq1;
      int square2 = sq2 * sq2;
      int sum_square = sq1 + sq2;
      int diff_square = sq1 - sq2;
      
      System.out.println("First square is :"+square1);
      System.out.println("Second square is :"+square2);
      System.out.println("Sum of squares is :"+sum_square);
      System.out.println("Different of squares is :"+diff_square);
    }
    
}
