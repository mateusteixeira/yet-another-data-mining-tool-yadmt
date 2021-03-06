/*
 * a.java
 *
 * Created on 24 de Maio de 2008, 10:37
 */
package moduledefault.elicitedbases.postgresrafael.view.jpanel;

import java.awt.Color;
import moduledefault.elicitedbases.postgresrafael.FacadePostgresElicitedBases;
import moduledefault.elicitedbases.postgresrafael.PostgresElicitedBases;
import moduledefault.elicitedbases.postgresrafael.util.jcombobox.ComboListener;

/**
 *
 * @author  Rafael
 */
public class JPMetaDados extends javax.swing.JPanel {

    PostgresElicitedBases postgresElicitedBases;

    /** Creates new form a */
    public JPMetaDados() {
        initComponents();
        postgresElicitedBases = FacadePostgresElicitedBases.getPostgresElicitedBases();
//        MetodosUtil.setCombo(jCSGBD);
        jCSGBD.addItemListener(new ComboListener(this));
    }

    public String getJCSgbdSelectedItem() {
        return (String) jCSGBD.getSelectedItem();
    }

    public char[] getJPSenhaPassword() {
        return jPSenha.getPassword();
    }

    public String getJTCaminhoText() {
        return jTCaminho.getText();
    }

    public String getJTNomeBancoText() {
        return jTNomeBanco.getText();
    }

    public String getJTPortaText() {
        return jTPorta.getText();
    }

    public String getJTUsuarioText() {
        return jTUsuario.getText();
    }

    public void setJCSgbdSelectedItem(String selectedItem) {
        jCSGBD.setSelectedItem(selectedItem);
    }

    public void setJTCaminhoText(String caminho) {
        jTCaminho.setText(caminho);
    }

    public void getJTNomeBancoText(String nome) {
        jTNomeBanco.setText(nome);
    }

    public void setJTPortaText(String porta) {
        jTPorta.setText(porta);
    }

    public void setJTUsuarioText(String usuario) {
        jTUsuario.setText(usuario);
    }

    public void setJLErroText(String erro) {
        jLErro.setText(erro);
    }

    public void setJLErroTextColor(Color cor) {
        jLErro.setForeground(cor);
    }

