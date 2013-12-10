/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8.Tugas;

/**
 *
 * @author admin
 */
public class Circle {
    private double radius;

    public Circle() {
    }

    public double getradius() {
        return radius;
    }

    public void setradius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return 3.14*getradius()*getradius();
    }
    
    public double getCircumference(){
        return 2*3.14*getradius();
    }
}
