/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10.percobaan;

import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author admin
 */
public class WriteDataDemo {

    public WriteDataDemo() {
    }

    public static void main(String[] args) throws Exception {
        // write the data out with FileOutputStream
        // buat file
        File outfile = new File("Latihan.txt");
        // buka stream
        FileOutputStream out = new FileOutputStream(outfile);
        // sediakan data string
        String testoutput = "This is an exercise to write data to a file with FileOutputStream";
        /* Cara 1 : tulis data ke stream
        for(int i=0;i<testOutput.length();i++){
        out.write((byte)testOutput.charAt(i));
        }                                            
        */
        /*Cara 2 : tulis data ke stream*/
        out.write(testoutput.getBytes());
        // tutup stream
        out.close();
    }
}
