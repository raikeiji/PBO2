/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8.SimpleGUI_1.SimpleGUI_2;

/**
 *
 * @author admin
 */
public class Circle {
    public double radius;

    public Circle() {
    }

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
