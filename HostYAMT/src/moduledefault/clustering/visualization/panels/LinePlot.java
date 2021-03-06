/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moduledefault.clustering.visualization.panels;

import java.awt.Color;
import java.awt.Graphics;
import moduledefault.clustering.visualization.FramePrincipal.TecnicasDispersao;

/**
 *
 * @author Mateus
 */
public class LinePlot extends javax.swing.JPanel {

    /**
     * Creates new form LinePlot
     */
    private static Color[] coresAux = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.MAGENTA, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.BLACK};
    private static Color[] cores;

    public LinePlot() {
        initComponents();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

//        int width = TecnicasDispersao.getFundoLinePlot().getWidth();
//        int height = TecnicasDispersao.getFundoLinePlot().getHeight();
//        float w = width / 2;
//        float h = height / 2;
//        int tamPixel = TecnicasDispersao.getTamanhoPontoGrupos();
//        int x0 = 50 + (int) 0 * (width - 120);
//        int y0 = (height - 70) - (int) 0 * (height - 120) + tamPixel;
//        int x1 = 50 + (int) 1 * (width - 120) + tamPixel;
//        int y1 = (height - 70) - (int) 0 * (height - 120) + tamPixel;
//        int x2 = 50 + (int) 0 * (width - 120);
//        int y2 = (height - 70) - (int) 1 * (height - 120) - tamPixel;
//        g.setColor(Color.black);
//        g.drawLine(x0, y0, x1, y1);//x
//        g.drawLine(x0, y0, x2, y2);//y
//        iniciaVetorCores();
//        //escala para y
//        int aux = 0;
//        int escala = (int) (y0 - y2) / 10;
//        int soma = y2;
//        String[] valores1 = {"1", "0.9", "0.8", "0.7", "0.6", "0.5", "0.4", "0.3", "0.2", "0.1", "0"};
//        while (soma <= y0) {
//            if (valores1[aux] != "0") {
//                g.drawLine(x0 - 5, soma, x0 + 5, soma);
//            }
//            g.drawString(valores1[aux], x0 - 25, soma + 5);
//            aux++;
//            soma += escala;
//        }
//        //escala para x
//        aux = 0;
//        escala = (int) (x1 - x0) / 10;
//        soma = x0;
//        int escalaBase = TecnicasDispersao.getMatrizDados().getDataSet().size() / 10;
//        aux = 0;
//        String[] valores2 = new String[11];
//        for (int i = 0; i < 11; i++) {
//            valores2[i] = String.valueOf(aux);
//            aux += escalaBase;
//        }
//        aux = 0;
//        while (soma <= x1) {
//            g.drawLine(soma, y0 - 5, soma, y0 + 5);
//            g.drawString(valores2[aux], soma - 7, y0 + 20);
//            aux++;
//            soma += escala;
//        }
//        escala = (int) (x1 - x0) / 20;
//        escalaBase = TecnicasDispersao.getMatrizDados().getDataSet().size() / 20;
//        soma = x0;
//        if (true) {
//            int[] coordX = new int[21];
//            int[] coordY = new int[21];
//            for (int i = 0; i < 21; i++) {
//                coordX[i] = soma;
//                soma += escala;
//            }
//            for (int i = 0; i < coordX.length; i++) {
//                System.out.print(coordX[i] + " ");
//            }
//            int index = 0;
//            aux = 0;
//            boolean subtrai = false;
//            for (int i = 0; i < TecnicasDispersao.getMatrizDados().getDataSet().get(0).getAtributos().size(); i++) {
//                soma = x0;
//                aux = 0;
//                index = 0;
//                while (soma < x1) {
//                    if (aux < TecnicasDispersao.getMatrizDados().getDataSet().size()) {
//                        int y = (height - 70) - (int) (TecnicasDispersao.getMatrizDados().getDataSet().get(aux).getAtributos().get((i)) * (height - 120));
//                        coordY[index] = y;
//                        System.out.println("aux = " + aux);
//                        aux += escalaBase;
//                        index++;
//                    }
//                    if(!subtrai){
//                        aux--;
//                        subtrai = true;
//                    }
//                    soma += escala;
//                }
//                g.setColor(cores[i]);
//                for (int j = 0; j < coordX.length - 1; j++) {
//                    g.fillRect(coordX[j], coordY[j], 4, 4);
//                    g.drawLine(coordX[j], coordY[j], coordX[j + 1], coordY[j + 1]);
//                }
//
//            }
//        }


    }

    private void iniciaVetorCores() {
        cores = new Color[TecnicasDispersao.getMatrizDados().getAtributos().size()];
        for (int i = 0; i < cores.length; i++) {
            cores[i] = coresAux[i];
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder("Line Plot"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
