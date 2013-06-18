/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moduledefault.clustering.visualization;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Mateus
 */
public class MatrizCorrelacao extends javax.swing.JPanel {

    private double grupos[][];

    /**
     * Creates new form MatrizCorrelacao
     */
    public MatrizCorrelacao() {
        initComponents();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = ClusteringFrameVisualization.getFundoDispersão().getWidth();
        int height = ClusteringFrameVisualization.getFundoDispersão().getHeight();
        float w = width / 2;
        float h = height / 2;

        int x0 = width - (width - 50);
        int y0 = height - (height - 50);
        int x2 = width - 50;
        int y2 = height - 50;

        g.setColor(Color.black);
        g.drawString("1", x0, y0);
        g.drawString("2", x2, y0);
        g.drawString("3", x0, y2);
        g.drawString("4", x2, y2);

        g.drawLine(x0, y0, x2, y0);
        g.drawLine(x0, y0, x0, y2);
        g.drawLine(x2, y0, x2, y2);
        g.drawLine(x0, y2, x2, y2);

        int escala = (int) height / 10;
        for (int i = 0; i < height; i++) {
            if (i == escala) {
                g.drawLine(x0 - 5, i, x0 + 5, i);
                escala += escala;
            }
        }

        int linhas = width - x0 - x2;
        int colunas = height - y0 - y2;
        int inicioX = width / 2 - grupos.length / 2;
        int inicioY = height / 2 - grupos.length / 2;
        int tamPixel = (width / grupos.length) / (height / grupos.length)+10;

        if (this.grupos != null) {
            for (int i = 0; i < grupos.length; i++) {
                inicioX = width / 2 - grupos.length / 2;
                for (int j = 0; j < grupos.length; j++) {
                    int x = inicioX;
                    int y = inicioY;
                    if (grupos[i][j] > 0 && grupos[i][j] <= 0.24) {
                        g.setColor(Color.blue);
                    }
                    if (grupos[i][j] >= 0.25 && grupos[i][j] <= 0.49) {
                        g.setColor(Color.yellow);
                    }
                    if (grupos[i][j] >= 0.50 && grupos[i][j] <= 0.74) {
                        g.setColor(Color.orange);
                    }
                    if (grupos[i][j] >= 0.75 && grupos[i][j] < 1) {
                        g.setColor(Color.red);
                    }
                    if (i == j) {
                        g.setColor(Color.black);
                    }
                    g.fillOval(x, y, tamPixel, tamPixel);
                    inicioX += tamPixel;
                }
                inicioY += tamPixel;
            }
            g.setColor(Color.black);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    void setMatrizGrupos(double[][] grupos) {
        this.grupos = grupos;

    }
}
