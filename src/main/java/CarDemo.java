/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Client
 */
public class CarDemo {
    
    public static void main(String[] args) {
        
        Car myCar = new Car(2010, "Hyundai");
        
        for (int i = 1; i <= 5; i++){
            myCar.accelerate();
            System.out.println("Current speed: " + myCar.getSpeed());
        }
        
        for (int i = 1; i <= 5; i++){
            myCar.brake();
            System.out.println("Current speed: " + myCar.getSpeed());
        }
    }
    
}
