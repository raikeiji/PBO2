/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8.TIA;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class GeometriJFrame extends JFrame implements ActionListener {

    private JDesktopPane jDesktopPane1;
    private JPanel contentPane;
    private JMenuItem squareMenuItem;
    private JMenuItem circleMenuItem;
    private JMenuItem exitMenuItem;
    private JMenuBar menuBar;

//    JFrame frame = new JFrame("Geometry Application");
    public GeometriJFrame() {

        setTitle("GEOMETRI FRAME");
        setLocation(100, 100);
        setSize(600, 600);
        setResizable(true);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
 
        //MENUBAR
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        //MENU
        JMenu geometryMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(geometryMenu);
        menuBar.add(helpMenu);

        //MENUITEM
        squareMenuItem = new JMenuItem("Square");
        geometryMenu.add(squareMenuItem);
        circleMenuItem = new JMenuItem("Circle");
        geometryMenu.add(circleMenuItem);
        exitMenuItem = new JMenuItem("Exit");
        geometryMenu.add(exitMenuItem);

       
        //frame
        jDesktopPane1 = new JDesktopPane();
        contentPane.add(jDesktopPane1);
        setContentPane(contentPane);
        setVisible(true);

        squareMenuItem.addActionListener(this);
        circleMenuItem.addActionListener(this);
        exitMenuItem.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == squareMenuItem) {
            squareAction();
        } else if (e.getSource() == circleMenuItem) {
            circleAction();
        } else {
            exitAction();
        }

    }

    private void squareAction() {
        SquareJInternalFrame squareFrame = new SquareJInternalFrame();
        jDesktopPane1.add(squareFrame);
        jDesktopPane1.setVisible(true);
    }

    public void circleAction() {
        CircleJInternalFrame circleFrame = new CircleJInternalFrame();
        jDesktopPane1.add(circleFrame);
        jDesktopPane1.setVisible(true);

    }

    public void exitAction() {
        System.exit(0);
    }
}
