package br.com.alexlopes.designacoes.views;

import br.com.alexlopes.designacoes.dao.EstudoBiblicoCongregacaoDAO;
import br.com.alexlopes.designacoes.dao.LeitorDAO;
import br.com.alexlopes.designacoes.dao.OracaoDAO;
import br.com.alexlopes.designacoes.dao.ParteDAO;
import br.com.alexlopes.designacoes.dao.PessoaDAO;
import br.com.alexlopes.designacoes.dao.PresidenteDAO;
import br.com.alexlopes.designacoes.dao.TesourosDAO;
import br.com.alexlopes.designacoes.model.EstudoBiblicoCongregacao;
import br.com.alexlopes.designacoes.model.Leitor;
import br.com.alexlopes.designacoes.model.Oracao;
import br.com.alexlopes.designacoes.model.Parte;
import br.com.alexlopes.designacoes.model.Pessoa;
import br.com.alexlopes.designacoes.model.Presidente;
import br.com.alexlopes.designacoes.model.Tesouros;
import br.com.alexlopes.designacoes.util.Janela;
import br.com.alexlopes.designacoes.util.Mensagem;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class CadastroParticipantes extends javax.swing.JFrame {

    private final PessoaDAO pesDAO = new PessoaDAO();
    private int contar = 0;

    public CadastroParticipantes() {
        initComponents();
        // Definir a imagem como ícone da janela
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagem/designacaoo.png"));
        Image image = icon.getImage();
        setIconImage(image);
        homem.requestFocus();
        mostrarTabela();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
                Janela.irMenu();
            }
        });
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        mulher = new javax.swing.JRadioButton();
        homem = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        botaoVoltar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        rOracao = new javax.swing.JRadioButton();
        rPresidente = new javax.swing.JRadioButton();
        rTesouros = new javax.swing.JRadioButton();
        rJoias = new javax.swing.JRadioButton();
        rLeituraBiblia = new javax.swing.JRadioButton();
        rIniciando = new javax.swing.JRadioButton();
        rCultivando = new javax.swing.JRadioButton();
        rExplicando = new javax.swing.JRadioButton();
        rNossaVidaCrista = new javax.swing.JRadioButton();
        rEstudoCongregacao = new javax.swing.JRadioButton();
        rLeituraEstudo = new javax.swing.JRadioButton();
        rAjudante = new javax.swing.JRadioButton();
        rDiscurso = new javax.swing.JRadioButton();
        rFazendo = new javax.swing.JRadioButton();
        rVideo = new javax.swing.JRadioButton();
        botaoVoltar1 = new javax.swing.JButton();
        mostrarContar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jDesktopPane1.setMaximumSize(new java.awt.Dimension(1359, 687));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1359, 687));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastrar Participante");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tabela.setBackground(new java.awt.Color(255, 255, 255));
        tabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        tabela.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabela.setFillsViewportHeight(true);
        tabela.setRowHeight(30);
        jScrollPane1.setViewportView(tabela);
        tabela.getAccessibleContext().setAccessibleParent(jDesktopPane1);

        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Sobrenome:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome:");

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        txtSobrenome.setBackground(new java.awt.Color(255, 255, 255));
        txtSobrenome.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtSobrenome.setForeground(new java.awt.Color(0, 0, 0));
        txtSobrenome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSobrenomeKeyPressed(evt);
            }
        });

        buttonGroup1.add(mulher);
        mulher.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        mulher.setForeground(new java.awt.Color(0, 0, 0));
        mulher.setText("Mulher");
        mulher.setContentAreaFilled(false);
        mulher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mulher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mulherMouseClicked(evt);
            }
        });
        mulher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mulherKeyPressed(evt);
            }
        });

        buttonGroup1.add(homem);
        homem.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        homem.setForeground(new java.awt.Color(0, 0, 0));
        homem.setText("Homem");
        homem.setContentAreaFilled(false);
        homem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homemMouseClicked(evt);
            }
        });
        homem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                homemKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Celular:");

        txtCelular.setBackground(new java.awt.Color(255, 255, 255));
        txtCelular.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtCelular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCelularFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelularFocusLost(evt);
            }
        });
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCelularKeyPressed(evt);
            }
        });

        botaoVoltar.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(102, 0, 0));
        botaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/71124_arrow_back_left_red_icon.png"))); // NOI18N
        botaoVoltar.setText("Voltar");
        botaoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoCadastrar.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(0, 0, 102));
        botaoCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/85542_guardar_save_icon.png"))); // NOI18N
        botaoCadastrar.setText("  Cadastrar");
        botaoCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Designações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        rOracao.setBackground(new java.awt.Color(255, 255, 255));
        rOracao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rOracao.setForeground(new java.awt.Color(0, 0, 0));
        rOracao.setText("Oração");
        rOracao.setContentAreaFilled(false);
        rOracao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rPresidente.setBackground(new java.awt.Color(255, 255, 255));
        rPresidente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rPresidente.setForeground(new java.awt.Color(0, 0, 0));
        rPresidente.setText("Presidente");
        rPresidente.setContentAreaFilled(false);
        rPresidente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rTesouros.setBackground(new java.awt.Color(255, 255, 255));
        rTesouros.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rTesouros.setForeground(new java.awt.Color(0, 0, 0));
        rTesouros.setText("Tesouros");
        rTesouros.setContentAreaFilled(false);
        rTesouros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rJoias.setBackground(new java.awt.Color(255, 255, 255));
        rJoias.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rJoias.setForeground(new java.awt.Color(0, 0, 0));
        rJoias.setText("Joias");
        rJoias.setContentAreaFilled(false);
        rJoias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rLeituraBiblia.setBackground(new java.awt.Color(255, 255, 153));
        rLeituraBiblia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rLeituraBiblia.setForeground(new java.awt.Color(0, 0, 51));
        rLeituraBiblia.setText("Leitura da Bíblia");
        rLeituraBiblia.setContentAreaFilled(false);
        rLeituraBiblia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rIniciando.setBackground(new java.awt.Color(255, 255, 153));
        rIniciando.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rIniciando.setForeground(new java.awt.Color(0, 0, 51));
        rIniciando.setText("Iniciando conversas");
        rIniciando.setContentAreaFilled(false);
        rIniciando.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rCultivando.setBackground(new java.awt.Color(255, 255, 153));
        rCultivando.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rCultivando.setForeground(new java.awt.Color(0, 0, 51));
        rCultivando.setText("Cultivando o interesse");
        rCultivando.setContentAreaFilled(false);
        rCultivando.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rExplicando.setBackground(new java.awt.Color(255, 255, 153));
        rExplicando.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rExplicando.setForeground(new java.awt.Color(0, 0, 51));
        rExplicando.setText("Explicando suas crenças");
        rExplicando.setContentAreaFilled(false);
        rExplicando.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rNossaVidaCrista.setBackground(new java.awt.Color(255, 255, 255));
        rNossaVidaCrista.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rNossaVidaCrista.setForeground(new java.awt.Color(0, 0, 0));
        rNossaVidaCrista.setText("Nossa Vida Cristã");
        rNossaVidaCrista.setContentAreaFilled(false);
        rNossaVidaCrista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rEstudoCongregacao.setBackground(new java.awt.Color(255, 255, 255));
        rEstudoCongregacao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rEstudoCongregacao.setForeground(new java.awt.Color(0, 0, 0));
        rEstudoCongregacao.setText("Estudo Bíblico de Congregação");
        rEstudoCongregacao.setContentAreaFilled(false);
        rEstudoCongregacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rLeituraEstudo.setBackground(new java.awt.Color(255, 255, 255));
        rLeituraEstudo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rLeituraEstudo.setForeground(new java.awt.Color(0, 0, 0));
        rLeituraEstudo.setText("Leitura do Estudo");
        rLeituraEstudo.setContentAreaFilled(false);
        rLeituraEstudo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rAjudante.setBackground(new java.awt.Color(255, 255, 153));
        rAjudante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rAjudante.setForeground(new java.awt.Color(0, 0, 51));
        rAjudante.setText("Ajudante");
        rAjudante.setContentAreaFilled(false);
        rAjudante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rDiscurso.setBackground(new java.awt.Color(255, 255, 153));
        rDiscurso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rDiscurso.setForeground(new java.awt.Color(0, 0, 51));
        rDiscurso.setText("Discurso");
        rDiscurso.setContentAreaFilled(false);
        rDiscurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rFazendo.setBackground(new java.awt.Color(255, 255, 153));
        rFazendo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rFazendo.setForeground(new java.awt.Color(0, 0, 51));
        rFazendo.setText("Fazendo discipulos");
        rFazendo.setContentAreaFilled(false);
        rFazendo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rVideo.setBackground(new java.awt.Color(255, 255, 153));
        rVideo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rVideo.setForeground(new java.awt.Color(0, 0, 0));
        rVideo.setText("Consideração da Brochura");
        rVideo.setContentAreaFilled(false);
        rVideo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rVideo)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(rLeituraEstudo)
                                .addGap(113, 113, 113))
                            .addComponent(rFazendo)
                            .addComponent(rEstudoCongregacao)
                            .addComponent(rDiscurso)
                            .addComponent(rNossaVidaCrista)
                            .addComponent(rAjudante)
                            .addComponent(rExplicando)
                            .addComponent(rCultivando)
                            .addComponent(rIniciando)))
                    .addComponent(rLeituraBiblia)
                    .addComponent(rJoias)
                    .addComponent(rTesouros)
                    .addComponent(rPresidente)
                    .addComponent(rOracao))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rOracao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rPresidente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rTesouros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rJoias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rLeituraBiblia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rVideo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rIniciando)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rCultivando)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rExplicando)
                .addGap(8, 8, 8)
                .addComponent(rFazendo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rDiscurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rAjudante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rNossaVidaCrista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rEstudoCongregacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rLeituraEstudo)
                .addContainerGap())
        );

        botaoVoltar1.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        botaoVoltar1.setForeground(new java.awt.Color(0, 0, 0));
        botaoVoltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/60202_refresh_icon.png"))); // NOI18N
        botaoVoltar1.setText("Alterar");
        botaoVoltar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(homem)
                                .addGap(61, 61, 61)
                                .addComponent(mulher))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNome)
                                    .addComponent(txtSobrenome)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(homem)
                            .addComponent(mulher))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(108, 108, 108)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoVoltar)
                            .addComponent(botaoCadastrar)
                            .addComponent(botaoVoltar1)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mostrarContar.setBackground(new java.awt.Color(255, 255, 255));
        mostrarContar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mostrarContar.setForeground(new java.awt.Color(0, 0, 0));
        mostrarContar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrarContar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mostrarContar.setOpaque(true);

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(mostrarContar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mostrarContar, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrarContar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1352, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        try {
            if (validarCampos()) {
                String sexo = null;
                if (homem.isSelected()) {
                    sexo = "Homem";
                }
                if (mulher.isSelected()) {
                    sexo = "Mulher";
                }
                Pessoa pessoa = new Pessoa();
                pessoa.setNome(txtNome.getText());
                pessoa.setSobrenome(txtSobrenome.getText());
                pessoa.setSexo(sexo);
                pessoa.setCelular(txtCelular.getText());
                pessoa.setDataUltima(null);
                pessoa.setSala(null);
                pesDAO.cadastrar(pessoa);

                definirPartes(pessoa);
                mostrarTabela();
                limparTela();
                limparTelaCheck();

                jPanel3.setBackground(Color.WHITE);
                homem.requestFocus();
            }
        } catch (Exception e) {
            Mensagem.mensagemErro("Erro ao tentar fazer o cadastro");
            e.getStackTrace();
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.dispose();
        Janela.irMenu();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void txtCelularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusGained
        try {
            MaskFormatter maskFormatters = new MaskFormatter("(##)#####-####");
            maskFormatters.setValueContainsLiteralCharacters(false);
            txtCelular.setFormatterFactory(new DefaultFormatterFactory(maskFormatters));
            txtCelular.setText("");
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtCelularFocusGained

    private void txtCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusLost
        String num = txtCelular.getText().replaceAll("[^0-9]", "");
        int numQtd = num.length();

        try {
            MaskFormatter maskFormatter;
            maskFormatter = switch (numQtd) {
                case 11 ->
                    new MaskFormatter("(##)#####-####");
                case 10 ->
                    new MaskFormatter("(##)####-####");
                default ->
                    new MaskFormatter();
            };
            maskFormatter.setValueContainsLiteralCharacters(false);
            txtCelular.setFormatterFactory(new DefaultFormatterFactory(maskFormatter));
            txtCelular.setText(num);
        } catch (ParseException ex) {
            Logger.getLogger(CadastroParticipantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtCelularFocusLost

    private void botaoVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltar1ActionPerformed
        this.dispose();
        Janela.irAlterarParticipantes();
    }//GEN-LAST:event_botaoVoltar1ActionPerformed

    private void homemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homemMouseClicked
        jPanel3.setBackground(new Color(173, 216, 230));
    }//GEN-LAST:event_homemMouseClicked

    private void mulherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mulherMouseClicked
        jPanel3.setBackground(new Color(255, 99, 71));
    }//GEN-LAST:event_mulherMouseClicked

    private void homemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_homemKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER -> {
                java.awt.event.MouseEvent evts = null;
                homemMouseClicked(evts);
                txtNome.requestFocus();
            }
            case KeyEvent.VK_RIGHT ->
                mulher.requestFocus();
            default -> {
            }
        }
    }//GEN-LAST:event_homemKeyPressed

    private void mulherKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mulherKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER -> {
                java.awt.event.MouseEvent evts = null;
                mulherMouseClicked(evts);
                txtNome.requestFocus();
            }
            case KeyEvent.VK_LEFT ->
                homem.requestFocus();
            default -> {
            }
        }
    }//GEN-LAST:event_mulherKeyPressed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER -> {
                txtSobrenome.requestFocus();
            }
            case KeyEvent.VK_UP ->
                homem.requestFocus();
            case KeyEvent.VK_DOWN ->
                txtSobrenome.requestFocus();
            default -> {
            }
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtSobrenomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSobrenomeKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER -> {
                txtCelular.requestFocus();
            }
            case KeyEvent.VK_UP ->
                txtNome.requestFocus();
            case KeyEvent.VK_DOWN ->
                txtCelular.requestFocus();
            default -> {
            }
        }
    }//GEN-LAST:event_txtSobrenomeKeyPressed

    private void txtCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_UP ->
                txtSobrenome.requestFocus();
            default -> {
            }
        }
    }//GEN-LAST:event_txtCelularKeyPressed

    private void definirPartes(Pessoa pessoa) {
        ParteDAO pdao = new ParteDAO();
        if (rOracao.isSelected()) {
            Parte parte = new Parte();
            parte.setDescricao("Oracao");
            parte.setPessoa(pessoa);
            pdao.cadastrar(parte);

            Oracao oracao = new Oracao();
            OracaoDAO oDAO = new OracaoDAO();
            oracao.setPessoa(pessoa);
            oracao.setData(null);
            oDAO.cadastrar(oracao);
        }
        if (rPresidente.isSelected()) {
            Parte parte = new Parte();
            parte.setDescricao("Presidente");
            parte.setPessoa(pessoa);
            pdao.cadastrar(parte);

            Presidente presidente = new Presidente();
            PresidenteDAO preDAO = new PresidenteDAO();
            presidente.setPessoa(pessoa);
            presidente.setSala(null);
            presidente.setData(null);
            preDAO.cadastrar(presidente);
        }
        if (rTesouros.isSelected()) {
            Parte parte = new Parte();
            parte.setDescricao("Tesouros");
            parte.setPessoa(pessoa);
            pdao.cadastrar(parte);

            Tesouros tesouros = new Tesouros();
            TesourosDAO tDAO = new TesourosDAO();
            tesouros.setPessoa(pessoa);
            tesouros.setData(null);
            tDAO.cadastrar(tesouros);
        }
        if (rJoias.isSelected()) {
            Parte parte = new Parte();
            parte.setDescricao("Joias");
            parte.setPessoa(pessoa);
            pdao.cadastrar(parte);
        }
        if (rLeituraBiblia.isSelected()) {
            Parte parte = new Parte();
            parte.setDescricao("LeituraBiblia");
            parte.setPessoa(pessoa);
            pdao.cadastrar(parte);
        }
        if (rVideo.isSelected()) {
            Parte parte = new Parte();
            parte.setDescricao("Video");
            parte.setPessoa(pessoa);
            pdao.cadastrar(parte);
        }
        if (rIniciando.isSelected()) {
            Parte parte = new Parte();
            parte.setDescricao("Iniciando conversas");
            parte.setPessoa(pessoa);
            pdao.cadastrar(parte);
        }
        if (rCultivando.isSelected()) {
            Parte parte = new Parte();
            parte.setDescricao("Cultivando o interesse");
            parte.setPessoa(pessoa);
            pdao.cadastrar(parte);
        }
        if (rExplicando.isSelected()) {
            Parte parte = new Parte();
            parte.setDescricao("Explicando suas crenças");
            parte.setPessoa(pessoa);
            pdao.cadastrar(parte);
        }
        if (rFazendo.isSelected()) {
            Parte parte = new Parte();
            parte.setDescricao("Fazendo discipulos");
            parte.setPessoa(pessoa);
            pdao.cadastrar(parte);
        }
        if (rDiscurso.isSelected()) {
            Parte parte = new Parte();
            parte.setDescricao("Discurso");
            parte.setPessoa(pessoa);
            pdao.cadastrar(parte);
        }
        if (rAjudante.isSelected()) {
            Parte parte = new Parte();
            parte.setDescricao("Ajudante");
            parte.setPessoa(pessoa);
            pdao.cadastrar(parte);
        }
        if (rNossaVidaCrista.isSelected()) {
            Parte parte = new Parte();
            parte.setDescricao("NossaVidaCrista");
            parte.setPessoa(pessoa);
            pdao.cadastrar(parte);
        }
        if (rEstudoCongregacao.isSelected()) {
            Parte parte = new Parte();
            parte.setDescricao("EstudoCongregacao");
            parte.setPessoa(pessoa);
            pdao.cadastrar(parte);

            EstudoBiblicoCongregacao estudoCong = new EstudoBiblicoCongregacao();
            EstudoBiblicoCongregacaoDAO congDAO = new EstudoBiblicoCongregacaoDAO();
            estudoCong.setPessoa(pessoa);
            estudoCong.setData(null);
            congDAO.cadastrar(estudoCong);
        }
        if (rLeituraEstudo.isSelected()) {
            Parte parte = new Parte();
            parte.setDescricao("LeituraEstudo");
            parte.setPessoa(pessoa);
            pdao.cadastrar(parte);

            Leitor leitor = new Leitor();
            LeitorDAO leiDAO = new LeitorDAO();
            leitor.setPessoa(pessoa);
            leitor.setData(null);
            leiDAO.cadastrar(leitor);
        }
    }

    private boolean validarCampos() {
        if (!homem.isSelected() && !mulher.isSelected()) {
            Mensagem.mensagemAlerta("Por favor, selecione o sexo do Participante");
            return false;
        }
        if (txtNome.getText().isEmpty()) {
            Mensagem.mensagemAlerta("O Campo NOME não pode estar vazio");
            txtNome.requestFocus();
            return false;
        }
        if (txtSobrenome.getText().isEmpty()) {
            Mensagem.mensagemAlerta("O Campo SOBRENOME não pode estar vazio");
            txtSobrenome.requestFocus();
            return false;
        }
        if (txtCelular.getText().equals("(  )     -    ")) {
            Mensagem.mensagemAlerta("O Campo CELULAR não pode estar vazio");
            txtCelular.requestFocus();
            return false;
        }

        return true;
    }

    private void mostrarTabela() {
        List<Pessoa> lista = pesDAO.buscarTodasPorOrdemAlfabetica();
        DefaultTableModel tab = (DefaultTableModel) tabela.getModel();
        tab.setNumRows(0);
        contar = 0;
        for (Pessoa a : lista) {
            tab.addRow(new Object[]{
                "  " + a.getNome() + " " + a.getSobrenome(),
                    contar++
            });
        }
        mostrarContar.setText(contar + " participantes cadastrados");
    }

    private void limparTela() {
        buttonGroup1.clearSelection();
        txtNome.setText(null);
        txtSobrenome.setText(null);
        txtCelular.setText("");
    }

    private void limparTelaCheck() {
        rOracao.setSelected(false);
        rPresidente.setSelected(false);
        rTesouros.setSelected(false);
        rJoias.setSelected(false);
        rLeituraBiblia.setSelected(false);
        rVideo.setSelected(false);
        rIniciando.setSelected(false);
        rCultivando.setSelected(false);
        rExplicando.setSelected(false);
        rFazendo.setSelected(false);
        rDiscurso.setSelected(false);
        rAjudante.setSelected(false);
        rNossaVidaCrista.setSelected(false);
        rEstudoCongregacao.setSelected(false);
        rLeituraEstudo.setSelected(false);
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
            java.util.logging.Logger.getLogger(CadastroParticipantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroParticipantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroParticipantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroParticipantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroParticipantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JButton botaoVoltar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton homem;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mostrarContar;
    private javax.swing.JRadioButton mulher;
    private javax.swing.JRadioButton rAjudante;
    private javax.swing.JRadioButton rCultivando;
    private javax.swing.JRadioButton rDiscurso;
    private javax.swing.JRadioButton rEstudoCongregacao;
    private javax.swing.JRadioButton rExplicando;
    private javax.swing.JRadioButton rFazendo;
    private javax.swing.JRadioButton rIniciando;
    private javax.swing.JRadioButton rJoias;
    private javax.swing.JRadioButton rLeituraBiblia;
    private javax.swing.JRadioButton rLeituraEstudo;
    private javax.swing.JRadioButton rNossaVidaCrista;
    private javax.swing.JRadioButton rOracao;
    private javax.swing.JRadioButton rPresidente;
    private javax.swing.JRadioButton rTesouros;
    private javax.swing.JRadioButton rVideo;
    private javax.swing.JTable tabela;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}
