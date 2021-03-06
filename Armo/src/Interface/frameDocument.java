package Interface;

import javax.swing.JOptionPane;
import logic.Document;
import Persistence.MSAccessA;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Yesica Daniela Vargas Espitia
 * @author Andres Mauricio Perez Escobar
 */
public class frameDocument extends javax.swing.JFrame {
     private MSAccessA dataFile;

    public frameDocument() {
        initComponents();
    
        this.setDataFile(new MSAccessA());
        this.selectDocument();
    }

    public MSAccessA getDataFile() {
        return dataFile;
    }

    public void setDataFile(MSAccessA dataFile) {
        this.dataFile = dataFile;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labDocument = new javax.swing.JLabel();
        labIdDocument = new javax.swing.JLabel();
        labIdSupply = new javax.swing.JLabel();
        textIdDocument = new javax.swing.JTextField();
        textIdSupply = new javax.swing.JTextField();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext1 = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        butPath = new javax.swing.JButton();
        labPath = new javax.swing.JLabel();
        butView = new javax.swing.JButton();

        labDocument.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        labDocument.setText("Document");

        labIdDocument.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        labIdDocument.setText("Id Document");

        labIdSupply.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        labIdSupply.setText("Id Supply");

        textIdSupply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdSupplyActionPerformed(evt);
            }
        });

        btnFirst.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPrevious.setText("<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNext1.setText(">");
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnNew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearch.setText("Search ...");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        butPath.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        butPath.setText("Path");
        butPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPathActionPerformed(evt);
            }
        });

        butView.setFont(new java.awt.Font("Kristen ITC", 0, 12)); // NOI18N
        butView.setText("View");
        butView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSearch)
                        .addGap(10, 10, 10)
                        .addComponent(btnNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(labIdSupply))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labPath, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labIdDocument))))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labDocument)
                                    .addComponent(textIdDocument, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(textIdSupply)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btnFirst)
                                .addGap(16, 16, 16)
                                .addComponent(btnPrevious)
                                .addGap(18, 18, 18)
                                .addComponent(btnNext1)
                                .addGap(18, 18, 18)
                                .addComponent(btnLast)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butPath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butView)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labDocument)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labIdDocument)
                    .addComponent(textIdDocument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labIdSupply)
                    .addComponent(textIdSupply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labPath, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butPath)
                    .addComponent(butView))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext1)
                    .addComponent(btnLast)
                    .addComponent(btnFirst)
                    .addComponent(btnPrevious))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnDelete)
                    .addComponent(btnNew)
                    .addComponent(btnUpdate))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
       try {
            this.getDataFile().getResultSet().first();
            this.updateView();
        } catch (SQLException ex) {
            Logger.getLogger(frameDocument.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        
         try {
            if (!this.getDataFile().getResultSet().isFirst()) {
                this.getDataFile().getResultSet().previous();
                this.updateView();
            }
        } catch (SQLException ex) {
            Logger.getLogger(frameDocument.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
       try {
            if (!this.getDataFile().getResultSet().isLast()) {
                this.getDataFile().getResultSet().next();
                this.updateView();
            }
        } catch (SQLException ex) {
            Logger.getLogger(frameDocument.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }//GEN-LAST:event_btnNext1ActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
         try {
            this.getDataFile().getResultSet().last();
            this.updateView();
        } catch (SQLException ex) {
            Logger.getLogger(frameDocument.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         if (JOptionPane.showConfirmDialog(this, 
                "Are you sure to delete this record?", "Delete record", 
                JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {

            this.deleteDocument();
            JOptionPane.showMessageDialog(this, "Deleted record!", "Delete record",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         this.updateDocument();
        JOptionPane.showMessageDialog(this, "Updated record!", "Update record",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
           if (btnNew.getText().equals("New")) {
            this.newView();
        }
        else if (btnNew.getText().equals("Save")) {
            if (validateView()) {
                this.insertDocument();

                btnNew.setText("New");
                btnFirst.setEnabled(true);
                btnPrevious.setEnabled(true);
                btnNext1.setEnabled(true);
                btnLast.setEnabled(true);
                btnSearch.setEnabled(true);
                btnUpdate.setEnabled(true);
                btnDelete.setEnabled(true);
            }
            else {
                JOptionPane.showMessageDialog(this, "Please, fill the requeried fields", 
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       long id = Long.parseLong(JOptionPane.showInputDialog("Please, write the Document id", "Document id"));
        if (id > 0){
             this.searchDocument(id);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void textIdSupplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdSupplyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdSupplyActionPerformed

    private void butPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPathActionPerformed
        JFileChooser fc = new JFileChooser();
        int select = fc.showOpenDialog(this);
        if (select == JFileChooser.APPROVE_OPTION) {
            try {
                File docFile = fc.getSelectedFile();
                labPath.setText(docFile.getCanonicalPath());
            } catch (IOException ex) {
                Logger.getLogger(frameDocument.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_butPathActionPerformed

    private void butViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butViewActionPerformed
        if (Desktop.isDesktopSupported() && !labPath.getText().equals("")) {
        try {
            File myFile = new File(labPath.getText());
            Desktop.getDesktop().open(myFile);
        } catch (IOException ex) {
            // no application registered for PDFs
        }
}
    }//GEN-LAST:event_butViewActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frameDocument.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameDocument.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameDocument.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameDocument.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameDocument().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext1;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton butPath;
    private javax.swing.JButton butView;
    private javax.swing.JLabel labDocument;
    private javax.swing.JLabel labIdDocument;
    private javax.swing.JLabel labIdSupply;
    private javax.swing.JLabel labPath;
    private javax.swing.JTextField textIdDocument;
    private javax.swing.JTextField textIdSupply;
    // End of variables declaration//GEN-END:variables

     private boolean validateView() {
        boolean validate = !(textIdDocument.getText().equals("") 
                || textIdSupply.getText().equals("")
                || labPath.getText().equals(""));         
        return validate;
    }
     
     
      /**
     * Obtain the view data and tranfer it to the object
     */
    private Document view2Object() {
        Document document = new Document();

        document.setidDocumentr(Integer.parseInt(textIdDocument.getText()));
        document.setIdSupply(Integer.parseInt(textIdSupply.getText()));
        document.setPath(labPath.getText());
        
              
        return document;
    }
    
    /**
     * You obtain data from an object and pass it to the view
     */
    private void updateView() {
        if (this.getDataFile().getResultSet() == null) {
            this.newView();
        }
        else {
            this.object2View();
        }
    }

    /**
     * You prepare the view to enter a new employee data
     */
    private void newView() {
        
        textIdDocument.setText("");
        textIdSupply.setText("");
        labPath.setText("");
        
        btnNew.setText("save");
        btnFirst.setEnabled(false);
        btnPrevious.setEnabled(false);
        btnNext1.setEnabled(false);
        btnLast.setEnabled(false);
        btnSearch.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
    }

    /**
     * Result set -> object
     */
    private void object2View() {
        Document document = new Document();
        try {
             document.setidDocumentr(this.getDataFile().getResultSet().getInt("idDocument"));
             document.setIdSupply(this.getDataFile().getResultSet().getInt("idSupply"));
             document.setPath(this.getDataFile().getResultSet().getString("path"));
             
            this.object2View(document);
        } catch (SQLException ex) {
            Logger.getLogger(frameUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     /**
     * Show the object data into view
     * @param employee Employee to show
     */
    private void object2View(Document document) {
        
        textIdDocument.setText(""+ document.getIdDocument());
        textIdSupply.setText(""+ document.getIdSupply());
         labPath.setText(document.getPath());
    }
    
    /**
     * Select employees from DB
     */
    private void selectDocument() {
        String query = "SELECT * FROM Document";
        if (this.getDataFile().execute(query)) {
            try {
                this.getDataFile().getResultSet().next();
                this.updateView();
            } catch (SQLException ex) {
                Logger.getLogger(frameUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
   /**
     * Insert new employee
     */
    private void insertDocument() {
        Document document = this.view2Object();
       

        String query = "INSERT INTO Document "
                + "(idDocument, idSupply, path) "
                + "VALUES ("
                + document.getIdDocument()+ ", '"
                + document.getIdSupply() + ", '"
                + document.getPath() + ")";
        if (this.getDataFile().execute(query)) {
            this.selectDocument();
            this.searchDocument(document.getIdDocument());
        }
    }

    /**
     * Update employee
     */
    private void updateDocument() {
        Document document = this.view2Object();

        String query = "UPDATE Document SET "
                + "idDocument = '" + document.getIdDocument() + "', "
                + "idSupply = '" + document.getIdSupply() + "', "
                + "path = '" + document.getPath();
                
        if (this.getDataFile().execute(query)) {
            this.selectDocument();
            this.searchDocument(document.getIdDocument());
        }
    }

    /**
     * Delete employee
     */
    private void deleteDocument() {
        Document document = this.view2Object();
        String query = "DELETE * FROM Document WHERE id = " + document.getIdDocument();
        if (this.getDataFile().execute(query)) {
            this.selectDocument();
        }        
    }

    /**
     * Search employee by id
     * @param id Employee id
     */
    private void searchDocument(long id) {
        boolean find = false;
        try {
            if (this.getDataFile().getResultSet() != null) {
                Long lastId = this.getDataFile().getResultSet().getLong("id");
                this.getDataFile().getResultSet().beforeFirst();
                while (this.getDataFile().getResultSet().next()) {
                    if (this.getDataFile().getResultSet().getLong("id") == id) {
                        find = true;
                        break;
                    }
                }
                if (find) {
                    this.updateView();
                }
                else {
                    this.getDataFile().getResultSet().first();
                    this.searchDocument(lastId);
                    JOptionPane.showMessageDialog(this, "Document " + id + " was not found!");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(frameDocument.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
