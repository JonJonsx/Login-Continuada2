/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jonatan.continuada2lp;

import java.util.List;
import javax.swing.BorderFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

/**
 *
 * @author Aluno
 */
public class Login extends javax.swing.JFrame {

    Conexao conecta = new Conexao();
    private List valores;
    Integer tentativas = 2;

    public List<Usuario> getValores() {
        return valores;
    }

    void conectarBanco() {

    }

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLogn = new javax.swing.JButton();
        lbMensagem = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        lbMensagem1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(1, 1, 1));
        jPanel1.setForeground(new java.awt.Color(236, 240, 241));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 240, 241));
        jLabel1.setText("Sign in");

        btnLogn.setBackground(new java.awt.Color(108, 92, 231));
        btnLogn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aluno\\Desktop\\Nova pasta\\continuada2LP\\src\\main\\java\\images\\seta.png")); // NOI18N
        btnLogn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLogn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLognActionPerformed(evt);
            }
        });

        lbMensagem.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbMensagem.setForeground(new java.awt.Color(236, 240, 241));
        lbMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 240, 241));
        jLabel2.setText("Login");

        tfLogin.setBackground(new java.awt.Color(51, 51, 51));
        tfLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfLogin.setForeground(new java.awt.Color(236, 240, 241));
        tfLogin.setBorder(BorderFactory.createCompoundBorder(
            tfLogin.getBorder(),
            BorderFactory.createEmptyBorder(5, 15, 5, 15)));

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(236, 240, 241));
    jLabel3.setText("Senha");

    pfSenha.setBackground(new java.awt.Color(51, 51, 51));
    pfSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    pfSenha.setForeground(new java.awt.Color(236, 240, 241));
    pfSenha.setBorder(BorderFactory.createCompoundBorder(
        pfSenha.getBorder(),
        BorderFactory.createEmptyBorder(5, 15, 5, 15)));

lbMensagem1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
lbMensagem1.setForeground(new java.awt.Color(236, 240, 241));
lbMensagem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(30, 30, 30)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbMensagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lbMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addGap(199, 199, 199)
                    .addComponent(btnLogn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3)
                .addComponent(pfSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(0, 30, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addComponent(lbMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(lbMensagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(10, 10, 10)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(29, 29, 29)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(btnLogn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addGap(54, 54, 54))))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLognActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLognActionPerformed
        // metodo que efetua conexão com o banco
        conecta.conectarBanco();

        // instancia a tela dados
        Dados dadosUsuario = new Dados();

        String email = tfLogin.getText();
        String senha = pfSenha.getText();
        List<Usuario> Logar = conecta.getJdbcTemplate().query(
                "select * from usuario where email = ? and senha = ?",
                new BeanPropertyRowMapper(Usuario.class), email, senha);
        this.valores = Logar;
        if (Logar.isEmpty()) {
            tentativas -= 1;
            lbMensagem1.setText(String.format("Email e/ou senha errados. Você ainda tem %s tentativas", tentativas));
        } else {
            if (tentativas == 0) {
                lbMensagem.setText("Sistema Bloqueado - Procure o suporte");
                lbMensagem1.setText(String.format("Email e/ou senha errados. Você ainda tem %s tentativas", tentativas));
                btnLogn.setEnabled(false);
            } else {
                Logar.forEach(logar -> lbMensagem.setText(String.format("Login efetuado com sucesso. Bem vindo(a), %s", logar.getNome())));

                // abre a tela Dados
                dadosUsuario.setVisible(true);

                // fecha a tela que esta aberta
                dispose();
            }
        }

    }//GEN-LAST:event_btnLognActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogn;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbMensagem;
    private javax.swing.JLabel lbMensagem1;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfLogin;
    // End of variables declaration//GEN-END:variables
}
