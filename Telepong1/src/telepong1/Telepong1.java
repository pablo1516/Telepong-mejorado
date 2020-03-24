/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telepong1;

import java.awt.Color;

/**
 *
 * @author david
 */
public class Telepong1 {
    int jugar=1;
    int salir1=2;
          
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrmMenu frmpongm = new FrmMenu();     
        
        frmpongm.setVisible(true);
        frmpongm.setLocationRelativeTo(null);
        frmpongm.setSize(400, 400);
        frmpongm.setResizable(false);
        frmpongm.setTitle("Telepong");

    }
    
}
