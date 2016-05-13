/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.jpanel;

import controller.FacadeHost;
import controller.Host;
import interfaces.Base;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import moduledefault.clustering.som.visualization.FrameSomVisualization;
import moduledefault.clustering.view.frames.JFrameFormigas;
import moduledefault.clustering.view.frames.JFrameHierarquicos;
import moduledefault.clustering.view.frames.JFrameKmeans;
import moduledefault.clustering.view.frames.JFrameKohonenConfig;
import moduledefault.clustering.view.jpanel.PanelFormigas;
import moduledefault.clustering.view.jpanel.PanelHierarquicos;
import moduledefault.clustering.view.jpanel.PanelKmeans;
import moduledefault.clustering.view.jpanel.PanelSOM;
import moduledefault.clustering.view.jpanel.testes;

/**
 *
 * @author Mateusinho
 */
public class JPanelClustering extends javax.swing.JPanel implements Observer {

    private ArrayList<Base> arrayListBases = new ArrayList<>(); //LISTA DE BASE DE DADOS
    private double[][] base; //Base atual
    private String[] grupos;
    static int fundoWidth;
    static int fundoHeight;
    //
    PanelFormigas formigas = null;
    PanelKmeans K = null;
    PanelSOM kohonen = null;
    PanelHierarquicos hierarquicos = null;
    //
    JFrameFormigas frameFormigas;
    JFrameKmeans frameKmeans;
    JFrameHierarquicos frameHierarquicos;
    JFrameKohonenConfig frameKohonen;

