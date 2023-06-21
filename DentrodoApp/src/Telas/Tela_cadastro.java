package Telas;

import Cadastro.Cadastro;
import Conexao.Conexao;
import dao.CadastroDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tela_cadastro extends javax.swing.JFrame {

    public Tela_cadastro() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldnome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldcpf = new javax.swing.JFormattedTextField();
        jTextFieldtelefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFielddatan = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldusuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldestado = new javax.swing.JTextField();
        jTextFieldcep = new javax.swing.JTextField();
        jTextFieldbairro = new javax.swing.JTextField();
        jFormattedTextFieldcidade = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPasswordFieldsenha = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de usuários");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, 34));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        getContentPane().add(jTextFieldnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 200, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CPF");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        getContentPane().add(jFormattedTextFieldcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 200, -1));
        getContentPane().add(jTextFieldtelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 200, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Data de nascimento");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, 27));
        getContentPane().add(jFormattedTextFielddatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 164, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuario");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        jTextFieldusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 164, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Senha");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Endereço");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estado");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Cidade");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Bairro");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CEP");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));
        getContentPane().add(jTextFieldestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 117, -1));
        getContentPane().add(jTextFieldcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 109, -1));

        jTextFieldbairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldbairroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldbairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 108, -1));
        getContentPane().add(jFormattedTextFieldcidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 117, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SALVAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CANCELAR");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/c.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 360, 430));
        getContentPane().add(jPasswordFieldsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 160, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/bb.jpg"))); // NOI18N
        jLabel14.setText(" ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, -20, 260, 430));

        jMenu1.setText("MENU");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String nome = jTextFieldnome.getText();
        String cpf = jFormattedTextFieldcpf.getText();
        String telefone = jTextFieldtelefone.getText();
        String datan = jFormattedTextFielddatan.getText();
        String usuario = jTextFieldusuario.getText();
        String senha = jPasswordFieldsenha.getText();
        String estado = jTextFieldestado.getText();
        String cidade = jFormattedTextFieldcidade.getText();
        String bairro = jTextFieldbairro.getText();
        String cep = jTextFieldcep.getText();

        Cadastro cadastro = new Cadastro(nome, cpf, telefone, datan, usuario, senha, estado, cidade, bairro, cep);

        // Obter a conexão com o banco de dados
        Connection conexao = Conexao.getConnection();

        // Inserir o cadastro no banco de dados usando o CadastroDAO
        CadastroDAO cadastroDao = new CadastroDAO(conexao);
        try {
            cadastroDao.insert(cadastro);

            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

        } catch (SQLException ex) {
            Logger.getLogger(Tela_cadastro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados!");
        } finally {
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Tela_cadastro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldusuarioActionPerformed

    private void jTextFieldbairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldbairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldbairroActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextFieldcidade;
    private javax.swing.JFormattedTextField jFormattedTextFieldcpf;
    private javax.swing.JFormattedTextField jFormattedTextFielddatan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPasswordField jPasswordFieldsenha;
    private javax.swing.JTextField jTextFieldbairro;
    private javax.swing.JTextField jTextFieldcep;
    private javax.swing.JTextField jTextFieldestado;
    private javax.swing.JTextField jTextFieldnome;
    private javax.swing.JTextField jTextFieldtelefone;
    private javax.swing.JTextField jTextFieldusuario;
    // End of variables declaration//GEN-END:variables
}
