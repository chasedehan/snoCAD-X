/*
 * Copyright 2007-2014 Daniel Graf (https://github.com/danielgraf)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * snoCADpreferences.java
 *
 * Created on 18 November 2007, 16:45
 */

package snocadx;

/**
 *
 * @author  dgraf
 */
public class snoCADpreferences extends javax.swing.JPanel {
    
    /** Creates new form snoCADpreferences */
    public snoCADpreferences() {
        initComponents();
        initSettings();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
        m_projectFolder = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        m_brandLogo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        m_snowboardButton = new javax.swing.JRadioButton();
        m_skiButton = new javax.swing.JRadioButton();
        m_nothingButton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        m_projectFolder.setEditable(false);
        m_projectFolder.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnEditProjectFolder(evt);
            }
        });

        jLabel1.setText("snoCAD Project Folder");

        jButton4.setText("Edit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnEditBrandLogo(evt);
            }
        });

        m_brandLogo.setEditable(false);
        m_brandLogo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        jLabel2.setText("Brand Logo Image");

        m_snowboardButton.setSelected(true);
        m_snowboardButton.setText("Snowboard");
        m_snowboardButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        m_snowboardButton.setMargin(new java.awt.Insets(0, 0, 0, 0));

        m_skiButton.setText("Ski");
        m_skiButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        m_skiButton.setMargin(new java.awt.Insets(0, 0, 0, 0));

        m_nothingButton.setText("Nothing");
        m_nothingButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        m_nothingButton.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel3.setText("Default Product :");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, m_nothingButton)
                            .add(layout.createSequentialGroup()
                                .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(m_projectFolder, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 225, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(jLabel2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 29, Short.MAX_VALUE)
                                .add(m_brandLogo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 225, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jButton3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .add(jButton4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)))
                    .add(m_snowboardButton)
                    .add(m_skiButton)
                    .add(jLabel3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(19, 19, 19)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(m_projectFolder, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1)
                    .add(jButton3))
                .add(21, 21, 21)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(m_brandLogo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2)
                    .add(jButton4))
                .add(12, 12, 12)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(m_snowboardButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(m_skiButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(m_nothingButton)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void OnEditBrandLogo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnEditBrandLogo

        final javax.swing.JFileChooser fc = new javax.swing.JFileChooser();
        fc.setFileFilter(new snoCADfileFilters().getGraphicsFilter());
        fc.setDialogTitle("Select Brand Logo");
        int returnVal = fc.showOpenDialog(this);
        
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) 
        {
            java.io.File importFile = fc.getSelectedFile();
            
            if (importFile != null)
            {
                m_brandLogo.setText(importFile.getAbsolutePath());
            }
            
        }
    }//GEN-LAST:event_OnEditBrandLogo

    private void OnEditProjectFolder(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnEditProjectFolder

        final javax.swing.JFileChooser fc = new javax.swing.JFileChooser();
        fc.setFileFilter(new snoCADfileFilters().getFolderFilter());
        fc.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        fc.setDialogTitle("Select Default Project Folder");
        int returnVal = fc.showOpenDialog(this);
        
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) 
        {
            java.io.File importFile = fc.getSelectedFile();
            
            if (importFile != null)
            {
                m_projectFolder.setText(importFile.getAbsolutePath());
            }
            
        }
    }//GEN-LAST:event_OnEditProjectFolder
 
 public String getProjectFolder() 
 { 
     return m_projectFolder.getText(); 
 }
 
 public String getBrandLogo()
 {
     return m_brandLogo.getText();
 }
 
 public int getDefaultProduct()
 {
     if (m_snowboardButton.isSelected()) return 0;
     if (m_skiButton.isSelected()) return 1;
     if (m_nothingButton.isSelected()) return 99;
     
     return 0;
     
 }
 
 private void initSettings()
 {
     m_projectFolder.setText(Main.getProjectFolder());
     m_brandLogo.setText(Main.getBrandLogo());
     
     switch (Main.getDefaultProduct())
     {
         case 0 : // Snowboard
             m_snowboardButton.setSelected(true);
             m_nothingButton.setSelected(false);
             m_skiButton.setSelected(false);
             break;
         case 1 : // Ski
             m_snowboardButton.setSelected(false);
             m_nothingButton.setSelected(false);
             m_skiButton.setSelected(true);
             break;
         default :
             m_snowboardButton.setSelected(false);
             m_nothingButton.setSelected(true);
             m_skiButton.setSelected(false);
             break;
             
     }
     
     buttonGroup1.add(m_snowboardButton);
     buttonGroup1.add(m_nothingButton);
     buttonGroup1.add(m_skiButton);
     
 }
    
  
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField m_brandLogo;
    private javax.swing.JRadioButton m_nothingButton;
    private javax.swing.JTextField m_projectFolder;
    private javax.swing.JRadioButton m_skiButton;
    private javax.swing.JRadioButton m_snowboardButton;
    // End of variables declaration//GEN-END:variables
    
}