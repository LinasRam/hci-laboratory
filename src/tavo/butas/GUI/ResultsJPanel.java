/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tavo.butas.GUI;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.BoxLayout;

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
        
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
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
            
            ResultJPanel result = new ResultJPanel();
            result.setName(parts[0]);
            result.setDistrictText(parts[1]);
            result.setRoomsText(parts[2]);
            result.setPriceText(parts[3] + " EUR");
            
            this.add(result);
        }
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
