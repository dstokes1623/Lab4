
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Client
 */
public class CircleDemo {
   
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the radius of the circle: ");
        
        Circle userCircle = new Circle(keyboard.nextDouble());
        
        System.out.println("The area of the circle is: " + userCircle.area());
        System.out.println("The diameter of the circle is: " + userCircle.diameter());
        System.out.println("The circumference of the circle is: " + userCircle.circumference());
    }
    
}