    /**
     * Creates new form JPanelClustering
     */
    public JPanelClustering() {
        FacadeHost.getHost().addObserver(this);
        initComponents();
        jButtonConfiguracao.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoDistancias = new javax.swing.ButtonGroup();
        grupoRec = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxMetodos = new javax.swing.JComboBox();
        jButtonConfiguracao = new javax.swing.JButton();
        jLabelMetodosDisponiveis = new javax.swing.JLabel();
        panelFundo = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(666, 499));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tarefa de Agrupamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16))); // NOI18N
        jPanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jPanel2ComponentResized(evt);
            }
        });

        jComboBoxMetodos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Colônia de Fomigas", "K-means", "Self-Organizing Map (SOM)", "Métodos Hierárquicos" }));
        jComboBoxMetodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMetodosActionPerformed(evt);
            }
        });

        jButtonConfiguracao.setText("Configurações");
        jButtonConfiguracao.setEnabled(false);
        jButtonConfiguracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfiguracaoActionPerformed(evt);
            }
        });

        jLabelMetodosDisponiveis.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabelMetodosDisponiveis.setText("Métodos Disponíveis:");

        javax.swing.GroupLayout panelFundoLayout = new javax.swing.GroupLayout(panelFundo);
        panelFundo.setLayout(panelFundoLayout);
        panelFundoLayout.setHorizontalGroup(
            panelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );
        panelFundoLayout.setVerticalGroup(
            panelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMetodosDisponiveis)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jComboBoxMetodos, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonConfiguracao, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(173, Short.MAX_VALUE))
            .addComponent(panelFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelMetodosDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxMetodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfiguracao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMetodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMetodosActionPerformed
        try {
            fundoWidth = panelFundo.getWidth();
            fundoHeight = panelFundo.getHeight();
            testes t = new testes(arrayListBases.get(arrayListBases.size() - 1), frameFormigas);
            FrameSomVisualization.getInstance().setVisible(false);

            switch (jComboBoxMetodos.getSelectedIndex()) {
                case 0: //Nenhum selecionado
                    jButtonConfiguracao.setEnabled(false);
                    panelFundo.removeAll();
                    panelFundo.updateUI();
                    panelFundo.repaint();
                    break;
                case 1: //Formigas
                    jButtonConfiguracao.setEnabled(true);
                    panelFundo.removeAll();
                    frameFormigas = new JFrameFormigas();
                    formigas = new PanelFormigas(arrayListBases.get(arrayListBases.size() - 1), frameFormigas);
                    formigas.setSize(panelFundo.getSize());
                    formigas.setPreferredSize(panelFundo.getPreferredSize());
                    panelFundo.add(formigas);
                    panelFundo.updateUI();
                    panelFundo.repaint();
                    break;
                case 2: //Kmeans
                    jButtonConfiguracao.setEnabled(true);
                    frameKmeans = new JFrameKmeans();
                    panelFundo.removeAll();
                    K = new PanelKmeans(arrayListBases.get(arrayListBases.size() - 1), frameKmeans);
                    K.setSize(panelFundo.getSize());
                    K.setPreferredSize(panelFundo.getPreferredSize());
                    panelFundo.add(K);
                    panelFundo.updateUI();
                    panelFundo.repaint();
                    break;
                case 3: //Kohonen
                    if (kohonen == null) {
                        frameKohonen = new JFrameKohonenConfig();
                        kohonen = new PanelSOM(arrayListBases.get(arrayListBases.size() - 1), frameKohonen);
                    }
                    jButtonConfiguracao.setEnabled(true);
                    panelFundo.removeAll();
                    kohonen.setSize(panelFundo.getSize());
                    kohonen.setPreferredSize(panelFundo.getPreferredSize());
                    panelFundo.add(kohonen);
                    panelFundo.updateUI();
                    panelFundo.repaint();
                    break;
                case 4: //Hierarquicos
                    jButtonConfiguracao.setEnabled(true);
                    frameHierarquicos = new JFrameHierarquicos();
                    panelFundo.removeAll();
                    hierarquicos = new PanelHierarquicos(arrayListBases.get(arrayListBases.size() - 1),frameHierarquicos);
                    hierarquicos.setSize(panelFundo.getSize());
                    hierarquicos.setPreferredSize(panelFundo.getPreferredSize());
                    panelFundo.add(hierarquicos);
                    panelFundo.updateUI();
                    panelFundo.repaint();
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(JPanelClustering.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBoxMetodosActionPerformed

    private void jPanel2ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel2ComponentResized
        if (panelFundo.getComponentCount() > 0) {
            fundoWidth = panelFundo.getWidth();
            fundoHeight = panelFundo.getHeight();
            panelFundo.getComponent(0).setSize(fundoWidth, fundoHeight);
            panelFundo.updateUI();
            panelFundo.repaint();
        }
    }//GEN-LAST:event_jPanel2ComponentResized

    private void jButtonConfiguracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfiguracaoActionPerformed
        switch (jComboBoxMetodos.getSelectedIndex()) {
            case 1:
                frameFormigas.setVisible(true);
                break;
            case 2:
                frameKmeans.setVisible(true);
                break;
            case 3:
                frameKohonen.setVisible(true);
                break;
            case 4:
                frameHierarquicos.setVisible(true);
        }
    }//GEN-LAST:event_jButtonConfiguracaoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupoDistancias;
    private javax.swing.ButtonGroup grupoRec;
    private javax.swing.JButton jButtonConfiguracao;
    private javax.swing.JComboBox jComboBoxMetodos;
    private javax.swing.JLabel jLabelMetodosDisponiveis;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelFundo;
    // End of variables declaration//GEN-END:variables

    public void carregaBase() { //Carrega a ultima base da lista para a matriz de double...
        base = new double[arrayListBases.get(arrayListBases.size() - 1).getInput().length][arrayListBases.get(arrayListBases.size() - 1).getInput()[0].length];
        
        for (int i = 0; i < base.length; i++) {
            for (int j = 0; j < base[0].length; j++) {
                base[i][j] = Double.valueOf(arrayListBases.get(arrayListBases.size() - 1).getInput()[i][j] + "").doubleValue();
            }
        }
        grupos = new String[arrayListBases.get(arrayListBases.size() - 1).getOutput().length];

        for (int i = 0; i < base.length; i++) {
            grupos[i] = arrayListBases.get(arrayListBases.size() - 1).getOutput()[i].toString();
        }

        updateBase();
    }

    public void updateBase() {
        if (formigas != null) {
            formigas.attBase(arrayListBases.get(arrayListBases.size() - 1));
        }
        if (K != null) {
            K.attBase(arrayListBases.get(arrayListBases.size() - 1));
        }
        if (kohonen != null) {
            kohonen.addBase(arrayListBases.get(arrayListBases.size() - 1));
        }
        if (hierarquicos != null) {
            hierarquicos.addBase(arrayListBases.get(arrayListBases.size() - 1));
        }
    }

    public void update(Observable o, Object o1) {
        if (o instanceof Host) {
            if ((o1 instanceof Base) && ((Base) o1).hasMeta()) {
                if (verificaBase((Base) o1)) {
                    arrayListBases.add((Base) o1); //PEGO A BASE
                    carregaBase();
                }
            }
        }
    }

    //Verfifica se a base é composta somente por atributos numéricos
    public boolean verificaBase(Base b) {
        double teste = 0;
        boolean base = true;
        for (int i = 0; i < b.getInput().length; i++) {
            for (int j = 0; j < b.getInput()[0].length; j++) {
                try {
                    teste = Double.valueOf(b.getInput()[i][j] + "").doubleValue();
                } catch (NumberFormatException e) {
                    base = false;
                }
            }
        }
        
        return base;
    }

    public static int getFundoWidth() {
        return fundoWidth;
    }

    public static int getFundoHeight() {
        return fundoHeight;
    }
}
