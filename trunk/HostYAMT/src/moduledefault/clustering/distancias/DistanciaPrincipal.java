/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moduledefault.clustering.distancias;

import java.io.IOException;

/**
 *
 * @author Mateus
 */
public class DistanciaPrincipal {

    double[][] matrizDistancias;

    void padronizacaDistancias(double[][] matriz) throws IOException {
        double menor = 0;
        double maior = 0;
        int cont = 0;
        while (cont < matriz.length) {
            menor = 10000;
            maior = -10000;
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][cont] > maior) {
                    maior = matriz[i][cont];
                }
            }
            cont++;
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] /= maior;
            }
        }
    }

    public double[][] getMatrizDistancias() {
        return matrizDistancias;
    }

    public void setMatrizDistancias(int linhas) {
        this.matrizDistancias = new double[linhas][linhas];
    }
}