package HydrateApp;


public class DietTrackerGUI extends javax.swing.JFrame {

    
  public DietTrackerGUI() {
         initComponents();
      
}

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLBL = new javax.swing.JLabel();
        fatsFieldTF = new javax.swing.JTextField();
        hydrationGoalLabelLBL = new javax.swing.JLabel();
        waterIntakeFieldTF = new javax.swing.JTextField();
        hydrationGoalFieldTF = new javax.swing.JTextField();
        DisplayBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTA = new javax.swing.JTextArea();
        addBTN = new javax.swing.JButton();
        loadBTN = new javax.swing.JButton();
        FoodLBL = new javax.swing.JLabel();
        FoodDietRB = new javax.swing.JRadioButton();
        proteinLabelLBL = new javax.swing.JLabel();
        HydrationRB = new javax.swing.JRadioButton();
        foodNameFieldTF = new javax.swing.JTextField();
        carbohydratesLabelLBL = new javax.swing.JLabel();
        proteinFieldTF = new javax.swing.JTextField();
        fatsLabelLBL = new javax.swing.JLabel();
        carbohydratesFieldTF = new javax.swing.JTextField();
        waterIntakeLabelLBL = new javax.swing.JLabel();
        saveBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLBL.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        titleLBL.setText("DietTrackerApp");

        fatsFieldTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatsFieldTFActionPerformed(evt);
            }
        });

        hydrationGoalLabelLBL.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        hydrationGoalLabelLBL.setText("Hydration Goal");

        DisplayBTN.setText("Display");
        DisplayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayBTNActionPerformed(evt);
            }
        });

        displayTA.setColumns(20);
        displayTA.setRows(5);
        jScrollPane1.setViewportView(displayTA);

        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        loadBTN.setText("load from file");
        loadBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBTNActionPerformed(evt);
            }
        });

        FoodLBL.setBackground(new java.awt.Color(255, 102, 102));
        FoodLBL.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        FoodLBL.setText("FoodName");
        FoodLBL.setMaximumSize(new java.awt.Dimension(38, 16));
        FoodLBL.setMinimumSize(new java.awt.Dimension(38, 16));

        FoodDietRB.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        FoodDietRB.setText("FoodDiet");
        FoodDietRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodDietRBActionPerformed(evt);
            }
        });

        proteinLabelLBL.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        proteinLabelLBL.setText("Protein (g)");

        HydrationRB.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        HydrationRB.setText("Hydration");
        HydrationRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HydrationRBActionPerformed(evt);
            }
        });

        foodNameFieldTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodNameFieldTFActionPerformed(evt);
            }
        });

        carbohydratesLabelLBL.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        carbohydratesLabelLBL.setText("Carbohydrates (g)");

        proteinFieldTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proteinFieldTFActionPerformed(evt);
            }
        });

        fatsLabelLBL.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        fatsLabelLBL.setText("Fats (g)");

        carbohydratesFieldTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carbohydratesFieldTFActionPerformed(evt);
            }
        });

        waterIntakeLabelLBL.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        waterIntakeLabelLBL.setText("Water Intake ");

        saveBTN.setText("Save");
        saveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTNActionPerformed(evt);
            }
        });

        exitBTN.setText("exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(FoodLBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(foodNameFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(proteinLabelLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(fatsLabelLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fatsFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(proteinFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(saveBTN)
                                                .addGap(51, 51, 51)
                                                .addComponent(loadBTN))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(DisplayBTN)
                                                .addGap(59, 59, 59)
                                                .addComponent(addBTN))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(waterIntakeLabelLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(waterIntakeFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(hydrationGoalLabelLBL)
                                        .addGap(18, 18, 18)
                                        .addComponent(hydrationGoalFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(carbohydratesLabelLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carbohydratesFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(234, 234, 234)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FoodDietRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(HydrationRB, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(titleLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titleLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FoodLBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foodNameFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(carbohydratesLabelLBL)
                            .addComponent(carbohydratesFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(proteinLabelLBL)
                            .addComponent(proteinFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fatsLabelLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fatsFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(waterIntakeLabelLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(waterIntakeFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hydrationGoalLabelLBL)
                            .addComponent(hydrationGoalFieldTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DisplayBTN)
                            .addComponent(addBTN))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(saveBTN))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(loadBTN)))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FoodDietRB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HydrationRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(382, 382, 382)
                        .addComponent(exitBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitBTNActionPerformed

    private void fatsFieldTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatsFieldTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fatsFieldTFActionPerformed

    private void DisplayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayBTNActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_DisplayBTNActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_addBTNActionPerformed

    private void loadBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBTNActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_loadBTNActionPerformed

    private void FoodDietRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodDietRBActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_FoodDietRBActionPerformed

    private void HydrationRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HydrationRBActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_HydrationRBActionPerformed

    private void foodNameFieldTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodNameFieldTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodNameFieldTFActionPerformed

    private void proteinFieldTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proteinFieldTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proteinFieldTFActionPerformed

    private void carbohydratesFieldTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carbohydratesFieldTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carbohydratesFieldTFActionPerformed

    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_saveBTNActionPerformed

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
            java.util.logging.Logger.getLogger(DietTrackerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DietTrackerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DietTrackerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DietTrackerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DietTrackerGUI().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DisplayBTN;
    private javax.swing.JRadioButton FoodDietRB;
    private javax.swing.JLabel FoodLBL;
    private javax.swing.JRadioButton HydrationRB;
    private javax.swing.JButton addBTN;
    private javax.swing.JTextField carbohydratesFieldTF;
    private javax.swing.JLabel carbohydratesLabelLBL;
    private javax.swing.JTextArea displayTA;
    private javax.swing.JButton exitBTN;
    private javax.swing.JTextField fatsFieldTF;
    private javax.swing.JLabel fatsLabelLBL;
    private javax.swing.JTextField foodNameFieldTF;
    private javax.swing.JTextField hydrationGoalFieldTF;
    private javax.swing.JLabel hydrationGoalLabelLBL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadBTN;
    private javax.swing.JTextField proteinFieldTF;
    private javax.swing.JLabel proteinLabelLBL;
    private javax.swing.JButton saveBTN;
    private javax.swing.JLabel titleLBL;
    private javax.swing.JTextField waterIntakeFieldTF;
    private javax.swing.JLabel waterIntakeLabelLBL;
    // End of variables declaration//GEN-END:variables



}

