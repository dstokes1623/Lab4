/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Client
 */
public class Circle {
    private double radius;
    private final double PI = 3.14159;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(){
        this.radius = 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double area(){
        return PI * radius * radius;
    }
    
    public double diameter(){
        return radius * 2;
    }
    
    public double circumference(){
        return 2 * PI * radius;
    }
}
