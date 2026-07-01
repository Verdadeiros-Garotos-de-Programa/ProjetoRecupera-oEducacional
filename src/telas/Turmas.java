
package telas;


public class Turmas extends javax.swing.JFrame {

    public Turmas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCriarTurma = new javax.swing.JButton();
        btnAtualizarTurma = new javax.swing.JButton();
        btnDeletarTurma = new javax.swing.JButton();
        btnVoltarTurma = new javax.swing.JButton();
        btnRelatorioTurmas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Turmas");

        btnCriarTurma.setText("Criar Turma");
        btnCriarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarTurmaActionPerformed(evt);
            }
        });

        btnAtualizarTurma.setText("Atualizar Turma");
        btnAtualizarTurma.setToolTipText("");
        btnAtualizarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarTurmaActionPerformed(evt);
            }
        });

        btnDeletarTurma.setText("Deletar Turma");
        btnDeletarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarTurmaActionPerformed(evt);
            }
        });

        btnVoltarTurma.setText("Voltar");
        btnVoltarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarTurmaActionPerformed(evt);
            }
        });

        btnRelatorioTurmas.setText("Relatório");
        btnRelatorioTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioTurmasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(btnVoltarTurma))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnCriarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRelatorioTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAtualizarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnDeletarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCriarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRelatorioTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnVoltarTurma)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarTurmaActionPerformed
        Criar_Turma telas = new Criar_Turma();
        telas.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnCriarTurmaActionPerformed

    private void btnAtualizarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarTurmaActionPerformed
        Atualizar_Turma telas = new Atualizar_Turma();
        telas.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnAtualizarTurmaActionPerformed

    private void btnDeletarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarTurmaActionPerformed
        Deletar_Turma telas = new Deletar_Turma();
        telas.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnDeletarTurmaActionPerformed

    private void btnVoltarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarTurmaActionPerformed

        Menu_Principal telas = new Menu_Principal();
        telas.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_btnVoltarTurmaActionPerformed

    private void btnRelatorioTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioTurmasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRelatorioTurmasActionPerformed

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
            java.util.logging.Logger.getLogger(Turmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Turmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Turmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Turmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Turmas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarTurma;
    private javax.swing.JButton btnCriarTurma;
    private javax.swing.JButton btnDeletarTurma;
    private javax.swing.JButton btnRelatorioTurmas;
    private javax.swing.JButton btnVoltarTurma;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
