/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8.TIA;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author TOSHIBA
 */
public class SquareJInternalFrame extends JInternalFrame{

    private JLabel lengthLabel, widthLabel;
    private JTextField lengthText;
    private JTextField widthText;
    private JLabel resultLabel;
    private JButton calculateButton;

    public SquareJInternalFrame() {
    
    
        
    JPanel pan1  = new JPanel();
    JPanel pan2 = new JPanel();
    pan1.setLayout(new GridLayout(1,1)); 
    pan2.setLayout(new GridLayout(3,2));
    pan2.add(pan1);
    
    //container
    Container con = this.getContentPane();
    con.setLayout(new GridLayout(2, 2));
    con.add(pan2);
    
    lengthLabel = new JLabel("Length");
    widthLabel = new JLabel("Width");
    resultLabel = new JLabel("Result", JLabel.CENTER);
    
    
    lengthText = new JTextField(12);
    widthText = new JTextField(12);
    
    
    calculateButton = new JButton("Calcute");
    
    pan1.add(lengthLabel);pan1.add(lengthText);
    pan1.add(widthLabel);pan1.add(widthText);
    pan2.add(resultLabel);pan2.add(calculateButton);
    
    
    this.setTitle("Square");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocation(40, 120);
    this.setSize(300,250);
    this.setVisible(true);
   
    
    calculateButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
           calculateAction();
            }

            
        } );
    
    
    }
    private void calculateAction() {
        Square data = new Square();
        data.setWidth(Double.parseDouble(widthText.getText()));
        data.setLength(Double.parseDouble(lengthText.getText()));
    String result ="Area :   "+data.getArea() + "   Circumference:   "+data.getCicumference();
    resultLabel.setText(result);
         
    }
}
