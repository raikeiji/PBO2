/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu4.coba.jay;

/**
 *
 * @author hp
 */
public class GuiMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      JFrane menu = new JFrane();
        menu.setVisible(true);
        
        guiMahasiswa men = new guiMahasiswa();
        men.setVisible(true);
        
        
        
        guiUkm m = new guiUkm();
        m.setVisible(true);
        
         guiMasyarakat me = new guiMasyarakat();
        me.setVisible(true);
    }
}
