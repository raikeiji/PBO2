/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu4.coba.jay;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author hp
 */
public class JFrane extends JFrame{
    
    private static final int lebar = 1000;
    private static final int tinggi = 500;
    private static final int kordinatX = 150;
    private static final int kordinatY = 250;

    public JFrane() {
        setTitle("GUI");
        setSize(lebar, tinggi);
        setResizable(false);
        setLocation(kordinatX, kordinatY);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
         Container contentPane = getContentPane();
        contentPane.setBackground(Color.PINK);
        
       //Container contentPane = getContentPane();
       JMenuBar menuBar=new JMenuBar();
       JMenu fileMenu= new JMenu("edit");
       JMenuItem item1 = new   JMenuItem("Mahasiswa");
       JMenuItem item2 = new   JMenuItem("Masyarakat Sekitar");
       JMenuItem item3 = new   JMenuItem("UKM");
       JMenu Menu= new JMenu("Help");  
       
       menuBar.add(fileMenu);
       fileMenu.add(item1);
       fileMenu.add(item2);
       fileMenu.add(item3);
      this.setJMenuBar(menuBar);
       menuBar.add(Menu);
      //this.setJMenuBar(menuBar)       
       
    }
    
    
}
