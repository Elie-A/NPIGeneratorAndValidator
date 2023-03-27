/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npigeneratorandvalidator;

/**
 *
 * @author elie.abdallah
 */
public class NPIGeneratorAndValidator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.setTitle("NPI Generator & Validator");
        gui.setResizable(false);
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);
    }
    
}
