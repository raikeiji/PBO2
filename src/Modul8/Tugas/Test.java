/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8.Tugas;

import javax.swing.SwingUtilities;

/**
 *
 * @author admin
 */
public class Test {
//    public static void main(String[] args) {
//        GeometriFrame1 g=new GeometriFrame1();
//        g.setVisible(true);
//    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                GeometriFrame1 g=new GeometriFrame1();
                g.setVisible(true);
            }
        });
    }
}
