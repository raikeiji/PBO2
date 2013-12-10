/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9;

import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class TestMessage {

    public static void main(String[] args) {
        boolean validTo = true;
        Message mess = new Message();
        while (validTo) {
            try {
                mess.setTo(JOptionPane.showInputDialog("Masukkan alamat email tujuan :"));
                mess.setSubject(JOptionPane.showInputDialog("Masukkan subyek email (<11 kata): "));
                mess.setMessage(JOptionPane.showInputDialog("Masukkan pesan email (<50 kata) : "));
                JOptionPane.showMessageDialog(null, mess.getresume());
                validTo = false;
            }
            catch(Exception ae){
                JOptionPane.showMessageDialog(null, ae.getMessage());
            }
        }
    }
}
