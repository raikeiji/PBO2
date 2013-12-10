
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu4.coba.jay;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class guiMasyarakat extends JDialog {

    Container ContentPane;

    public guiMasyarakat() {
        setTitle("Masyarakat");
        setSize(500, 300);
        setLocation(100, 100);
        ContentPane = getContentPane();
        ContentPane.setLayout(new GridLayout(2, 1));
        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(5, 4));
        JPanel jp2 = new JPanel();
        jp2.setLayout(new FlowLayout());
         Container contentPane = getContentPane();
        contentPane.setBackground(Color.ORANGE);
        ContentPane.add(jp1);
        ContentPane.add(jp2);


        JLabel lebel1 = new JLabel("Nomor");
        jp1.add(lebel1);
        JLabel titik1 = new JLabel(":");
        jp1.add(titik1);
        JTextField text1 = new JTextField(5);
        jp1.add(text1);


        JLabel lebel2 = new JLabel("Nama");
        jp1.add(lebel2);
        JLabel titik2 = new JLabel(":");
        jp1.add(titik2);
        JTextField text2 = new JTextField(5);
        jp1.add(text2);




        JLabel lebel3 = new JLabel("TTL");
        jp1.add(lebel3);
        JLabel titik3 = new JLabel(":");
        jp1.add(titik3);
        JTextField text3 = new JTextField(5);
        jp1.add(text3);

        JLabel lebel4 = new JLabel("Jumlah iuran");
        jp1.add(lebel4);
        JLabel titik4 = new JLabel(":");
        jp1.add(titik4);
        JTextField text4 = new JTextField(5);
        jp1.add(text4);

        JLabel lebel5 = new JLabel("UKM");
        jp1.add(lebel5);
        JLabel titik5 = new JLabel(":");
        jp1.add(titik5);
        JTextField text5 = new JTextField(5);
        jp1.add(text5);

        JButton sim = new JButton("simpan");
        jp2.add(sim);


    }
}
