/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8.Tugas;


/**
 *
 * @author admin
 */
public class Square{
    private double length;
    private double width;

    public Square() {
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
    
    public double getCircumtance(){
        return (getLength()*2)+(getWidth()*2);
    }
}
