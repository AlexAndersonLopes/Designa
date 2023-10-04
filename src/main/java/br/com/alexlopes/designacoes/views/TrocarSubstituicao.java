package br.com.alexlopes.designacoes.views;

import br.com.alexlopes.designacoes.dao.PessoaDAO;
import br.com.alexlopes.designacoes.model.Pessoa;
import br.com.alexlopes.designacoes.util.Janela;
import br.com.alexlopes.designacoes.util.Mensagem;
import br.com.alexlopes.designacoes.util.whats.FolhaDesignacao;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class TrocarSubstituicao extends javax.swing.JFrame {

    private String parte, data, sala, parteBD, parteBD2, campo;
    private Pessoa a, b;
    private DefaultTableModel tab;
    private int responsavel = 0, linha = -1, num;

    public TrocarSubstituicao() {
        initComponents();
    }

    public TrocarSubstituicao(String campo, int num, String parteBD, String parte, String data, String sala, Pessoa a, Pessoa b) {
        initComponents();

        this.campo = campo;
        this.num = num;
        this.parteBD = parteBD;
        this.parte = parte;
        this.data = data;
        this.sala = sala;
        this.a = a;
        this.b = b;

        //Partes sem ajudante
        if (num == 1) {
            preencher1();
        } //Partes com ajudante
        else if (num == 2) {
            preencher2();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            ImageIcon icon = new ImageIcon(getClass().getResource("/Imagem/bazul.jpeg"));
            Image image = icon.getImage();
            public void paintComponent(Graphics g){
                super.paintComponent(g); // Chama o método paintComponent da superclasse
                g.drawImage(image, 0,0, getWidth(), getHeight(),this);
            }
        };
        panelDesignacao = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon(getClass().getResource("/Imagem/folhaDesig.jpg"));
            Image image = icon.getImage();
            public void paintComponent(Graphics g){
                super.paintComponent(g); // Chama o método paintComponent da superclasse
                g.drawImage(image, 0,0, getWidth(), getHeight(),this);
            }
        };
        txtNome = new javax.swing.JLabel();
        txtNomeAjudante = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        txtTipoParte = new javax.swing.JLabel();
        txtSala = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtTipo = new javax.swing.JLabel();
        txtParte = new javax.swing.JLabel();
        txtAjudante = new javax.swing.JLabel();
        labelAjudante = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        todos = new javax.swing.JRadioButton();
        homem = new javax.swing.JRadioButton();
        mulher = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelDesignacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNome.setText("Nome");

        txtNomeAjudante.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNomeAjudante.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeAjudante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNomeAjudante.setText("Ajudante");

        txtData.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtData.setForeground(new java.awt.Color(0, 0, 0));
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtData.setText("Data");

        txtTipoParte.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtTipoParte.setForeground(new java.awt.Color(0, 0, 102));
        txtTipoParte.setText("Parte");

        txtSala.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtSala.setForeground(new java.awt.Color(153, 0, 0));
        txtSala.setText("Sala");

        javax.swing.GroupLayout panelDesignacaoLayout = new javax.swing.GroupLayout(panelDesignacao);
        panelDesignacao.setLayout(panelDesignacaoLayout);
        panelDesignacaoLayout.setHorizontalGroup(
            panelDesignacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDesignacaoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelDesignacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSala, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoParte, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDesignacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDesignacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeAjudante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelDesignacaoLayout.setVerticalGroup(
            panelDesignacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDesignacaoLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(txtNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNomeAjudante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtData)
                .addGap(64, 64, 64)
                .addComponent(txtTipoParte)
                .addGap(61, 61, 61)
                .addComponent(txtSala)
                .addGap(117, 117, 117))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setOpaque(false);

        txtTipo.setBackground(new java.awt.Color(255, 255, 255));
        txtTipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTipo.setForeground(new java.awt.Color(0, 0, 0));
        txtTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTipo.setOpaque(true);

        txtParte.setBackground(new java.awt.Color(255, 255, 255));
        txtParte.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtParte.setForeground(new java.awt.Color(0, 0, 0));
        txtParte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtParte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtParte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte.setOpaque(true);
        txtParte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParteMouseClicked(evt);
            }
        });

        txtAjudante.setBackground(new java.awt.Color(255, 255, 255));
        txtAjudante.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtAjudante.setForeground(new java.awt.Color(51, 102, 0));
        txtAjudante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAjudante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAjudante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante.setOpaque(true);
        txtAjudante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudanteMouseClicked(evt);
            }
        });

        labelAjudante.setForeground(new java.awt.Color(51, 102, 0));
        labelAjudante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAjudante.setText("Ajudante");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtParte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAjudante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(labelAjudante, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(txtParte, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(labelAjudante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAjudante, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        tabela.setBackground(new java.awt.Color(204, 204, 204));
        tabela.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PARTICIPANTE", "ÚLTIMA PARTE", "AJUDANTE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setFillsViewportHeight(true);
        tabela.setRowHeight(30);
        tabela.setShowGrid(true);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setMinWidth(0);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(0);
            tabela.getColumnModel().getColumn(0).setMaxWidth(0);
            tabela.getColumnModel().getColumn(2).setMinWidth(120);
            tabela.getColumnModel().getColumn(2).setPreferredWidth(120);
            tabela.getColumnModel().getColumn(2).setMaxWidth(120);
            tabela.getColumnModel().getColumn(3).setMinWidth(120);
            tabela.getColumnModel().getColumn(3).setPreferredWidth(120);
            tabela.getColumnModel().getColumn(3).setMaxWidth(120);
        }

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/71124_arrow_back_left_red_icon.png"))); // NOI18N
        jButton1.setText(" Voltar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/85542_guardar_save_icon.png"))); // NOI18N
        jButton2.setText("  Salvar e Enviar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(todos);
        todos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        todos.setText("Todos");
        todos.setContentAreaFilled(false);
        todos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosActionPerformed(evt);
            }
        });

        buttonGroup1.add(homem);
        homem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        homem.setText("Homens");
        homem.setContentAreaFilled(false);
        homem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homemActionPerformed(evt);
            }
        });

        buttonGroup1.add(mulher);
        mulher.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mulher.setText("Mulheres");
        mulher.setContentAreaFilled(false);
        mulher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mulher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulherActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(panelDesignacao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(todos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(homem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(mulher, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap(368, Short.MAX_VALUE)
                        .addComponent(todos)
                        .addGap(47, 47, 47)
                        .addComponent(homem)
                        .addGap(39, 39, 39)
                        .addComponent(mulher)
                        .addGap(79, 79, 79)))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDesignacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(panelDesignacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(todos)
                            .addComponent(homem)
                            .addComponent(mulher))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosActionPerformed
        try {
            PessoaDAO pes = new PessoaDAO();
            List<Object[]> resultadoConsulta = pes.buscarNomesParaSubstituicao(null, parteBD2);
            tab = (DefaultTableModel) tabela.getModel();
            tab.setNumRows(0);
            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            for (Object[] resultado : resultadoConsulta) {
                int idPessoa = (int) resultado[0]; // ID da pessoa
                String nomeCompleto = (String) resultado[1]; // Nome completo
                LocalDate dataUltima = (LocalDate) resultado[2]; // Data última    
                LocalDate ajudante = (LocalDate) resultado[3]; // Data última    
                String dataUltimaFormatada = dataUltima != null ? dataUltima.format(df) : ""; // Trata o valor nulo
                String ajudanteFormatada = ajudante != null ? ajudante.format(df) : ""; // Trata o valor nulo
                if (dataUltima != null) {
                    dataUltimaFormatada = dataUltima.format(df);
                }
                if (ajudante != null) {
                    ajudanteFormatada = ajudante.format(df);
                }
                tab.addRow(new Object[]{
                    idPessoa,
                    nomeCompleto,
                    dataUltimaFormatada,
                    ajudanteFormatada
                });
            }
        } catch (Exception e) {
            Mensagem.mensagemAlerta("Escolha quem substituir, o Responsavel ou o Ajudante");
        }
    }//GEN-LAST:event_todosActionPerformed

    private void homemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homemActionPerformed
        try {
            PessoaDAO pes = new PessoaDAO();
            List<Object[]> resultadoConsulta = pes.buscarNomesParaSubstituicao("Homem", parteBD2);
            tab = (DefaultTableModel) tabela.getModel();
            tab.setNumRows(0);
            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            for (Object[] resultado : resultadoConsulta) {
                int idPessoa = (int) resultado[0]; // ID da pessoa
                String nomeCompleto = (String) resultado[1]; // Nome completo
                LocalDate dataUltima = (LocalDate) resultado[2]; // Data última    
                LocalDate ajudante = (LocalDate) resultado[3]; // Data última    
                String dataUltimaFormatada = dataUltima != null ? dataUltima.format(df) : ""; // Trata o valor nulo
                String ajudanteFormatada = ajudante != null ? ajudante.format(df) : ""; // Trata o valor nulo
                if (dataUltima != null) {
                    dataUltimaFormatada = dataUltima.format(df);
                }
                if (ajudante != null) {
                    ajudanteFormatada = ajudante.format(df);
                }
                tab.addRow(new Object[]{
                    idPessoa,
                    nomeCompleto,
                    dataUltimaFormatada,
                    ajudanteFormatada
                });
            }
        } catch (Exception e) {
            Mensagem.mensagemAlerta("Escolha quem substituir, o Responsavel ou o Ajudante");
        }
    }//GEN-LAST:event_homemActionPerformed

    private void mulherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulherActionPerformed
        try {
            PessoaDAO pes = new PessoaDAO();
            List<Object[]> resultadoConsulta = pes.buscarNomesParaSubstituicao("Mulher", parteBD2);
            tab = (DefaultTableModel) tabela.getModel();
            tab.setNumRows(0);
            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            for (Object[] resultado : resultadoConsulta) {
                int idPessoa = (int) resultado[0]; // ID da pessoa
                String nomeCompleto = (String) resultado[1]; // Nome completo
                LocalDate dataUltima = (LocalDate) resultado[2]; // Data última    
                LocalDate ajudante = (LocalDate) resultado[3]; // Data última    
                String dataUltimaFormatada = dataUltima != null ? dataUltima.format(df) : ""; // Trata o valor nulo
                String ajudanteFormatada = ajudante != null ? ajudante.format(df) : ""; // Trata o valor nulo
                if (dataUltima != null) {
                    dataUltimaFormatada = dataUltima.format(df);
                }
                if (ajudante != null) {
                    ajudanteFormatada = ajudante.format(df);
                }
                tab.addRow(new Object[]{
                    idPessoa,
                    nomeCompleto,
                    dataUltimaFormatada,
                    ajudanteFormatada
                });
            }
        } catch (Exception e) {
            Mensagem.mensagemAlerta("Escolha quem substituir, o Responsavel ou o Ajudante");
        }
    }//GEN-LAST:event_mulherActionPerformed

    private void txtAjudanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudanteMouseClicked
        if (!txtAjudante.getText().equals("NA")) {
            buttonGroup1.clearSelection();
            if (tab != null) {
                tab.setNumRows(0);
            }
            parteBD2 = "Ajudante";
            responsavel = 2;
        }
        Color corBranco = new Color(255, 255, 255);
        txtParte.setBackground(corBranco);
        Color corVermelho = new Color(0, 116, 245);
        txtAjudante.setBackground(corVermelho);
    }//GEN-LAST:event_txtAjudanteMouseClicked

    private void txtParteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParteMouseClicked
        if (!txtAjudante.getText().equals("NA")) {
            buttonGroup1.clearSelection();
            if (tab != null) {
                tab.setNumRows(0);
            }
            parteBD2 = parteBD;
            responsavel = 1;
        }
        Color corBranco = new Color(255, 255, 255);
        txtAjudante.setBackground(corBranco);
        Color corVermelho = new Color(0, 116, 245);
        txtParte.setBackground(corVermelho);
    }//GEN-LAST:event_txtParteMouseClicked

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        linha = tabela.getSelectedRow();
        if (responsavel == 1) {
            a = new Pessoa();
            if (linha >= 0) {
                Object idPessoaObj = tabela.getValueAt(linha, 0);
                if (idPessoaObj != null) {
                    int idPessoaClicada = (int) idPessoaObj;
                    PessoaDAO dao = new PessoaDAO();
                    a = dao.buscarPessoaPorId(idPessoaClicada);
                    txtParte.setText(a.getNome() + " " + a.getSobrenome());
                    txtNome.setText(a.getNome() + " " + a.getSobrenome());
                }
            }
        } else if (responsavel == 2) {
            b = new Pessoa();
            if (linha >= 0) {
                Object idPessoaObj = tabela.getValueAt(linha, 0);
                if (idPessoaObj != null) {
                    int idPessoaClicada = (int) idPessoaObj;
                    PessoaDAO dao = new PessoaDAO();
                    b = dao.buscarPessoaPorId(idPessoaClicada);
                    txtNomeAjudante.setText(b.getNome() + " " + b.getSobrenome());
                    txtAjudante.setText(b.getNome() + " " + b.getSobrenome());
                }
            }
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            FolhaDesignacao folha = new FolhaDesignacao(a, b, txtData.getText(), txtTipoParte.getText(), txtSala.getText());
        } catch (Exception e) {
            return;
        }
        substituir();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void substituir() {
        switch (campo) {
            case "txtPresidenteA" ->
                Janela.sub.alttxtPresidenteA(a);
            case "txtOracaoInicial" ->
                Janela.sub.alttxtOracaoInicial(a);
            case "txtTesouros" ->
                Janela.sub.alttxtTesouros(a);
            case "txtJoias" ->
                Janela.sub.alttxtJoias(a);
            case "txtLeituraBibliaA" ->
                Janela.sub.alttxtLeituraBibliaA(a);
            case "txtParte1A" ->
                Janela.sub.alttxtParte1A(a, b);
            case "txtParte2A" ->
                Janela.sub.alttxtParte2A(a, b);
            case "txtParte3A" ->
                Janela.sub.alttxtParte3A(a, b);
            case "txtNossaVida1" ->
                Janela.sub.alttxtNossaVida1(a);
            case "txtNossaVida2" ->
                Janela.sub.alttxtNossaVida2(a);
            case "txtEstudoCongregacao" ->
                Janela.sub.alttxtEstudoCongregacao(a);
            case "txtLeitor" ->
                Janela.sub.alttxtLeitor(a);
            case "txtOracaoFinal" ->
                Janela.sub.alttxtOracaoFinal(a);
            case "txtPresidenteB" ->
                Janela.sub.alttxtPresidenteB(a);
            case "txtLeituraBibliaB" ->
                Janela.sub.alttxtLeituraBibliaB(a);
            case "txtParte1B" ->
                Janela.sub.alttxtParte1B(a, b);
            case "txtParte2B" ->
                Janela.sub.alttxtParte2B(a, b);
            case "txtParte3B" ->
                Janela.sub.alttxtParte3B(a, b);
            default -> {
            }
        }
    }

    private void preencher1() {
        buttonGroup1.clearSelection();
        todos.setEnabled(false);
        homem.setEnabled(false);
        mulher.setEnabled(false);

        txtTipo.setText(parte);
        txtParte.setText(a.getNome() + " " + a.getSobrenome());
        txtAjudante.setText("NA");
        txtAjudante.setEnabled(false);
        txtNome.setText(a.getNome() + " " + a.getSobrenome());
        txtNomeAjudante.setText("   ");
        txtData.setText(data);
        txtTipoParte.setText(parte);
        txtSala.setText(sala);

        contPreencher1();
        responsavel = 1;
    }

    private void preencher2() {
        txtTipo.setText(parte);
        txtParte.setText(a.getNome() + " " + a.getSobrenome());
        txtNome.setText(a.getNome() + " " + a.getSobrenome());
        if (b != null) {
            txtNomeAjudante.setText(b.getNome() + " " + b.getSobrenome());
            txtAjudante.setText(b.getNome() + " " + b.getSobrenome());
        } else {
            txtNomeAjudante.setText("    ");
            txtAjudante.setText("     ");
        }
        txtData.setText(data);
        txtTipoParte.setText(parte);
        txtSala.setText(sala);
    }

    private void contPreencher1() {
        PessoaDAO pes = new PessoaDAO();
        List<Object[]> resultadoConsulta = pes.buscarNomesParaSubstituicao(null, parteBD);
        tab = (DefaultTableModel) tabela.getModel();
        tab.setNumRows(0);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (Object[] resultado : resultadoConsulta) {
            int idPessoa = (int) resultado[0]; // ID da pessoa
            String nomeCompleto = (String) resultado[1]; // Nome completo
            LocalDate dataUltima = (LocalDate) resultado[2]; // Data última    
            LocalDate ajudante = (LocalDate) resultado[3]; // Data última    
            String dataUltimaFormatada = dataUltima != null ? dataUltima.format(df) : ""; // Trata o valor nulo
            String ajudanteFormatada = ajudante != null ? ajudante.format(df) : ""; // Trata o valor nulo
            if (dataUltima != null) {
                dataUltimaFormatada = dataUltima.format(df);
                ajudanteFormatada = ajudante.format(df);
            }
            tab.addRow(new Object[]{
                idPessoa,
                nomeCompleto,
                dataUltimaFormatada,
                ajudanteFormatada
            });
        }
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
            java.util.logging.Logger.getLogger(TrocarSubstituicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrocarSubstituicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrocarSubstituicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrocarSubstituicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrocarSubstituicao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton homem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAjudante;
    private javax.swing.JRadioButton mulher;
    private javax.swing.JPanel panelDesignacao;
    private javax.swing.JTable tabela;
    private javax.swing.JRadioButton todos;
    private javax.swing.JLabel txtAjudante;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtNomeAjudante;
    private javax.swing.JLabel txtParte;
    private javax.swing.JLabel txtSala;
    private javax.swing.JLabel txtTipo;
    private javax.swing.JLabel txtTipoParte;
    // End of variables declaration//GEN-END:variables
}
