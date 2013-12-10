/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8.TIA;

//import Geometri.*;

/**
 *
 * @author TOSHIBA
 */
public class Square {
    private double length;
    private double width;

    public Square() {
    }

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getArea(){
        return getLength()*getWidth();
        
    }
    
    public double getCicumference(){
        return 2*(getLength()+getWidth());
        
    }
}
