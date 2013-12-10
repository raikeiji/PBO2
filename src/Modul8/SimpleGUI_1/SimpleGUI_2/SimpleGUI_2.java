/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8.SimpleGUI_1.SimpleGUI_2;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class SimpleGUI_2 extends JFrame {

    private JLabel radiusLabel;
    private JTextField radiusTextField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public SimpleGUI_2() {
        radiusLabel = new JLabel("radius");
        radiusTextField = new JTextField(10);

        calculateButton = new JButton("calculate");
        resultLabel = new JLabel("Area = ");

        this.setLayout(new FlowLayout());
        this.add(radiusLabel);
        this.add(radiusTextField);
        this.add(calculateButton);
        this.add(resultLabel);

        this.setTitle("circle calculation");
        this.setSize(300, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        calculateButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAction();
            }
        });
    }

    public void calculateAction() {
        Circle data=new Circle();
        data.setRadius(Double.parseDouble(radiusTextField.getText()));
        resultLabel.setText("Area : "+data.getRadius());
    }
}
