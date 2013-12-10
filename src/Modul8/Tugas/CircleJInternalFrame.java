/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8.Tugas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class CircleJInternalFrame extends JInternalFrame{
    private JLabel radiusLabel;
    private JTextField radiustext;
    private JLabel resultlabel;
    private JButton calculatebutton;
    static final int xPosition=30, yPosition=30;
    
    public CircleJInternalFrame() {
       
        super("Circle JInternalFrame", true,true, true, true);
        this.setSize(200,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(xPosition*GeometriFrame1.openFrameCount, yPosition*GeometriFrame1.openFrameCount);
        radiusLabel=new JLabel("radius");
        radiustext=new JTextField();
        resultlabel=new JLabel();
        calculatebutton=new JButton("calculate");
        calculatebutton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                calculateaction();
            }
        });
        setLocation(xPosition*GeometriFrame1.openFrameCount,yPosition*GeometriFrame1.openFrameCount);
        this.add(radiusLabel);
        this.add(radiustext);
        this.add(resultlabel);
        this.add(calculatebutton);
    }
    public void calculateaction(){
        Circle data=new Circle();
        data.setradius(Double.parseDouble(radiustext.getText()));
        String result="Luas : "+data.getArea()+"Keliling : "+data.getCircumference();
        resultlabel.setText(result);
    }
}
