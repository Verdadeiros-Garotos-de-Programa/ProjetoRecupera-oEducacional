
package telas;


public class Alunos extends javax.swing.JFrame {

    public Alunos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtualizarAluno1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCriarAluno = new javax.swing.JButton();
        btnAtualizarAluno = new javax.swing.JButton();
        btnDeletarAluno = new javax.swing.JButton();
        btnVoltarAlujno = new javax.swing.JButton();
        btnRelatorioAlunos = new javax.swing.JButton();

        btnAtualizarAluno1.setText("Atualizar Aluno");
        btnAtualizarAluno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarAluno1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Alunos");

        btnCriarAluno.setText("Criar Aluno");
        btnCriarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarAlunoActionPerformed(evt);
            }
        });

        btnAtualizarAluno.setText("Atualizar Aluno");
        btnAtualizarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarAlunoActionPerformed(evt);
            }
        });

        btnDeletarAluno.setText("Deletar Aluno");
        btnDeletarAluno.setToolTipText("");
        btnDeletarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarAlunoActionPerformed(evt);
            }
        });

        btnVoltarAlujno.setText("Voltar");
        btnVoltarAlujno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarAlujnoActionPerformed(evt);
            }
        });

        btnRelatorioAlunos.setText("Relatório");
        btnRelatorioAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioAlunosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVoltarAlujno)
                        .addGap(234, 234, 234))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(229, 229, 229))))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnCriarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRelatorioAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAtualizarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeletarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCriarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRelatorioAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnVoltarAlujno)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarAlunoActionPerformed
        Criar_Aluno telas = new Criar_Aluno();
        telas.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnCriarAlunoActionPerformed

    private void btnAtualizarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarAlunoActionPerformed
        Atualizar_Aluno telas = new Atualizar_Aluno();
        telas.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnAtualizarAlunoActionPerformed

    private void btnDeletarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarAlunoActionPerformed
        Deletar_Aluno telas = new Deletar_Aluno();
        telas.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_btnDeletarAlunoActionPerformed

    private void btnVoltarAlujnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarAlujnoActionPerformed
 
        Menu_Principal telas = new Menu_Principal();
        telas.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnVoltarAlujnoActionPerformed

    private void btnAtualizarAluno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarAluno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarAluno1ActionPerformed

    private void btnRelatorioAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioAlunosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRelatorioAlunosActionPerformed

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
            java.util.logging.Logger.getLogger(Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarAluno;
    private javax.swing.JButton btnAtualizarAluno1;
    private javax.swing.JButton btnCriarAluno;
    private javax.swing.JButton btnDeletarAluno;
    private javax.swing.JButton btnRelatorioAlunos;
    private javax.swing.JButton btnVoltarAlujno;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
