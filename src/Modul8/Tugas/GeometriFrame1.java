/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8.Tugas;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

/**
 *
 * @author admin
 */
public class GeometriFrame1 extends JFrame {

    private JMenuBar menuBar;
    private JMenu geometryMenu;
    private JMenu helpMenu;
    private JMenuItem squaremenuitem, circlemenuitem, exitmenuitem;
    private SquareJInternalFrame squareframe;
    private CircleJInternalFrame circleframe;
    //private JDesktopPane jdesk;
    private JInternalFrame f;
    JDesktopPane jdpDesktop;
    static int openFrameCount = 0;

    public GeometriFrame1() {
        JFrame frame = new JFrame("Geometri Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(400,200);
        jdpDesktop = new JDesktopPane() {

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(600, 600);
            }
        };
        //createFrame();
        createMenuBar();
        //frame.setLocationRelativeTo(null);
        frame.setContentPane(jdpDesktop);
        frame.setJMenuBar(createMenuBar());
        jdpDesktop.putClientProperty("Jedsktopdraf.mode", "Outline");
        frame.pack();
        frame.setVisible(true);
    }

    private JMenuBar createMenuBar() {
        menuBar = new JMenuBar();
        geometryMenu = new JMenu("Geometri");
        geometryMenu.setMnemonic(KeyEvent.VK_G);
        helpMenu = new JMenu("Help");
        helpMenu.setMnemonic(KeyEvent.VK_H);
        squaremenuitem = new JMenuItem("Square");
        squaremenuitem.setMnemonic(KeyEvent.VK_S);
        squaremenuitem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SquareJInternalFrame s = new SquareJInternalFrame();
                s.setVisible(true);
                jdpDesktop.add(s);
                try {
                    s.setSelected(true);
                } catch (java.beans.PropertyVetoException ae) {
                }
            }
        });
        circlemenuitem = new JMenuItem("circle");
        circlemenuitem.setMnemonic(KeyEvent.VK_C);
        circlemenuitem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                CircleJInternalFrame c = new CircleJInternalFrame();
                c.setVisible(true);
                jdpDesktop.add(c);
                try {
                    c.setSelected(true);

                } catch (java.beans.PropertyVetoException ae) {
                }
            }
        });
        exitmenuitem = new JMenuItem("exit");
        exitmenuitem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        geometryMenu.add(squaremenuitem);
        geometryMenu.add(circlemenuitem);
        geometryMenu.add(exitmenuitem);
        menuBar.add(geometryMenu);
        menuBar.add(helpMenu);
        //setJMenuBar(menuBar);
        return menuBar;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
//                GeometriFrame1 g=new GeometriFrame1();
//                g.setVisible(true);
                new GeometriFrame1();
            }
        });
    }
}
