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
public class CircleJInternalFrame extends JInternalFrame {

    private JLabel radiusLabel;
    private JTextField radiusText;
    private JButton calculateButton;
    private JLabel resultLabel;

    /**
     * Creates a new instance of SimpleGUI
     */
    public CircleJInternalFrame() {

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        panel1.setLayout(new GridLayout(1, 1));
        panel2.setLayout(new GridLayout(3, 2));

        Container con = this.getContentPane();
        con.setLayout(new GridLayout(3, 1));
        con.add(panel1);
        con.add(panel2);
        con.add(panel3);

        radiusLabel = new JLabel("Radius");
        radiusText = new JTextField(10);

        calculateButton = new JButton("Calculate");
        resultLabel = new JLabel("Result", JLabel.CENTER);

        
        panel1.add(radiusLabel);
        panel1.add(radiusText);
        panel2.add(resultLabel);
        panel2.add(calculateButton);

        
        this.setTitle("Circle ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(40, 120);
        this.setSize(300, 250);
        this.setVisible(true);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAction();
            }
        });
    }

    public void calculateAction() {
        Circle data = new Circle();
        data.setRadius(Double.parseDouble(radiusText.getText()));
        resultLabel.setText("Radius: " + data.getRadius() + " Area: " + data.getArea());

    }
}
