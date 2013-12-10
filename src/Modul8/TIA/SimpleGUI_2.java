/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8.TIA;

//import Geometri.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author TOSHIBA
 */
public class SimpleGUI_2 extends JFrame{
    private JLabel radiusLabel;
    private JTextField radiusTextField;
    private JButton calculateButton;
    private JLabel resultLabel;
    
    /** Creates a new instance of SimpleGUI */
    public SimpleGUI_2() {
        radiusLabel=new JLabel("Radius");
        radiusTextField=new JTextField(10);
        
        calculateButton = new JButton("Calculate");
        resultLabel = new JLabel("Area = ");
        
        this.setLayout(new FlowLayout());
        this.add(radiusLabel);
        this.add(radiusTextField);
        this.add(calculateButton);
        this.add(resultLabel);
        
        this.setTitle("Circle Calculation");
        this.setSize(300,200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        calculateButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAction();
            }
        });
    } 
    public void calculateAction(){
        Circle data = new Circle();
        data.setRadius(Double.parseDouble(radiusTextField.getText()));
        resultLabel.setText("Area: "+data.getArea());
    }
     
}

