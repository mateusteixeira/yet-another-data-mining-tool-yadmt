package moduledefault.clustering.recuperacaogrupos;

import moduledefault.clustering.aco.ACOClustering;
import moduledefault.clustering.uteis.MatrizDados;


public class Ward {

    int[][] m;// = new int[matriz.length][matriz.length];
    int linhas;
    MatrizDados mdados;
    int numpad, numgrupo = 1;
    int[][] mpos;
    int[][] mpos2;
    int q = 1;
    ACOClustering x;
    StringBuffer string3;

    public Ward(int[][] matriz, MatrizDados matrizdados, ACOClustering x_) {
        x = x_;
        string3 = new StringBuffer();
        linhas = matriz.length;
        m = new int[matriz.length][matriz.length];
        m = matriz;
        mdados = matrizdados;
        numpad = mdados.getLinhas();
        mpos = new int[2][numpad];
        mpos2 = new int[2][numpad];
    }

    public void inicio() {
        ward(m);

    }

    public int get_contgrupos() {
        return numgrupo;
    }

    public int[][] get_mpos() {
        return mpos2;

    }

    public int getNumpad() {
        return numpad;
    }

    void ward(int[][] m) {


        char ch;
        int z = 0;
        //VERIFICA NUMERO DE GRUPOS
        z = (int) mdados.getMatriz_dados()[0][0];
        for (int i = 1; i < mdados.getLinhas(); i++) {
            if (mdados.getMatriz_dados()[i][0] != z) {
                numgrupo++;
            }
            z = (int) mdados.getMatriz_dados()[i][0];
        }

        int[][] mdend = new int[numpad][1000];


        for (int i = 0; i < numpad; i++) {
            for (int j = 0; j < numpad; j++) {
                mdend[i][j] = 0;
            }
        }
        for (int i = 0; i < numpad; i++) {
            mdend[0][i] = i + 1;
        }


        float min = 1000000, d = 0;
        int pad1 = 0, pad2 = 0, q = 0, cont = 0, para = 0;
        int[] parada = new int[numpad];
        /////////////////

        float[][] matrizSQE = new float[numpad][numpad];  //CAlcula a matriz SQE 

        for (int i = 0; i < numpad; i++) {
            for (int j = 0; j < numpad; j++) {
                matrizSQE[i][j] = 0;
            }
        }
        for (int i = 0; i < numpad; i++) {
            mdend[q][i] = i + 1;
        }

        for (int i = 0; i < numpad; i++) { // Calcula todos os SQE
            for (int j = i + 1; j < numpad; j++) {
                int n = 0;
                if (i != j) { //Faz o calculo do SQE de 1 grupo para os demais
                    for (int x = 0; x < numpad; x++) {
                        if ((mdend[q][x] == i + 1) || (mdend[q][x] == j + 1)) //conta os padroes do grupo 1
                        {
                            ++n;
                        }
                    }
                    int[][] grupo = new int[n][2];
                    float[] mediagrupo = new float[2];//media para grupo 1 + grupo 2
                    int cnt = 0;
                    float SQE = 0;

                    for (int x = 0; x < 2; x++) {
                        mediagrupo[x] = 0;
                    }

                    for (int x = 0; x < numpad; x++) {//salva no vetor os padroes do grupo 1
                        if ((mdend[q][x] == i + 1) || (mdend[q][x] == j + 1)) {
                            for (int k = 0; k < linhas; k++) {
                                for (int y = 0; y < linhas; y++) {
                                    if (m[k][y] == x + 1) {
                                        grupo[cnt][0] = k;
                                        grupo[cnt][1] = y;
                                        ++cnt;
                                    }
                                }
                            }
                        }
                    }

                    for (int x = 0; x < n; x++) {
                        mediagrupo[0] += grupo[x][0];
                        mediagrupo[1] += grupo[x][1];
                    }

                    mediagrupo[0] = mediagrupo[0] / n;
                    mediagrupo[1] = mediagrupo[1] / n;

                    SQE = 0;
                    for (int x = 0; x < n; x++) {
                        SQE += Math.pow((grupo[x][0] - mediagrupo[0]), 2);
                        SQE += Math.pow((grupo[x][1] - mediagrupo[1]), 2);
                    }

                    matrizSQE[i][j] = SQE;
                } else {
                    for (int x = 0; x < numpad; x++) {
                        if (mdend[q][x] == i + 1) //conta os padroes do grupo 
                        {
                            ++n;
                        }
                    }
                    int[][] grupo = new int[n][2];
                    float[] mediagrupo = new float[2];//media para grupo 1 + grupo 2
                    int cnt = 0;
                    float SQE = 0;

                    for (int x = 0; x < 2; x++) {
                        mediagrupo[x] = 0;
                    }

                    for (int x = 0; x < numpad; x++) {//salva no vetor os padroes do grupo 1
                        if (mdend[q][x] == i + 1) {
                            for (int k = 0; k < linhas; k++) {
                                for (int y = 0; y < linhas; y++) {
                                    if (m[k][y] == x + 1) {
                                        grupo[cnt][0] = k;
                                        grupo[cnt][1] = y;
                                        ++cnt;
                                    }
                                }
                            }
                        }
                    }

                    for (int x = 0; x < n; x++) {
                        mediagrupo[0] += grupo[x][0];
                        mediagrupo[1] += grupo[x][1];
                    }

                    mediagrupo[0] = mediagrupo[0] / n;
                    mediagrupo[1] = mediagrupo[1] / n;

                    SQE = 0;
                    for (int x = 0; x < n; x++) {
                        SQE += Math.pow((grupo[x][0] - mediagrupo[0]), 2);
                        SQE += Math.pow((grupo[x][1] - mediagrupo[1]), 2);
                    }
                    matrizSQE[i][j] = SQE;
                }//else
            }// for SQE
        }// for SQE 
        float SQETotal = 0;

        for (int i = 0; i < numpad; i++) { // 
            SQETotal += matrizSQE[i][i];
        }

        while (para != 1) {
            //printf("\n+1\n");
            for (int i = 0; i < numpad; i++) {
                parada[i] = 0;
            }
            cont = 0;
            min = 1000000;
            d = 0;
            pad1 = 0;
            pad2 = 0;

            float SQEMin = 1000000;
            int g1 = 0, g2 = 0;


            float auxSQE = 0;

            for (int i = 0; i < numpad; i++) { //
                for (int j = i + 1; j < numpad; j++) {
                    if (matrizSQE[i][j] != 0) {
                        auxSQE = SQETotal;
                        auxSQE -= matrizSQE[i][i];
                        auxSQE -= matrizSQE[j][j];
                        auxSQE += matrizSQE[i][j];
                        if (auxSQE < SQEMin) {
                            SQEMin = auxSQE;
                            g1 = i + 1;
                            g2 = j + 1;
                        }
                    }
                }
            }
            //printf("%d - %d  q = %d\n",g1,g2,q);
            //system("pause");

            for (int i = 0; i < numpad; i++) { //Junta os grupos com menor SQe
                if ((mdend[q][i] == g2)) {
                    mdend[q + 1][i] = g1;
                } else {
                    mdend[q + 1][i] = mdend[q][i];
                }
            }

            ++q;

            ///atualizar matriz SQE
            matrizSQE[g1 - 1][g1 - 1] = SQEMin;

            for (int i = 0; i < numpad; i++) {
                matrizSQE[g2 - 1][i] = 0;
                matrizSQE[i][g2 - 1] = 0;
            }

            ///////////////////////////////
            for (int i = 0; i < numpad; i++) {
                int n = 0;
                if ((i + 1 != g1) && (i + 1 != g2)) {
                    for (int x = 0; x < numpad; x++) {
                        if ((mdend[q][x] == g1) || (mdend[q][x] == i + 1))//conta os padroes do grupo 
                        {
                            ++n;
                        }
                    }

                    int[][] grupo = new int[n][2];
                    float[] mediagrupo = new float[2];//media para grupo 1 + grupo 2
                    int cnt = 0;
                    float SQE = 0;

                    for (int x = 0; x < 2; x++) {
                        mediagrupo[x] = 0;
                    }

                    for (int x = 0; x < numpad; x++) {//salva no vetor os padroes do grupo 1
                        if ((mdend[q][x] == g1) || (mdend[q][x] == i + 1)) {
                            for (int k = 0; k < linhas; k++) {
                                for (int y = 0; y < linhas; y++) {
                                    if (m[k][y] == x + 1) {
                                        grupo[cnt][0] = k;
                                        grupo[cnt][1] = y;
                                        ++cnt;
                                    }
                                }
                            }
                        }
                    }

                    for (int x = 0; x < n; x++) {
                        mediagrupo[0] += grupo[x][0];
                        mediagrupo[1] += grupo[x][1];
                    }

                    mediagrupo[0] = mediagrupo[0] / n;
                    mediagrupo[1] = mediagrupo[1] / n;

                    SQE = 0;
                    for (int x = 0; x < n; x++) {
                        SQE += Math.pow((grupo[x][0] - mediagrupo[0]), 2);
                        SQE += Math.pow((grupo[x][1] - mediagrupo[1]), 2);
                    }
                    if (matrizSQE[g1 - 1][i] != 0) {
                        matrizSQE[g1 - 1][i] = SQE;
                    }
                }//if
            }//fim for

            //////////////////////////////////
            int aux = 0, aux2 = 0;
            for (int i = 0; i < numpad; i++) {
                aux = mdend[q][i];
                for (int j = 0; j < numpad; j++) {
                    if (aux == parada[j]) {
                        aux2 = 1;
                    }
                }
                if (aux2 == 0) {
                    parada[cont] = aux;
                    ++cont;
                }
                aux2 = 0;
            }
            if (cont == numgrupo) {
                para = 1;
            } else {
                para = 0;
            }



        }//while parada


        int count = 1;
        for (int j = 0; j < numpad; j++) {
            mpos2[0][j] = count;
            mpos2[1][j] = mdend[q][j];
            count++;
        }


        count = 1;
        int[] pertence = new int[numgrupo];
        boolean teste = false;

        pertence[0] = mpos2[1][0];
        for (int i = 1; i < numpad; i++) {
            for (int j = 0; j < count; j++) {
                if (mpos2[1][i] == pertence[j]) {
                    teste = false;
                    break;
                } else {
                    teste = true;

                }
            }
            if (teste) {
                pertence[count] = mpos2[1][i];
                count++;
            }
            teste = false;

        }

        cont = 0;
        for (int i = 0; i < numpad; i++) {
            for (int j = 0; j < numgrupo; j++) {
                if (mpos2[1][i] == pertence[j]) {
                    mpos2[1][i] = j + 1;
                    break;
                }
            }
        }

    }
}
