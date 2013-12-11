/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uts2_125314112;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JDialog;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.text.Document;

/**
 *
 * @author made
 */
public class OpenGUI extends JDialog{
    private JTextArea area;

    public OpenGUI() {
        setTitle("isi file komputer.txt");
        setSize(400,200);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        
        area=new JTextArea((Document) new Dimension(20,20));
        
        this.add(area);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                OpenGUI o=new OpenGUI(); o.setVisible(true);
            }
        });
    }
}
