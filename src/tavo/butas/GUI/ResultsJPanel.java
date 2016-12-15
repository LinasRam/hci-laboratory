/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tavo.butas.GUI;

import java.awt.ComponentOrientation;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import sun.awt.VerticalBagLayout;
import tavo.butas.Advert;

/**
 *
 * @author Linas
 */
public class ResultsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ResultsJPanel
     */
    public ResultsJPanel() {
        initComponents();
        
        this.setLayout(new VerticalBagLayout());
        
        this.fillResults();
    }
    
    private void fillResults(){
        Scanner in = null;
        ArrayList<String> adverts = new ArrayList<>();

        try {
            in = new Scanner(new FileReader("adverts.txt"));
        } catch (FileNotFoundException ex) {

        }

        while (in.hasNextLine()) {
            String advert = in.nextLine();
            String[] parts = advert.split(";");
            
            Advert advertObject = new Advert(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5]);
            
            ResultJPanel result = new ResultJPanel(advertObject);
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(advertObject.getImageUrl()));
            result.getjLabelImage().setIcon(this.getScaledIcon(imageIcon));
            
            this.add(result);
        }
    }
    
    private ImageIcon getScaledIcon(ImageIcon imageIcon){
        Image image = imageIcon.getImage().getScaledInstance(166, 100, java.awt.Image.SCALE_SMOOTH);
        
        return new ImageIcon(image);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
