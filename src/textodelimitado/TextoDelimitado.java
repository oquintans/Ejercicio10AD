/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textodelimitado;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oracle
 */
public class TextoDelimitado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("texto1.txt")));
            BufferedReader br = new BufferedReader(new FileReader("texto1.txt"));
            String linea;
            String[] cod = {"p1", "p2", "p3"};
            String[] descrip = {"parafusos", "cravos", "tachas"};
            int[] precio = {3, 4, 5};

            for (int i = 0; i < cod.length; i++) {
                pw.print(cod[i] + "\t");
                pw.print(descrip[i] + "\t");
                pw.println(precio[i]);
            }
            pw.close();

            while ((linea = br.readLine()) != null) {
                String[] leido = linea.split("\t");
                Product pr = new Product(leido[0], leido[1], Integer.parseInt(leido[2]));
                System.out.println(pr.toString());
            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(TextoDelimitado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
