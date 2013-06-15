/*
 * JPSelecionaColunas.java
 *
 * Created on 21 de Maio de 2008, 22:39
 */
package moduledefault.elicitedbases.postgresrafael.view.jpanel;


import interfaces.Base;
import java.util.ArrayList;
import moduledefault.elicitedbases.postgresrafael.model.beans.BaseDados;
//import b_Controle.FacadeSwing;
//import c_Modelo.Regras.FacadeFactory;
import javax.swing.tree.DefaultMutableTreeNode;
import moduledefault.elicitedbases.postgresrafael.FacadePostgresElicitedBases;
import moduledefault.elicitedbases.postgresrafael.PostgresElicitedBases;
import moduledefault.elicitedbases.postgresrafael.model.beans.Coluna;

/**
 *
 * @author  Rafael
 */
public class JPSelecionaColunas extends javax.swing.JPanel {

    PostgresElicitedBases postgresElicitedBases;
    //JPPreviaDados jPPrevia;
    /** Creates new form JPSelecionaColunas */
    public JPSelecionaColunas() {
        initComponents();
        //jPanel1 = new JPPreviaDados();
        postgresElicitedBases = FacadePostgresElicitedBases.getPostgresElicitedBases();
        rJTSelecionadas.setRootVisible(false);
        rJTArvore.setRootVisible(false);
        jDialog1.pack();
    //rJTSelecionadas.addTreeModelListner(new RafaelTreeModelListener(rJTSelecionadas));
    }

    public void createNodes(BaseDados bd) {
        rJTArvore.createNodes(bd);
    }

    public JPPreviaDados getPreviaDados() {
        return jPPreviaDados1;
    }

    public void addBase(){
        Base base = new Base();
        ArrayList<String> arrayListString = new ArrayList<String>();
        for(Coluna coluna : (Coluna[])jPPreviaDados1.rafaelJTable1GetColumnIdentifiers().toArray(new Coluna[0]))
            arrayListString.add(coluna.getNome());
        base.setAtributes(arrayListString.toArray(new String[0]));
        base.setInput(jPPreviaDados1.getInput());
        base.setOutput(jPPreviaDados1.getOutput());
        postgresElicitedBases.addBase(base);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jDialog1 = new javax.swing.JDialog();
        jPPreviaDados1 = new moduledefault.elicitedbases.postgresrafael.view.jpanel.JPPreviaDados();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rJTArvore = new moduledefault.elicitedbases.postgresrafael.util.jtree.RafaelJTree();
        jScrollPane1 = new javax.swing.JScrollPane();
        rJTSelecionadas = new moduledefault.elicitedbases.postgresrafael.util.jtree.RafaelJTree();
        jBAdd = new javax.swing.JButton();
        jBRem = new javax.swing.JButton();
        jBVis = new javax.swing.JButton();
        jBAddBase = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPreviaDados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPreviaDados1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione as Colunas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16))); // NOI18N
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel1.setText("Lista de Conexões:"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 18, 0, 0);
        add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12));
        jLabel2.setText("Colunas Selecionadas"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 18);
        add(jLabel2, gridBagConstraints);

        jScrollPane2.setViewportView(rJTArvore);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        add(jScrollPane2, gridBagConstraints);

        jScrollPane1.setViewportView(rJTSelecionadas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 18);
        add(jScrollPane1, gridBagConstraints);

        jBAdd.setFont(new java.awt.Font("Calibri", 0, 12));
        jBAdd.setText("Adicionar"); // NOI18N
        jBAdd.setToolTipText("Adiciona dados para a mineração de dados");
        jBAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(6, 29, 0, 23);
        add(jBAdd, gridBagConstraints);

        jBRem.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jBRem.setText("Remover"); // NOI18N
        jBRem.setToolTipText("Adiciona dados para a mineração de dados");
        jBRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 29, 0, 23);
        add(jBRem, gridBagConstraints);

        jBVis.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jBVis.setText("Visualizar"); // NOI18N
        jBVis.setToolTipText("Visualiza os dados selecionados para a mineração");
        jBVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 29, 0, 23);
        add(jBVis, gridBagConstraints);

        jBAddBase.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jBAddBase.setText("Adicionar Base");
        jBAddBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddBaseActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 18);
        add(jBAddBase, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
//
    private void jBAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddActionPerformed
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) rJTArvore.getLastSelectedPathComponent();
        if(node!=null){
            rJTSelecionadas.adicionar(node);
            postgresElicitedBases.addColuna(node);
        }

}//GEN-LAST:event_jBAddActionPerformed

    private void jBVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisActionPerformed
        jPPreviaDados1.revalidate();
        jDialog1.setVisible(true);
}//GEN-LAST:event_jBVisActionPerformed

    private void jBRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRemActionPerformed
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) rJTSelecionadas.getLastSelectedPathComponent();
        if(node!=null){
            rJTSelecionadas.remover(node);
            postgresElicitedBases.remColuna(node);
        }
    }//GEN-LAST:event_jBRemActionPerformed

    private void jBAddBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddBaseActionPerformed
        addBase();
    }//GEN-LAST:event_jBAddBaseActionPerformed
//
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdd;
    private javax.swing.JButton jBAddBase;
    private javax.swing.JButton jBRem;
    private javax.swing.JButton jBVis;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private moduledefault.elicitedbases.postgresrafael.view.jpanel.JPPreviaDados jPPreviaDados1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private moduledefault.elicitedbases.postgresrafael.util.jtree.RafaelJTree rJTArvore;
    private moduledefault.elicitedbases.postgresrafael.util.jtree.RafaelJTree rJTSelecionadas;
    // End of variables declaration//GEN-END:variables
}