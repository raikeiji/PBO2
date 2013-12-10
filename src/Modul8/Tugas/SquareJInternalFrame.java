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
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class SquareJInternalFrame extends JInternalFrame{
    private JLabel lengthlabel;
    private JTextField lengthtext;
    private JLabel widthlabel;
    private JTextField widthtext;
    private JLabel resultlabel;
    private JButton calculatebutton;
    static final int xPosition=30, yPosition=30;
    
    public SquareJInternalFrame() {
        //this.setTitle("Square");
        //JPanel panel1=new JPanel();
        
        super("SquareJinternalFrame"+(++GeometriFrame1.openFrameCount), true, true, true, true);
        this.setSize(400,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(xPosition*GeometriFrame1.openFrameCount, yPosition*GeometriFrame1.openFrameCount);
        this.setVisible(true);
        
        lengthlabel=new JLabel("Length");
        lengthtext=new JTextField();
        widthlabel=new JLabel("width");
        widthtext=new JTextField();
        resultlabel=new JLabel();
        calculatebutton=new JButton("calculate");
        calculatebutton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                calculateaction();
            }
        });
        this.add(lengthlabel);
        this.add(lengthtext);
        this.add(widthlabel);
        this.add(widthtext);
        this.add(resultlabel);
        this.add(calculatebutton);
    }
    public void calculateaction(){
        Square data=new Square();
        data.setWidth(Double.parseDouble(widthtext.getText()));
        data.setLength(Double.parseDouble(lengthtext.getText()));
        String result="Luas : "+data.getArea()+"Keliling : "+data.getCircumtance();
        resultlabel.setText(result);
    }
}
