/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JPanelPostgresElicitedBases.java
 *
 * Created on 27/08/2010, 09:49:02
 */

package moduledefault.elicitedbases.postgresrafael;

import moduledefault.elicitedbases.postgresrafael.view.jpanel.JPMetaDados;
import moduledefault.elicitedbases.postgresrafael.view.jpanel.JPPreviaDados;
import moduledefault.elicitedbases.postgresrafael.view.jpanel.JPSelecionaColunas;

/**
 *
 * @author evaristowb
 */
public class JPanelPostgresElicitedBases extends javax.swing.JPanel {

    /** Creates new form JPanelPostgresElicitedBases */
    public JPanelPostgresElicitedBases() {
        initComponents();

        jPMetaDados.setVisible(true);
        jPSelecionaColunas.setVisible(false);
        revalidate();
    }

    public JPMetaDados getMetadados(){
        return jPMetaDados;
    }

    public JPSelecionaColunas getSelecionaColuna() {
        return jPSelecionaColunas;
    }

    public JPPreviaDados getPrevia() {
        return jPSelecionaColunas.getPreviaDados();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPMetaDados = new moduledefault.elicitedbases.postgresrafael.view.jpanel.JPMetaDados();
        jPSelecionaColunas = new moduledefault.elicitedbases.postgresrafael.view.jpanel.JPSelecionaColunas();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPMetaDados, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
            .addComponent(jPSelecionaColunas, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPMetaDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPSelecionaColunas, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private moduledefault.elicitedbases.postgresrafael.view.jpanel.JPMetaDados jPMetaDados;
    private moduledefault.elicitedbases.postgresrafael.view.jpanel.JPSelecionaColunas jPSelecionaColunas;
    // End of variables declaration//GEN-END:variables

    public void nextPanel(){
        jPMetaDados.setVisible(false);
        jPSelecionaColunas.setVisible(true);
        revalidate();
    }

}
