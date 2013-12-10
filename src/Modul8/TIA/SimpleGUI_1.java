/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8.TIA;

/**
 *
 * @author TOSHIBA
 */
//import Geometri.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * SimpleGUI_1.java
 */

/**
 *
 * @author
 */
public class SimpleGUI_1 extends JFrame{
    private JButton clickButton;
    private JLabel counterLabel;
    private int numberOfClicks;
    private JButton notClickButton;
    
    /** Creates a new instance of SimpleGUI */
    public SimpleGUI_1() {
        clickButton = new JButton("I'M swing button");
        notClickButton = new JButton("I'M not swing button");
        counterLabel = new JLabel("Number of button click: ");
        
        numberOfClicks=0;
        
        this.setLayout(new FlowLayout());
        this.add(clickButton);
        this.add(counterLabel);
        this.add(notClickButton);
        this.setTitle("swing Application");
        this.setSize(300,200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        notClickButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                notClickAction();
            }
        });	                //Cara ke-2
        
        clickButton.addActionListener(new ClickButtonHandler());   // Cara ke-3
    }
    
    private class ClickButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            numberOfClicks++;
            counterLabel.setText("Number of button click: "+numberOfClicks);
        }
        
    }
    public void notClickAction(){
        numberOfClicks--;
        counterLabel.setText("Number of button click: "+numberOfClicks);
    }
    
    public int getNumberOfClicks() {
        return numberOfClicks;
    }
    
    public void setNumberOfClicks(int numberOfClicks) {
        this.numberOfClicks = numberOfClicks;
    }
        
  
    public static void main(String[] args) {
SimpleGUI_1 gui = new SimpleGUI_1();
}
}
  

