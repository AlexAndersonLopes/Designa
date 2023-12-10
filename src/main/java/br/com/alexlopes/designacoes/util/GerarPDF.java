package br.com.alexlopes.designacoes.util;

import br.com.alexlopes.designacoes.dao.TodasPartesDAO;
import br.com.alexlopes.designacoes.model.TodasPartes;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GerarPDF extends javax.swing.JFrame {

    private final String cam = System.getProperty("user.home") + "\\OneDrive\\Área de Trabalho\\Designações\\";
    private String seguir;
    private String caminho;
    private int num = 5;

    public GerarPDF(TodasPartes a) {
        initComponents();
        salvar(a);
    }

    public GerarPDF() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelSemana = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        salaB = new javax.swing.JPanel();
        parte1b = new javax.swing.JLabel();
        parte2b = new javax.swing.JLabel();
        parte3b = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ajudante1b = new javax.swing.JLabel();
        ajudante2b = new javax.swing.JLabel();
        ajudante3b = new javax.swing.JLabel();
        leituraB = new javax.swing.JLabel();
        parte4B = new javax.swing.JLabel();
        ajudante4B = new javax.swing.JLabel();
        labelPresidente = new javax.swing.JLabel();
        labelConselheiro = new javax.swing.JLabel();
        labelOracaoInicial = new javax.swing.JLabel();
        labelTesouros = new javax.swing.JLabel();
        labelJoias = new javax.swing.JLabel();
        labelLeituraBiblia = new javax.swing.JLabel();
        labelParte1 = new javax.swing.JLabel();
        labelParte2 = new javax.swing.JLabel();
        labelParte3 = new javax.swing.JLabel();
        labelNossa1 = new javax.swing.JLabel();
        labelNossa2 = new javax.swing.JLabel();
        labelEstudo = new javax.swing.JLabel();
        labelLeitorEstudo = new javax.swing.JLabel();
        labelOracaoFinal = new javax.swing.JLabel();
        ltesouros = new javax.swing.JLabel();
        ljoias = new javax.swing.JLabel();
        lleituraBiblia = new javax.swing.JLabel();
        labelTesouros4 = new javax.swing.JLabel();
        labelTesouros5 = new javax.swing.JLabel();
        labelTesouros6 = new javax.swing.JLabel();
        labelTesouros7 = new javax.swing.JLabel();
        lOracaoFinal = new javax.swing.JLabel();
        lOracaoInicial = new javax.swing.JLabel();
        lconselheiro = new javax.swing.JLabel();
        lpresidente = new javax.swing.JLabel();
        parte1a = new javax.swing.JLabel();
        parte2a = new javax.swing.JLabel();
        parte3a = new javax.swing.JLabel();
        labelAjudante1A = new javax.swing.JLabel();
        ajudante1a = new javax.swing.JLabel();
        labelAjudante2A = new javax.swing.JLabel();
        ajudante2a = new javax.swing.JLabel();
        labelAjudante3A = new javax.swing.JLabel();
        ajudante3a = new javax.swing.JLabel();
        lnossa1 = new javax.swing.JLabel();
        lnossa2 = new javax.swing.JLabel();
        lestudo = new javax.swing.JLabel();
        lleitor = new javax.swing.JLabel();
        labelParte4 = new javax.swing.JLabel();
        parte4A = new javax.swing.JLabel();
        labelAjudante4A = new javax.swing.JLabel();
        ajudante4A = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(707, 932));
        setMinimumSize(new java.awt.Dimension(707, 932));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelSemana.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        labelSemana.setForeground(new java.awt.Color(0, 0, 0));
        labelSemana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSemana.setText("Semana");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Programação da Reunião do meio de Semana");

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  TESOUROS DA PALAVRA DE DEUS");
        jLabel1.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(255, 204, 0));
        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  FAÇA SEU MELHOR NO MINISTÉRIO");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(153, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  NOSSA VIDA CRISTÃ");
        jLabel4.setOpaque(true);

        salaB.setBackground(new java.awt.Color(255, 255, 204));

        parte1b.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        parte2b.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        parte3b.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        jLabel8.setBackground(new java.awt.Color(255, 204, 0));
        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SALA  B");
        jLabel8.setOpaque(true);

        ajudante1b.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        ajudante2b.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        ajudante3b.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        leituraB.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        parte4B.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        ajudante4B.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout salaBLayout = new javax.swing.GroupLayout(salaB);
        salaB.setLayout(salaBLayout);
        salaBLayout.setHorizontalGroup(
            salaBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salaBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salaBLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(salaBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(parte1b, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(parte2b, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(parte3b, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ajudante1b, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ajudante2b, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ajudante3b, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(salaBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(salaBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leituraB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parte4B, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajudante4B, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        salaBLayout.setVerticalGroup(
            salaBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salaBLayout.createSequentialGroup()
                .addComponent(leituraB, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(parte1b, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ajudante1b, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(parte2b, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ajudante2b, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(parte3b, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ajudante3b, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(parte4B, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ajudante4B, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        labelPresidente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelPresidente.setForeground(new java.awt.Color(0, 0, 0));
        labelPresidente.setText("Presidente: ");

        labelConselheiro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelConselheiro.setForeground(new java.awt.Color(0, 0, 0));
        labelConselheiro.setText("Conselheiro da Sala B: ");

        labelOracaoInicial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelOracaoInicial.setForeground(new java.awt.Color(0, 0, 0));
        labelOracaoInicial.setText("Oração Inicial:");

        labelTesouros.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelTesouros.setForeground(new java.awt.Color(0, 0, 0));
        labelTesouros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelTesouros.setText("Discurso: ");

        labelJoias.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelJoias.setForeground(new java.awt.Color(0, 0, 0));
        labelJoias.setText("2 - Joias espirituais:");

        labelLeituraBiblia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelLeituraBiblia.setForeground(new java.awt.Color(0, 0, 0));
        labelLeituraBiblia.setText("3 - Leitura da Bíblia:");

        labelParte1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelParte1.setForeground(new java.awt.Color(0, 0, 0));
        labelParte1.setText("Parte 1:");

        labelParte2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelParte2.setForeground(new java.awt.Color(0, 0, 0));
        labelParte2.setText("Parte 2:");

        labelParte3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelParte3.setForeground(new java.awt.Color(0, 0, 0));
        labelParte3.setText("Parte 3:");

        labelNossa1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelNossa1.setForeground(new java.awt.Color(0, 0, 0));
        labelNossa1.setText("Nossa Vida - parte 1:");

        labelNossa2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelNossa2.setForeground(new java.awt.Color(0, 0, 0));
        labelNossa2.setText("Nossa Vida - parte 2:");

        labelEstudo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelEstudo.setForeground(new java.awt.Color(0, 0, 0));
        labelEstudo.setText("Estudo Bíblico de Congregação:");

        labelLeitorEstudo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelLeitorEstudo.setForeground(new java.awt.Color(0, 0, 0));
        labelLeitorEstudo.setText("Leitor:");

        labelOracaoFinal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelOracaoFinal.setForeground(new java.awt.Color(0, 0, 0));
        labelOracaoFinal.setText("Oração Final:");

        ltesouros.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ltesouros.setForeground(new java.awt.Color(0, 0, 0));
        ltesouros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        ljoias.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        ljoias.setForeground(new java.awt.Color(0, 0, 0));
        ljoias.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lleituraBiblia.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lleituraBiblia.setForeground(new java.awt.Color(0, 0, 0));

        labelTesouros4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelTesouros4.setForeground(new java.awt.Color(0, 0, 0));

        labelTesouros5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelTesouros5.setForeground(new java.awt.Color(0, 0, 0));

        labelTesouros6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelTesouros6.setForeground(new java.awt.Color(0, 0, 0));

        labelTesouros7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labelTesouros7.setForeground(new java.awt.Color(0, 0, 0));

        lOracaoFinal.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lOracaoFinal.setForeground(new java.awt.Color(0, 0, 0));

        lOracaoInicial.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lOracaoInicial.setForeground(new java.awt.Color(0, 0, 0));

        lconselheiro.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lconselheiro.setForeground(new java.awt.Color(0, 0, 0));

        lpresidente.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lpresidente.setForeground(new java.awt.Color(0, 0, 0));

        parte1a.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        parte1a.setForeground(new java.awt.Color(0, 0, 0));

        parte2a.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        parte2a.setForeground(new java.awt.Color(0, 0, 0));

        parte3a.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        parte3a.setForeground(new java.awt.Color(0, 0, 0));

        labelAjudante1A.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelAjudante1A.setForeground(new java.awt.Color(0, 0, 0));
        labelAjudante1A.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAjudante1A.setText("Ajudante:");

        ajudante1a.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ajudante1a.setForeground(new java.awt.Color(0, 0, 0));

        labelAjudante2A.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelAjudante2A.setForeground(new java.awt.Color(0, 0, 0));
        labelAjudante2A.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAjudante2A.setText("Ajudante:");

        ajudante2a.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ajudante2a.setForeground(new java.awt.Color(0, 0, 0));

        labelAjudante3A.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelAjudante3A.setForeground(new java.awt.Color(0, 0, 0));
        labelAjudante3A.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAjudante3A.setText("Ajudante:");

        ajudante3a.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ajudante3a.setForeground(new java.awt.Color(0, 0, 0));

        lnossa1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lnossa1.setForeground(new java.awt.Color(0, 0, 0));
        lnossa1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lnossa2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lnossa2.setForeground(new java.awt.Color(0, 0, 0));
        lnossa2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lestudo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lestudo.setForeground(new java.awt.Color(0, 0, 0));
        lestudo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lleitor.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lleitor.setForeground(new java.awt.Color(0, 0, 0));
        lleitor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        labelParte4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelParte4.setForeground(new java.awt.Color(0, 0, 0));
        labelParte4.setText("Parte 4:");

        parte4A.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        parte4A.setForeground(new java.awt.Color(0, 0, 0));

        labelAjudante4A.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelAjudante4A.setForeground(new java.awt.Color(0, 0, 0));
        labelAjudante4A.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAjudante4A.setText("Ajudante:");

        ajudante4A.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ajudante4A.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelTesouros6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelTesouros5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(163, 163, 163)
                                                .addComponent(labelLeitorEstudo)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(labelNossa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelEstudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelTesouros7, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelTesouros4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(187, 187, 187)))
                            .addGap(6, 6, 6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lleitor, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lestudo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                    .addComponent(lnossa2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lnossa1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(31, 31, 31))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelAjudante4A, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelAjudante3A, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(labelAjudante2A, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(labelParte2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                                        .addComponent(labelParte3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(labelParte4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(parte4A, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                                        .addComponent(parte3a, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ajudante2a, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(parte2a, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ajudante3a, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ajudante4A, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addComponent(labelNossa1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ajudante1a, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(parte1a, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(salaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelLeituraBiblia)
                                        .addComponent(labelJoias, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lleituraBiblia, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(248, 248, 248)
                                            .addComponent(ljoias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelAjudante1A, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelConselheiro)
                                        .addComponent(labelPresidente)
                                        .addComponent(labelOracaoInicial)
                                        .addComponent(labelTesouros, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lOracaoInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                        .addComponent(lconselheiro, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                        .addComponent(lpresidente, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                        .addComponent(ltesouros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(labelParte1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelOracaoFinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lOracaoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPresidente)
                    .addComponent(lpresidente, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelConselheiro)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelOracaoInicial)
                            .addComponent(lOracaoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lconselheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ltesouros, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTesouros))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelJoias, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ljoias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelLeituraBiblia)
                            .addComponent(lleituraBiblia, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelParte1)
                            .addComponent(parte1a, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelAjudante1A)
                            .addComponent(ajudante1a, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelParte2)
                            .addComponent(parte2a, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelAjudante2A)
                            .addComponent(ajudante2a, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelParte3)
                            .addComponent(parte3a, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelAjudante3A)
                            .addComponent(ajudante3a, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelParte4)
                            .addComponent(parte4A, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelAjudante4A)
                            .addComponent(ajudante4A, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(salaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNossa1)
                    .addComponent(labelTesouros4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnossa1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelNossa2)
                        .addComponent(labelTesouros7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lnossa2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelEstudo)
                            .addComponent(labelTesouros5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lestudo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLeitorEstudo)
                            .addComponent(lleitor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelTesouros6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelOracaoFinal)
                    .addComponent(lOracaoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void salvar(TodasPartes dados) {
        seguir = "Designados" + dados.getMes() + dados.getAno() + ".pdf";
        caminho = cam + seguir;

        TodasPartesDAO dao = new TodasPartesDAO();
        List<TodasPartes> lista = new ArrayList<>();
        lista = dao.buscarPorMesEAno(dados.getMes(), dados.getAno());

        try {
            File file = new File(caminho);
            if (!verificarArquivoExiste()) {
                criarArquivo();
            }

            Document docPdf = new Document();
            PdfWriter.getInstance(docPdf, new FileOutputStream(file, true));

            docPdf.open();

            for (TodasPartes a : lista) {
                docPdf.newPage();

                labelSemana.setText("Semana: " + a.getDia() + " de " + a.getMes() + ", " + a.getAno());

                if (!a.getPresidenteA().equals("NA") && !a.getPresidenteA().equals("")) {
                    lpresidente.setText(a.getPresidenteA());
                } else {
                    lpresidente.setText("");
                }

                if (!a.getPresidenteB().equals("NA") && !a.getPresidenteB().equals("")) {
                    labelConselheiro.setVisible(true);
                    lconselheiro.setText(a.getPresidenteB());
                } else {
                    labelConselheiro.setVisible(false);
                    lconselheiro.setText("");
                }

                if (!a.getOracaoInicial().equals("NA") && !a.getOracaoInicial().equals("")) {
                    lOracaoInicial.setText(a.getOracaoInicial());
                } else {
                    lOracaoInicial.setText("");
                }

                if (!a.getTesouros().equals("NA") && !a.getTesouros().equals("")) {
                    labelTesouros.setText("1 - " + a.getLabelTesouros() + ":");
                    ltesouros.setText(a.getTesouros());
                } else {
                    labelTesouros.setText("Discurso:");
                    ltesouros.setText("");
                }

                if (!a.getJoias().equals("NA") && !a.getJoias().equals("")) {
                    ljoias.setText(a.getJoias());
                } else {
                    ljoias.setText("");
                }

                if (!a.getLeituraBibliaA().equals("NA") && !a.getLeituraBibliaA().equals("")) {
                    lleituraBiblia.setText(a.getLeituraBibliaA());
                } else {
                    lleituraBiblia.setText("");
                }

                if (!a.getNomeParte1().equals("NA") && !a.getNomeParte1().equals("") && !a.getNomeParte1().equals("Faça seu melhor no ministério")) {
                    labelParte1.setVisible(true);
                    labelParte1.setText("4 - " + a.getNomeParte1());
                    parte1a.setVisible(true);
                    parte1a.setText(a.getParte1A());
                    if (!a.getAjudante1A().equals("NA") && !a.getAjudante1A().equals("")) {
                        labelAjudante1A.setVisible(true);
                        labelAjudante4A.setText("Ajudante:");
                        ajudante1a.setVisible(true);
                        ajudante1a.setText(a.getAjudante1A());
                    }else{
                        ajudante1a.setText("");
                    }
                } else {
                    labelAjudante1A.setText("");
                    labelParte1.setVisible(false);
                    parte1a.setVisible(false);
                    labelAjudante1A.setVisible(false);
                    ajudante1a.setVisible(false);
                }

                if (!a.getNomeParte2().equals("NA") && !a.getNomeParte2().equals("") && !a.getNomeParte2().equals("Faça seu melhor no ministério")) {
                    labelParte2.setVisible(true);
                    labelParte2.setText("5 - " + a.getNomeParte2());
                    parte2a.setVisible(true);
                    parte2a.setText(a.getParte2A());
                    if (!a.getAjudante2A().equals("NA") && !a.getAjudante2A().equals("")) {
                        labelAjudante2A.setVisible(true);
                        labelAjudante2A.setText("Ajudante:");
                        ajudante2a.setVisible(true);
                        ajudante2a.setText(a.getAjudante2A());
                    }else{
                        ajudante2a.setText("");
                    }
                } else {
                    labelAjudante4A.setText("");
                    labelParte2.setVisible(false);
                    parte2a.setVisible(false);
                    labelAjudante2A.setVisible(false);
                    ajudante2a.setVisible(false);
                }

                if (!a.getNomeparte3().equals("NA") && !a.getNomeparte3().equals("") && !a.getNomeparte3().equals("Faça seu melhor no ministério")) {
                    num++;
                    labelParte3.setVisible(true);
                    labelParte3.setText(String.valueOf(num) + " - " + a.getNomeparte3());
                    parte3a.setVisible(true);
                    parte3a.setText(a.getParte3A());
                    if (!a.getAjudante3A().equals("NA") && !a.getAjudante3A().equals("")) {
                        labelAjudante3A.setVisible(true);
                        labelAjudante3A.setText("Ajudante:");
                        ajudante3a.setVisible(true);
                        ajudante3a.setText(a.getAjudante3A());
                    }else{
                        ajudante3a.setText("");
                    }
                } else {
                    labelAjudante3A.setText("");
                    labelParte3.setVisible(false);
                    labelAjudante3A.setVisible(false);
                    parte3a.setVisible(false);
                    ajudante3a.setVisible(false);
                }
                System.out.println(a.getNomeParte4());
                if (!a.getNomeParte4().equals("NA") && !a.getNomeParte4().equals("") && !a.getNomeParte4().equals("Faça seu melhor no ministério")) {
                    num++;
                    labelParte4.setVisible(true);
                    parte4A.setVisible(true);
                    labelParte4.setText(String.valueOf(num) + " - " + a.getNomeParte4());
                    parte4A.setText(a.getParte4A());
                    if (!a.getAjudante4A().equals("NA") && !a.getAjudante4A().equals("")) {
                        labelAjudante4A.setText("Ajudante:");
                        labelAjudante4A.setVisible(true);
                        ajudante4A.setVisible(true);
                        ajudante4A.setText(a.getAjudante4A());
                    }else{
                        ajudante4A.setText("");
                    }
                } else {
                    labelParte4.setText("");
                    labelAjudante4A.setText("");
                    labelAjudante4A.setVisible(false);
                    labelParte4.setVisible(false);
                    parte4A.setVisible(false);
                    ajudante4A.setVisible(false);
                }

                if (!a.getLeituraBibliaB().equals("NA") && !a.getNomeParte2().equals("NA") && !a.getNomeparte3().equals("NA")
                        && !a.getLeituraBibliaB().equals("") && !a.getNomeParte2().equals("") && !a.getNomeparte3().equals("")) {
                    salaB.setVisible(true);
                    if (!a.getLeituraBibliaB().equals("NA") && !a.getLeituraBibliaB().equals("")) {
                        leituraB.setText(a.getLeituraBibliaB());
                    } else {
                        leituraB.setText("");
                    }

                    if (!a.getParte1B().equals("NA") && !a.getParte1B().equals("")) {
                        parte1b.setVisible(true);
                        parte1b.setText(a.getParte1B());
                        if (!a.getAjudante1B().equals("NA") && !a.getAjudante1B().equals("")) {
                            ajudante1b.setVisible(true);
                            ajudante1b.setText(a.getAjudante1B());
                        }else{
                        ajudante1b.setText("");
                    }
                    } else {
                        ajudante1b.setVisible(false);
                        parte1b.setVisible(false);
                    }

                    if (!a.getParte2B().equals("NA") && !a.getParte2B().equals("")) {
                        parte2b.setVisible(true);
                        parte2b.setText(a.getParte2B());
                        if (!a.getAjudante2B().equals("NA") && !a.getAjudante2B().equals("")) {
                            ajudante2b.setVisible(true);
                            ajudante2b.setText(a.getAjudante2B());
                        }else{
                        ajudante2b.setText("");
                    }
                    } else {
                        ajudante2b.setVisible(false);
                        parte2b.setVisible(false);
                    }

                    if (!a.getParte3B().equals("NA") && !a.getParte3B().equals("")) {
                        parte3b.setVisible(true);
                        parte3b.setText(a.getParte3B());
                        if (!a.getAjudante3B().equals("NA") && !a.getAjudante3B().equals("")) {
                            ajudante3b.setVisible(true);
                            ajudante3b.setText(a.getAjudante3B());
                        }else{
                        ajudante3b.setText("");
                    }
                    } else {
                        ajudante3b.setVisible(false);
                        parte3b.setVisible(false);
                    }

                    if (!a.getParte4B().equals("NA") && !a.getParte4B().equals("")) {
                        parte4B.setVisible(true);
                        parte4B.setText(a.getParte4B());
                        if (!a.getAjudante4B().equals("NA") && !a.getAjudante4B().equals("")) {
                            ajudante4B.setVisible(true);
                            ajudante4B.setText(a.getAjudante4B());
                        }else{
                        ajudante4B.setText("");
                    }
                    } else {
                        ajudante4B.setVisible(false);
                        parte4B.setVisible(false);
                    }
                } else {
                    salaB.setVisible(false);
                }

                if (!a.getNossaVida1().equals("NA") && !a.getNossaVida1().equals("")) {
                    num++;
                    labelNossa1.setText(String.valueOf(num) + " - " + a.getLabelNossaVida1() + ":");
                    lnossa1.setText(a.getNossaVida1());
                } else {
                    labelNossa1.setText("Nossa Vida - parte 1:");
                    lnossa1.setText("");
                }

                if (!a.getNossaVida2().equals("NA") && !a.getNossaVida2().equals("")) {
                    num++;
                    labelNossa2.setVisible(true);
                    labelNossa2.setText(String.valueOf(num) + " - " + a.getLabelNossaVida2() + ":");
                    lnossa2.setText(a.getNossaVida2());
                } else {
                    labelNossa2.setText("Nossa Vida - parte 2:");
                    labelNossa2.setVisible(false);
                    lnossa2.setText("");
                }

                if (!a.getEstudoLivro().equals("NA") && !a.getEstudoLivro().equals("")) {
                    num++;
                    labelEstudo.setText(String.valueOf(num) + " - Estudo Bíblico de Congregação:");
                    lestudo.setText(a.getEstudoLivro());
                } else {
                    lestudo.setText("");
                }

                if (!a.getLeitor().equals("NA") && !a.getLeitor().equals("")) {
                    labelLeitorEstudo.setVisible(true);
                    lleitor.setText(a.getLeitor());
                } else {
                    labelLeitorEstudo.setVisible(false);
                    lleitor.setText("");
                }

                if (!a.getOracaoFinal().equals("NA") && !a.getOracaoFinal().equals("")) {
                    lOracaoFinal.setText(a.getOracaoFinal());
                } else {
                    lOracaoFinal.setText("");
                }
                num = 5;

                BufferedImage imag = preencherDesignacao();
                Image imagem = Image.getInstance(bufferedImageToByteArray(imag));
                imagem.scaleToFit(595, 842);
                float x = (PageSize.A4.getWidth() - imagem.getScaledWidth()) / 2;
                float y = (PageSize.A4.getHeight() - imagem.getScaledHeight()) / 2;
                imagem.setAbsolutePosition(x, y);
                docPdf.add(imagem);
            }
            docPdf.close();
        } catch (IOException | DocumentException ex) {
            ex.getStackTrace();
        }
    }

    public byte[] bufferedImageToByteArray(BufferedImage image) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(image, "png", baos); // Você pode escolher o formato (exemplo: "png", "jpg", etc.)
        return baos.toByteArray();
    }

    public boolean verificarArquivoExiste() {
        File file = new File(caminho);
        return file.exists();
    }

    public void criarArquivo() throws IOException, DocumentException {
        File file = new File(caminho);
        file.getParentFile().mkdirs();
        Document docPdf = new Document();
        PdfWriter.getInstance(docPdf, new FileOutputStream(caminho));
    }

    public static BufferedImage imagemFolha(JPanel panel) {
        BufferedImage bufferedImage = new BufferedImage(panel.getWidth(), panel.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = bufferedImage.createGraphics();
        panel.paint(graphics);
        graphics.dispose();
        return bufferedImage;
    }

    public BufferedImage preencherDesignacao() {
        return imagemFolha(jPanel1);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GerarPDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerarPDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerarPDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerarPDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerarPDF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ajudante1a;
    private javax.swing.JLabel ajudante1b;
    private javax.swing.JLabel ajudante2a;
    private javax.swing.JLabel ajudante2b;
    private javax.swing.JLabel ajudante3a;
    private javax.swing.JLabel ajudante3b;
    private javax.swing.JLabel ajudante4A;
    private javax.swing.JLabel ajudante4B;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lOracaoFinal;
    private javax.swing.JLabel lOracaoInicial;
    private javax.swing.JLabel labelAjudante1A;
    private javax.swing.JLabel labelAjudante2A;
    private javax.swing.JLabel labelAjudante3A;
    private javax.swing.JLabel labelAjudante4A;
    private javax.swing.JLabel labelConselheiro;
    private javax.swing.JLabel labelEstudo;
    private javax.swing.JLabel labelJoias;
    private javax.swing.JLabel labelLeitorEstudo;
    private javax.swing.JLabel labelLeituraBiblia;
    private javax.swing.JLabel labelNossa1;
    private javax.swing.JLabel labelNossa2;
    private javax.swing.JLabel labelOracaoFinal;
    private javax.swing.JLabel labelOracaoInicial;
    private javax.swing.JLabel labelParte1;
    private javax.swing.JLabel labelParte2;
    private javax.swing.JLabel labelParte3;
    private javax.swing.JLabel labelParte4;
    private javax.swing.JLabel labelPresidente;
    private javax.swing.JLabel labelSemana;
    private javax.swing.JLabel labelTesouros;
    private javax.swing.JLabel labelTesouros4;
    private javax.swing.JLabel labelTesouros5;
    private javax.swing.JLabel labelTesouros6;
    private javax.swing.JLabel labelTesouros7;
    private javax.swing.JLabel lconselheiro;
    private javax.swing.JLabel leituraB;
    private javax.swing.JLabel lestudo;
    private javax.swing.JLabel ljoias;
    private javax.swing.JLabel lleitor;
    private javax.swing.JLabel lleituraBiblia;
    private javax.swing.JLabel lnossa1;
    private javax.swing.JLabel lnossa2;
    private javax.swing.JLabel lpresidente;
    private javax.swing.JLabel ltesouros;
    private javax.swing.JLabel parte1a;
    private javax.swing.JLabel parte1b;
    private javax.swing.JLabel parte2a;
    private javax.swing.JLabel parte2b;
    private javax.swing.JLabel parte3a;
    private javax.swing.JLabel parte3b;
    private javax.swing.JLabel parte4A;
    private javax.swing.JLabel parte4B;
    private javax.swing.JPanel salaB;
    // End of variables declaration//GEN-END:variables
}
