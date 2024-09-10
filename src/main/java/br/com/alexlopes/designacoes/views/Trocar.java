package br.com.alexlopes.designacoes.views;

import br.com.alexlopes.designacoes.dao.LeitorDAO;
import br.com.alexlopes.designacoes.dao.OracaoDAO;
import br.com.alexlopes.designacoes.dao.PessoaDAO;
import br.com.alexlopes.designacoes.model.Pessoa;
import br.com.alexlopes.designacoes.util.Janela;
import br.com.alexlopes.designacoes.util.Mensagem;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class Trocar extends javax.swing.JFrame {

    private Pessoa pessoa = new Pessoa();
    private Pessoa pessoa2;
    private int linha = -1, numero = 0;
    private String des;
    private DefaultTableModel tab;
    private List<Integer> listaIgnorar = new ArrayList<>();

    public Trocar() {
        initComponents();
    }

    //int é o tipo da parte que o usuario quer alterar
    //string b é o sexo do participante
    //string p é a pessoa
    public Trocar(int a, String b, Pessoa p, List<Integer> lista, String parte) {
        initComponents();
        txtProcurar.requestFocus();
        pessoa = p;
        labelNomeAntigo.setText(p.getNome() + " " + p.getSobrenome());
        listaIgnorar.addAll(lista);
        //1 = leitura da Biblia A
        switch (a) {
            case 1 -> {
                numero = 1;
                des = "LeituraBiblia";
                mostrarTabelaPessoa(b, "LeituraBiblia");
                botaoLista.setText("Lista: " + des);
            }
            case 2 -> {
                numero = 2;
                des = "Presidente";
                mostrarTabelaPessoa(b, "Presidente");
                botaoLista.setText("Lista: " + des);
            }
            case 3 -> {
                numero = 3;
                des = "Tesouros";
                mostrarTabelaPessoa(b, "Tesouros");
                botaoLista.setText("Lista: " + des);
            }
            case 4 -> {
                numero = 4;
                des = "Oracao";
                mostrarTabelaOracao();
                botaoLista.setText("Lista: " + des);
            }
            case 5 -> {
                numero = 5;
                des = "NossaVidaCrista";
                mostrarTabelaPessoa(b, "NossaVidaCrista");
                botaoLista.setText("Todos");
            }
            case 6 -> {
                numero = 6;
                des = "LeituraEstudo";
                mostrarTabelaLeitor();
                botaoLista.setText("Lista: " + des);
            }
            case 7 -> {
                numero = 7;
                des = "Joias";
                mostrarTabelaPessoa(b, "Joias");
                botaoLista.setText("Lista: " + des);
            }
            case 8 -> {
                numero = 8;
                des = parte;
                mostrarTabelaPessoa(b, parte);
                botaoLista.setText("Todos");
            }
            case 9 -> {
                numero = 9;
                des = "Ajudante";
                mostrarTabelaPessoaAjudante(b, "Ajudante");
                botaoLista.setText("Todos");
            }
            case 10 -> {
                numero = 10;
                des = parte;
                mostrarTabelaPessoa(b, parte);
                botaoLista.setText("Todos");
            }
            case 11 -> {
                numero = 11;
                des = "Ajudante";
                mostrarTabelaPessoaAjudante(b, "Ajudante");
                botaoLista.setText("Todos");
            }
            case 12 -> {
                numero = 12;
                des = parte;
                mostrarTabelaPessoa(b, parte);
                botaoLista.setText("Todos");
            }
            case 13 -> {
                numero = 13;
                des = "Ajudante";
                mostrarTabelaPessoaAjudante(b, "Ajudante");
                botaoLista.setText("Todos");
            }
            case 14 -> {
                numero = 14;
                des = parte;
                mostrarTabelaPessoa(b, parte);
                botaoLista.setText("Todos");
            }
            case 15 -> {
                numero = 15;
                des = "Ajudante";
                mostrarTabelaPessoaAjudante(b, "Ajudante");
                botaoLista.setText("Todos");
            }
            case 16 -> {
                numero = 16;
                des = parte;
                mostrarTabelaPessoa(b, parte);
                botaoLista.setText("Todos");
            }
            case 17 -> {
                numero = 17;
                des = "Ajudante";
                mostrarTabelaPessoaAjudante(b, "Ajudante");
                botaoLista.setText("Todos");
            }
            case 19 -> {
                numero = 19;
                des = "Oracao";
                mostrarTabelaOracao();
                botaoLista.setText("Lista: " + des);
            }
            case 20 -> {
                numero = 20;
                des = "NossaVidaCrista";
                mostrarTabelaPessoa(b, "NossaVidaCrista");
                botaoLista.setText("Todos");
            }
            case 21 -> {
                numero = 21;
                des = "EstudoCongregacao";
                mostrarTabelaPessoa(b, "EstudoCongregacao");
                botaoLista.setText("Lista: " + des);
            }
            case 22 -> {
                numero = 22;
                des = "Presidente";
                mostrarTabelaPessoa(b, "Presidente");
                botaoLista.setText("Lista: " + des);
            }
            case 23 -> {
                numero = 23;
                des = parte;
                mostrarTabelaPessoa(b, parte);
                botaoLista.setText("Todos");
            }
            case 24 -> {
                numero = 24;
                des = "Ajudante";
                mostrarTabelaPessoaAjudante(b, "Ajudante");
                botaoLista.setText("Todos");
            }
            case 25 -> {
                numero = 25;
                des = parte;
                mostrarTabelaPessoa(b, parte);
                botaoLista.setText("Todos");
            }
            case 26 -> {
                numero = 26;
                des = "Ajudante";
                mostrarTabelaPessoaAjudante(b, "Ajudante");
                botaoLista.setText("Todos");
            }
            case 27 -> {
                numero = 27;
                des = parte;
                mostrarTabelaPessoa(b, parte);
                botaoLista.setText("Todos");
            }
            case 28 -> {
                numero = 28;
                des = "Ajudante";
                mostrarTabelaPessoaAjudante(b, "Ajudante");
                botaoLista.setText("Todos");
            }
            case 34 -> {
                numero = 34;
                des = "LeituraBiblia";
                mostrarTabelaPessoa(b, "LeituraBiblia");
                botaoLista.setText("Lista: " + des);
            }
            default -> {
            }
        }
    }

    //METODO 2 CONSTRUTOR 2
    //int é o tipo da parte que o usuario quer alterar
    //string b é o sexo do participante
    public Trocar(int a, String b, List<Integer> lista) {
        initComponents();
        txtProcurar.requestFocus();
        listaIgnorar.addAll(lista);
        //1 = leitura da Biblia A
        switch (a) {
            case 1 -> {
                numero = 1;
                des = "LeituraBiblia";
                mostrarTabelaPessoa(b, "LeituraBiblia");
                botaoLista.setText("Lista: " + des);
            }
            case 2 -> {
                numero = 2;
                des = "Presidente";
                mostrarTabelaPessoa(b, "Presidente");
                botaoLista.setText("Lista: " + des);
            }
            case 3 -> {
                numero = 3;
                des = "Tesouros";
                mostrarTabelaPessoa(b, "Tesouros");
                botaoLista.setText("Lista: " + des);
            }
            case 4 -> {
                numero = 4;
                des = "Oracao";
                mostrarTabelaOracao();
                botaoLista.setText("Lista: " + des);
            }
            case 5 -> {
                numero = 5;
                des = "NossaVidaCrista";
                mostrarTabelaPessoa(b, "NossaVidaCrista");
                botaoLista.setText("Todos");
            }
            case 6 -> {
                numero = 6;
                des = "LeituraEstudo";
                mostrarTabelaLeitor();
                botaoLista.setText("Lista: " + des);
            }
            case 7 -> {
                numero = 7;
                des = "Joias";
                mostrarTabelaPessoa(b, "Joias");
                botaoLista.setText("Lista: " + des);
            }
            case 8 -> {
                numero = 8;
                des = "PrimeiraConversa";
                mostrarTabelaPessoa(b, "PrimeiraConversa");
                botaoLista.setText("Todos");
            }
            case 9 -> {
                numero = 9;
                des = "Ajudante";
                mostrarTabelaPessoaAjudante(b, "Ajudante");
                botaoLista.setText("Todos");
            }
            case 10 -> {
                numero = 10;
                des = "PrimeiraConversa";
                mostrarTabelaPessoa(b, "PrimeiraConversa");
                botaoLista.setText("Todos");
            }
            case 11 -> {
                numero = 11;
                des = "Ajudante";
                mostrarTabelaPessoaAjudante(b, "Ajudante");
                botaoLista.setText("Todos");
            }
            case 12 -> {
                numero = 12;
                des = "Revisita";
                mostrarTabelaPessoa(b, "Revisita");
                botaoLista.setText("Todos");
            }
            case 13 -> {
                numero = 13;
                des = "Ajudante";
                mostrarTabelaPessoaAjudante(b, "Ajudante");
            }
            case 14 -> {
                numero = 14;
                des = "Revisita";
                mostrarTabelaPessoa(b, "Revisita");
                botaoLista.setText("Todos");
            }
            case 15 -> {
                numero = 15;
                des = "Ajudante";
                mostrarTabelaPessoaAjudante(b, "Ajudante");
                botaoLista.setText("Todos");
            }
            case 16 -> {
                numero = 16;
                des = "EstudoBiblico";
                mostrarTabelaPessoa(b, "EstudoBiblico");
                botaoLista.setText("Todos");
            }
            case 17 -> {
                numero = 17;
                des = "Ajudante";
                mostrarTabelaPessoaAjudante(b, "Ajudante");
                botaoLista.setText("Todos");
            }
            case 19 -> {
                numero = 19;
                des = "Oracao";
                mostrarTabelaOracao();
                botaoLista.setText("Lista: " + des);
            }
            case 20 -> {
                numero = 20;
                des = "NossaVidaCrista";
                mostrarTabelaPessoa(b, "NossaVidaCrista");
                botaoLista.setText("Todos");
            }
            case 21 -> {
                numero = 21;
                des = "EstudoCongregacao";
                mostrarTabelaPessoa(b, "EstudoCongregacao");
                botaoLista.setText("Todos");
            }
            case 22 -> {
                numero = 22;
                des = "Presidente";
                mostrarTabelaPessoa(b, "Presidente");
                botaoLista.setText("Lista: " + des);
            }
            case 23 -> {
                numero = 23;
                des = "PrimeiraConversa";
                mostrarTabelaPessoa(b, "PrimeiraConversa");
                botaoLista.setText("Todos");
            }
            case 24 -> {
                numero = 24;
                des = "Ajudante";
                mostrarTabelaPessoaAjudante(b, "Ajudante");
                botaoLista.setText("Todos");
            }
            case 25 -> {
                numero = 25;
                des = "PrimeiraConversa";
                mostrarTabelaPessoa(b, "PrimeiraConversa");
                botaoLista.setText("Todos");
            }
            case 26 -> {
                numero = 26;
                des = "Ajudante";
                mostrarTabelaPessoaAjudante(b, "Ajudante");
                botaoLista.setText("Todos");
            }
            case 27 -> {
                numero = 27;
                des = "Revisita";
                mostrarTabelaPessoa(b, "Revisita");
                botaoLista.setText("Todos");
            }
            case 28 -> {
                numero = 28;
                des = "Ajudante";
                mostrarTabelaPessoaAjudante(b, "Ajudante");
                botaoLista.setText("Todos");
            }
            case 34 -> {
                numero = 34;
                des = "LeituraBiblia";
                mostrarTabelaPessoa(b, "LeituraBiblia");
                botaoLista.setText("Lista: " + des);
            }
            default -> {
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane(){
            ImageIcon icon = new ImageIcon(getClass().getResource("/Imagem/bazul.jpeg"));
            Image image = icon.getImage();
            public void paintComponent(Graphics g){
                super.paintComponent(g); // Chama o método paintComponent da superclasse
                g.drawImage(image, 0,0, getWidth(), getHeight(),this);
            }
        };
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        botaoTrocar = new javax.swing.JButton();
        labelNomeAntigo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtProcurar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labelNovoNome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        botaoLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tabela.setBackground(new java.awt.Color(204, 204, 204));
        tabela.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PARTICIPANTE", "Última parte", "Ajudante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        botaoTrocar.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        botaoTrocar.setForeground(new java.awt.Color(0, 0, 102));
        botaoTrocar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/60202_refresh_icon.png"))); // NOI18N
        botaoTrocar.setText("  Trocar");
        botaoTrocar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoTrocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTrocarActionPerformed(evt);
            }
        });

        labelNomeAntigo.setBackground(new java.awt.Color(255, 255, 255));
        labelNomeAntigo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelNomeAntigo.setForeground(new java.awt.Color(102, 0, 0));
        labelNomeAntigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNomeAntigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 2));
        labelNomeAntigo.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Procurar por Nome:");

        txtProcurar.setBackground(new java.awt.Color(255, 255, 255));
        txtProcurar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtProcurar.setForeground(new java.awt.Color(0, 0, 0));
        txtProcurar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtProcurar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProcurarKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Trocar esse Participante");

        labelNovoNome.setBackground(new java.awt.Color(255, 255, 255));
        labelNovoNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelNovoNome.setForeground(new java.awt.Color(0, 0, 102));
        labelNovoNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNovoNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        labelNovoNome.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Por esse");

        botaoVoltar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(153, 0, 0));
        botaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/71124_arrow_back_left_red_icon.png"))); // NOI18N
        botaoVoltar.setText(" Voltar");
        botaoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoLista.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListaActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(botaoTrocar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelNomeAntigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtProcurar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelNovoNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(botaoVoltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(botaoLista, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelNomeAntigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelNovoNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addGap(96, 96, 96)
                                    .addComponent(jLabel3))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21))
                                .addComponent(txtProcurar)))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(botaoTrocar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(botaoLista, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoLista, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNomeAntigo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNovoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(botaoTrocar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
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

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        linha = tabela.getSelectedRow();
        pessoa2 = new Pessoa();
        if (linha >= 0) {
            Object idPessoaObj = tabela.getValueAt(linha, 0);
            if (idPessoaObj != null) {
                int idPessoaClicada = (int) idPessoaObj;
                PessoaDAO dao = new PessoaDAO();
                pessoa2 = dao.buscarPessoaPorId(idPessoaClicada);
                labelNovoNome.setText(pessoa2.getNome() + " " + pessoa2.getSobrenome());
            }
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void botaoTrocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTrocarActionPerformed
        try {
            if (pessoa2 != null) {
                irTela1();
                this.dispose();
            } else {
                Mensagem.mensagemAlerta("Selecione um Participante na Lista");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_botaoTrocarActionPerformed

    private void txtProcurarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProcurarKeyReleased
        PessoaDAO pesDAO = new PessoaDAO();
        List<Pessoa> resultadoConsulta = pesDAO.buscarPorNome(txtProcurar.getText());
        tab = (DefaultTableModel) tabela.getModel();
        tab.setNumRows(0);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (Pessoa pessoa : resultadoConsulta) {
            int idPessoa = pessoa.getId(); // substitua com o método getter correto
            String nomeCompleto = pessoa.getNome() + " " + pessoa.getSobrenome(); // substitua com o método getter correto
            LocalDate dataUltima = pessoa.getDataUltima(); // substitua com o método getter correto
            LocalDate ajudante = pessoa.getAjudante(); // substitua com o método getter correto

            String dataUltimaFormatada = dataUltima != null ? dataUltima.format(df) : "";
            String ajudanteFormatada = ajudante != null ? ajudante.format(df) : "";

            tab.addRow(new Object[]{
                idPessoa,
                nomeCompleto,
                dataUltimaFormatada,
                ajudanteFormatada
            });
        }

    }//GEN-LAST:event_txtProcurarKeyReleased

    private void botaoListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListaActionPerformed
        txtProcurar.setText(null);
        if (numero == 6) {
            mostrarTabelaLeitor();
        } else if (numero == 19 || numero == 4) {
            mostrarTabelaOracao();
        } else if (numero == 5 || numero == 20 || numero >= 8 && numero <= 17 || numero >= 23 && numero <= 28) {
            mostrarTabelaPessoaTodas();
        } else {
            mostrarTabelaPessoa(pessoa.getSexo(), des);
        }
    }//GEN-LAST:event_botaoListaActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void irTela1() {
        if (numero == 1) {
            Janela.tela2.altLeituraBibliaA(pessoa2);
        }
        if (numero == 2) {
            Janela.tela2.altPresidenteA(pessoa2);
        }
        if (numero == 3) {
            Janela.tela2.altTesouros(pessoa2);
        }
        if (numero == 4) {
            Janela.tela2.altOracaoInicial(pessoa2);
        }
        if (numero == 5) {
            Janela.tela2.altNossaVida1(pessoa2);
        }
        if (numero == 6) {
            Janela.tela2.altLeitorEstudo(pessoa2);
        }
        if (numero == 7) {
            Janela.tela2.altJoias(pessoa2);
        }
        if (numero == 8) {
            Janela.tela2.altParte1A(pessoa2);
        }
        if (numero == 9) {
            Janela.tela2.altAjudante1A(pessoa2);
        }
        if (numero == 10) {
            Janela.tela2.altParte1B(pessoa2);
        }
        if (numero == 11) {
            Janela.tela2.altAjudante1B(pessoa2);
        }
        if (numero == 12) {
            Janela.tela2.altParte2A(pessoa2);
        }
        if (numero == 13) {
            Janela.tela2.altAjudante2A(pessoa2);
        }
        if (numero == 14) {
            Janela.tela2.altParte2B(pessoa2);
        }
        if (numero == 15) {
            Janela.tela2.altAjudante2B(pessoa2);
        }
        if (numero == 16) {
            Janela.tela2.altParte3A(pessoa2);
        }
        if (numero == 17) {
            Janela.tela2.altAjudante3A(pessoa2);
        }
        if (numero == 19) {
            Janela.tela2.altOracaoFinal(pessoa2);
        }
        if (numero == 20) {
            Janela.tela2.altNossaVida2(pessoa2);
        }
        if (numero == 21) {
            Janela.tela2.altEstudoCongregacao(pessoa2);
        }
        if (numero == 22) {
            Janela.tela2.altPresidenteB(pessoa2);
        }
        if (numero == 23) {
            Janela.tela2.altParte4A(pessoa2);
        }
        if (numero == 24) {
            Janela.tela2.altAjudante4A(pessoa2);
        }
        if (numero == 25) {
            Janela.tela2.altParte4B(pessoa2);
        }
        if (numero == 26) {
            Janela.tela2.altAjudante4B(pessoa2);
        }
        if (numero == 27) {
            Janela.tela2.altParte3B(pessoa2);
        }
        if (numero == 28) {
            Janela.tela2.altAjudante3B(pessoa2);
        }
        if (numero == 34) {
            Janela.tela2.altLeituraBibliaB(pessoa2);
        }
    }

    private void mostrarTabelaPessoa(String sexo, String descricao) {
        PessoaDAO pessoaRepository = new PessoaDAO();
        List<Object[]> resultadoConsulta = pessoaRepository.buscarNomesJoiasOrdenadosPorDataMaisAntiga(sexo, descricao, listaIgnorar);
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
    }

    private void mostrarTabelaPessoaTodas() {
        PessoaDAO pessoaRepository = new PessoaDAO();
        List<Object[]> resultadoConsulta = pessoaRepository.buscarTodasPessoas();
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
    }

    private void mostrarTabelaPessoaAjudante(String sexo, String descricao) {
        PessoaDAO pessoaRepository = new PessoaDAO();
        List<Object[]> resultadoConsulta = pessoaRepository.buscarNomesAjudantePorDataMaisAntiga(sexo, descricao, listaIgnorar);
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
    }

    private void mostrarTabelaOracao() {
        OracaoDAO dao = new OracaoDAO();
        List<Object[]> lista = dao.buscarNomesOracaoOrdenadosPorDataMaisAntiga(listaIgnorar);
        tab = (DefaultTableModel) tabela.getModel();
        tab.setColumnIdentifiers(new String[]{"", "PARTICIPANTE", "DATA - Última oração"});
        tab.setNumRows(0);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (Object[] presidenteInfo : lista) {
            int idPessoa = (int) presidenteInfo[0];
            String nomeCompleto = (String) presidenteInfo[1];
            LocalDate dataUltimaOracao = (LocalDate) presidenteInfo[2];
            String dataFormatada = "";
            if (dataUltimaOracao != null) {
                dataFormatada = dataUltimaOracao.format(df);
            }
            tab.addRow(new Object[]{
                idPessoa,
                nomeCompleto,
                dataFormatada,});
        }
        tabela.getColumnModel().getColumn(0).setMinWidth(0);
        tabela.getColumnModel().getColumn(0).setMaxWidth(0);
        tabela.getColumnModel().getColumn(0).setWidth(0);

        tabela.getColumnModel().getColumn(2).setMinWidth(175);
        tabela.getColumnModel().getColumn(2).setMaxWidth(175);
        tabela.getColumnModel().getColumn(2).setWidth(175);
    }

    public void mostrarTabelaLeitor() {
        LeitorDAO dao = new LeitorDAO();
        List<Object[]> lista = dao.buscarNomesLeitorOrdenadosPorDataMaisAntiga(listaIgnorar);
        tab = (DefaultTableModel) tabela.getModel();
        tab.setColumnIdentifiers(new String[]{"ID", "PARTICIPANTE", "DATA - Última Leitura"});
        tab.setNumRows(0);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (Object[] leitorInfo : lista) {
            int idPessoa = (int) leitorInfo[0];
            String nomeCompleto = (String) leitorInfo[1];
            LocalDate dataInicioMandato = (LocalDate) leitorInfo[2];
            String dataFormatada = "";
            if (dataInicioMandato != null) {
                dataFormatada = dataInicioMandato.format(df);
            }
            tab.addRow(new Object[]{
                idPessoa,
                nomeCompleto,
                dataFormatada,});
        }
        tabela.getColumnModel().getColumn(0).setMinWidth(0);
        tabela.getColumnModel().getColumn(0).setMaxWidth(0);
        tabela.getColumnModel().getColumn(0).setWidth(0);

        tabela.getColumnModel().getColumn(2).setMinWidth(175);
        tabela.getColumnModel().getColumn(2).setMaxWidth(175);
        tabela.getColumnModel().getColumn(2).setWidth(175);
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
            java.util.logging.Logger.getLogger(Trocar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trocar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trocar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trocar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trocar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLista;
    private javax.swing.JButton botaoTrocar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNomeAntigo;
    private javax.swing.JLabel labelNovoNome;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtProcurar;
    // End of variables declaration//GEN-END:variables
}