    /**
     * Metodo que ativa os JTextFields quando necessario
     * @param ativa opcao para ativar ou desativar os JTextFields
     * @author Rafael Voltolini
     * @version 20080607
     */
    public void setEnabledJText(boolean ativa) {
        jTPorta.setEnabled(ativa);
        jTNomeBanco.setEnabled(ativa);
        jTUsuario.setEnabled(ativa);
        jPSenha.setEnabled(ativa);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSGBD = new javax.swing.JLabel();
        jCSGBD = new javax.swing.JComboBox();
        jButtonQuestionSGBD = new javax.swing.JButton();
        jLabelCaminho = new javax.swing.JLabel();
        jTCaminho = new javax.swing.JTextField();
        jButtonQuestionCaminho = new javax.swing.JButton();
        jLabelPorta = new javax.swing.JLabel();
        jTPorta = new javax.swing.JTextField();
        jButtonQuestionPorta = new javax.swing.JButton();
        jLabelNomeBanco = new javax.swing.JLabel();
        jTNomeBanco = new javax.swing.JTextField();
        jButtonNomeBanco = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jTUsuario = new javax.swing.JTextField();
        jButtonUsuario = new javax.swing.JButton();
        jLabelSenha = new javax.swing.JLabel();
        jPSenha = new javax.swing.JPasswordField();
        jButtonSenha = new javax.swing.JButton();
        JBConectar = new javax.swing.JButton();
        jLErro = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configuração Base de Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16))); // NOI18N

        jLabelSGBD.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabelSGBD.setText("SGBD:"); // NOI18N

        jCSGBD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PostgreSQL" }));
        jCSGBD.setNextFocusableComponent(jTCaminho);

        jButtonQuestionSGBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Question.GIF")));
        jButtonQuestionSGBD.setToolTipText("Origem dos Dados");
        jButtonQuestionSGBD.setBorder(null);

        jLabelCaminho.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabelCaminho.setText("Caminho da Base de Dados:"); // NOI18N

        jTCaminho.setText("127.0.0.1/"); // NOI18N
        jTCaminho.setNextFocusableComponent(jTPorta);

        jButtonQuestionCaminho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Question.GIF")));
        jButtonQuestionCaminho.setToolTipText("Computador onde os dados estão armazenados");
        jButtonQuestionCaminho.setBorder(null);

        jLabelPorta.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabelPorta.setText("Porta para a conexão:"); // NOI18N

        jTPorta.setText("5432"); // NOI18N
        jTPorta.setNextFocusableComponent(jTNomeBanco);

        jButtonQuestionPorta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Question.GIF")));
        jButtonQuestionPorta.setToolTipText("Porta para realizar a conexão ao computador");
        jButtonQuestionPorta.setBorder(null);

        jLabelNomeBanco.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabelNomeBanco.setText("Nome da base dados:"); // NOI18N

        jTNomeBanco.setText("postgres"); // NOI18N
        jTNomeBanco.setNextFocusableComponent(jTUsuario);

        jButtonNomeBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Question.GIF")));
        jButtonNomeBanco.setToolTipText("Nome da base de dados de origem");
        jButtonNomeBanco.setBorder(null);

        jLabelUsuario.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabelUsuario.setText("Usuário:"); // NOI18N

        jTUsuario.setText("postgres"); // NOI18N
        jTUsuario.setNextFocusableComponent(jPSenha);

        jButtonUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Question.GIF")));
        jButtonUsuario.setToolTipText("Usuário do banco de dados utilizado para acesar os dados");
        jButtonUsuario.setBorder(null);

        jLabelSenha.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabelSenha.setText("Senha:"); // NOI18N

        jPSenha.setText("postgres"); // NOI18N
        jPSenha.setNextFocusableComponent(JBConectar);

        jButtonSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Question.GIF")));
        jButtonSenha.setToolTipText("Senha do Usuário para acessar os dados");
        jButtonSenha.setBorder(null);

        JBConectar.setText("Criar Conexão"); // NOI18N
        JBConectar.setNextFocusableComponent(jCSGBD);
        JBConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBConectarActionPerformed(evt);
            }
        });

        jLErro.setFont(new java.awt.Font("Calibri", 0, 12));
        jLErro.setForeground(new java.awt.Color(255, 0, 0));
        jLErro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLErro.setText(" "); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSGBD)
                            .addComponent(jLabelCaminho)
                            .addComponent(jLabelPorta)
                            .addComponent(jLabelNomeBanco)
                            .addComponent(jLabelUsuario)
                            .addComponent(jLabelSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTCaminho)
                                    .addComponent(jCSGBD, 0, 200, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonQuestionPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonQuestionSGBD, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonQuestionCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTNomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonNomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLErro, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBConectar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCSGBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelSGBD))
                    .addComponent(jButtonQuestionSGBD, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCaminho))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelPorta))
                            .addComponent(jButtonQuestionPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelNomeBanco)
                                .addComponent(jTNomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonNomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonQuestionCaminho, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelUsuario)
                        .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelSenha)
                        .addComponent(jPSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLErro)
                    .addComponent(JBConectar))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jCSGBD, jPSenha, jTCaminho, jTNomeBanco, jTPorta, jTUsuario});

    }// </editor-fold>//GEN-END:initComponents
//
    private void JBConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBConectarActionPerformed
        postgresElicitedBases.conectarBaseDados();
}//GEN-LAST:event_JBConectarActionPerformed
//
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBConectar;
    private javax.swing.JButton jButtonNomeBanco;
    private javax.swing.JButton jButtonQuestionCaminho;
    private javax.swing.JButton jButtonQuestionPorta;
    private javax.swing.JButton jButtonQuestionSGBD;
    private javax.swing.JButton jButtonSenha;
    private javax.swing.JButton jButtonUsuario;
    private javax.swing.JComboBox jCSGBD;
    private javax.swing.JLabel jLErro;
    private javax.swing.JLabel jLabelCaminho;
    private javax.swing.JLabel jLabelNomeBanco;
    private javax.swing.JLabel jLabelPorta;
    private javax.swing.JLabel jLabelSGBD;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPSenha;
    private javax.swing.JTextField jTCaminho;
    private javax.swing.JTextField jTNomeBanco;
    private javax.swing.JTextField jTPorta;
    private javax.swing.JTextField jTUsuario;
    // End of variables declaration//GEN-END:variables
}
