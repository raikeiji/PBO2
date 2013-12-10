package Modul8.SimpleGUI_1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author admin
 */
public class SimpleGUI_1 extends JFrame {


    private JButton clickButton;
    private JLabel counterLabel;
    private int numberOfClicks;
    private JButton notClickButton;
    
    public SimpleGUI_1() {
        clickButton = new JButton("I'M Swing Button");
        notClickButton = new JButton("I'M not swing button");
        counterLabel = new JLabel("Number of button click");
        
        numberOfClicks = 0;
        this.setLayout(new FlowLayout());
        this.add(clickButton);
        this.add(counterLabel);
        this.add(notClickButton);
        this.setTitle("swing application");
        this.setSize(30, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        notClickButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                notClickButton();
            }            
        });
        clickButton.addActionListener(new ClickButtonHandler());
        
    }
    private class ClickButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            numberOfClicks++;
            counterLabel.setText("Number of button click "+numberOfClicks);
        }

       
    }
    public void notClickButton() {
        numberOfClicks--;
        counterLabel.setText("Number of Button Click " + numberOfClicks);
    }

    public int getNumberOfClicks() {
        return numberOfClicks;
    }

    public void setNumberOfClicks(int numberOfClicks) {
        this.numberOfClicks = numberOfClicks;
    }
   
    
}
