/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moduledefault.clustering.visualization;

import javax.swing.JPanel;
import moduledefault.clustering.aco.ACOClustering;
import moduledefault.clustering.uteis.MatrizDados;
import moduledefault.clustering.view.jpanel.PanelFormigas;

/**
 *
 * @author Mateus
 */
public final class ClusteringFrameVisualization extends javax.swing.JFrame {

    /**
     * Creates new form ClusteringFrameVisualization
     */
    private static GraficoDispersaoGrupo GDGr;
    private static ClusteringFrameVisualization INSTANCE;
    private static MatrizDados dados;
    private static double matrizDados[][];
    private static int matrizPadroes[][];
    private static int[][] matrizGrupos;

    public ClusteringFrameVisualization() {
        initComponents();
        repaint();
    }

    public static synchronized ClusteringFrameVisualization getInstance(ACOClustering a) {
        if (INSTANCE == null) {
            INSTANCE = new ClusteringFrameVisualization();
            dispersaoGrupos();
        } else {
        }
        INSTANCE.repaint();
        return INSTANCE;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGuias = new javax.swing.JTabbedPane();
        panelGraficoDispersao = new javax.swing.JPanel();
        fundoDispersão = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        graficoDispersao = new javax.swing.JCheckBox();
        grafoDispersao = new javax.swing.JCheckBox();
        dispersaoCorrelacao = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        checkGeral = new javax.swing.JCheckBox();
        checkGrupos = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        comboEixoX = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        comboEixoY = new javax.swing.JComboBox();
        buttonVisualizar = new javax.swing.JButton();
        panelDistribuicao = new javax.swing.JPanel();
        segmentoRegular = new javax.swing.JCheckBox();
        segmentoCircular = new javax.swing.JCheckBox();
        fundoDistribuicao = new javax.swing.JPanel();
        panelProjecoesGeometricas = new javax.swing.JPanel();
        coordenadasParalelas2D = new javax.swing.JCheckBox();
        coordenadasParalelas3D = new javax.swing.JCheckBox();
        andrewCurve = new javax.swing.JCheckBox();
        gravitationalForce = new javax.swing.JCheckBox();
        fundoProjecoes = new javax.swing.JPanel();
        panelDendograma = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        fundoDispersão.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                fundoDispersãoComponentResized(evt);
            }
        });

        javax.swing.GroupLayout fundoDispersãoLayout = new javax.swing.GroupLayout(fundoDispersão);
        fundoDispersão.setLayout(fundoDispersãoLayout);
        fundoDispersãoLayout.setHorizontalGroup(
            fundoDispersãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        fundoDispersãoLayout.setVerticalGroup(
            fundoDispersãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Opções"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        graficoDispersao.setText("Gráfico de Dispersão");
        graficoDispersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficoDispersaoActionPerformed(evt);
            }
        });

        grafoDispersao.setText("Grafo de Dispersão");
        grafoDispersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grafoDispersaoActionPerformed(evt);
            }
        });

        dispersaoCorrelacao.setText("Dispersão de Correlação");
        dispersaoCorrelacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispersaoCorrelacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(graficoDispersao)
                    .addComponent(grafoDispersao)
                    .addComponent(dispersaoCorrelacao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(graficoDispersao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grafoDispersao, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dispersaoCorrelacao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Amostra Para Visualização"));

        checkGeral.setText("Geral");

        checkGrupos.setText("Por Grupos");

        jLabel1.setText("Eixo X:");

        comboEixoX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Eixo Y:");

        comboEixoY.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboEixoY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEixoYActionPerformed(evt);
            }
        });

        buttonVisualizar.setText("Visualizar");
        buttonVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVisualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkGeral)
                    .addComponent(checkGrupos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(comboEixoX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(comboEixoY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(buttonVisualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(checkGeral)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkGrupos))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboEixoY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboEixoX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonVisualizar)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelGraficoDispersaoLayout = new javax.swing.GroupLayout(panelGraficoDispersao);
        panelGraficoDispersao.setLayout(panelGraficoDispersaoLayout);
        panelGraficoDispersaoLayout.setHorizontalGroup(
            panelGraficoDispersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGraficoDispersaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGraficoDispersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fundoDispersão, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelGraficoDispersaoLayout.setVerticalGroup(
            panelGraficoDispersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGraficoDispersaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fundoDispersão, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelGuias.addTab("Dispersão", panelGraficoDispersao);

        segmentoRegular.setText("Segmento Retangular");

        segmentoCircular.setText("Segmento Circular");

        javax.swing.GroupLayout fundoDistribuicaoLayout = new javax.swing.GroupLayout(fundoDistribuicao);
        fundoDistribuicao.setLayout(fundoDistribuicaoLayout);
        fundoDistribuicaoLayout.setHorizontalGroup(
            fundoDistribuicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        fundoDistribuicaoLayout.setVerticalGroup(
            fundoDistribuicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelDistribuicaoLayout = new javax.swing.GroupLayout(panelDistribuicao);
        panelDistribuicao.setLayout(panelDistribuicaoLayout);
        panelDistribuicaoLayout.setHorizontalGroup(
            panelDistribuicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDistribuicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDistribuicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fundoDistribuicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelDistribuicaoLayout.createSequentialGroup()
                        .addComponent(segmentoRegular)
                        .addGap(18, 18, 18)
                        .addComponent(segmentoCircular)
                        .addGap(0, 495, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDistribuicaoLayout.setVerticalGroup(
            panelDistribuicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDistribuicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDistribuicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(segmentoRegular)
                    .addComponent(segmentoCircular))
                .addGap(18, 18, 18)
                .addComponent(fundoDistribuicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelGuias.addTab("Distribuição de Pixels", panelDistribuicao);

        coordenadasParalelas2D.setText("Coordenadas Paralelas 2D");

        coordenadasParalelas3D.setText("Coordenadas Paralelas 3D");

        andrewCurve.setText("Andrew's Curve");

        gravitationalForce.setText("Gravitational Force");

        javax.swing.GroupLayout fundoProjecoesLayout = new javax.swing.GroupLayout(fundoProjecoes);
        fundoProjecoes.setLayout(fundoProjecoesLayout);
        fundoProjecoesLayout.setHorizontalGroup(
            fundoProjecoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        fundoProjecoesLayout.setVerticalGroup(
            fundoProjecoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelProjecoesGeometricasLayout = new javax.swing.GroupLayout(panelProjecoesGeometricas);
        panelProjecoesGeometricas.setLayout(panelProjecoesGeometricasLayout);
        panelProjecoesGeometricasLayout.setHorizontalGroup(
            panelProjecoesGeometricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProjecoesGeometricasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProjecoesGeometricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fundoProjecoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelProjecoesGeometricasLayout.createSequentialGroup()
                        .addComponent(coordenadasParalelas2D)
                        .addGap(18, 18, 18)
                        .addComponent(coordenadasParalelas3D)
                        .addGap(18, 18, 18)
                        .addComponent(andrewCurve)
                        .addGap(18, 18, 18)
                        .addComponent(gravitationalForce)
                        .addGap(0, 181, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelProjecoesGeometricasLayout.setVerticalGroup(
            panelProjecoesGeometricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProjecoesGeometricasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProjecoesGeometricasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coordenadasParalelas2D)
                    .addComponent(coordenadasParalelas3D)
                    .addComponent(andrewCurve)
                    .addComponent(gravitationalForce))
                .addGap(18, 18, 18)
                .addComponent(fundoProjecoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelGuias.addTab("Projeções Geométricas", panelProjecoesGeometricas);

        javax.swing.GroupLayout panelDendogramaLayout = new javax.swing.GroupLayout(panelDendograma);
        panelDendograma.setLayout(panelDendogramaLayout);
        panelDendogramaLayout.setHorizontalGroup(
            panelDendogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
        );
        panelDendogramaLayout.setVerticalGroup(
            panelDendogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 707, Short.MAX_VALUE)
        );

        panelGuias.addTab("Distribuição Hierárquica", panelDendograma);

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGuias)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGuias)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void graficoDispersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficoDispersaoActionPerformed
        if (graficoDispersao.isSelected()) {
            grafoDispersao.setEnabled(false);
            dispersaoCorrelacao.setEnabled(false);
        } else {
            grafoDispersao.setEnabled(true);
            dispersaoCorrelacao.setEnabled(true);
        }
    }//GEN-LAST:event_graficoDispersaoActionPerformed

    private void grafoDispersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grafoDispersaoActionPerformed
        if (grafoDispersao.isSelected()) {
            graficoDispersao.setEnabled(false);
            dispersaoCorrelacao.setEnabled(false);
        } else {
            graficoDispersao.setEnabled(true);
            dispersaoCorrelacao.setEnabled(true);
        }
    }//GEN-LAST:event_grafoDispersaoActionPerformed

    private void dispersaoCorrelacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispersaoCorrelacaoActionPerformed
        if (dispersaoCorrelacao.isSelected()) {
            graficoDispersao.setEnabled(false);
            grafoDispersao.setEnabled(false);
        } else {
            graficoDispersao.setEnabled(true);
            grafoDispersao.setEnabled(true);
        }
    }//GEN-LAST:event_dispersaoCorrelacaoActionPerformed

    private void comboEixoYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEixoYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEixoYActionPerformed

    private void buttonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVisualizarActionPerformed

        if (graficoDispersao.isSelected()) {
            if (checkGrupos.isSelected()) {
                setGrupos(getMatrizGrupos());
                GDGr.setVisible(true);
                GDGr.repaint();
            }
        }


    }//GEN-LAST:event_buttonVisualizarActionPerformed

    private void fundoDispersãoComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_fundoDispersãoComponentResized

        fundoDispersão.removeAll();
        GDGr.setSize(fundoDispersão.getWidth(), fundoDispersão.getHeight());
        fundoDispersão.add(GDGr);
        fundoDispersão.updateUI();
        repaint();
    }//GEN-LAST:event_fundoDispersãoComponentResized
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox andrewCurve;
    private static javax.swing.JButton buttonVisualizar;
    private static javax.swing.JCheckBox checkGeral;
    private static javax.swing.JCheckBox checkGrupos;
    private static javax.swing.JComboBox comboEixoX;
    private static javax.swing.JComboBox comboEixoY;
    private javax.swing.JCheckBox coordenadasParalelas2D;
    private javax.swing.JCheckBox coordenadasParalelas3D;
    private javax.swing.JCheckBox dispersaoCorrelacao;
    private static javax.swing.JPanel fundoDispersão;
    private static javax.swing.JPanel fundoDistribuicao;
    private static javax.swing.JPanel fundoProjecoes;
    private static javax.swing.JCheckBox graficoDispersao;
    private javax.swing.JCheckBox grafoDispersao;
    private javax.swing.JCheckBox gravitationalForce;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelDendograma;
    private javax.swing.JPanel panelDistribuicao;
    private javax.swing.JPanel panelGraficoDispersao;
    private javax.swing.JTabbedPane panelGuias;
    private javax.swing.JPanel panelProjecoesGeometricas;
    private javax.swing.JCheckBox segmentoCircular;
    private javax.swing.JCheckBox segmentoRegular;
    // End of variables declaration//GEN-END:variables

    private static void dispersaoGrupos() {
        if (GDGr == null) {
            GDGr = new GraficoDispersaoGrupo();
        }
        GDGr.setSize(fundoDispersão.getWidth(), fundoDispersão.getHeight());
        fundoDispersão.add(GDGr);
        GDGr.setVisible(false);
    }

    public static void setGrupos(int[][] b) {
        if (GDGr == null) {
            GDGr = new GraficoDispersaoGrupo();
        }
        GDGr.setGrupos(b);
    }

    public static JPanel getFundoDispersão() {
        return fundoDispersão;
    }

    public void setFundoDispersão(JPanel fundoDispersão) {
        this.fundoDispersão = fundoDispersão;
    }

    public static JPanel getFundoDistribuicao() {
        return fundoDistribuicao;
    }

    public void setFundoDistribuicao(JPanel fundoDistribuicao) {
        this.fundoDistribuicao = fundoDistribuicao;
    }

    public static JPanel getFundoProjecoes() {
        return fundoProjecoes;
    }

    public void setFundoProjecoes(JPanel fundoProjecoes) {
        this.fundoProjecoes = fundoProjecoes;
    }

    public static MatrizDados getDados() {
        return dados;
    }

    public static void setDados(MatrizDados d) {
        dados = d;
    }

    public static void setMatrizPadroes(int[][] m) {
        matrizPadroes = m;
    }

    public static int[][] getMatrizPadroes() {
        return matrizPadroes;
    }

    public static int[][] getMatrizGrupos() {
        return matrizGrupos;
    }

    public static void setMatrizGrupos(int[][] matrizGrupos) {
        ClusteringFrameVisualization.matrizGrupos = matrizGrupos;
    }

    public static double[][] getMatrizDados() {
        return matrizDados;
    }

    public static void setMatrizDados(double[][] matrizDados) {
        ClusteringFrameVisualization.matrizDados = matrizDados;
    }
}
