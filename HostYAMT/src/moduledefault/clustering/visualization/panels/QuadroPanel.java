/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moduledefault.clustering.visualization.panels;

import java.awt.Color;
import java.awt.Graphics;
import moduledefault.clustering.distancias.PValue;
import moduledefault.clustering.uteis.Base;

/**
 *
 * @author Mateus
 */
public class QuadroPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuadroPanel
     */
    int opcao;
    int numPanel;
    int att1;
    int att2;
    Base base;
    String nome1;
    String nome2;

    public QuadroPanel(int i, int i0, Base matrizDados, int _att1, int _att2, String n1, String n2) {
        initComponents();
        opcao = i;
        numPanel = i0;
        base = matrizDados;
        att1 = _att1;
        att2 = _att2;
        nome1 = n1;
        nome2 = n2;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (base != null) {
            g.drawString(nome1 + "/" + nome2, 10, 10);

//                System.out.println("aqui");
            int width = this.getWidth();
            int height = this.getHeight();
            float m = width / base.getDataSet().size() + 2;
            int tamPixel = (int) m;
            for (int i = 0; i < base.getDataSet().size(); i++) {
                int x = 50 + (int) (base.getDataSet().get(i).getAtributos().get((att1)) * (width - 120));
                int y = (height - 70) - (int) (base.getDataSet().get(i).getAtributos().get((att2)) * (height - 120));
                if (PValue.getPValue(base.getDataSet().get(i).getAtributos().get((att1)), base.getDataSet().get(i).getAtributos().get((att2)))) {
                    g.setColor(Color.GREEN);
                } else {
                    g.setColor(Color.black);
                }
                g.fillOval(x, y, tamPixel, tamPixel);
            }


        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
