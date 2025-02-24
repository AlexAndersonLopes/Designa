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

public class AlterarParticipantes extends javax.swing.JFrame {

    private final PessoaDAO pesDAO = new PessoaDAO();
    private DefaultTableModel tab;
    private int linha = -1, contar;
    private Pessoa pessoa;
    private final ParteDAO pDAO = new ParteDAO();

    public AlterarParticipantes() {
        initComponents();
        // Definir a imagem como ícone da janela
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagem/designacaoo.png"));
        Image image = icon.getImage();
        setIconImage(image);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();
        botaoMostrarTodos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        mulher = new javax.swing.JRadioButton();
        homem = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        botaoVoltar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
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
        botaoRemover = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setOpaque(false);

        tabela.setBackground(new java.awt.Color(255, 255, 255));
        tabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        tabela.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabela.setFillsViewportHeight(true);
        tabela.setRowHeight(30);
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
        }

        txtPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        txtPesquisar.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtPesquisar.setForeground(new java.awt.Color(0, 0, 0));
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        botaoMostrarTodos.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        botaoMostrarTodos.setForeground(new java.awt.Color(0, 0, 0));
        botaoMostrarTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/314233_note_list_icon.png"))); // NOI18N
        botaoMostrarTodos.setText("Mostrar Todos");
        botaoMostrarTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMostrarTodosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pesquisar pelo Nome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPesquisar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(100, 100, 100))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(botaoMostrarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoMostrarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alterar Participante");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Sobrenome:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nome:");

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));

        txtSobrenome.setBackground(new java.awt.Color(255, 255, 255));
        txtSobrenome.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtSobrenome.setForeground(new java.awt.Color(0, 0, 0));

        buttonGroup1.add(mulher);
        mulher.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        mulher.setForeground(new java.awt.Color(0, 0, 0));
        mulher.setText("Mulher");
        mulher.setContentAreaFilled(false);
        mulher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonGroup1.add(homem);
        homem.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        homem.setForeground(new java.awt.Color(0, 0, 0));
        homem.setText("Homem");
        homem.setContentAreaFilled(false);
        homem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Celular:");

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
        botaoCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/60202_refresh_icon.png"))); // NOI18N
        botaoCadastrar.setText("Alterar");
        botaoCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

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
        rLeituraBiblia.setForeground(new java.awt.Color(0, 0, 102));
        rLeituraBiblia.setText("Leitura da Bíblia");
        rLeituraBiblia.setContentAreaFilled(false);
        rLeituraBiblia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rIniciando.setBackground(new java.awt.Color(255, 255, 153));
        rIniciando.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rIniciando.setForeground(new java.awt.Color(0, 0, 102));
        rIniciando.setText("Iniciando conversas");
        rIniciando.setContentAreaFilled(false);
        rIniciando.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rCultivando.setBackground(new java.awt.Color(255, 255, 153));
        rCultivando.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rCultivando.setForeground(new java.awt.Color(0, 0, 102));
        rCultivando.setText("Cultivando o interesse");
        rCultivando.setContentAreaFilled(false);
        rCultivando.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rExplicando.setBackground(new java.awt.Color(255, 255, 153));
        rExplicando.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rExplicando.setForeground(new java.awt.Color(0, 0, 102));
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
        rAjudante.setForeground(new java.awt.Color(0, 0, 102));
        rAjudante.setText("Ajudante");
        rAjudante.setContentAreaFilled(false);
        rAjudante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rDiscurso.setBackground(new java.awt.Color(255, 255, 153));
        rDiscurso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rDiscurso.setForeground(new java.awt.Color(0, 0, 102));
        rDiscurso.setText("Discurso");
        rDiscurso.setContentAreaFilled(false);
        rDiscurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rFazendo.setBackground(new java.awt.Color(255, 255, 153));
        rFazendo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rFazendo.setForeground(new java.awt.Color(0, 0, 102));
        rFazendo.setText("Fazendo discipulos");
        rFazendo.setContentAreaFilled(false);
        rFazendo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rVideo.setBackground(new java.awt.Color(255, 255, 153));
        rVideo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rVideo.setForeground(new java.awt.Color(0, 0, 0));
        rVideo.setText("Consideração da Brochura");
        rVideo.setContentAreaFilled(false);
        rVideo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(rLeituraEstudo)
                            .addGap(113, 113, 113))
                        .addComponent(rEstudoCongregacao)
                        .addComponent(rDiscurso)
                        .addComponent(rNossaVidaCrista)
                        .addComponent(rAjudante))
                    .addComponent(rVideo)
                    .addComponent(rFazendo)
                    .addComponent(rExplicando)
                    .addComponent(rIniciando)
                    .addComponent(rCultivando, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rLeituraBiblia)
                    .addComponent(rJoias)
                    .addComponent(rTesouros)
                    .addComponent(rPresidente)
                    .addComponent(rOracao))
                .addGap(54, 54, 54))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rIniciando)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rCultivando)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rExplicando)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rFazendo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rDiscurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rAjudante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rNossaVidaCrista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rEstudoCongregacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rLeituraEstudo)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        botaoRemover.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        botaoRemover.setForeground(new java.awt.Color(102, 0, 0));
        botaoRemover.setText("Desmarcar Todas opções");
        botaoRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        botaoExcluir.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        botaoExcluir.setForeground(new java.awt.Color(0, 0, 0));
        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/118932_trash_icon.png"))); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(homem)
                                .addGap(61, 61, 61)
                                .addComponent(mulher))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNome)
                                    .addComponent(txtSobrenome)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(116, 116, 116))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(homem)
                            .addComponent(mulher))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(111, 111, 111)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoVoltar)
                            .addComponent(botaoCadastrar)
                            .addComponent(botaoExcluir)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.dispose();
        Janela.irMenu();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMostrarTodosActionPerformed
        limparTela();
        limparTelaCheck();
        mostrarTabela();
    }//GEN-LAST:event_botaoMostrarTodosActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        java.awt.event.FocusEvent evts = null;
        txtCelularFocusGained(evts);

        String valorString = tabela.getValueAt(tabela.getSelectedRow(), 0).toString();
        linha = Integer.parseInt(valorString);
        pessoa = pesDAO.buscarPessoaPorId(linha);
        preencheTela(pessoa);
        preencheCheck(pessoa.getId());
    }//GEN-LAST:event_tabelaMouseClicked

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
        limparTelaCheck();
    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        if (linha >= 0) {
            pesDAO.excluirPorId(linha);
            mostrarTabela();
            Mensagem.mensagemExito(pessoa.getNome() + " " + pessoa.getSobrenome() + " Excluído com Sucesso");
            limparTela();
            limparTelaCheck();
            limparDados();
        } else {
            Mensagem.mensagemErro("Por favor selecione alguém na lista para excluír");
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        try {
            int id = pessoa.getId();
            pDAO.excluirPartesPorIdPessoa(id);

            if (validarCampos()) {
                String sexo = null;
                if (homem.isSelected()) {
                    sexo = "Homem";
                }
                if (mulher.isSelected()) {
                    sexo = "Mulher";
                }
                pessoa.setId(pessoa.getId());
                pessoa.setNome(txtNome.getText());
                pessoa.setSobrenome(txtSobrenome.getText());
                pessoa.setSexo(sexo);
                pessoa.setCelular(txtCelular.getText());
                pessoa.setDataUltima(pessoa.getDataUltima());
                pessoa.setSala(pessoa.getSala());
                pesDAO.atualizarPessoa(pessoa.getId(), pessoa);
                
                jPanel4.setBackground(Color.WHITE);

                definirPartes(pessoa);
                mostrarTabela();
                limparTela();
                limparTelaCheck();
                limparDados();
            }
        } catch (Exception e) {
            Mensagem.mensagemErro("Algo deu errado");
            e.printStackTrace();
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    //Ao clicar em alguem, ajustar o campo celular para receber 10 ou 11 digitos
    private void mostrarNumeroTelefone(String numero) {
        String num = numero.replaceAll("[^0-9]", "");
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
    }

    //Voltar a mascara para o padrão podendo receber um digito a mais
    private void txtCelularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusGained
        try {
            MaskFormatter maskFormatter = new MaskFormatter("(##)#####-####");
            maskFormatter.setValueContainsLiteralCharacters(false);
            txtCelular.setFormatterFactory(new DefaultFormatterFactory(maskFormatter));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_txtCelularFocusGained

    //Ajustar a mascara para receber o digito 9 se tiver
    private void txtCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusLost
        String num = txtCelular.getText().replaceAll("[^0-9]", "");
        int numQtd = num.length();

        try {
            MaskFormatter maskFormatter;
            if (numQtd == 11) {
                maskFormatter = new MaskFormatter("(##)#####-####");
            } else if (numQtd == 10) {
                maskFormatter = new MaskFormatter("(##)####-####");
            } else {
                maskFormatter = new MaskFormatter();
            }
            maskFormatter.setValueContainsLiteralCharacters(false);
            txtCelular.setFormatterFactory(new DefaultFormatterFactory(maskFormatter));
            txtCelular.setText(num);
        } catch (ParseException ex) {
            Logger.getLogger(CadastroParticipantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtCelularFocusLost

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        //limparTela();
        limparTelaCheck();
        List<Pessoa> lista = pesDAO.buscarPorNome(txtPesquisar.getText());
        tab = (DefaultTableModel) tabela.getModel();
        tab.setNumRows(0);

        for (Pessoa a : lista) {
            tab.addRow(new Object[]{
                a.getId(),
                "  " + a.getNome() + " " + a.getSobrenome()
            });
        }
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void definirPartes(Pessoa pessoa) {
        ParteDAO pdao = new ParteDAO();
        if (rOracao.isSelected()) {
            Parte parte = new Parte();
            parte.setDescricao("Oracao");
            parte.setPessoa(pessoa);
            pdao.cadastrar(parte);

            Oracao oracao = new Oracao();
            OracaoDAO oDAO = new OracaoDAO();
            if (!oDAO.verificarExistenciaOracaoPorPessoaId(pessoa.getId())) {
                oracao.setPessoa(pessoa);
                oracao.setData(null);
                oDAO.cadastrar(oracao);
            }
        } else {
            OracaoDAO oDAO = new OracaoDAO();
            if (oDAO.verificarExistenciaOracaoPorPessoaId(pessoa.getId())) {
                oDAO.excluirOracaoPorPessoaId(pessoa.getId());
            }
        }

        if (rPresidente.isSelected()) {
            Parte parte = new Parte();
            parte.setDescricao("Presidente");
            parte.setPessoa(pessoa);
            pdao.cadastrar(parte);

            Presidente presidente = new Presidente();
            PresidenteDAO preDAO = new PresidenteDAO();
            if (!preDAO.verificarExistenciaPresidentePorPessoaId(pessoa.getId())) {
                presidente.setPessoa(pessoa);
                presidente.setSala(null);
                presidente.setData(null);
                preDAO.cadastrar(presidente);
            }
        } else if (!rPresidente.isSelected()) {
            PresidenteDAO preDAO = new PresidenteDAO();
            if (preDAO.verificarExistenciaPresidentePorPessoaId(pessoa.getId())) {
                preDAO.excluirPresidentePorPessoaId(pessoa.getId());
            }
        }

        if (rTesouros.isSelected()) {
            Parte parte = new Parte();
            parte.setDescricao("Tesouros");
            parte.setPessoa(pessoa);
            pdao.cadastrar(parte);

            Tesouros tesouros = new Tesouros();
            TesourosDAO tDAO = new TesourosDAO();
            if (!tDAO.verificarExistenciaTesouroPorPessoaId(pessoa.getId())) {
                tesouros.setPessoa(pessoa);
                tesouros.setData(null);
                tDAO.cadastrar(tesouros);
            }
        } else {
            TesourosDAO tDAO = new TesourosDAO();
            if (tDAO.verificarExistenciaTesouroPorPessoaId(pessoa.getId())) {
                tDAO.excluirTesouroPorPessoaId(pessoa.getId());
            }
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
            if (!congDAO.verificarExistenciaEstudoBiblicoPorPessoaId(pessoa.getId())) {
                estudoCong.setPessoa(pessoa);
                estudoCong.setData(null);
                congDAO.cadastrar(estudoCong);
            }
        } else {
            EstudoBiblicoCongregacaoDAO congDAO = new EstudoBiblicoCongregacaoDAO();
            if (congDAO.verificarExistenciaEstudoBiblicoPorPessoaId(pessoa.getId())) {
                congDAO.excluirEstudoBiblicoPorPessoaId(pessoa.getId());
            }
        }

        if (rLeituraEstudo.isSelected()) {
            Parte parte = new Parte();
            parte.setDescricao("LeituraEstudo");
            parte.setPessoa(pessoa);
            pdao.cadastrar(parte);
            Leitor leitor = new Leitor();
            LeitorDAO leiDAO = new LeitorDAO();
            if (!leiDAO.verificarExistenciaLeitorPorPessoaId(pessoa.getId())) {
                leitor.setPessoa(pessoa);
                leitor.setData(null);
                leiDAO.cadastrar(leitor);
            }
        } else {
            LeitorDAO leiDAO = new LeitorDAO();
            if (leiDAO.verificarExistenciaLeitorPorPessoaId(pessoa.getId())) {
                leiDAO.excluirLeitorPorPessoaId(pessoa.getId());
            }
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

    private void preencheTela(Pessoa a) {
        limparTela();
        if (a.getSexo().equals("Homem")) {
            homem.setSelected(true);
            jPanel4.setBackground(new Color(173, 216, 230));
        }
        if (a.getSexo().equals("Mulher")) {
            mulher.setSelected(true);
            jPanel4.setBackground(new Color(255, 99, 71));
        }
        txtNome.setText(a.getNome());
        txtSobrenome.setText(a.getSobrenome());
        txtCelular.setText(a.getCelular().replaceAll("\\D", ""));
        mostrarNumeroTelefone(txtCelular.getText());//Ajustar para receber o digito se tiver
    }

    private void limparDados() {
        pessoa = null;
        linha = -1;
    }

    private void preencheCheck(int a) {
        limparTelaCheck();
        List<Parte> lista = pDAO.buscarPartesPorIdPessoa(a);
        for (int i = 0; i <= 16; i++) {
            for (Parte s : lista) {
                if (s.getDescricao().equals("Oracao")) {
                    rOracao.setSelected(true);
                }
                if (s.getDescricao().equals("Presidente")) {
                    rPresidente.setSelected(true);
                }
                if (s.getDescricao().equals("Tesouros")) {
                    rTesouros.setSelected(true);
                }
                if (s.getDescricao().equals("Joias")) {
                    rJoias.setSelected(true);
                }
                if (s.getDescricao().equals("LeituraBiblia")) {
                    rLeituraBiblia.setSelected(true);
                }
                if (s.getDescricao().equals("Video")) {
                    rVideo.setSelected(true);
                }
                if (s.getDescricao().equals("Iniciando conversas")) {
                    rIniciando.setSelected(true);
                }
                if (s.getDescricao().equals("Cultivando o interesse")) {
                    rCultivando.setSelected(true);
                }
                if (s.getDescricao().equals("Explicando suas crenças")) {
                    rExplicando.setSelected(true);
                }
                if (s.getDescricao().equals("Fazendo discipulos")) {
                    rFazendo.setSelected(true);
                }
                if (s.getDescricao().equals("Discurso")) {
                    rDiscurso.setSelected(true);
                }
                if (s.getDescricao().equals("Ajudante")) {
                    rAjudante.setSelected(true);
                }
                if (s.getDescricao().equals("NossaVidaCrista")) {
                    rNossaVidaCrista.setSelected(true);
                }
                if (s.getDescricao().equals("EstudoCongregacao")) {
                    rEstudoCongregacao.setSelected(true);
                }
                if (s.getDescricao().equals("LeituraEstudo")) {
                    rLeituraEstudo.setSelected(true);
                }
            }
        }
    }

    private void mostrarTabela() {
        List<Pessoa> lista = pesDAO.buscarTodasPorOrdemAlfabetica();
        tab = (DefaultTableModel) tabela.getModel();
        tab.setNumRows(0);
        contar=0;
        for (Pessoa a : lista) {
            tab.addRow(new Object[]{
                a.getId(),
                "  " + a.getNome() + " " + a.getSobrenome(),
                contar++
            });
        }
        botaoMostrarTodos.setText("Mostrar Todos: " + contar);
    }

    private void limparTela() {
        txtPesquisar.setText(null);
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
            java.util.logging.Logger.getLogger(AlterarParticipantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarParticipantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarParticipantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarParticipantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarParticipantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoMostrarTodos;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton homem;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}
