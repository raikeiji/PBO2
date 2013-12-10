/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu4.coba;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author admin
 */
public class UKMFrame extends JFrame{
    private JMenuBar bar;
    private JMenu editMenu;
    private JMenu helpmenu;
    private JMenuItem tambahMahasiswaItem;
    private JMenuItem tambahMasyarakatItem;
    private JMenuItem tambahUKMItem;

    public UKMFrame() {
        this.setSize(200, 200);
        
        bar=new JMenuBar();
        editMenu=new JMenu("Edit");
        helpmenu=new JMenu("Help");
        tambahMahasiswaItem=new JMenuItem("Tambah Mahasiswa");
        tambahMasyarakatItem=new JMenuItem("Tambah Masyarakat Sekitar");
        tambahUKMItem=new JMenuItem("Tambah UKM");
        
        editMenu.add(tambahMahasiswaItem);
        editMenu.add(tambahMasyarakatItem);
        editMenu.add(tambahUKMItem);
        bar.add(editMenu);
        bar.add(helpmenu);
        this.setJMenuBar(bar);
    }
}
