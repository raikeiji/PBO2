/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8.TIA;

/**
 *
 * @author TOSHIBA
 */
public final class Circle {
    private double radius;
   
    /** Creates a new instance of Circle */
    public Circle() {
    }
 
    /** Creates a new instance of Circle */
    public Circle(double radius) {
        setRadius(radius);
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return 3.14*radius*radius;
    }
    
}

