/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telaLogin;

import AppIniciar.InicioApp;
import SistemaRg.Rg;
import javax.swing.JOptionPane;

public class LoginT extends javax.swing.JFrame {

    private String usuario;
    private String senha;
    private boolean logado;
    private String adminNome;
    private String adminSenha;
    private boolean adminLogado;

    public LoginT() {
        initComponents();
        this.usuario = "usuario";
        this.senha = "senha";
        this.adminNome = "admin";
        this.adminSenha = "123456";
        this.logado = false;
        this.adminLogado = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adcLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        adcSenha = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        cliqueParaEntrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("SISTEMA DE GESTÃO NUTRICIONAL");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("LOGIN");

        adcLogin.setText(" ");
        adcLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adcLoginActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("SENHA");

        adcSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adcSenhaActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox1.setText("Lembre-me");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Esqueceu sua senha?");

        cliqueParaEntrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cliqueParaEntrar.setText("ENTRAR");
        cliqueParaEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliqueParaEntrarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("REGISTRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(cliqueParaEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(adcLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                        .addComponent(adcSenha))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jButton2)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(adcLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(adcSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(cliqueParaEntrar)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        new Rg().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cliqueParaEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliqueParaEntrarActionPerformed
        fazerLogin();
    }

    private void fazerLogin() {
        String nomeUsuario = adcLogin.getText().trim();
        String coloqueSenha = new String(adcSenha.getPassword());

        if (nomeUsuario.equals(usuario) && coloqueSenha.equals(senha)) {
            logado = true;
            System.out.println("Login realizado com sucesso!");
            new InicioApp().setVisible(true);
            dispose();
        } else if (adminNome.equals(nomeUsuario) && adminSenha.equals(coloqueSenha)) {
            adminLogado = true;
            System.out.println("Login do administrador realizado com sucesso!");
            new InicioApp().setVisible(true);
            dispose();
        } else {
            System.out.println("Nome de usuario ou senha incorretos.");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginT().setVisible(true);
            }
        });

    }//GEN-LAST:event_cliqueParaEntrarActionPerformed

    private void adcLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adcLoginActionPerformed

        String nomeUsuario = adcLogin.getText().trim();
        JOptionPane.showMessageDialog(this, "Nome de usuario: " + nomeUsuario);
    }//GEN-LAST:event_adcLoginActionPerformed

    private void adcSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adcSenhaActionPerformed
        fazerLogin();
    }//GEN-LAST:event_adcSenhaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adcLogin;
    private javax.swing.JPasswordField adcSenha;
    private javax.swing.JButton cliqueParaEntrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

}
