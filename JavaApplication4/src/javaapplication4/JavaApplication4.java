/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import javax.swing.JOptionPane;

/**
 *
 * @author Keng
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            int x = Integer.parseInt(JOptionPane.showInputDialog("ad"));
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null, "no se puede convertir en un numero");
           JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
