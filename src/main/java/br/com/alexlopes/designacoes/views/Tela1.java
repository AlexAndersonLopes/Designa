package br.com.alexlopes.designacoes.views;

import br.com.alexlopes.designacoes.dao.EstudoBiblicoCongregacaoDAO;
import br.com.alexlopes.designacoes.dao.JoiasDAO;
import br.com.alexlopes.designacoes.dao.LeitorDAO;
import br.com.alexlopes.designacoes.dao.NossaVidaDAO;
import br.com.alexlopes.designacoes.dao.OracaoDAO;
import br.com.alexlopes.designacoes.dao.PessoaDAO;
import br.com.alexlopes.designacoes.dao.PresidenteDAO;
import br.com.alexlopes.designacoes.dao.SemanaDAO;
import br.com.alexlopes.designacoes.dao.TesourosDAO;
import br.com.alexlopes.designacoes.dao.TodasPartesDAO;
import br.com.alexlopes.designacoes.model.EstudoBiblicoCongregacao;
import br.com.alexlopes.designacoes.model.Joias;
import br.com.alexlopes.designacoes.model.Leitor;
import br.com.alexlopes.designacoes.model.NossaVida;
import br.com.alexlopes.designacoes.model.Oracao;
import br.com.alexlopes.designacoes.model.Pessoa;
import br.com.alexlopes.designacoes.model.Presidente;
import br.com.alexlopes.designacoes.model.Semana;
import br.com.alexlopes.designacoes.model.Tesouros;
import br.com.alexlopes.designacoes.model.TodasPartes;
import br.com.alexlopes.designacoes.util.GerarPDF;
import br.com.alexlopes.designacoes.util.Janela;
import br.com.alexlopes.designacoes.util.Mensagem;
import br.com.alexlopes.designacoes.util.whats.FolhaDesignacao;
import java.awt.Graphics;
import java.awt.Image;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

public class Tela1 extends javax.swing.JFrame {

    private TodasPartes todas;
    private TodasPartesDAO tddao = new TodasPartesDAO();
    private String ano, mes, dia;
    private int linha = 0;
    private LocalDate semanaAtual;
    private LocalDate[] semanas = new LocalDate[5];

    private Presidente presidenteA, presidenteB;
    private Oracao oracaoA, oracaoB;
    private Tesouros tesouros;
    private Joias joias;
    private NossaVida nossaVida1, nossaVida2;
    private EstudoBiblicoCongregacao estudoCong;
    private Leitor leitor;

    private Pessoa leituraBibliaA, leituraBibliaB;
    private Pessoa discursoA, discursoB;
    private Pessoa primeiraA, primeiraB, primeira2A, primeira2B;
    private Pessoa ajudantePrimeiraA, ajudantePrimeiraB, ajudantePrimeira2A, ajudantePrimeira2B;
    private Pessoa revisitaA, revisitaB, revisita2A, revisita2B;
    private Pessoa ajudanteRevisitaA, ajudanteRevisitaB, ajudanteRevisita2A, ajudanteRevisita2B;
    private Pessoa estudoA, estudoB, estudoAjudanteA, estudoAjudanteB;

    private List<LocalDate> segundasFeiras = new ArrayList<>();
    private List<Integer> listaIgnorar = new ArrayList<>();
    private List<Integer> listaIgnorarEstudantes = new ArrayList<>();

    public Tela1() {
        initComponents();
        comboAno.addItem("           ANO");
        comboAno.addItem(String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
        comboAno.addItem(String.valueOf(Calendar.getInstance().get(Calendar.YEAR) + 1));

        panelA.setVisible(false);
        panelA1.setVisible(false);
        listaIgnorar.add(-1);
        listaIgnorarEstudantes.add(-1);
        iniciar();
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
        panelA = new javax.swing.JPanel();
        cTesouros = new javax.swing.JRadioButton();
        cJoias = new javax.swing.JRadioButton();
        cLeituraBiblia = new javax.swing.JRadioButton();
        cPrimeiraConversa = new javax.swing.JRadioButton();
        cPrimeiraConversa1 = new javax.swing.JRadioButton();
        cPrimeiraConversa2 = new javax.swing.JRadioButton();
        cRevisita = new javax.swing.JRadioButton();
        cRevisita1 = new javax.swing.JRadioButton();
        cRevisita2 = new javax.swing.JRadioButton();
        cEstudoBiblico = new javax.swing.JRadioButton();
        cDiscurso = new javax.swing.JRadioButton();
        cNossaVida1 = new javax.swing.JRadioButton();
        cNossaVida2 = new javax.swing.JRadioButton();
        cEstudoCongregacao = new javax.swing.JRadioButton();
        cLeitor = new javax.swing.JRadioButton();
        labelDATA = new javax.swing.JLabel();
        cSalaA = new javax.swing.JRadioButton();
        cSalaAB = new javax.swing.JRadioButton();
        cVideo = new javax.swing.JRadioButton();
        botaoDesignar = new javax.swing.JButton();
        cOracaoFinal = new javax.swing.JRadioButton();
        cOracaoInicial = new javax.swing.JRadioButton();
        cPresidente = new javax.swing.JRadioButton();
        botaoVoltar = new javax.swing.JButton();
        panelA1 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        panelB = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtLeituraBibliaB = new javax.swing.JTextField();
        txtParte1B = new javax.swing.JTextField();
        txtAjudante1B = new javax.swing.JTextField();
        txtParte2B = new javax.swing.JTextField();
        txtAjudante2B = new javax.swing.JTextField();
        txtParte3B = new javax.swing.JTextField();
        txtAjudante3B = new javax.swing.JTextField();
        txtPresidenteB = new javax.swing.JTextField();
        botaoSalvarSemana = new javax.swing.JButton();
        labelPresidente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelOracaoInicial = new javax.swing.JLabel();
        labelTesouros = new javax.swing.JLabel();
        labelJoias = new javax.swing.JLabel();
        labelLeituraBiblia = new javax.swing.JLabel();
        txtPresidente = new javax.swing.JTextField();
        txtOracaoInicial = new javax.swing.JTextField();
        txtTesouros = new javax.swing.JTextField();
        txtJoias = new javax.swing.JTextField();
        txtLeituraBiblia = new javax.swing.JTextField();
        txtParte1 = new javax.swing.JTextField();
        txtAjudante1 = new javax.swing.JTextField();
        txtParte2 = new javax.swing.JTextField();
        labelParte1 = new javax.swing.JLabel();
        labelParte2 = new javax.swing.JLabel();
        txtAjudante2 = new javax.swing.JTextField();
        txtParte3 = new javax.swing.JTextField();
        txtAjudante3 = new javax.swing.JTextField();
        txtCrista1 = new javax.swing.JTextField();
        txtNossaVida2 = new javax.swing.JTextField();
        txtEstudoCongregacao = new javax.swing.JTextField();
        txtLeitor = new javax.swing.JTextField();
        txtOracaoFinal = new javax.swing.JTextField();
        labelAjudante1 = new javax.swing.JLabel();
        labelAjudante2 = new javax.swing.JLabel();
        labelAjudante3 = new javax.swing.JLabel();
        labelParte3 = new javax.swing.JLabel();
        labelNossaVida1 = new javax.swing.JLabel();
        labelNossaVida2 = new javax.swing.JLabel();
        labelEstudoCongregacao = new javax.swing.JLabel();
        labelLeitor = new javax.swing.JLabel();
        labelOracaoFinal = new javax.swing.JLabel();
        comboMes = new javax.swing.JComboBox<>();
        comboAno = new javax.swing.JComboBox<>();
        botaoDefinirData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Designar particpantes para Reunião do Meio de Semana");
        setMaximumSize(new java.awt.Dimension(1352, 675));
        setMinimumSize(new java.awt.Dimension(1352, 675));

        jDesktopPane1.setMaximumSize(new java.awt.Dimension(1352, 675));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(1352, 675));

        panelA.setBackground(new java.awt.Color(204, 204, 204));
        panelA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelA.setPreferredSize(new java.awt.Dimension(678, 602));

        cTesouros.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cTesouros.setForeground(new java.awt.Color(0, 0, 0));
        cTesouros.setText("Tesouros");
        cTesouros.setContentAreaFilled(false);
        cTesouros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cTesouros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cTesourosMouseClicked(evt);
            }
        });

        cJoias.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cJoias.setForeground(new java.awt.Color(0, 0, 0));
        cJoias.setText("Joias");
        cJoias.setContentAreaFilled(false);
        cJoias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cJoias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cJoiasMouseClicked(evt);
            }
        });

        cLeituraBiblia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cLeituraBiblia.setForeground(new java.awt.Color(0, 0, 102));
        cLeituraBiblia.setText("Leitura da Bíblia");
        cLeituraBiblia.setContentAreaFilled(false);
        cLeituraBiblia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cLeituraBiblia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cLeituraBibliaMouseClicked(evt);
            }
        });

        cPrimeiraConversa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cPrimeiraConversa.setForeground(new java.awt.Color(0, 0, 102));
        cPrimeiraConversa.setText("Primeira Conversa");
        cPrimeiraConversa.setContentAreaFilled(false);
        cPrimeiraConversa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cPrimeiraConversa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cPrimeiraConversaMouseClicked(evt);
            }
        });

        cPrimeiraConversa1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cPrimeiraConversa1.setForeground(new java.awt.Color(0, 0, 102));
        cPrimeiraConversa1.setText("Primeira Conversa - 1");
        cPrimeiraConversa1.setContentAreaFilled(false);
        cPrimeiraConversa1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cPrimeiraConversa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cPrimeiraConversa1MouseClicked(evt);
            }
        });

        cPrimeiraConversa2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cPrimeiraConversa2.setForeground(new java.awt.Color(0, 0, 102));
        cPrimeiraConversa2.setText("Primeira Conversa - 2");
        cPrimeiraConversa2.setContentAreaFilled(false);
        cPrimeiraConversa2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cPrimeiraConversa2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cPrimeiraConversa2MouseClicked(evt);
            }
        });

        cRevisita.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cRevisita.setForeground(new java.awt.Color(0, 0, 102));
        cRevisita.setText("Revisita");
        cRevisita.setContentAreaFilled(false);
        cRevisita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cRevisita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cRevisitaMouseClicked(evt);
            }
        });

        cRevisita1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cRevisita1.setForeground(new java.awt.Color(0, 0, 102));
        cRevisita1.setText("Revisita - 1");
        cRevisita1.setContentAreaFilled(false);
        cRevisita1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cRevisita1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cRevisita1MouseClicked(evt);
            }
        });

        cRevisita2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cRevisita2.setForeground(new java.awt.Color(0, 0, 102));
        cRevisita2.setText("Revisita - 2");
        cRevisita2.setContentAreaFilled(false);
        cRevisita2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cRevisita2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cRevisita2MouseClicked(evt);
            }
        });

        cEstudoBiblico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cEstudoBiblico.setForeground(new java.awt.Color(0, 0, 102));
        cEstudoBiblico.setText("Estudo Bíblico");
        cEstudoBiblico.setContentAreaFilled(false);
        cEstudoBiblico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cEstudoBiblico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cEstudoBiblicoMouseClicked(evt);
            }
        });

        cDiscurso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cDiscurso.setForeground(new java.awt.Color(0, 0, 102));
        cDiscurso.setText("Discurso");
        cDiscurso.setContentAreaFilled(false);
        cDiscurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cDiscurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cDiscursoMouseClicked(evt);
            }
        });

        cNossaVida1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cNossaVida1.setForeground(new java.awt.Color(0, 0, 0));
        cNossaVida1.setText("Nossa vida Cristã parte 1");
        cNossaVida1.setContentAreaFilled(false);
        cNossaVida1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cNossaVida1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cNossaVida1MouseClicked(evt);
            }
        });

        cNossaVida2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cNossaVida2.setForeground(new java.awt.Color(0, 0, 0));
        cNossaVida2.setText("Nossa vida Cristã parte 2");
        cNossaVida2.setContentAreaFilled(false);
        cNossaVida2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cNossaVida2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cNossaVida2MouseClicked(evt);
            }
        });

        cEstudoCongregacao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cEstudoCongregacao.setForeground(new java.awt.Color(0, 0, 0));
        cEstudoCongregacao.setText("Estudo Bíblico de Congregação");
        cEstudoCongregacao.setContentAreaFilled(false);
        cEstudoCongregacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cEstudoCongregacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cEstudoCongregacaoMouseClicked(evt);
            }
        });

        cLeitor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cLeitor.setForeground(new java.awt.Color(0, 0, 0));
        cLeitor.setText("Leitor");
        cLeitor.setContentAreaFilled(false);
        cLeitor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cLeitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cLeitorMouseClicked(evt);
            }
        });

        labelDATA.setBackground(new java.awt.Color(255, 255, 255));
        labelDATA.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        labelDATA.setForeground(new java.awt.Color(0, 0, 0));
        labelDATA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDATA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        labelDATA.setOpaque(true);

        buttonGroup1.add(cSalaA);
        cSalaA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cSalaA.setForeground(new java.awt.Color(153, 0, 0));
        cSalaA.setText("Sala A");
        cSalaA.setContentAreaFilled(false);
        cSalaA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cSalaA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cSalaAMouseClicked(evt);
            }
        });

        buttonGroup1.add(cSalaAB);
        cSalaAB.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cSalaAB.setForeground(new java.awt.Color(153, 0, 0));
        cSalaAB.setText("Salas A e B");
        cSalaAB.setContentAreaFilled(false);
        cSalaAB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cSalaAB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cSalaABMouseClicked(evt);
            }
        });

        cVideo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cVideo.setForeground(new java.awt.Color(0, 0, 102));
        cVideo.setText("VÍDEO");
        cVideo.setContentAreaFilled(false);
        cVideo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cVideo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cVideoMouseClicked(evt);
            }
        });

        botaoDesignar.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        botaoDesignar.setForeground(new java.awt.Color(0, 0, 153));
        botaoDesignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/314233_note_list_icon.png"))); // NOI18N
        botaoDesignar.setText("  Designar");
        botaoDesignar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoDesignar.setMaximumSize(new java.awt.Dimension(100, 42));
        botaoDesignar.setMinimumSize(new java.awt.Dimension(100, 42));
        botaoDesignar.setPreferredSize(new java.awt.Dimension(100, 42));
        botaoDesignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDesignarActionPerformed(evt);
            }
        });

        cOracaoFinal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cOracaoFinal.setForeground(new java.awt.Color(0, 0, 0));
        cOracaoFinal.setText("Oração Final");
        cOracaoFinal.setContentAreaFilled(false);
        cOracaoFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cOracaoFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cOracaoFinalMouseClicked(evt);
            }
        });

        cOracaoInicial.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cOracaoInicial.setForeground(new java.awt.Color(0, 0, 0));
        cOracaoInicial.setText("Oração Inicial");
        cOracaoInicial.setContentAreaFilled(false);
        cOracaoInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cOracaoInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cOracaoInicialMouseClicked(evt);
            }
        });

        cPresidente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cPresidente.setForeground(new java.awt.Color(0, 0, 0));
        cPresidente.setText("Presidente");
        cPresidente.setContentAreaFilled(false);
        cPresidente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cPresidente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cPresidenteMouseClicked(evt);
            }
        });

        botaoVoltar.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(102, 0, 0));
        botaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/71124_arrow_back_left_red_icon.png"))); // NOI18N
        botaoVoltar.setText("Voltar");
        botaoVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoVoltar.setMaximumSize(new java.awt.Dimension(71, 42));
        botaoVoltar.setMinimumSize(new java.awt.Dimension(71, 42));
        botaoVoltar.setPreferredSize(new java.awt.Dimension(71, 42));
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelALayout = new javax.swing.GroupLayout(panelA);
        panelA.setLayout(panelALayout);
        panelALayout.setHorizontalGroup(
            panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelALayout.createSequentialGroup()
                        .addComponent(labelDATA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelALayout.createSequentialGroup()
                        .addGap(0, 24, Short.MAX_VALUE)
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelALayout.createSequentialGroup()
                                .addComponent(cSalaA)
                                .addGap(38, 38, 38)
                                .addComponent(cSalaAB)
                                .addGap(242, 242, 242))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelALayout.createSequentialGroup()
                                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoDesignar, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelALayout.createSequentialGroup()
                                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cPresidente)
                                    .addComponent(cOracaoInicial)
                                    .addComponent(cOracaoFinal)
                                    .addComponent(cJoias)
                                    .addComponent(cTesouros)
                                    .addComponent(cVideo)
                                    .addComponent(cLeituraBiblia)
                                    .addGroup(panelALayout.createSequentialGroup()
                                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panelALayout.createSequentialGroup()
                                                .addComponent(cPrimeiraConversa)
                                                .addGap(34, 34, 34)
                                                .addComponent(cPrimeiraConversa1))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelALayout.createSequentialGroup()
                                                .addComponent(cRevisita)
                                                .addGap(118, 118, 118)
                                                .addComponent(cRevisita1))
                                            .addComponent(cEstudoBiblico, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cDiscurso, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cNossaVida1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cNossaVida2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cEstudoCongregacao, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cLeitor, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(30, 30, 30)
                                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cPrimeiraConversa2)
                                            .addComponent(cRevisita2))))
                                .addGap(18, 18, 18))))))
        );
        panelALayout.setVerticalGroup(
            panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDATA, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cSalaA)
                    .addComponent(cSalaAB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cPresidente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cOracaoInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cTesouros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cJoias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cLeituraBiblia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cVideo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cPrimeiraConversa)
                    .addComponent(cPrimeiraConversa1)
                    .addComponent(cPrimeiraConversa2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cRevisita)
                    .addComponent(cRevisita1)
                    .addComponent(cRevisita2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cEstudoBiblico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cDiscurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cNossaVida1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cNossaVida2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cEstudoCongregacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cLeitor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cOracaoFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoDesignar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelA1.setBackground(new java.awt.Color(255, 255, 255));
        panelA1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        panelB.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("SALA B");

        txtLeituraBibliaB.setEditable(false);
        txtLeituraBibliaB.setBackground(new java.awt.Color(255, 255, 255));
        txtLeituraBibliaB.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtLeituraBibliaB.setForeground(new java.awt.Color(0, 0, 102));
        txtLeituraBibliaB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtLeituraBibliaB.setMaximumSize(new java.awt.Dimension(200, 25));
        txtLeituraBibliaB.setMinimumSize(new java.awt.Dimension(200, 25));
        txtLeituraBibliaB.setPreferredSize(new java.awt.Dimension(200, 25));
        txtLeituraBibliaB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLeituraBibliaBMouseClicked(evt);
            }
        });

        txtParte1B.setEditable(false);
        txtParte1B.setBackground(new java.awt.Color(255, 255, 255));
        txtParte1B.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtParte1B.setForeground(new java.awt.Color(0, 0, 102));
        txtParte1B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte1B.setMaximumSize(new java.awt.Dimension(200, 25));
        txtParte1B.setMinimumSize(new java.awt.Dimension(200, 25));
        txtParte1B.setPreferredSize(new java.awt.Dimension(200, 25));
        txtParte1B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte1BMouseClicked(evt);
            }
        });

        txtAjudante1B.setEditable(false);
        txtAjudante1B.setBackground(new java.awt.Color(255, 255, 255));
        txtAjudante1B.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAjudante1B.setForeground(new java.awt.Color(0, 102, 51));
        txtAjudante1B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante1B.setMaximumSize(new java.awt.Dimension(200, 25));
        txtAjudante1B.setMinimumSize(new java.awt.Dimension(200, 25));
        txtAjudante1B.setPreferredSize(new java.awt.Dimension(200, 25));
        txtAjudante1B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante1BMouseClicked(evt);
            }
        });

        txtParte2B.setEditable(false);
        txtParte2B.setBackground(new java.awt.Color(255, 255, 255));
        txtParte2B.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtParte2B.setForeground(new java.awt.Color(0, 0, 102));
        txtParte2B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte2B.setMaximumSize(new java.awt.Dimension(200, 25));
        txtParte2B.setMinimumSize(new java.awt.Dimension(200, 25));
        txtParte2B.setPreferredSize(new java.awt.Dimension(200, 25));
        txtParte2B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte2BMouseClicked(evt);
            }
        });

        txtAjudante2B.setEditable(false);
        txtAjudante2B.setBackground(new java.awt.Color(255, 255, 255));
        txtAjudante2B.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAjudante2B.setForeground(new java.awt.Color(0, 102, 51));
        txtAjudante2B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante2B.setMaximumSize(new java.awt.Dimension(200, 25));
        txtAjudante2B.setMinimumSize(new java.awt.Dimension(200, 25));
        txtAjudante2B.setPreferredSize(new java.awt.Dimension(200, 25));
        txtAjudante2B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante2BMouseClicked(evt);
            }
        });

        txtParte3B.setEditable(false);
        txtParte3B.setBackground(new java.awt.Color(255, 255, 255));
        txtParte3B.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtParte3B.setForeground(new java.awt.Color(0, 0, 102));
        txtParte3B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte3B.setMaximumSize(new java.awt.Dimension(200, 25));
        txtParte3B.setMinimumSize(new java.awt.Dimension(200, 25));
        txtParte3B.setPreferredSize(new java.awt.Dimension(200, 25));
        txtParte3B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte3BMouseClicked(evt);
            }
        });

        txtAjudante3B.setEditable(false);
        txtAjudante3B.setBackground(new java.awt.Color(255, 255, 255));
        txtAjudante3B.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAjudante3B.setForeground(new java.awt.Color(0, 102, 51));
        txtAjudante3B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante3B.setMaximumSize(new java.awt.Dimension(200, 25));
        txtAjudante3B.setMinimumSize(new java.awt.Dimension(200, 25));
        txtAjudante3B.setPreferredSize(new java.awt.Dimension(200, 25));
        txtAjudante3B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante3BMouseClicked(evt);
            }
        });

        txtPresidenteB.setEditable(false);
        txtPresidenteB.setBackground(new java.awt.Color(255, 255, 255));
        txtPresidenteB.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtPresidenteB.setForeground(new java.awt.Color(0, 0, 0));
        txtPresidenteB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtPresidenteB.setMaximumSize(new java.awt.Dimension(200, 25));
        txtPresidenteB.setMinimumSize(new java.awt.Dimension(200, 25));
        txtPresidenteB.setPreferredSize(new java.awt.Dimension(200, 25));
        txtPresidenteB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPresidenteBMouseClicked(evt);
            }
        });

        botaoSalvarSemana.setBackground(new java.awt.Color(0, 204, 204));
        botaoSalvarSemana.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        botaoSalvarSemana.setForeground(new java.awt.Color(0, 0, 0));
        botaoSalvarSemana.setText("Salvar Semana");
        botaoSalvarSemana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSalvarSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarSemanaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBLayout = new javax.swing.GroupLayout(panelB);
        panelB.setLayout(panelBLayout);
        panelBLayout.setHorizontalGroup(
            panelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(71, 71, 71))
            .addGroup(panelBLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPresidenteB, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAjudante3B, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtParte3B, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAjudante2B, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtParte2B, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAjudante1B, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtParte1B, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLeituraBibliaB, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvarSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelBLayout.setVerticalGroup(
            panelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addComponent(txtPresidenteB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(txtLeituraBibliaB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtParte1B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAjudante1B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtParte2B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAjudante2B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtParte3B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAjudante3B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSalvarSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jDesktopPane2.setLayer(panelB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        labelPresidente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelPresidente.setForeground(new java.awt.Color(0, 0, 0));
        labelPresidente.setText("Presidente:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("SALA A");

        labelOracaoInicial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelOracaoInicial.setForeground(new java.awt.Color(0, 0, 0));
        labelOracaoInicial.setText("Oração Inicial:");

        labelTesouros.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelTesouros.setForeground(new java.awt.Color(0, 0, 0));
        labelTesouros.setText("Tesouros:");

        labelJoias.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelJoias.setForeground(new java.awt.Color(0, 0, 0));
        labelJoias.setText("Joias Espirituais:");

        labelLeituraBiblia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelLeituraBiblia.setForeground(new java.awt.Color(0, 0, 102));
        labelLeituraBiblia.setText("Leitura da Bíblia:");

        txtPresidente.setEditable(false);
        txtPresidente.setBackground(new java.awt.Color(255, 255, 255));
        txtPresidente.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtPresidente.setForeground(new java.awt.Color(0, 0, 0));
        txtPresidente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtPresidente.setMaximumSize(new java.awt.Dimension(200, 25));
        txtPresidente.setMinimumSize(new java.awt.Dimension(200, 25));
        txtPresidente.setPreferredSize(new java.awt.Dimension(200, 25));
        txtPresidente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPresidenteMouseClicked(evt);
            }
        });

        txtOracaoInicial.setEditable(false);
        txtOracaoInicial.setBackground(new java.awt.Color(255, 255, 255));
        txtOracaoInicial.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtOracaoInicial.setForeground(new java.awt.Color(0, 0, 0));
        txtOracaoInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtOracaoInicial.setMaximumSize(new java.awt.Dimension(200, 25));
        txtOracaoInicial.setMinimumSize(new java.awt.Dimension(200, 25));
        txtOracaoInicial.setPreferredSize(new java.awt.Dimension(200, 25));
        txtOracaoInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOracaoInicialMouseClicked(evt);
            }
        });

        txtTesouros.setEditable(false);
        txtTesouros.setBackground(new java.awt.Color(255, 255, 255));
        txtTesouros.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtTesouros.setForeground(new java.awt.Color(0, 0, 0));
        txtTesouros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTesouros.setMaximumSize(new java.awt.Dimension(200, 25));
        txtTesouros.setMinimumSize(new java.awt.Dimension(200, 25));
        txtTesouros.setPreferredSize(new java.awt.Dimension(200, 25));
        txtTesouros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTesourosMouseClicked(evt);
            }
        });

        txtJoias.setEditable(false);
        txtJoias.setBackground(new java.awt.Color(255, 255, 255));
        txtJoias.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtJoias.setForeground(new java.awt.Color(0, 0, 0));
        txtJoias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtJoias.setMaximumSize(new java.awt.Dimension(200, 25));
        txtJoias.setMinimumSize(new java.awt.Dimension(200, 25));
        txtJoias.setPreferredSize(new java.awt.Dimension(200, 25));
        txtJoias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtJoiasMouseClicked(evt);
            }
        });

        txtLeituraBiblia.setEditable(false);
        txtLeituraBiblia.setBackground(new java.awt.Color(255, 255, 255));
        txtLeituraBiblia.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtLeituraBiblia.setForeground(new java.awt.Color(0, 0, 102));
        txtLeituraBiblia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtLeituraBiblia.setMaximumSize(new java.awt.Dimension(200, 25));
        txtLeituraBiblia.setMinimumSize(new java.awt.Dimension(200, 25));
        txtLeituraBiblia.setPreferredSize(new java.awt.Dimension(200, 25));
        txtLeituraBiblia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLeituraBibliaMouseClicked(evt);
            }
        });

        txtParte1.setEditable(false);
        txtParte1.setBackground(new java.awt.Color(255, 255, 255));
        txtParte1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtParte1.setForeground(new java.awt.Color(0, 0, 102));
        txtParte1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte1.setMaximumSize(new java.awt.Dimension(200, 25));
        txtParte1.setMinimumSize(new java.awt.Dimension(200, 25));
        txtParte1.setPreferredSize(new java.awt.Dimension(200, 25));
        txtParte1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte1MouseClicked(evt);
            }
        });

        txtAjudante1.setEditable(false);
        txtAjudante1.setBackground(new java.awt.Color(255, 255, 255));
        txtAjudante1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAjudante1.setForeground(new java.awt.Color(0, 102, 51));
        txtAjudante1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante1.setMaximumSize(new java.awt.Dimension(200, 25));
        txtAjudante1.setMinimumSize(new java.awt.Dimension(200, 25));
        txtAjudante1.setPreferredSize(new java.awt.Dimension(200, 25));
        txtAjudante1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante1MouseClicked(evt);
            }
        });

        txtParte2.setEditable(false);
        txtParte2.setBackground(new java.awt.Color(255, 255, 255));
        txtParte2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtParte2.setForeground(new java.awt.Color(0, 0, 102));
        txtParte2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte2.setMaximumSize(new java.awt.Dimension(200, 25));
        txtParte2.setMinimumSize(new java.awt.Dimension(200, 25));
        txtParte2.setPreferredSize(new java.awt.Dimension(200, 25));
        txtParte2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte2MouseClicked(evt);
            }
        });

        labelParte1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelParte1.setForeground(new java.awt.Color(0, 0, 102));
        labelParte1.setText("Parte 1");

        labelParte2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelParte2.setForeground(new java.awt.Color(0, 0, 102));
        labelParte2.setText("Parte 2");

        txtAjudante2.setEditable(false);
        txtAjudante2.setBackground(new java.awt.Color(255, 255, 255));
        txtAjudante2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAjudante2.setForeground(new java.awt.Color(0, 102, 51));
        txtAjudante2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante2.setMaximumSize(new java.awt.Dimension(200, 25));
        txtAjudante2.setPreferredSize(new java.awt.Dimension(200, 25));
        txtAjudante2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante2MouseClicked(evt);
            }
        });

        txtParte3.setEditable(false);
        txtParte3.setBackground(new java.awt.Color(255, 255, 255));
        txtParte3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtParte3.setForeground(new java.awt.Color(0, 0, 102));
        txtParte3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte3.setMaximumSize(new java.awt.Dimension(200, 25));
        txtParte3.setMinimumSize(new java.awt.Dimension(200, 25));
        txtParte3.setPreferredSize(new java.awt.Dimension(200, 25));
        txtParte3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte3MouseClicked(evt);
            }
        });

        txtAjudante3.setEditable(false);
        txtAjudante3.setBackground(new java.awt.Color(255, 255, 255));
        txtAjudante3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAjudante3.setForeground(new java.awt.Color(0, 102, 51));
        txtAjudante3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante3.setMaximumSize(new java.awt.Dimension(200, 25));
        txtAjudante3.setMinimumSize(new java.awt.Dimension(200, 25));
        txtAjudante3.setPreferredSize(new java.awt.Dimension(200, 25));
        txtAjudante3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante3MouseClicked(evt);
            }
        });

        txtCrista1.setEditable(false);
        txtCrista1.setBackground(new java.awt.Color(255, 255, 255));
        txtCrista1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtCrista1.setForeground(new java.awt.Color(0, 0, 0));
        txtCrista1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCrista1.setMaximumSize(new java.awt.Dimension(200, 25));
        txtCrista1.setMinimumSize(new java.awt.Dimension(200, 25));
        txtCrista1.setPreferredSize(new java.awt.Dimension(200, 25));
        txtCrista1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCrista1MouseClicked(evt);
            }
        });

        txtNossaVida2.setEditable(false);
        txtNossaVida2.setBackground(new java.awt.Color(255, 255, 255));
        txtNossaVida2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtNossaVida2.setForeground(new java.awt.Color(0, 0, 0));
        txtNossaVida2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtNossaVida2.setMaximumSize(new java.awt.Dimension(200, 25));
        txtNossaVida2.setMinimumSize(new java.awt.Dimension(200, 25));
        txtNossaVida2.setPreferredSize(new java.awt.Dimension(200, 25));
        txtNossaVida2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNossaVida2MouseClicked(evt);
            }
        });

        txtEstudoCongregacao.setEditable(false);
        txtEstudoCongregacao.setBackground(new java.awt.Color(255, 255, 255));
        txtEstudoCongregacao.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtEstudoCongregacao.setForeground(new java.awt.Color(0, 0, 0));
        txtEstudoCongregacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEstudoCongregacao.setMaximumSize(new java.awt.Dimension(200, 25));
        txtEstudoCongregacao.setMinimumSize(new java.awt.Dimension(200, 25));
        txtEstudoCongregacao.setPreferredSize(new java.awt.Dimension(200, 25));
        txtEstudoCongregacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEstudoCongregacaoMouseClicked(evt);
            }
        });

        txtLeitor.setEditable(false);
        txtLeitor.setBackground(new java.awt.Color(255, 255, 255));
        txtLeitor.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtLeitor.setForeground(new java.awt.Color(0, 0, 0));
        txtLeitor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtLeitor.setMaximumSize(new java.awt.Dimension(200, 25));
        txtLeitor.setMinimumSize(new java.awt.Dimension(200, 25));
        txtLeitor.setPreferredSize(new java.awt.Dimension(200, 25));
        txtLeitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLeitorMouseClicked(evt);
            }
        });

        txtOracaoFinal.setEditable(false);
        txtOracaoFinal.setBackground(new java.awt.Color(255, 255, 255));
        txtOracaoFinal.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtOracaoFinal.setForeground(new java.awt.Color(0, 0, 0));
        txtOracaoFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtOracaoFinal.setMaximumSize(new java.awt.Dimension(200, 25));
        txtOracaoFinal.setMinimumSize(new java.awt.Dimension(200, 25));
        txtOracaoFinal.setPreferredSize(new java.awt.Dimension(200, 25));
        txtOracaoFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOracaoFinalMouseClicked(evt);
            }
        });

        labelAjudante1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelAjudante1.setForeground(new java.awt.Color(0, 102, 51));
        labelAjudante1.setText("Ajudante:");

        labelAjudante2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelAjudante2.setForeground(new java.awt.Color(0, 102, 51));
        labelAjudante2.setText("Ajudante:");

        labelAjudante3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelAjudante3.setForeground(new java.awt.Color(0, 102, 51));
        labelAjudante3.setText("Ajudante:");

        labelParte3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelParte3.setForeground(new java.awt.Color(0, 0, 102));
        labelParte3.setText("Parte 3");

        labelNossaVida1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelNossaVida1.setForeground(new java.awt.Color(0, 0, 0));
        labelNossaVida1.setText("Nossa Vida Cristã parte 1:");

        labelNossaVida2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelNossaVida2.setForeground(new java.awt.Color(0, 0, 0));
        labelNossaVida2.setText("Nossa Vida Cristã parte 2:");

        labelEstudoCongregacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelEstudoCongregacao.setForeground(new java.awt.Color(0, 0, 0));
        labelEstudoCongregacao.setText("Estudo Bíb. Congregação:");

        labelLeitor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelLeitor.setForeground(new java.awt.Color(0, 0, 0));
        labelLeitor.setText("Leitor:");

        labelOracaoFinal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelOracaoFinal.setForeground(new java.awt.Color(0, 0, 0));
        labelOracaoFinal.setText("Oração Final:");

        javax.swing.GroupLayout panelA1Layout = new javax.swing.GroupLayout(panelA1);
        panelA1.setLayout(panelA1Layout);
        panelA1Layout.setHorizontalGroup(
            panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelA1Layout.createSequentialGroup()
                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelA1Layout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelA1Layout.createSequentialGroup()
                                .addComponent(labelTesouros)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTesouros, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelA1Layout.createSequentialGroup()
                                .addComponent(labelJoias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtJoias, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelA1Layout.createSequentialGroup()
                                .addComponent(labelLeituraBiblia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLeituraBiblia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelA1Layout.createSequentialGroup()
                                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelParte1)
                                    .addComponent(labelAjudante1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAjudante1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtParte1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelA1Layout.createSequentialGroup()
                                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelParte2)
                                    .addComponent(labelAjudante2)
                                    .addComponent(labelAjudante3)
                                    .addComponent(labelParte3)
                                    .addComponent(labelNossaVida1)
                                    .addComponent(labelNossaVida2)
                                    .addComponent(labelEstudoCongregacao)
                                    .addComponent(labelLeitor)
                                    .addComponent(labelOracaoFinal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAjudante2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtParte2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtParte3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAjudante3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCrista1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNossaVida2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEstudoCongregacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtLeitor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtOracaoFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panelA1Layout.createSequentialGroup()
                                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelOracaoInicial, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelPresidente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPresidente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtOracaoInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(12, 12, 12))
                    .addGroup(panelA1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelA1Layout.setVerticalGroup(
            panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelA1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPresidente)
                    .addComponent(txtPresidente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOracaoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOracaoInicial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTesouros, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTesouros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJoias, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelJoias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLeituraBiblia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLeituraBiblia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParte1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelParte1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAjudante1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAjudante1))
                .addGap(18, 18, 18)
                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParte2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelParte2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAjudante2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAjudante2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParte3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelParte3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAjudante3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAjudante3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCrista1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNossaVida1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNossaVida2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNossaVida2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstudoCongregacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEstudoCongregacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLeitor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOracaoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOracaoFinal))
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(jDesktopPane2)
        );

        comboMes.setBackground(new java.awt.Color(255, 255, 255));
        comboMes.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        comboMes.setForeground(new java.awt.Color(0, 0, 0));
        comboMes.setMaximumRowCount(13);
        comboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "            MÊS", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        comboMes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        comboAno.setBackground(new java.awt.Color(255, 255, 255));
        comboAno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        comboAno.setForeground(new java.awt.Color(0, 0, 0));
        comboAno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        botaoDefinirData.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        botaoDefinirData.setText("Definir Data");
        botaoDefinirData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoDefinirData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDefinirDataActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(panelA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(panelA1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(comboMes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(comboAno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(botaoDefinirData, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(comboAno, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(botaoDefinirData, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoDefinirData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboAno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelA, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE))
                    .addComponent(panelA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoDefinirDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDefinirDataActionPerformed
        linha = 0;
        limparTelaListas();
        segundasFeiras.clear();
        if (comboMes.getSelectedIndex() != 0) {
            if (comboAno.getSelectedIndex() != 0) {
                verData();
            } else {
                Mensagem.mensagemAlerta("Selecione o Ano");
            }
        } else {
            Mensagem.mensagemAlerta("Selecione o Mês");
        }
    }//GEN-LAST:event_botaoDefinirDataActionPerformed

    private void botaoDesignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDesignarActionPerformed
        if (cSalaA.isSelected()) {
            panelA1.setVisible(true);
            //CONFERIR OS CAMPOS SELECIONADOS
            conferirSelecionados();
            preencherSalaA();

        } else if (cSalaAB.isSelected()) {
            panelA1.setVisible(true);
            //CONFERIR OS CAMPOS SELECIONADOS
            conferirSelecionados();
            preencherSalaAB();

        } else if (!cSalaA.isSelected() && !cSalaAB.isSelected()) {
            Mensagem.mensagemAlerta("Selecione a sala para Designar");
        }
    }//GEN-LAST:event_botaoDesignarActionPerformed

    private void preencherSalaA() {
        PresidenteDAO preDAO = new PresidenteDAO();
        Pessoa pessoa;
        PessoaDAO pDAO = new PessoaDAO();

        if (cPresidente.isSelected() && txtPresidente.getText().isEmpty()) {
            presidenteA = preDAO.buscarPresidenteAntigoFezParteNaSala_B();
            if (presidenteA == null) {
                presidenteA = preDAO.buscarPresidenteAntigoFezParteNaSala_A();
                pessoa = pDAO.buscarPessoaPorId(presidenteA.getPessoa().getId());
                txtPresidente.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
                listaIgnorar.add(presidenteA.getPessoa().getId());
            } else {
                pessoa = pDAO.buscarPessoaPorId(presidenteA.getPessoa().getId());
                txtPresidente.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
                listaIgnorar.add(presidenteA.getPessoa().getId());
            }
        }
        if (cOracaoInicial.isSelected() && txtOracaoInicial.getText().isEmpty()) {
            OracaoDAO oDAO = new OracaoDAO();
            oracaoA = oDAO.buscarOracaoSemDataMaisAntigaParaPessoas(listaIgnorar);
            pessoa = pDAO.buscarPessoaPorId(oracaoA.getPessoa().getId());
            txtOracaoInicial.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
            listaIgnorar.add(oracaoA.getPessoa().getId());
        }
        if (cOracaoFinal.isSelected() && txtOracaoFinal.getText().isEmpty()) {
            OracaoDAO oDAO = new OracaoDAO();
            oracaoB = oDAO.buscarOracaoSemDataMaisAntigaParaPessoas(listaIgnorar);
            if (oracaoB == null) {
                oracaoB = oDAO.buscarOracaoSemDataMaisAntigaParaPessoas2();
            }
            pessoa = pDAO.buscarPessoaPorId(oracaoB.getPessoa().getId());
            txtOracaoFinal.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
            listaIgnorar.add(oracaoB.getPessoa().getId());
        }
        if (cTesouros.isSelected() && txtTesouros.getText().isEmpty()) {
            TesourosDAO tDAO = new TesourosDAO();
            tesouros = tDAO.buscarTesouroSemDataMaisAntigaParaPessoas(listaIgnorar);
            if (tesouros == null) {
                tesouros = tDAO.buscarTesouroSemDataMaisAntigaParaPessoas2();
            }
            pessoa = pDAO.buscarPessoaPorId(tesouros.getPessoa().getId());
            txtTesouros.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
            listaIgnorar.add(tesouros.getPessoa().getId());
        }
        if (cJoias.isSelected() && txtJoias.getText().isEmpty()) {
            JoiasDAO jDAO = new JoiasDAO();
            joias = jDAO.buscarJoiaSemDataMaisAntigaParaPessoas(listaIgnorar);
            if (joias == null) {
                joias = jDAO.buscarJoiaSemDataMaisAntigaParaPessoas2();
            }
            pessoa = pDAO.buscarPessoaPorId(joias.getPessoa().getId());
            txtJoias.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
            listaIgnorar.add(joias.getPessoa().getId());
        }
        if (cLeituraBiblia.isSelected() && txtLeituraBiblia.getText().isEmpty()) {
            leituraBibliaA = pDAO.buscarPessoaComCondicoes("LeituraBiblia", null, listaIgnorarEstudantes);
            txtLeituraBiblia.setText(leituraBibliaA.getNome() + " " + leituraBibliaA.getSobrenome());
            listaIgnorarEstudantes.add(leituraBibliaA.getId());
        }
        if (cNossaVida1.isSelected() && txtCrista1.getText().isEmpty()) {
            NossaVidaDAO vidaDAO = new NossaVidaDAO();
            nossaVida1 = vidaDAO.buscarNossaVidaSemDataMaisAntigaParaPessoas(listaIgnorar);
            if (nossaVida1 == null) {
                nossaVida1 = vidaDAO.buscarNossaVidaSemDataMaisAntigaParaPessoas2();
            }
            pessoa = pDAO.buscarPessoaPorId(nossaVida1.getPessoa().getId());
            txtCrista1.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
            listaIgnorar.add(nossaVida1.getPessoa().getId());
        }
        if (cNossaVida2.isSelected() && txtNossaVida2.getText().isEmpty()) {
            NossaVidaDAO vidaDAO = new NossaVidaDAO();
            nossaVida2 = vidaDAO.buscarNossaVidaSemDataMaisAntigaParaPessoas(listaIgnorar);
            if (nossaVida2 == null) {
                nossaVida2 = vidaDAO.buscarNossaVidaSemDataMaisAntigaParaPessoas2();
            }
            pessoa = pDAO.buscarPessoaPorId(nossaVida2.getPessoa().getId());
            txtNossaVida2.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
            listaIgnorar.add(nossaVida2.getPessoa().getId());
        }
        if (cEstudoCongregacao.isSelected() && txtEstudoCongregacao.getText().isEmpty()) {
            EstudoBiblicoCongregacaoDAO congDAO = new EstudoBiblicoCongregacaoDAO();
            estudoCong = congDAO.buscarEstudoBiblicoCongregacaoSemDataMaisAntigaParaPessoas(listaIgnorar);
            if (estudoCong == null) {
                estudoCong = congDAO.buscarEstudoBiblicoCongregacaoSemDataMaisAntigaParaPessoas2();
            }
            pessoa = pDAO.buscarPessoaPorId(estudoCong.getPessoa().getId());
            txtEstudoCongregacao.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
            listaIgnorar.add(estudoCong.getPessoa().getId());
        }
        if (cLeitor.isSelected() && txtLeitor.getText().isEmpty()) {
            LeitorDAO leiDAO = new LeitorDAO();
            leitor = leiDAO.buscarLeitorSemDataMaisAntigaParaPessoas(listaIgnorar);
            if (leitor == null) {
                leitor = leiDAO.buscarLeitorSemDataMaisAntigaParaPessoas2();
            }
            pessoa = pDAO.buscarPessoaPorId(leitor.getPessoa().getId());
            txtLeitor.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
            listaIgnorar.add(leitor.getPessoa().getId());
        }
        if (cDiscurso.isSelected() && txtParte3.getText().isEmpty()) {
            discursoA = pDAO.buscarPessoaComCondicoes("Discurso", null, listaIgnorarEstudantes);
            if (discursoA == null) {
                discursoA = pDAO.buscarPessoaComCondicoes2("Discurso", null);
            }
            txtParte3.setText(discursoA.getNome() + " " + discursoA.getSobrenome());
            listaIgnorarEstudantes.add(discursoA.getId());
        }
        if (cPrimeiraConversa.isSelected() && txtParte1.getText().isEmpty() && !cVideo.isSelected()) {
            primeiraA = pDAO.buscarPessoaComCondicoes("PrimeiraConversa", null, listaIgnorarEstudantes);
            if (primeiraA == null) {
                primeiraA = pDAO.buscarPessoaComCondicoes2("PrimeiraConversa", null);
            }
            txtParte1.setText(primeiraA.getNome() + " " + primeiraA.getSobrenome());
            listaIgnorarEstudantes.add(primeiraA.getId());

            ajudantePrimeiraA = pDAO.buscarPessoaComCondicoesAjudante("Ajudante", primeiraA.getSexo(), listaIgnorarEstudantes, primeiraA.getAjudante());
            if (ajudantePrimeiraA == null) {
                ajudantePrimeiraA = pDAO.buscarPessoaComCondicoes2("Ajudante", primeiraA.getSexo());
            }
            txtAjudante1.setText(ajudantePrimeiraA.getNome() + " " + ajudantePrimeiraA.getSobrenome());
            listaIgnorarEstudantes.add(ajudantePrimeiraA.getId());
        }
        if (cPrimeiraConversa.isSelected() && txtParte2.getText().isEmpty() && cVideo.isSelected()) {
            primeiraA = pDAO.buscarPessoaComCondicoes("PrimeiraConversa", null, listaIgnorarEstudantes);
            if (primeiraA == null) {
                primeiraA = pDAO.buscarPessoaComCondicoes2("PrimeiraConversa", null);
            }
            txtParte2.setText(primeiraA.getNome() + " " + primeiraA.getSobrenome());
            listaIgnorarEstudantes.add(primeiraA.getId());

            ajudantePrimeiraA = pDAO.buscarPessoaComCondicoesAjudante("Ajudante", primeiraA.getSexo(), listaIgnorarEstudantes, primeiraA.getAjudante());
            if (ajudantePrimeiraA == null) {
                ajudantePrimeiraA = pDAO.buscarPessoaComCondicoes2("Ajudante", primeiraA.getSexo());
            }
            txtAjudante2.setText(ajudantePrimeiraA.getNome() + " " + ajudantePrimeiraA.getSobrenome());
            listaIgnorarEstudantes.add(ajudantePrimeiraA.getId());
        }
        if (cPrimeiraConversa1.isSelected() && txtParte2.getText().isEmpty()) {
            primeiraA = pDAO.buscarPessoaComCondicoes("PrimeiraConversa", null, listaIgnorarEstudantes);
            if (primeiraA == null) {
                primeiraA = pDAO.buscarPessoaComCondicoes2("PrimeiraConversa", null);
            }
            txtParte2.setText(primeiraA.getNome() + " " + primeiraA.getSobrenome());
            listaIgnorarEstudantes.add(primeiraA.getId());

            ajudantePrimeiraA = pDAO.buscarPessoaComCondicoesAjudante("Ajudante", primeiraA.getSexo(), listaIgnorarEstudantes, primeiraA.getAjudante());
            if (ajudantePrimeiraA == null) {
                ajudantePrimeiraA = pDAO.buscarPessoaComCondicoes2("Ajudante", primeiraA.getSexo());
            }
            txtAjudante2.setText(ajudantePrimeiraA.getNome() + " " + ajudantePrimeiraA.getSobrenome());
            listaIgnorarEstudantes.add(ajudantePrimeiraA.getId());
        }
        if (cPrimeiraConversa2.isSelected() && txtParte3.getText().isEmpty()) {
            primeira2A = pDAO.buscarPessoaComCondicoes("PrimeiraConversa", null, listaIgnorarEstudantes);
            if (primeira2A == null) {
                primeira2A = pDAO.buscarPessoaComCondicoes2("PrimeiraConversa", null);
            }
            txtParte3.setText(primeira2A.getNome() + " " + primeira2A.getSobrenome());
            listaIgnorarEstudantes.add(primeira2A.getId());

            ajudantePrimeira2A = pDAO.buscarPessoaComCondicoesAjudante("Ajudante", primeira2A.getSexo(), listaIgnorarEstudantes, primeira2A.getAjudante());
            if (ajudantePrimeira2A == null) {
                ajudantePrimeira2A = pDAO.buscarPessoaComCondicoes2("Ajudante", primeira2A.getSexo());
            }
            txtAjudante3.setText(ajudantePrimeira2A.getNome() + " " + ajudantePrimeira2A.getSobrenome());
            listaIgnorarEstudantes.add(ajudantePrimeira2A.getId());
        }

        if (cRevisita.isSelected() && txtParte2.getText().isEmpty() && !cVideo.isSelected()) {
            revisitaA = pDAO.buscarPessoaComCondicoes("Revisita", null, listaIgnorarEstudantes);
            if (revisitaA == null) {
                revisitaA = pDAO.buscarPessoaComCondicoes2("Revisita", null);
            }
            txtParte2.setText(revisitaA.getNome() + " " + revisitaA.getSobrenome());
            listaIgnorarEstudantes.add(revisitaA.getId());

            ajudanteRevisitaA = pDAO.buscarPessoaComCondicoesAjudante("Ajudante", revisitaA.getSexo(), listaIgnorarEstudantes, revisitaA.getAjudante());
            if (ajudanteRevisitaA == null) {
                ajudanteRevisitaA = pDAO.buscarPessoaComCondicoes2("Ajudante", revisitaA.getSexo());
            }
            txtAjudante2.setText(ajudanteRevisitaA.getNome() + " " + ajudanteRevisitaA.getSobrenome());
            listaIgnorarEstudantes.add(ajudanteRevisitaA.getId());
        }
        if (cRevisita.isSelected() && txtParte3.getText().isEmpty() && cVideo.isSelected() && cPrimeiraConversa.isSelected()) {
            revisitaA = pDAO.buscarPessoaComCondicoes("Revisita", null, listaIgnorarEstudantes);
            if (revisitaA == null) {
                revisitaA = pDAO.buscarPessoaComCondicoes2("Revisita", null);
            }
            txtParte3.setText(revisitaA.getNome() + " " + revisitaA.getSobrenome());
            listaIgnorarEstudantes.add(revisitaA.getId());

            ajudanteRevisitaA = pDAO.buscarPessoaComCondicoesAjudante("Ajudante", revisitaA.getSexo(), listaIgnorarEstudantes, revisitaA.getAjudante());
            if (ajudanteRevisitaA == null) {
                ajudanteRevisitaA = pDAO.buscarPessoaComCondicoes2("Ajudante", revisitaA.getSexo());
            }
            txtAjudante3.setText(ajudanteRevisitaA.getNome() + " " + ajudanteRevisitaA.getSobrenome());
            listaIgnorarEstudantes.add(ajudanteRevisitaA.getId());
        }
        if (cRevisita.isSelected() && txtParte2.getText().isEmpty() && cVideo.isSelected() && !cPrimeiraConversa.isSelected()) {
            revisitaA = pDAO.buscarPessoaComCondicoes("Revisita", null, listaIgnorarEstudantes);
            if (revisitaA == null) {
                revisitaA = pDAO.buscarPessoaComCondicoes2("Revisita", null);
            }
            txtParte2.setText(revisitaA.getNome() + " " + revisitaA.getSobrenome());
            listaIgnorarEstudantes.add(revisitaA.getId());

            ajudanteRevisitaA = pDAO.buscarPessoaComCondicoesAjudante("Ajudante", revisitaA.getSexo(), listaIgnorarEstudantes, revisitaA.getAjudante());
            if (ajudanteRevisitaA == null) {
                ajudanteRevisitaA = pDAO.buscarPessoaComCondicoes2("Ajudante", revisitaA.getSexo());
            }
            txtAjudante2.setText(ajudanteRevisitaA.getNome() + " " + ajudanteRevisitaA.getSobrenome());
            listaIgnorarEstudantes.add(ajudanteRevisitaA.getId());
        }
        if (cRevisita1.isSelected() && txtParte2.getText().isEmpty()) {
            revisitaA = pDAO.buscarPessoaComCondicoes("Revisita", null, listaIgnorarEstudantes);
            if (revisitaA == null) {
                revisitaA = pDAO.buscarPessoaComCondicoes2("Revisita", null);
            }
            txtParte2.setText(revisitaA.getNome() + " " + revisitaA.getSobrenome());
            listaIgnorarEstudantes.add(revisitaA.getId());

            ajudanteRevisitaA = pDAO.buscarPessoaComCondicoesAjudante("Ajudante", revisitaA.getSexo(), listaIgnorarEstudantes, revisitaA.getAjudante());
            if (ajudanteRevisitaA == null) {
                ajudanteRevisitaA = pDAO.buscarPessoaComCondicoes2("Ajudante", revisitaA.getSexo());
            }
            txtAjudante2.setText(ajudanteRevisitaA.getNome() + " " + ajudanteRevisitaA.getSobrenome());
            listaIgnorarEstudantes.add(ajudanteRevisitaA.getId());
        }
        if (cRevisita2.isSelected() && txtParte3.getText().isEmpty()) {
            revisita2A = pDAO.buscarPessoaComCondicoes("Revisita", null, listaIgnorarEstudantes);
            if (revisita2A == null) {
                revisita2A = pDAO.buscarPessoaComCondicoes2("Revisita", null);
            }
            txtParte3.setText(revisita2A.getNome() + " " + revisita2A.getSobrenome());
            listaIgnorarEstudantes.add(revisita2A.getId());

            ajudanteRevisita2A = pDAO.buscarPessoaComCondicoesAjudante("Ajudante", revisita2A.getSexo(), listaIgnorarEstudantes, revisita2A.getAjudante());
            if (ajudanteRevisita2A == null) {
                ajudanteRevisita2A = pDAO.buscarPessoaComCondicoes2("Ajudante", revisita2A.getSexo());
            }
            txtAjudante3.setText(ajudanteRevisita2A.getNome() + " " + ajudanteRevisita2A.getSobrenome());
            listaIgnorarEstudantes.add(ajudanteRevisita2A.getId());
        }
        if (cEstudoBiblico.isSelected() && txtParte3.getText().isEmpty()) {
            estudoA = pDAO.buscarPessoaComCondicoes("EstudoBiblico", null, listaIgnorarEstudantes);
            if (estudoA == null) {
                estudoA = pDAO.buscarPessoaComCondicoes2("EstudoBiblico", null);
            }
            txtParte3.setText(estudoA.getNome() + " " + estudoA.getSobrenome());
            listaIgnorarEstudantes.add(estudoA.getId());

            estudoAjudanteA = pDAO.buscarPessoaComCondicoesAjudante("Ajudante", estudoA.getSexo(), listaIgnorarEstudantes, estudoA.getAjudante());
            if (estudoAjudanteA == null) {
                estudoAjudanteA = pDAO.buscarPessoaComCondicoes2("Ajudante", estudoA.getSexo());
            }
            txtAjudante3.setText(estudoAjudanteA.getNome() + " " + estudoAjudanteA.getSobrenome());
            listaIgnorarEstudantes.add(estudoAjudanteA.getId());
        }
    }

    private void preencherSalaAB() {
        PresidenteDAO preDAO = new PresidenteDAO();
        Pessoa pessoa;
        PessoaDAO pDAO = new PessoaDAO();

        if (cPresidente.isSelected() && txtPresidente.getText().isEmpty()) {
            presidenteA = preDAO.buscarPresidenteAntigoFezParteNaSala_B();
            if (presidenteA == null) {
                presidenteA = preDAO.buscarPresidenteAntigoFezParteNaSala_A();
                pessoa = pDAO.buscarPessoaPorId(presidenteA.getPessoa().getId());
                txtPresidente.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
                listaIgnorar.add(presidenteA.getPessoa().getId());
            } else {
                pessoa = pDAO.buscarPessoaPorId(presidenteA.getPessoa().getId());
                txtPresidente.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
                listaIgnorar.add(presidenteA.getPessoa().getId());
            }
        }
        if (cPresidente.isSelected() && txtPresidenteB.getText().isEmpty()) {
            //Definir o presidente da sala B
            presidenteB = preDAO.buscarPresidenteAntigoFezParteNaSala_A(presidenteA.getId());
            pessoa = pDAO.buscarPessoaPorId(presidenteB.getPessoa().getId());
            txtPresidenteB.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
            listaIgnorar.add(presidenteB.getPessoa().getId());
        } //PRESIDENTE PARA SALA A
        if (cOracaoInicial.isSelected() && txtOracaoInicial.getText().isEmpty()) {
            OracaoDAO oDAO = new OracaoDAO();
            oracaoA = oDAO.buscarOracaoSemDataMaisAntigaParaPessoas(listaIgnorar);
            if (oracaoA == null) {
                oracaoA = oDAO.buscarOracaoSemDataMaisAntigaParaPessoas2();
            }
            pessoa = pDAO.buscarPessoaPorId(oracaoA.getPessoa().getId());
            txtOracaoInicial.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
            listaIgnorar.add(oracaoA.getPessoa().getId());
        }
        if (cOracaoFinal.isSelected() && txtOracaoFinal.getText().isEmpty()) {
            OracaoDAO oDAO = new OracaoDAO();
            oracaoB = oDAO.buscarOracaoSemDataMaisAntigaParaPessoas(listaIgnorar);
            if (oracaoB == null) {
                oracaoB = oDAO.buscarOracaoSemDataMaisAntigaParaPessoas2();
            }
            pessoa = pDAO.buscarPessoaPorId(oracaoB.getPessoa().getId());
            txtOracaoFinal.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
            listaIgnorar.add(oracaoB.getPessoa().getId());
        }
        if (cTesouros.isSelected() && txtTesouros.getText().isEmpty()) {
            TesourosDAO tDAO = new TesourosDAO();
            tesouros = tDAO.buscarTesouroSemDataMaisAntigaParaPessoas(listaIgnorar);
            if (tesouros == null) {
                tesouros = tDAO.buscarTesouroSemDataMaisAntigaParaPessoas2();
            }
            pessoa = pDAO.buscarPessoaPorId(tesouros.getPessoa().getId());
            txtTesouros.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
            listaIgnorar.add(tesouros.getPessoa().getId());
        }
        if (cJoias.isSelected() && txtJoias.getText().isEmpty()) {
            JoiasDAO jDAO = new JoiasDAO();
            joias = jDAO.buscarJoiaSemDataMaisAntigaParaPessoas(listaIgnorar);
            if (joias == null) {
                joias = jDAO.buscarJoiaSemDataMaisAntigaParaPessoas2();
            }
            pessoa = pDAO.buscarPessoaPorId(joias.getPessoa().getId());
            txtJoias.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
            listaIgnorar.add(joias.getPessoa().getId());
        }
        if (cNossaVida1.isSelected() && txtCrista1.getText().isEmpty()) {
            NossaVidaDAO vidaDAO = new NossaVidaDAO();
            nossaVida1 = vidaDAO.buscarNossaVidaSemDataMaisAntigaParaPessoas(listaIgnorar);
            if (nossaVida1 == null) {
                nossaVida1 = vidaDAO.buscarNossaVidaSemDataMaisAntigaParaPessoas2();
            }
            pessoa = pDAO.buscarPessoaPorId(nossaVida1.getPessoa().getId());
            txtCrista1.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
            listaIgnorar.add(nossaVida1.getPessoa().getId());
        }
        if (cNossaVida2.isSelected() && txtNossaVida2.getText().isEmpty()) {
            NossaVidaDAO vidaDAO = new NossaVidaDAO();
            nossaVida2 = vidaDAO.buscarNossaVidaSemDataMaisAntigaParaPessoas(listaIgnorar);
            if (nossaVida2 == null) {
                nossaVida2 = vidaDAO.buscarNossaVidaSemDataMaisAntigaParaPessoas2();
            }
            pessoa = pDAO.buscarPessoaPorId(nossaVida2.getPessoa().getId());
            txtNossaVida2.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
            listaIgnorar.add(nossaVida2.getPessoa().getId());
        }
        if (cEstudoCongregacao.isSelected() && txtEstudoCongregacao.getText().isEmpty()) {
            EstudoBiblicoCongregacaoDAO congDAO = new EstudoBiblicoCongregacaoDAO();
            estudoCong = congDAO.buscarEstudoBiblicoCongregacaoSemDataMaisAntigaParaPessoas(listaIgnorar);
            if (estudoCong == null) {
                estudoCong = congDAO.buscarEstudoBiblicoCongregacaoSemDataMaisAntigaParaPessoas2();
            }
            pessoa = pDAO.buscarPessoaPorId(estudoCong.getPessoa().getId());
            txtEstudoCongregacao.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
            listaIgnorar.add(estudoCong.getPessoa().getId());
        }
        if (cLeitor.isSelected() && txtLeitor.getText().isEmpty()) {
            LeitorDAO leiDAO = new LeitorDAO();
            leitor = leiDAO.buscarLeitorSemDataMaisAntigaParaPessoas(listaIgnorar);
            if (leitor == null) {
                leitor = leiDAO.buscarLeitorSemDataMaisAntigaParaPessoas2();
            }
            pessoa = pDAO.buscarPessoaPorId(leitor.getPessoa().getId());
            txtLeitor.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
            listaIgnorar.add(leitor.getPessoa().getId());
        }
        if (cLeituraBiblia.isSelected() && txtLeituraBiblia.getText().isEmpty()) {
            //SALA A
            leituraBibliaA = pDAO.buscarPessoaComCondicoesSalaB("LeituraBiblia", null, listaIgnorarEstudantes, "SalaA");
            if (leituraBibliaA == null) {
                leituraBibliaA = pDAO.buscarPessoaComCondicoesSalaB2("LeituraBiblia", null);
            }
            txtLeituraBiblia.setText(leituraBibliaA.getNome() + " " + leituraBibliaA.getSobrenome());
            listaIgnorarEstudantes.add(leituraBibliaA.getId());
        }
        if (cLeituraBiblia.isSelected() && txtLeituraBibliaB.getText().isEmpty()) {
            //SALA B
            leituraBibliaB = pDAO.buscarPessoaComCondicoesSalaB("LeituraBiblia", null, listaIgnorarEstudantes, "SalaB");
            if (leituraBibliaB == null) {
                leituraBibliaB = pDAO.buscarPessoaComCondicoesSalaB2("LeituraBiblia", null);
            }
            txtLeituraBibliaB.setText(leituraBibliaB.getNome() + " " + leituraBibliaB.getSobrenome());
            listaIgnorarEstudantes.add(leituraBibliaB.getId());
        }
        if (cDiscurso.isSelected() && txtParte3.getText().isEmpty()) {
            //SALA A
            discursoA = pDAO.buscarPessoaComCondicoesSalaB("Discurso", null, listaIgnorarEstudantes, "SalaA");
            if (discursoA == null) {
                discursoA = pDAO.buscarPessoaComCondicoesSalaB2("Discurso", null);
            }
            txtParte3.setText(discursoA.getNome() + " " + discursoA.getSobrenome());
            listaIgnorarEstudantes.add(discursoA.getId());
        }
        if (cDiscurso.isSelected() && txtParte3B.getText().isEmpty()) {
            //SALA B
            discursoB = pDAO.buscarPessoaComCondicoesSalaB("Discurso", null, listaIgnorarEstudantes, "SalaB");
            if (discursoB == null) {
                discursoB = pDAO.buscarPessoaComCondicoesSalaB2("Discurso", null);
            }
            txtParte3B.setText(discursoB.getNome() + " " + discursoB.getSobrenome());
            listaIgnorarEstudantes.add(discursoB.getId());
        }
        if (cPrimeiraConversa.isSelected() && txtParte1.getText().isEmpty() && !cVideo.isSelected()) {
            //SALA A
            primeiraA = pDAO.buscarPessoaComCondicoesSalaB("PrimeiraConversa", null, listaIgnorarEstudantes, "SalaA");
            if (primeiraA == null) {
                primeiraA = pDAO.buscarPessoaComCondicoesSalaB2("PrimeiraConversa", null);
            }
            txtParte1.setText(primeiraA.getNome() + " " + primeiraA.getSobrenome());
            listaIgnorarEstudantes.add(primeiraA.getId());

            ajudantePrimeiraA = pDAO.buscarPessoaComCondicoes2("Ajudante", primeiraA.getSexo(), listaIgnorarEstudantes, primeiraA.getAjudante(), "SalaA");
            if (ajudantePrimeiraA == null) {
                ajudantePrimeiraA = pDAO.buscarPessoaComCondicoes3("Ajudante", primeiraA.getSexo());
            }
            txtAjudante1.setText(ajudantePrimeiraA.getNome() + " " + ajudantePrimeiraA.getSobrenome());
            listaIgnorarEstudantes.add(ajudantePrimeiraA.getId());
        }
        if (cPrimeiraConversa.isSelected() && txtParte2.getText().isEmpty() && cVideo.isSelected()) {
            //SALA A
            primeiraA = pDAO.buscarPessoaComCondicoesSalaB("PrimeiraConversa", null, listaIgnorarEstudantes, "SalaA");
            if (primeiraA == null) {
                primeiraA = pDAO.buscarPessoaComCondicoesSalaB2("PrimeiraConversa", null);
            }
            txtParte2.setText(primeiraA.getNome() + " " + primeiraA.getSobrenome());
            listaIgnorarEstudantes.add(primeiraA.getId());

            ajudantePrimeiraA = pDAO.buscarPessoaComCondicoes2("Ajudante", primeiraA.getSexo(), listaIgnorarEstudantes, primeiraA.getAjudante(), "SalaA");
            if (ajudantePrimeiraA == null) {
                ajudantePrimeiraA = pDAO.buscarPessoaComCondicoes3("Ajudante", primeiraA.getSexo());
            }
            txtAjudante2.setText(ajudantePrimeiraA.getNome() + " " + ajudantePrimeiraA.getSobrenome());
            listaIgnorarEstudantes.add(ajudantePrimeiraA.getId());
        }
        if (cPrimeiraConversa.isSelected() && txtParte1B.getText().isEmpty() && !cVideo.isSelected()) {
            //SALA B
            primeiraB = pDAO.buscarPessoaComCondicoesSalaB("PrimeiraConversa", null, listaIgnorarEstudantes, "SalaB");
            if (primeiraB == null) {
                primeiraB = pDAO.buscarPessoaComCondicoesSalaB2("PrimeiraConversa", null);
            }
            txtParte1B.setText(primeiraB.getNome() + " " + primeiraB.getSobrenome());
            listaIgnorarEstudantes.add(primeiraB.getId());

            ajudantePrimeiraB = pDAO.buscarPessoaComCondicoes2("Ajudante", primeiraB.getSexo(), listaIgnorarEstudantes, primeiraB.getAjudante(), "SalaB");
            if (ajudantePrimeiraB == null) {
                ajudantePrimeiraB = pDAO.buscarPessoaComCondicoes3("Ajudante", primeiraB.getSexo());
            }
            txtAjudante1B.setText(ajudantePrimeiraB.getNome() + " " + ajudantePrimeiraB.getSobrenome());
            listaIgnorarEstudantes.add(ajudantePrimeiraB.getId());
        }
        if (cPrimeiraConversa.isSelected() && txtParte2B.getText().isEmpty() && cVideo.isSelected()) {
            //SALA B
            primeiraB = pDAO.buscarPessoaComCondicoesSalaB("PrimeiraConversa", null, listaIgnorarEstudantes, "SalaB");
            if (primeiraB == null) {
                primeiraB = pDAO.buscarPessoaComCondicoesSalaB2("PrimeiraConversa", null);
            }
            txtParte2B.setText(primeiraB.getNome() + " " + primeiraB.getSobrenome());
            listaIgnorarEstudantes.add(primeiraB.getId());

            ajudantePrimeiraB = pDAO.buscarPessoaComCondicoes2("Ajudante", primeiraB.getSexo(), listaIgnorarEstudantes, primeiraB.getAjudante(), "SalaB");
            if (ajudantePrimeiraB == null) {
                ajudantePrimeiraB = pDAO.buscarPessoaComCondicoes3("Ajudante", primeiraB.getSexo());
            }
            txtAjudante2B.setText(ajudantePrimeiraB.getNome() + " " + ajudantePrimeiraB.getSobrenome());
            listaIgnorarEstudantes.add(ajudantePrimeiraB.getId());
        }
        if (cPrimeiraConversa1.isSelected() && txtParte2.getText().isEmpty()) {
            //SALA A
            primeiraA = pDAO.buscarPessoaComCondicoesSalaB("PrimeiraConversa", null, listaIgnorarEstudantes, "SalaA");
            if (primeiraA == null) {
                primeiraA = pDAO.buscarPessoaComCondicoesSalaB2("PrimeiraConversa", null);
            }
            txtParte2.setText(primeiraA.getNome() + " " + primeiraA.getSobrenome());
            listaIgnorarEstudantes.add(primeiraA.getId());

            ajudantePrimeiraA = pDAO.buscarPessoaComCondicoes2("Ajudante", primeiraA.getSexo(), listaIgnorarEstudantes, primeiraA.getAjudante(), "SalaA");
            if (ajudantePrimeiraA == null) {
                ajudantePrimeiraA = pDAO.buscarPessoaComCondicoes3("Ajudante", primeiraA.getSexo());
            }
            txtAjudante2.setText(ajudantePrimeiraA.getNome() + " " + ajudantePrimeiraA.getSobrenome());
            listaIgnorarEstudantes.add(ajudantePrimeiraA.getId());
        }
        if (cPrimeiraConversa1.isSelected() && txtParte2B.getText().isEmpty()) {
            //SALA B
            primeiraB = pDAO.buscarPessoaComCondicoesSalaB("PrimeiraConversa", null, listaIgnorarEstudantes, "SalaB");
            if (primeiraB == null) {
                primeiraB = pDAO.buscarPessoaComCondicoesSalaB2("PrimeiraConversa", null);
            }
            txtParte2B.setText(primeiraB.getNome() + " " + primeiraB.getSobrenome());
            listaIgnorarEstudantes.add(primeiraB.getId());

            ajudantePrimeiraB = pDAO.buscarPessoaComCondicoes2("Ajudante", primeiraB.getSexo(), listaIgnorarEstudantes, primeiraB.getAjudante(), "SalaB");
            if (ajudantePrimeiraB == null) {
                ajudantePrimeiraB = pDAO.buscarPessoaComCondicoes3("Ajudante", primeiraB.getSexo());
            }
            txtAjudante2B.setText(ajudantePrimeiraB.getNome() + " " + ajudantePrimeiraB.getSobrenome());
            listaIgnorarEstudantes.add(ajudantePrimeiraB.getId());
        }
        if (cPrimeiraConversa2.isSelected() && txtParte3.getText().isEmpty()) {
            //SALA A
            primeira2A = pDAO.buscarPessoaComCondicoesSalaB("PrimeiraConversa", null, listaIgnorarEstudantes, "SalaA");
            if (primeira2A == null) {
                primeira2A = pDAO.buscarPessoaComCondicoesSalaB2("PrimeiraConversa", null);
            }
            txtParte3.setText(primeira2A.getNome() + " " + primeira2A.getSobrenome());
            listaIgnorarEstudantes.add(primeira2A.getId());

            ajudantePrimeira2A = pDAO.buscarPessoaComCondicoes2("Ajudante", primeira2A.getSexo(), listaIgnorarEstudantes, primeira2A.getAjudante(), "SalaA");
            if (ajudantePrimeira2A == null) {
                ajudantePrimeira2A = pDAO.buscarPessoaComCondicoes3("Ajudante", primeira2A.getSexo());
            }
            txtAjudante3.setText(ajudantePrimeira2A.getNome() + " " + ajudantePrimeira2A.getSobrenome());
            listaIgnorarEstudantes.add(ajudantePrimeira2A.getId());
        }
        if (cPrimeiraConversa2.isSelected() && txtParte3B.getText().isEmpty()) {
            //SALA B
            primeira2B = pDAO.buscarPessoaComCondicoesSalaB("PrimeiraConversa", null, listaIgnorarEstudantes, "SalaB");
            if (primeira2B == null) {
                primeira2B = pDAO.buscarPessoaComCondicoesSalaB2("PrimeiraConversa", null);
            }
            txtParte3B.setText(primeira2B.getNome() + " " + primeira2B.getSobrenome());
            listaIgnorarEstudantes.add(primeira2B.getId());

            ajudantePrimeira2B = pDAO.buscarPessoaComCondicoes2("Ajudante", primeira2B.getSexo(), listaIgnorarEstudantes, primeira2B.getAjudante(), "SalaB");
            if (ajudantePrimeira2B == null) {
                ajudantePrimeira2B = pDAO.buscarPessoaComCondicoes3("Ajudante", primeira2B.getSexo());
            }
            txtAjudante3B.setText(ajudantePrimeira2B.getNome() + " " + ajudantePrimeira2B.getSobrenome());
            listaIgnorarEstudantes.add(ajudantePrimeira2B.getId());
        }
        if (cRevisita.isSelected() && txtParte2.getText().isEmpty() && !cVideo.isSelected()) {
            //SALA A
            revisitaA = pDAO.buscarPessoaComCondicoesSalaB("Revisita", null, listaIgnorarEstudantes, "SalaA");
            if (revisitaA == null) {
                revisitaA = pDAO.buscarPessoaComCondicoesSalaB2("Revisita", null);
            }
            txtParte2.setText(revisitaA.getNome() + " " + revisitaA.getSobrenome());
            listaIgnorarEstudantes.add(revisitaA.getId());

            ajudanteRevisitaA = pDAO.buscarPessoaComCondicoes2("Ajudante", revisitaA.getSexo(), listaIgnorarEstudantes, revisitaA.getAjudante(), "SalaA");
            if (ajudanteRevisitaA == null) {
                ajudanteRevisitaA = pDAO.buscarPessoaComCondicoes3("Ajudante", revisitaA.getSexo());
            }
            txtAjudante2.setText(ajudanteRevisitaA.getNome() + " " + ajudanteRevisitaA.getSobrenome());
            listaIgnorarEstudantes.add(ajudanteRevisitaA.getId());
        }
        if (cRevisita.isSelected() && txtParte2B.getText().isEmpty() && !cVideo.isSelected()) {
            //SALA B
            revisitaB = pDAO.buscarPessoaComCondicoesSalaB("Revisita", null, listaIgnorarEstudantes, "SalaB");
            if (revisitaB == null) {
                revisitaB = pDAO.buscarPessoaComCondicoesSalaB2("Revisita", null);
            }
            txtParte2B.setText(revisitaB.getNome() + " " + revisitaB.getSobrenome());
            listaIgnorarEstudantes.add(revisitaB.getId());

            ajudanteRevisitaB = pDAO.buscarPessoaComCondicoes2("Ajudante", revisitaB.getSexo(), listaIgnorarEstudantes, revisitaB.getAjudante(), "SalaB");
            if (ajudanteRevisitaB == null) {
                ajudanteRevisitaB = pDAO.buscarPessoaComCondicoes3("Ajudante", revisitaB.getSexo());
            }
            txtAjudante2B.setText(ajudanteRevisitaB.getNome() + " " + ajudanteRevisitaB.getSobrenome());
            listaIgnorarEstudantes.add(ajudanteRevisitaB.getId());
        }
        if (cRevisita.isSelected() && txtParte3.getText().isEmpty() && cVideo.isSelected() && cPrimeiraConversa.isSelected()) {
            //SALA A
            revisitaA = pDAO.buscarPessoaComCondicoesSalaB("Revisita", null, listaIgnorarEstudantes, "SalaA");
            if (revisitaA == null) {
                revisitaA = pDAO.buscarPessoaComCondicoesSalaB2("Revisita", null);
            }
            txtParte3.setText(revisitaA.getNome() + " " + revisitaA.getSobrenome());
            listaIgnorarEstudantes.add(revisitaA.getId());

            ajudanteRevisitaA = pDAO.buscarPessoaComCondicoes2("Ajudante", revisitaA.getSexo(), listaIgnorarEstudantes, revisitaA.getAjudante(), "SalaA");
            if (ajudanteRevisitaA == null) {
                ajudanteRevisitaA = pDAO.buscarPessoaComCondicoes3("Ajudante", revisitaA.getSexo());
            }
            txtAjudante3.setText(ajudanteRevisitaA.getNome() + " " + ajudanteRevisitaA.getSobrenome());
            listaIgnorarEstudantes.add(ajudanteRevisitaA.getId());
        }
        if (cRevisita.isSelected() && txtParte3B.getText().isEmpty() && cVideo.isSelected() && cPrimeiraConversa.isSelected()) {
            //SALA B
            revisitaB = pDAO.buscarPessoaComCondicoesSalaB("Revisita", null, listaIgnorarEstudantes, "SalaB");
            if (revisitaB == null) {
                revisitaB = pDAO.buscarPessoaComCondicoesSalaB2("Revisita", null);
            }
            txtParte3B.setText(revisitaB.getNome() + " " + revisitaB.getSobrenome());
            listaIgnorarEstudantes.add(revisitaB.getId());

            ajudanteRevisitaB = pDAO.buscarPessoaComCondicoes2("Ajudante", revisitaB.getSexo(), listaIgnorarEstudantes, revisitaB.getAjudante(), "SalaB");
            if (ajudanteRevisitaB == null) {
                ajudanteRevisitaB = pDAO.buscarPessoaComCondicoes3("Ajudante", revisitaB.getSexo());
            }
            txtAjudante3B.setText(ajudanteRevisitaB.getNome() + " " + ajudanteRevisitaB.getSobrenome());
            listaIgnorarEstudantes.add(ajudanteRevisitaB.getId());
        }

        if (cRevisita.isSelected() && txtParte2.getText().isEmpty() && cVideo.isSelected() && !cPrimeiraConversa.isSelected()) {
            //SALA A
            revisitaA = pDAO.buscarPessoaComCondicoesSalaB("Revisita", null, listaIgnorarEstudantes, "SalaA");
            if (revisitaA == null) {
                revisitaA = pDAO.buscarPessoaComCondicoesSalaB2("Revisita", null);
            }
            txtParte2.setText(revisitaA.getNome() + " " + revisitaA.getSobrenome());
            listaIgnorarEstudantes.add(revisitaA.getId());

            ajudanteRevisitaA = pDAO.buscarPessoaComCondicoes2("Ajudante", revisitaA.getSexo(), listaIgnorarEstudantes, revisitaA.getAjudante(), "SalaA");
            if (ajudanteRevisitaA == null) {
                ajudanteRevisitaA = pDAO.buscarPessoaComCondicoes3("Ajudante", revisitaA.getSexo());
            }
            txtAjudante2.setText(ajudanteRevisitaA.getNome() + " " + ajudanteRevisitaA.getSobrenome());
            listaIgnorarEstudantes.add(ajudanteRevisitaA.getId());
        }
        if (cRevisita.isSelected() && txtParte2B.getText().isEmpty() && cVideo.isSelected() && !cPrimeiraConversa.isSelected()) {
            //SALA B
            revisitaB = pDAO.buscarPessoaComCondicoesSalaB("Revisita", null, listaIgnorarEstudantes, "SalaB");
            if (revisitaB == null) {
                revisitaB = pDAO.buscarPessoaComCondicoesSalaB2("Revisita", null);
            }
            txtParte2B.setText(revisitaB.getNome() + " " + revisitaB.getSobrenome());
            listaIgnorarEstudantes.add(revisitaB.getId());

            ajudanteRevisitaB = pDAO.buscarPessoaComCondicoes2("Ajudante", revisitaB.getSexo(), listaIgnorarEstudantes, revisitaB.getAjudante(), "SalaB");
            if (ajudanteRevisitaB == null) {
                ajudanteRevisitaB = pDAO.buscarPessoaComCondicoes3("Ajudante", revisitaB.getSexo());
            }
            txtAjudante2B.setText(ajudanteRevisitaB.getNome() + " " + ajudanteRevisitaB.getSobrenome());
            listaIgnorarEstudantes.add(ajudanteRevisitaB.getId());
        }
        if (cRevisita1.isSelected() && txtParte2.getText().isEmpty()) {
            //SALA A
            revisitaA = pDAO.buscarPessoaComCondicoesSalaB("Revisita", null, listaIgnorarEstudantes, "SalaA");
            if (revisitaA == null) {
                revisitaA = pDAO.buscarPessoaComCondicoesSalaB2("Revisita", null);
            }
            txtParte2.setText(revisitaA.getNome() + " " + revisitaA.getSobrenome());
            listaIgnorarEstudantes.add(revisitaA.getId());

            ajudanteRevisitaA = pDAO.buscarPessoaComCondicoes2("Ajudante", revisitaA.getSexo(), listaIgnorarEstudantes, revisitaA.getAjudante(), "SalaA");
            if (ajudanteRevisitaA == null) {
                ajudanteRevisitaA = pDAO.buscarPessoaComCondicoes3("Ajudante", revisitaA.getSexo());
            }
            txtAjudante2.setText(ajudanteRevisitaA.getNome() + " " + ajudanteRevisitaA.getSobrenome());
            listaIgnorarEstudantes.add(ajudanteRevisitaA.getId());
        }
        if (cRevisita1.isSelected() && txtParte2B.getText().isEmpty()) {
            //SALA B
            revisitaB = pDAO.buscarPessoaComCondicoesSalaB("Revisita", null, listaIgnorarEstudantes, "SalaB");
            if (revisitaB == null) {
                revisitaB = pDAO.buscarPessoaComCondicoesSalaB2("Revisita", null);
            }
            txtParte2B.setText(revisitaB.getNome() + " " + revisitaB.getSobrenome());
            listaIgnorarEstudantes.add(revisitaB.getId());

            ajudanteRevisitaB = pDAO.buscarPessoaComCondicoes2("Ajudante", revisitaB.getSexo(), listaIgnorarEstudantes, revisitaB.getAjudante(), "SalaB");
            if (ajudanteRevisitaB == null) {
                ajudanteRevisitaB = pDAO.buscarPessoaComCondicoes3("Ajudante", revisitaB.getSexo());
            }
            txtAjudante2B.setText(ajudanteRevisitaB.getNome() + " " + ajudanteRevisitaB.getSobrenome());
            listaIgnorarEstudantes.add(ajudanteRevisitaB.getId());
        }
        if (cRevisita2.isSelected() && txtParte3.getText().isEmpty()) {
            //SALA A
            revisita2A = pDAO.buscarPessoaComCondicoesSalaB("Revisita", null, listaIgnorarEstudantes, "SalaA");
            if (revisita2A == null) {
                revisita2A = pDAO.buscarPessoaComCondicoesSalaB2("Revisita", null);
            }
            txtParte3.setText(revisita2A.getNome() + " " + revisita2A.getSobrenome());
            listaIgnorarEstudantes.add(revisita2A.getId());

            ajudanteRevisita2A = pDAO.buscarPessoaComCondicoes2("Ajudante", revisita2A.getSexo(), listaIgnorarEstudantes, revisita2A.getAjudante(), "SalaA");
            if (ajudanteRevisita2A == null) {
                ajudanteRevisita2A = pDAO.buscarPessoaComCondicoes3("Ajudante", revisita2A.getSexo());
            }
            txtAjudante3.setText(ajudanteRevisita2A.getNome() + " " + ajudanteRevisita2A.getSobrenome());
            listaIgnorarEstudantes.add(ajudanteRevisita2A.getId());
        }
        if (cRevisita2.isSelected() && txtParte3B.getText().isEmpty()) {
            //SALA B
            revisita2B = pDAO.buscarPessoaComCondicoesSalaB("Revisita", null, listaIgnorarEstudantes, "SalaB");
            if (revisita2B == null) {
                revisita2B = pDAO.buscarPessoaComCondicoesSalaB2("Revisita", null);
            }
            txtParte3B.setText(revisita2B.getNome() + " " + revisita2B.getSobrenome());
            listaIgnorarEstudantes.add(revisita2B.getId());

            ajudanteRevisita2B = pDAO.buscarPessoaComCondicoes2("Ajudante", revisita2B.getSexo(), listaIgnorarEstudantes, revisita2B.getAjudante(), "SalaB");
            if (ajudanteRevisita2B == null) {
                ajudanteRevisita2B = pDAO.buscarPessoaComCondicoes3("Ajudante", revisita2B.getSexo());
            }
            txtAjudante3B.setText(ajudanteRevisita2B.getNome() + " " + ajudanteRevisita2B.getSobrenome());
            listaIgnorarEstudantes.add(ajudanteRevisita2B.getId());
        }
        if (cEstudoBiblico.isSelected() && txtParte3.getText().isEmpty()) {
            //SALA A
            estudoA = pDAO.buscarPessoaComCondicoesSalaB("EstudoBiblico", null, listaIgnorarEstudantes, "SalaA");
            if (estudoA == null) {
                estudoA = pDAO.buscarPessoaComCondicoesSalaB2("EstudoBiblico", null);
            }
            txtParte3.setText(estudoA.getNome() + " " + estudoA.getSobrenome());
            listaIgnorarEstudantes.add(estudoA.getId());

            estudoAjudanteA = pDAO.buscarPessoaComCondicoes2("Ajudante", estudoA.getSexo(), listaIgnorarEstudantes, estudoA.getAjudante(), "SalaA");
            if (estudoAjudanteA == null) {
                estudoAjudanteA = pDAO.buscarPessoaComCondicoes3("Ajudante", estudoA.getSexo());
            }
            txtAjudante3.setText(estudoAjudanteA.getNome() + " " + estudoAjudanteA.getSobrenome());
            listaIgnorarEstudantes.add(estudoAjudanteA.getId());
        }
        if (cEstudoBiblico.isSelected() && txtParte3B.getText().isEmpty()) {
            //SALA B
            estudoB = pDAO.buscarPessoaComCondicoesSalaB("EstudoBiblico", null, listaIgnorarEstudantes, "SalaB");
            if (estudoB == null) {
                estudoB = pDAO.buscarPessoaComCondicoesSalaB2("EstudoBiblico", null);
            }
            txtParte3B.setText(estudoB.getNome() + " " + estudoB.getSobrenome());
            listaIgnorarEstudantes.add(estudoB.getId());

            estudoAjudanteB = pDAO.buscarPessoaComCondicoes2("Ajudante", estudoB.getSexo(), listaIgnorarEstudantes, estudoB.getAjudante(), "SalaB");
            if (estudoAjudanteB == null) {
                estudoAjudanteB = pDAO.buscarPessoaComCondicoes3("Ajudante", estudoB.getSexo());
            }
            txtAjudante3B.setText(estudoAjudanteB.getNome() + " " + estudoAjudanteB.getSobrenome());
            listaIgnorarEstudantes.add(estudoAjudanteB.getId());
        }
    }


    private void botaoSalvarSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarSemanaActionPerformed
        try {
            Janela.ag = null;
            Janela.irAguarde();
            Janela.ag.botao.setText("Aguarde");
            Janela.ag.botao.setEnabled(false);

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        // Cadastrar na tabela do banco de dados: SEMANA
                        cadastrarSemana();

                        // Cadastrar cada parte no BD
                        salvarAlterar();

                        // SALVAR NA CLASSE TODAS AS PARTES
                        salvarTodasPartes();

                        // Salvar em arquivo .pdf
                        salvarPdf();

                        // Enviar ZAP
                        enviarZap();

                        // Limpar Tela e Listas
                        limparTelaListas();

                        // Verificar se há mais segundas-feiras a processar
                        verificarSegundas();

                        // Deixar todas variaveis null
                        limparVariaveis();

                        //Atualizar tabela do menu principal
                        Janela.menu.mostrarTabela();

                        // Atualizar a interface do usuário na thread de interface do usuário
                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                Janela.ag.botao.setEnabled(true);
                                Janela.ag.botao.setText("OK");
                            }
                        });
                    } catch (Exception e) {
                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                Janela.ag.botao.setEnabled(true);
                                Janela.ag.botao.setText("OK");
                            }
                        });
                        e.printStackTrace();
                    }
                }
            });

            // Iniciar a thread
            thread.start();

        } catch (Exception e) {
            Janela.ag.botao.setEnabled(true);
            Janela.ag.botao.setText("OK");
            e.printStackTrace();
        }
    }//GEN-LAST:event_botaoSalvarSemanaActionPerformed

    private void verificarSegundas() {
        if (linha + 1 < segundasFeiras.size()) {
            linha++;
            semanaAtual = segundasFeiras.get(linha);
            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            labelDATA.setText("Semana: " + semanaAtual.format(df));
        } else {
            Mensagem.mensagemExito("Esse mês não tem mais semanas.");
            labelDATA.setText("SELECIONE UMA DATA");
            segundasFeiras.clear();
            panelA.setVisible(false);
        }
        int diaDoMes = semanaAtual.getDayOfMonth();
        String diaDoMesFormatado = String.format("%02d", diaDoMes);
        dia = diaDoMesFormatado.substring(0, 2);
        System.out.println("Dois primeiros dígitos do dia: " + dia);
    }

    private void limparTelaListas() {
        // Limpar as listas ignorar 
        listaIgnorar.clear();
        listaIgnorarEstudantes.clear();

        // Recondicionar as Listas
        listaIgnorar.add(-1);
        listaIgnorarEstudantes.add(-1);

        //Limpar Tela
        desmarcarCheck();
        limparCampoTextos();
        panelA1.setVisible(false);
    }

    private void enviarZap() {
        try {
            FolhaDesignacao fol = new FolhaDesignacao();
            fol.enviarWhatsApp(todas);
        } catch (Exception e) {
            Mensagem.mensagemErro("Erro ao enviar as designações por WhatsApp, envie manualmente");

        }
    }

    private void salvarPdf() {
        try {
            GerarPDF pdf = new GerarPDF();
            pdf.salvar(todas);
            Janela.ag.pd.setText("Salvo com Sucesso");
        } catch (Exception e) {
            Janela.ag.pd.setText("Erro ao salvar a lista em PDF");
        }
    }

    private void cadastrarSemana() {
        try {
            SemanaDAO sDAO = new SemanaDAO();
            Semana semana = new Semana();

            semana.setData(semanaAtual);
            sDAO.cadastrar(semana);
        } catch (Exception e) {
            Mensagem.mensagemErro("Não foi possivel salvar os dados no Banco de dados");
        }
    }

    private void salvarAlterar() {
        PresidenteDAO preDAO = new PresidenteDAO();
        OracaoDAO oDAO = new OracaoDAO();
        TesourosDAO tDAO = new TesourosDAO();
        JoiasDAO jDAO = new JoiasDAO();
        NossaVidaDAO vidaDAO = new NossaVidaDAO();
        EstudoBiblicoCongregacaoDAO congDAO = new EstudoBiblicoCongregacaoDAO();
        LeitorDAO leiDAO = new LeitorDAO();
        PessoaDAO pDAO = new PessoaDAO();

        if (presidenteA != null) {
            preDAO.alterarSalaEDataPresidente(presidenteA.getId(), "SalaA", semanaAtual); //Botão Salvar 
            pDAO.alterarDataUltimaPessoa(presidenteA.getPessoa().getId(), semanaAtual, null);
        }
        if (oracaoA != null) {
            oDAO.alterarDataOracao(oracaoA.getId(), semanaAtual); //Botão Salvar 
        }
        if (oracaoB != null) {
            oDAO.alterarDataOracao(oracaoB.getId(), semanaAtual); //Botão Salvar
        }
        if (tesouros != null) {
            tDAO.alterarDataTesouro(tesouros.getId(), semanaAtual); //Botão Salvar
            pDAO.alterarDataUltimaPessoa(tesouros.getPessoa().getId(), semanaAtual, null);
        }
        if (joias != null) {
            jDAO.alterarDataJoia(joias.getId(), semanaAtual); //Botão Salvar
            pDAO.alterarDataUltimaPessoa(joias.getPessoa().getId(), semanaAtual, null);
        }
        if (leituraBibliaA != null) {
            pDAO.alterarDataUltimaPessoa(leituraBibliaA.getId(), semanaAtual, "SalaA");
        }
        if (nossaVida1 != null) {
            vidaDAO.alterarDataNossaVida(nossaVida1.getId(), semanaAtual); //Botão Salvar
            pDAO.alterarDataUltimaPessoa(nossaVida1.getPessoa().getId(), semanaAtual, null);
        }
        if (nossaVida2 != null) {
            vidaDAO.alterarDataNossaVida(nossaVida2.getId(), semanaAtual); //Botão Salvar
            pDAO.alterarDataUltimaPessoa(nossaVida2.getPessoa().getId(), semanaAtual, null);
        }
        if (estudoCong != null) {
            congDAO.alterarDataEstudoBiblicoCongregacao(estudoCong.getId(), semanaAtual); //Botão Salvar
            pDAO.alterarDataUltimaPessoa(estudoCong.getPessoa().getId(), semanaAtual, null);
        }
        if (leitor != null) {
            leiDAO.alterarDataLeitor(leitor.getId(), semanaAtual); //Botão Salvar
        }
        if (discursoA != null) {
            pDAO.alterarDataUltimaPessoa(discursoA.getId(), semanaAtual, "SalaA");
        }
        if (primeiraA != null) {
            pDAO.alterarDataUltimaPessoa(primeiraA.getId(), semanaAtual, "SalaA");//Botão Salvar
        }
        if (ajudantePrimeiraA != null) {
            pDAO.alterarDataUltimaPessoa(ajudantePrimeiraA.getId(), ajudantePrimeiraA.getDataUltima(), ajudantePrimeiraA.getSala());//Botão Salvar
            pDAO.atualizarAjudante(ajudantePrimeiraA.getId(), semanaAtual);
        }
        if (primeira2A != null) {
            pDAO.alterarDataUltimaPessoa(primeira2A.getId(), semanaAtual, "SalaA");//Botão Salvar
        }
        if (ajudantePrimeira2A != null) {
            pDAO.alterarDataUltimaPessoa(ajudantePrimeira2A.getId(), ajudantePrimeira2A.getDataUltima(), ajudantePrimeira2A.getSala());//Botão Salvar
            pDAO.atualizarAjudante(ajudantePrimeira2A.getId(), semanaAtual);
        }
        if (revisitaA != null) {
            pDAO.alterarDataUltimaPessoa(revisitaA.getId(), semanaAtual, "SalaA");//Botão Salvar
        }
        if (ajudanteRevisitaA != null) {
            pDAO.alterarDataUltimaPessoa(ajudanteRevisitaA.getId(), ajudanteRevisitaA.getDataUltima(), ajudanteRevisitaA.getSala());//Botão Salvar
            pDAO.atualizarAjudante(ajudanteRevisitaA.getId(), semanaAtual);
        }
        if (revisita2A != null) {
            pDAO.alterarDataUltimaPessoa(revisita2A.getId(), semanaAtual, "SalaA");//Botão Salvar
        }
        if (ajudanteRevisita2A != null) {
            pDAO.alterarDataUltimaPessoa(ajudanteRevisita2A.getId(), ajudanteRevisita2A.getDataUltima(), ajudanteRevisita2A.getSala());//Botão Salvar
            pDAO.atualizarAjudante(ajudanteRevisita2A.getId(), semanaAtual);
        }
        if (estudoA != null) {
            pDAO.alterarDataUltimaPessoa(estudoA.getId(), semanaAtual, "SalaA");//Botão Salvar
        }
        if (estudoAjudanteA != null) {
            pDAO.alterarDataUltimaPessoa(estudoAjudanteA.getId(), estudoAjudanteA.getDataUltima(), estudoAjudanteA.getSala());//Botão Salvar
            pDAO.atualizarAjudante(estudoAjudanteA.getId(), semanaAtual);
        }
        if (presidenteB != null) {
            preDAO.alterarSalaEDataPresidente(presidenteB.getId(), "SalaB", semanaAtual); //Botão Salvar
            pDAO.alterarDataUltimaPessoa(presidenteB.getPessoa().getId(), semanaAtual, "SalaB");
        }
        if (leituraBibliaB != null) {
            pDAO.alterarDataUltimaPessoa(leituraBibliaB.getId(), semanaAtual, "SalaB");
        }
        if (discursoB != null) {
            pDAO.alterarDataUltimaPessoa(discursoB.getId(), semanaAtual, "SalaB");
        }
        if (primeiraB != null) {
            pDAO.alterarDataUltimaPessoa(primeiraB.getId(), semanaAtual, "SalaB");//Botão Salvar
        }
        if (ajudantePrimeiraB != null) {
            pDAO.alterarDataUltimaPessoa(ajudantePrimeiraB.getId(), ajudantePrimeiraB.getDataUltima(), ajudantePrimeiraB.getSala());//Botão Salvar
            pDAO.atualizarAjudante(ajudantePrimeiraB.getId(), semanaAtual);
        }
        if (primeira2B != null) {
            pDAO.alterarDataUltimaPessoa(primeira2B.getId(), semanaAtual, "SalaB");//Botão Salvar
        }
        if (ajudantePrimeira2B != null) {
            pDAO.alterarDataUltimaPessoa(ajudantePrimeira2B.getId(), ajudantePrimeira2B.getDataUltima(), ajudantePrimeira2B.getSala());//Botão Salvar
            pDAO.atualizarAjudante(ajudantePrimeira2B.getId(), semanaAtual);
        }
        if (revisitaB != null) {
            pDAO.alterarDataUltimaPessoa(revisitaB.getId(), semanaAtual, "SalaB");//Botão Salvar
        }
        if (ajudanteRevisitaB != null) {
            pDAO.alterarDataUltimaPessoa(ajudanteRevisitaB.getId(), ajudanteRevisitaB.getDataUltima(), ajudanteRevisitaB.getSala());//Botão Salvar
            pDAO.atualizarAjudante(ajudanteRevisitaB.getId(), semanaAtual);
        }
        if (revisita2B != null) {
            pDAO.alterarDataUltimaPessoa(revisita2B.getId(), semanaAtual, "SalaB");//Botão Salvar
        }
        if (ajudanteRevisita2B != null) {
            pDAO.alterarDataUltimaPessoa(ajudanteRevisita2B.getId(), ajudanteRevisita2B.getDataUltima(), ajudanteRevisita2B.getSala());//Botão Salvar
            pDAO.atualizarAjudante(ajudanteRevisita2B.getId(), semanaAtual);
        }
        if (estudoB != null) {
            pDAO.alterarDataUltimaPessoa(estudoB.getId(), semanaAtual, "SalaB");//Botão Salvar
        }
        if (estudoAjudanteB != null) {
            pDAO.alterarDataUltimaPessoa(estudoAjudanteB.getId(), estudoAjudanteB.getDataUltima(), estudoAjudanteB.getSala());//Botão Salvar
            pDAO.atualizarAjudante(estudoAjudanteB.getId(), semanaAtual);
        }
    }

    //SALA A desabilitar sala B
    private void cSalaAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cSalaAMouseClicked
        txtPresidenteB.setText("NA");
        txtPresidenteB.setEnabled(false);
        txtLeituraBibliaB.setText("NA");
        txtLeituraBibliaB.setEnabled(false);
        txtParte1B.setText("NA");
        txtParte1B.setEnabled(false);
        txtAjudante1B.setText("NA");
        txtAjudante1B.setEnabled(false);
        txtParte2B.setText("NA");
        txtParte2B.setEnabled(false);
        txtAjudante2B.setText("NA");
        txtAjudante2B.setEnabled(false);
        txtParte3B.setText("NA");
        txtParte3B.setEnabled(false);
        txtAjudante3B.setText("NA");
        txtAjudante3B.setEnabled(false);
    }//GEN-LAST:event_cSalaAMouseClicked

    //HABILITAR SALA B
    private void cSalaABMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cSalaABMouseClicked
        txtPresidenteB.setText(null);
        txtPresidenteB.setEnabled(true);
        txtLeituraBibliaB.setText(null);
        txtLeituraBibliaB.setEnabled(true);
        txtParte1B.setText(null);
        txtParte1B.setEnabled(true);
        txtAjudante1B.setText(null);
        txtAjudante1B.setEnabled(true);
        txtParte2B.setText(null);
        txtParte2B.setEnabled(true);
        txtAjudante2B.setText(null);
        txtAjudante2B.setEnabled(true);
        txtParte3B.setText(null);
        txtParte3B.setEnabled(true);
        txtAjudante3B.setText(null);
        txtAjudante3B.setEnabled(true);
    }//GEN-LAST:event_cSalaABMouseClicked

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        Janela.menu.mostrarTabela();
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void txtPresidenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPresidenteMouseClicked
        if (!txtPresidente.getText().isEmpty()) {
            Janela.irTrocar(2, presidenteA.getPessoa().getSexo(), presidenteA.getPessoa(), listaIgnorar);
        } else {
            Janela.irTrocar2(2, "Homem", listaIgnorar);
        }
    }//GEN-LAST:event_txtPresidenteMouseClicked

    private void txtOracaoInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOracaoInicialMouseClicked
        if (!txtOracaoInicial.getText().isEmpty()) {
            Janela.irTrocar(4, oracaoA.getPessoa().getSexo(), oracaoA.getPessoa(), listaIgnorar);
        } else {
            Janela.irTrocar2(4, "Homem", listaIgnorar);
        }
    }//GEN-LAST:event_txtOracaoInicialMouseClicked

    private void txtLeituraBibliaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLeituraBibliaMouseClicked
        if (!txtLeituraBiblia.getText().isEmpty()) {
            Janela.irTrocar(1, leituraBibliaA.getSexo(), leituraBibliaA, listaIgnorarEstudantes);
        } else {
            Janela.irTrocar2(1, "Homem", listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtLeituraBibliaMouseClicked

    private void txtTesourosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTesourosMouseClicked
        if (!txtTesouros.getText().isEmpty()) {
            Janela.irTrocar(3, tesouros.getPessoa().getSexo(), tesouros.getPessoa(), listaIgnorar);
        } else {
            Janela.irTrocar2(3, "Homem", listaIgnorar);
        }
    }//GEN-LAST:event_txtTesourosMouseClicked

    private void txtCrista1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCrista1MouseClicked
        if (!txtCrista1.getText().isEmpty()) {
            Janela.irTrocar(5, nossaVida1.getPessoa().getSexo(), nossaVida1.getPessoa(), listaIgnorar);
        } else {
            Janela.irTrocar2(5, "Homem", listaIgnorar);
        }
    }//GEN-LAST:event_txtCrista1MouseClicked

    private void txtLeitorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLeitorMouseClicked
        if (!txtLeitor.getText().isEmpty()) {
            Janela.irTrocar(6, leitor.getPessoa().getSexo(), leitor.getPessoa(), listaIgnorar);
        } else {
            Janela.irTrocar2(6, "Homem", listaIgnorar);
        }
    }//GEN-LAST:event_txtLeitorMouseClicked

    private void txtJoiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJoiasMouseClicked
        if (!txtJoias.getText().isEmpty()) {
            Janela.irTrocar(7, joias.getPessoa().getSexo(), joias.getPessoa(), listaIgnorar);
        } else {
            Janela.irTrocar2(7, "Homem", listaIgnorar);
        }
    }//GEN-LAST:event_txtJoiasMouseClicked

    private void txtParte1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte1MouseClicked
        if (!txtParte1.getText().isEmpty() && !txtParte1.getText().equals("NA")) {
            Janela.irTrocar(8, primeiraA.getSexo(), primeiraA, listaIgnorarEstudantes);
        } else {
            Janela.irTrocar2(8, null, listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtParte1MouseClicked

    private void txtAjudante1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante1MouseClicked
        if (!txtParte1.getText().isEmpty()) {
            if (!txtAjudante1.getText().isEmpty() && !txtAjudante1.getText().equals("NA")) {
                Janela.irTrocar(9, ajudantePrimeiraA.getSexo(), ajudantePrimeiraA, listaIgnorarEstudantes);
            } else {
                Janela.irTrocar2(9, primeiraA.getSexo(), listaIgnorarEstudantes);
            }
        } else {
            Mensagem.mensagemAlerta("Primeiro selecione quem fará a parte");
        }
    }//GEN-LAST:event_txtAjudante1MouseClicked

    private void txtParte3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte3MouseClicked
        if (!txtParte3.getText().isEmpty() && !txtParte3.getText().equals("")) {
            if (primeira2A != null && labelParte3.getText().equals("Primeira Conversa - 2:")) {
                Janela.irTrocar(10, primeira2A.getSexo(), primeira2A, listaIgnorarEstudantes);
            }
            if (revisita2A != null && labelParte3.getText().equals("Revisita - 2:")) {
                Janela.irTrocar(14, revisita2A.getSexo(), revisita2A, listaIgnorarEstudantes);
            }
            if (estudoA != null && labelParte3.getText().equals("Estudo Bíblico:")) {
                Janela.irTrocar(16, estudoA.getSexo(), estudoA, listaIgnorarEstudantes);
            }
            if (discursoA != null && labelParte3.getText().equals("Discurso:")) {
                Janela.irTrocar(18, discursoA.getSexo(), discursoA, listaIgnorarEstudantes);
            }
            if (revisitaA != null && labelParte3.getText().equals("Revisita:")) {
                Janela.irTrocar(12, revisitaA.getSexo(), revisitaA, listaIgnorarEstudantes);
            }
        } else {
            if (primeira2A == null && labelParte3.getText().equals("Primeira Conversa - 2:")) {
                Janela.irTrocar2(10, null, listaIgnorarEstudantes);
            }
            if (revisita2A == null && labelParte3.getText().equals("Revisita - 2:")) {
                Janela.irTrocar2(14, null, listaIgnorarEstudantes);
            }
            if (estudoA == null && labelParte3.getText().equals("Estudo Bíblico:")) {
                Janela.irTrocar2(16, null, listaIgnorarEstudantes);
            }
            if (discursoA == null && labelParte3.getText().equals("Discurso:")) {
                Janela.irTrocar2(18, null, listaIgnorarEstudantes);
            }
            if (revisitaA == null && labelParte3.getText().equals("Revisita:")) {
                Janela.irTrocar2(12, null, listaIgnorarEstudantes);
            }
        }
    }//GEN-LAST:event_txtParte3MouseClicked

    private void txtAjudante3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante3MouseClicked
        if (!txtParte3.getText().isEmpty()) {
            if (!txtAjudante3.getText().isEmpty() && !txtAjudante3.getText().equals("")) {
                if (ajudantePrimeira2A != null && labelParte3.getText().equals("Primeira Conversa - 2:")) {
                    Janela.irTrocar(11, ajudantePrimeira2A.getSexo(), ajudantePrimeira2A, listaIgnorarEstudantes);
                }
                if (ajudanteRevisita2A != null && labelParte3.getText().equals("Revisita - 2:")) {
                    Janela.irTrocar(15, ajudanteRevisita2A.getSexo(), ajudanteRevisita2A, listaIgnorarEstudantes);
                }
                if (estudoAjudanteA != null && labelParte3.getText().equals("Estudo Bíblico:")) {
                    Janela.irTrocar(17, estudoAjudanteA.getSexo(), estudoAjudanteA, listaIgnorarEstudantes);
                }
                if (ajudanteRevisitaA != null && labelParte3.getText().equals("Revisita:")) {
                    Janela.irTrocar(13, ajudanteRevisitaA.getSexo(), ajudanteRevisitaA, listaIgnorarEstudantes);
                }
            } else {
                if (ajudantePrimeira2A == null && labelParte3.getText().equals("Primeira Conversa - 2:")) {
                    Janela.irTrocar2(11, primeira2A.getSexo(), listaIgnorarEstudantes);
                }
                if (ajudanteRevisita2A == null && labelParte3.getText().equals("Revisita - 2:")) {
                    Janela.irTrocar2(15, revisita2A.getSexo(), listaIgnorarEstudantes);
                }
                if (estudoAjudanteA == null && labelParte3.getText().equals("Estudo Bíblico:")) {
                    Janela.irTrocar2(17, estudoA.getSexo(), listaIgnorarEstudantes);
                }
                if (ajudanteRevisitaA == null && labelParte3.getText().equals("Revisita:")) {
                    Janela.irTrocar2(13, revisitaA.getSexo(), listaIgnorarEstudantes);
                }
            }
        } else {
            Mensagem.mensagemAlerta("Primeiro selecione quem fará a parte");
        }
    }//GEN-LAST:event_txtAjudante3MouseClicked

    private void txtParte2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte2MouseClicked
        if (!txtParte2.getText().isEmpty()) {
            if (revisitaA != null && labelParte2.getText().equals("Revisita:")) {
                Janela.irTrocar(12, revisitaA.getSexo(), revisitaA, listaIgnorarEstudantes);
            }
            if (primeiraA != null && labelParte2.getText().equals("Primeira Conversa - 1:")) {
                Janela.irTrocar(35, primeiraA.getSexo(), primeiraA, listaIgnorarEstudantes);
            }
            if (revisitaA != null && labelParte2.getText().equals("Revisita - 1:")) {
                Janela.irTrocar(39, revisitaA.getSexo(), revisitaA, listaIgnorarEstudantes);
            }
            if (primeiraA != null && labelParte2.getText().equals("Primeira Conversa:")) {
                Janela.irTrocar(8, primeiraA.getSexo(), primeiraA, listaIgnorarEstudantes);
            }
        } else {
            if (revisitaA == null && labelParte2.getText().equals("Revisita:")) {
                Janela.irTrocar2(12, null, listaIgnorarEstudantes);
            }
            if (primeiraA == null && labelParte2.getText().equals("Primeira Conversa - 1:")) {
                Janela.irTrocar2(35, null, listaIgnorarEstudantes);
            }
            if (revisitaA == null && labelParte2.getText().equals("Revisita - 1:")) {
                Janela.irTrocar2(39, null, listaIgnorarEstudantes);
            }
            if (primeiraA == null && labelParte2.getText().equals("Primeira Conversa:")) {
                Janela.irTrocar2(8, null, listaIgnorarEstudantes);
            }
        }
    }//GEN-LAST:event_txtParte2MouseClicked

    private void txtAjudante2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante2MouseClicked
        if (!txtParte2.getText().isEmpty()) {
            if (!txtAjudante2.getText().isEmpty() && !txtAjudante2.getText().equals("")) {
                if (ajudanteRevisitaA != null && labelParte2.getText().equals("Revisita:")) {
                    Janela.irTrocar(13, ajudanteRevisitaA.getSexo(), ajudanteRevisitaA, listaIgnorarEstudantes);
                }
                if (ajudantePrimeiraA != null && labelParte2.getText().equals("Primeira Conversa - 1:")) {
                    Janela.irTrocar(36, ajudantePrimeiraA.getSexo(), ajudantePrimeiraA, listaIgnorarEstudantes);
                }
                if (ajudanteRevisitaA != null && labelParte2.getText().equals("Revisita - 1:")) {
                    Janela.irTrocar(40, ajudanteRevisitaA.getSexo(), ajudanteRevisitaA, listaIgnorarEstudantes);
                }
                if (ajudantePrimeiraA != null && labelParte2.getText().equals("Primeira Conversa:")) {
                    Janela.irTrocar(9, ajudantePrimeiraA.getSexo(), ajudantePrimeiraA, listaIgnorarEstudantes);
                }
            } else {
                if (ajudanteRevisitaA == null && labelParte2.getText().equals("Revisita:")) {
                    Janela.irTrocar2(13, revisitaA.getSexo(), listaIgnorarEstudantes);
                }
                if (ajudantePrimeiraA == null && labelParte2.getText().equals("Primeira Conversa - 1:")) {
                    Janela.irTrocar2(36, primeiraA.getSexo(), listaIgnorarEstudantes);
                }
                if (ajudanteRevisitaA == null && labelParte2.getText().equals("Revisita - 1:")) {
                    Janela.irTrocar2(40, revisitaA.getSexo(), listaIgnorarEstudantes);
                }
                if (ajudantePrimeiraA == null && labelParte2.getText().equals("Primeira Conversa:")) {
                    Janela.irTrocar2(9, primeiraA.getSexo(), listaIgnorarEstudantes);
                }
            }
        } else {
            Mensagem.mensagemAlerta("Primeiro selecione quem fará a parte");
        }
    }//GEN-LAST:event_txtAjudante2MouseClicked

    private void txtOracaoFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOracaoFinalMouseClicked
        if (!txtOracaoFinal.getText().isEmpty()) {
            Janela.irTrocar(19, oracaoB.getPessoa().getSexo(), oracaoB.getPessoa(), listaIgnorar);
        } else {
            Janela.irTrocar2(19, "Homem", listaIgnorar);
        }
    }//GEN-LAST:event_txtOracaoFinalMouseClicked

    private void txtNossaVida2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNossaVida2MouseClicked
        if (!txtNossaVida2.getText().isEmpty()) {
            Janela.irTrocar(20, nossaVida2.getPessoa().getSexo(), nossaVida2.getPessoa(), listaIgnorar);
        } else {
            Janela.irTrocar2(20, "Homem", listaIgnorar);
        }
    }//GEN-LAST:event_txtNossaVida2MouseClicked

    private void txtEstudoCongregacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEstudoCongregacaoMouseClicked
        if (!txtEstudoCongregacao.getText().isEmpty()) {
            Janela.irTrocar(21, estudoCong.getPessoa().getSexo(), estudoCong.getPessoa(), listaIgnorar);
        } else {
            Janela.irTrocar2(21, "Homem", listaIgnorar);
        }
    }//GEN-LAST:event_txtEstudoCongregacaoMouseClicked

    private void txtPresidenteBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPresidenteBMouseClicked
        if (!txtPresidenteB.getText().isEmpty()) {
            Janela.irTrocar(22, presidenteB.getPessoa().getSexo(), presidenteB.getPessoa(), listaIgnorar);
        } else {
            Janela.irTrocar2(22, "Homem", listaIgnorar);
        }
    }//GEN-LAST:event_txtPresidenteBMouseClicked

    private void txtParte1BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte1BMouseClicked
        if (!txtParte1B.getText().isEmpty() && !txtParte1B.getText().equals("NA")) {
            Janela.irTrocar(23, primeiraB.getSexo(), primeiraB, listaIgnorarEstudantes);
        } else {
            Janela.irTrocar2(23, null, listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtParte1BMouseClicked

    private void txtAjudante1BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante1BMouseClicked
        if (!txtParte1B.getText().isEmpty()) {
            if (!txtAjudante1B.getText().isEmpty() && !txtAjudante1B.getText().equals("NA")) {
                Janela.irTrocar(24, ajudantePrimeiraB.getSexo(), ajudantePrimeiraB, listaIgnorarEstudantes);
            } else {
                Janela.irTrocar2(24, primeiraB.getSexo(), listaIgnorarEstudantes);
            }
        } else {
            Mensagem.mensagemAlerta("Primeiro selecione quem fará a parte");
        }
    }//GEN-LAST:event_txtAjudante1BMouseClicked

    private void txtParte3BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte3BMouseClicked
        if (!txtParte3B.getText().isEmpty() && !txtParte3B.getText().equals("")) {
            if (primeira2B != null && labelParte3.getText().equals("Primeira Conversa - 2:")) {
                Janela.irTrocar(25, primeira2B.getSexo(), primeira2B, listaIgnorarEstudantes);
            }
            if (revisita2B != null && labelParte3.getText().equals("Revisita - 2:")) {
                Janela.irTrocar(29, revisita2B.getSexo(), revisita2B, listaIgnorarEstudantes);
            }
            if (estudoB != null && labelParte3.getText().equals("Estudo Bíblico:")) {
                Janela.irTrocar(31, estudoB.getSexo(), estudoB, listaIgnorarEstudantes);
            }
            if (discursoB != null && labelParte3.getText().equals("Discurso:")) {
                Janela.irTrocar(33, discursoB.getSexo(), discursoB, listaIgnorarEstudantes);
            }
            if (revisitaB != null && labelParte3.getText().equals("Revisita:")) {
                Janela.irTrocar(27, revisitaB.getSexo(), revisitaB, listaIgnorarEstudantes);
            }
        } else {
            if (primeira2B == null && labelParte3.getText().equals("Primeira Conversa - 2:")) {
                Janela.irTrocar2(25, null, listaIgnorarEstudantes);
            }
            if (revisita2B == null && labelParte3.getText().equals("Revisita - 2:")) {
                Janela.irTrocar2(29, null, listaIgnorarEstudantes);
            }
            if (estudoB == null && labelParte3.getText().equals("Estudo Bíblico:")) {
                Janela.irTrocar2(31, null, listaIgnorarEstudantes);
            }
            if (discursoB == null && labelParte3.getText().equals("Discurso:")) {
                Janela.irTrocar2(33, null, listaIgnorarEstudantes);
            }
            if (revisitaB == null && labelParte3.getText().equals("Revisita:")) {
                Janela.irTrocar2(27, null, listaIgnorarEstudantes);
            }
        }
    }//GEN-LAST:event_txtParte3BMouseClicked

    private void txtAjudante3BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante3BMouseClicked
        if (!txtParte3B.getText().isEmpty()) {
            if (!txtAjudante3B.getText().isEmpty() && !txtAjudante3B.getText().equals("")) {
                if (ajudantePrimeira2B != null && labelParte3.getText().equals("Primeira Conversa - 2:")) {
                    Janela.irTrocar(26, ajudantePrimeira2B.getSexo(), ajudantePrimeira2B, listaIgnorarEstudantes);
                }
                if (ajudanteRevisita2B != null && labelParte3.getText().equals("Revisita - 2:")) {
                    Janela.irTrocar(30, ajudanteRevisita2B.getSexo(), ajudanteRevisita2B, listaIgnorarEstudantes);
                }
                if (estudoAjudanteB != null && labelParte3.getText().equals("Estudo Bíblico:")) {
                    Janela.irTrocar(32, estudoAjudanteB.getSexo(), estudoAjudanteB, listaIgnorarEstudantes);
                }
                if (ajudanteRevisitaB != null && labelParte3.getText().equals("Revisita:")) {
                    Janela.irTrocar(28, ajudanteRevisitaB.getSexo(), ajudanteRevisitaB, listaIgnorarEstudantes);
                }
            } else {
                if (ajudantePrimeira2B == null && labelParte3.getText().equals("Primeira Conversa - 2:")) {
                    Janela.irTrocar2(26, primeira2B.getSexo(), listaIgnorarEstudantes);
                }
                if (ajudanteRevisita2B == null && labelParte3.getText().equals("Revisita - 2:")) {
                    Janela.irTrocar2(30, revisita2B.getSexo(), listaIgnorarEstudantes);
                }
                if (estudoAjudanteB == null && labelParte3.getText().equals("Estudo Bíblico:")) {
                    Janela.irTrocar2(32, estudoB.getSexo(), listaIgnorarEstudantes);
                }
                if (ajudanteRevisitaB == null && labelParte3.getText().equals("Revisita:")) {
                    Janela.irTrocar2(28, revisitaB.getSexo(), listaIgnorarEstudantes);
                }
            }
        } else {
            Mensagem.mensagemAlerta("Primeiro selecione quem fará a parte");
        }
    }//GEN-LAST:event_txtAjudante3BMouseClicked

    private void txtParte2BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte2BMouseClicked
        if (!txtParte2B.getText().isEmpty() && !txtParte2B.getText().equals("")) {
            if (revisitaB != null && labelParte2.getText().equals("Revisita:")) {
                Janela.irTrocar(27, revisitaB.getSexo(), revisitaB, listaIgnorarEstudantes);
            }
            if (primeiraB != null && labelParte2.getText().equals("Primeira Conversa - 1:")) {
                Janela.irTrocar(37, primeiraB.getSexo(), primeiraB, listaIgnorarEstudantes);
            }
            if (revisitaB != null && labelParte2.getText().equals("Revisita - 1:")) {
                Janela.irTrocar(41, revisitaB.getSexo(), revisitaB, listaIgnorarEstudantes);
            }
            if (primeiraB != null && labelParte2.getText().equals("Primeira Conversa:")) {
                Janela.irTrocar(23, primeiraB.getSexo(), primeiraB, listaIgnorarEstudantes);
            }
        } else {
            if (revisitaB == null && labelParte2.getText().equals("Revisita:")) {
                Janela.irTrocar2(27, null, listaIgnorarEstudantes);
            }
            if (primeiraB == null && labelParte2.getText().equals("Primeira Conversa - 1:")) {
                Janela.irTrocar2(37, null, listaIgnorarEstudantes);
            }
            if (revisitaB == null && labelParte2.getText().equals("Revisita - 1:")) {
                Janela.irTrocar2(41, null, listaIgnorarEstudantes);
            }
            if (primeiraB == null && labelParte2.getText().equals("Primeira Conversa:")) {
                Janela.irTrocar2(23, null, listaIgnorarEstudantes);
            }
        }
    }//GEN-LAST:event_txtParte2BMouseClicked

    private void txtAjudante2BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante2BMouseClicked
        if (!txtParte2B.getText().isEmpty()) {
            if (!txtAjudante2B.getText().isEmpty() && !txtAjudante2B.getText().equals("")) {
                if (ajudanteRevisitaB != null && labelParte2.getText().equals("Revisita:")) {
                    Janela.irTrocar(28, ajudanteRevisitaB.getSexo(), ajudanteRevisitaB, listaIgnorarEstudantes);
                }
                if (ajudantePrimeiraB != null && labelParte2.getText().equals("Primeira Conversa - 1:")) {
                    Janela.irTrocar(38, ajudantePrimeiraB.getSexo(), ajudantePrimeiraB, listaIgnorarEstudantes);
                }
                if (ajudanteRevisitaB != null && labelParte2.getText().equals("Revisita - 1:")) {
                    Janela.irTrocar(42, ajudanteRevisitaB.getSexo(), ajudanteRevisitaB, listaIgnorarEstudantes);
                }
                if (ajudantePrimeiraB != null && labelParte2.getText().equals("Primeira Conversa:")) {
                    Janela.irTrocar(24, ajudantePrimeiraB.getSexo(), ajudantePrimeiraB, listaIgnorarEstudantes);
                }
            } else {
                if (ajudanteRevisitaB == null && labelParte2.getText().equals("Revisita:")) {
                    Janela.irTrocar2(28, revisitaB.getSexo(), listaIgnorarEstudantes);
                }
                if (ajudantePrimeiraB == null && labelParte2.getText().equals("Primeira Conversa - 1:")) {
                    Janela.irTrocar2(38, primeiraB.getSexo(), listaIgnorarEstudantes);
                }
                if (ajudanteRevisitaB == null && labelParte2.getText().equals("Revisita - 1:")) {
                    Janela.irTrocar2(42, revisitaB.getSexo(), listaIgnorarEstudantes);
                }
                if (ajudantePrimeiraB == null && labelParte2.getText().equals("Primeira Conversa:")) {
                    Janela.irTrocar2(24, primeiraB.getSexo(), listaIgnorarEstudantes);
                }
            }
        } else {
            Mensagem.mensagemAlerta("Primeiro selecione quem fará a parte");
        }
    }//GEN-LAST:event_txtAjudante2BMouseClicked

    private void txtLeituraBibliaBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLeituraBibliaBMouseClicked
        if (!txtLeituraBibliaB.getText().isEmpty() && !txtLeituraBibliaB.getText().equals("")) {
            Janela.irTrocar(34, leituraBibliaB.getSexo(), leituraBibliaB, listaIgnorarEstudantes);
        } else {
            Janela.irTrocar2(34, "Homem", listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtLeituraBibliaBMouseClicked

    private void cPresidenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cPresidenteMouseClicked
        if (cPresidente.isSelected()) {
            if (txtPresidente.getText().isEmpty()) {
                labelPresidente.setVisible(true);
                txtPresidente.setText("");
                txtPresidente.setEnabled(true);
            }
            if (cSalaAB.isSelected()) {
                txtPresidenteB.setText("");
                txtPresidenteB.setEnabled(true);
            }
        } else {
            labelPresidente.setVisible(true);
            txtPresidente.setText(null);
            txtPresidente.setEnabled(true);
            if (cSalaAB.isSelected()) {
                txtPresidenteB.setText(null);
                txtPresidenteB.setEnabled(true);
            }
        }
    }//GEN-LAST:event_cPresidenteMouseClicked

    private void cOracaoInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cOracaoInicialMouseClicked
        if (cOracaoInicial.isSelected()) {
            if (txtOracaoInicial.getText().isEmpty()) {
                labelOracaoInicial.setVisible(true);
                txtOracaoInicial.setText("");
                txtOracaoInicial.setEnabled(true);
            }
        } else {
            labelOracaoInicial.setVisible(true);
            txtOracaoInicial.setText(null);
            txtOracaoInicial.setEnabled(true);
        }
    }//GEN-LAST:event_cOracaoInicialMouseClicked

    private void cTesourosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cTesourosMouseClicked
        if (cTesouros.isSelected()) {
            if (txtTesouros.getText().isEmpty()) {
                labelTesouros.setVisible(true);
                txtTesouros.setText("");
                txtTesouros.setEnabled(true);
            }
        } else {
            labelTesouros.setVisible(true);
            txtTesouros.setText(null);
            txtTesouros.setEnabled(true);
        }
    }//GEN-LAST:event_cTesourosMouseClicked

    private void cJoiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cJoiasMouseClicked
        if (cJoias.isSelected()) {
            if (txtJoias.getText().isEmpty()) {
                labelJoias.setVisible(true);
                txtJoias.setText("");
                txtJoias.setEnabled(true);
            }
        } else {
            labelJoias.setVisible(true);
            txtJoias.setText(null);
            txtJoias.setEnabled(true);
        }
    }//GEN-LAST:event_cJoiasMouseClicked

    private void cLeituraBibliaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cLeituraBibliaMouseClicked
        if (cLeituraBiblia.isSelected()) {
            if (txtLeituraBiblia.getText().isEmpty()) {
                txtLeituraBiblia.setText(null);
                txtLeituraBiblia.setEnabled(true);
            }
            if (cSalaAB.isSelected()) {
                if (txtLeituraBibliaB.getText().isEmpty()) {
                    txtLeituraBibliaB.setText(null);
                    txtLeituraBibliaB.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_cLeituraBibliaMouseClicked

    private void cVideoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cVideoMouseClicked
        if (cVideo.isSelected()) {
            labelParte1.setText("Vídeo:");
            txtParte1.setText("NA");
            txtParte1.setEnabled(false);
            txtAjudante1.setText("NA");
            txtAjudante1.setEnabled(false);
            if (cSalaAB.isSelected()) {
                txtParte1B.setText("NA");
                txtParte1B.setEnabled(false);
                txtAjudante1B.setText("NA");
                txtAjudante1B.setEnabled(false);
            }
        } else {
            labelParte1.setText("Parte 1");
            txtParte1.setText(null);
            txtParte1.setEnabled(true);
            txtAjudante1.setText(null);
            txtAjudante1.setEnabled(true);
            if (cSalaAB.isSelected()) {
                txtParte1B.setText(null);
                txtParte1B.setEnabled(true);
                txtAjudante1B.setText(null);
                txtAjudante1B.setEnabled(true);
            }
        }
    }//GEN-LAST:event_cVideoMouseClicked

    private void cPrimeiraConversaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cPrimeiraConversaMouseClicked
        SwingUtilities.invokeLater(() -> {
            if (cVideo.isSelected() && cPrimeiraConversa.isSelected()) {
                labelParte2.setText("Primeira Conversa:");
                txtParte2.setText("");
                txtAjudante2.setText("");
                txtParte2.setEnabled(true);
                txtAjudante2.setEnabled(true);
                if (cSalaAB.isSelected()) {
                    txtParte2B.setText("");
                    txtAjudante2B.setText("");
                    txtParte2B.setEnabled(true);
                    txtAjudante2B.setEnabled(true);
                }
            }
            if (cPrimeiraConversa.isSelected() && !cVideo.isSelected()) {
                labelParte1.setText("Primeira Conversa:");
                txtParte1.setText("");
                txtAjudante1.setText("");
                txtParte1.setEnabled(true);
                txtAjudante1.setEnabled(true);
                if (cSalaAB.isSelected()) {
                    txtParte1B.setText("");
                    txtAjudante1B.setText("");
                    txtParte1B.setEnabled(true);
                    txtAjudante1B.setEnabled(true);
                }
            } else if (!cPrimeiraConversa.isSelected() && !cVideo.isSelected()) {
                labelParte1.setText("Parte 1");
                txtParte1.setText("");
                txtAjudante1.setText("");
                txtParte1.setEnabled(true);
                txtAjudante1.setEnabled(true);
                if (cSalaAB.isSelected()) {
                    txtParte1B.setText("");
                    txtAjudante1B.setText("");
                    txtParte1B.setEnabled(true);
                    txtAjudante1B.setEnabled(true);
                }
            }
        });
    }//GEN-LAST:event_cPrimeiraConversaMouseClicked

    private void cPrimeiraConversa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cPrimeiraConversa1MouseClicked
        SwingUtilities.invokeLater(() -> {
            if (cPrimeiraConversa1.isSelected()) {
                labelParte2.setText("Primeira Conversa - 1:");
                txtParte2.setText("");
                txtAjudante2.setText("");
                txtParte2.setEnabled(true);
                txtAjudante2.setEnabled(true);
                if (cSalaAB.isSelected()) {
                    txtParte2B.setText("");
                    txtAjudante2B.setText("");
                    txtParte2B.setEnabled(true);
                    txtAjudante2B.setEnabled(true);
                }
            } else {
                labelParte2.setText("Parte 2");
                txtParte2.setText("");
                txtAjudante2.setText("");
                txtParte2.setEnabled(true);
                txtAjudante2.setEnabled(true);
                if (cSalaAB.isSelected()) {
                    txtParte2B.setText("");
                    txtAjudante2B.setText("");
                    txtParte2B.setEnabled(true);
                    txtAjudante2B.setEnabled(true);
                }
            }
        });
    }//GEN-LAST:event_cPrimeiraConversa1MouseClicked

    private void cPrimeiraConversa2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cPrimeiraConversa2MouseClicked
        SwingUtilities.invokeLater(() -> {
            if (cPrimeiraConversa2.isSelected()) {
                labelParte3.setText("Primeira Conversa - 2:");
                txtParte3.setText("");
                txtParte3.setEnabled(true);
                txtAjudante3.setText("");
                txtAjudante3.setEnabled(true);
                if (cSalaAB.isSelected()) {
                    txtParte3B.setText("");
                    txtParte3B.setEnabled(true);
                    txtAjudante3B.setText("");
                    txtAjudante3B.setEnabled(true);
                }
            } else {
                labelParte3.setText("Parte 3");
                txtParte3.setText("");
                txtParte3.setEnabled(true);
                txtAjudante3.setText("");
                txtAjudante3.setEnabled(true);
                if (cSalaAB.isSelected()) {
                    txtParte3B.setText("");
                    txtParte3B.setEnabled(true);
                    txtAjudante3B.setText("");
                    txtAjudante3B.setEnabled(true);
                }
            }
        });
    }//GEN-LAST:event_cPrimeiraConversa2MouseClicked

    private void cRevisitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cRevisitaMouseClicked
        SwingUtilities.invokeLater(() -> {
            if (cRevisita.isSelected() && cVideo.isSelected() && cPrimeiraConversa.isSelected()) {
                labelParte3.setText("Revisita:");
                txtParte3.setText("");
                txtParte3.setEnabled(true);
                txtAjudante3.setText("");
                txtAjudante3.setEnabled(true);
                if (cSalaAB.isSelected()) {
                    txtParte3B.setText("");
                    txtAjudante3B.setText("");
                    txtParte3B.setEnabled(true);
                    txtAjudante3B.setEnabled(true);
                }
            }
            if (cRevisita.isSelected() && cVideo.isSelected() && !cPrimeiraConversa.isSelected()) {
                labelParte2.setText("Revisita:");
                txtParte2.setText("");
                txtParte2.setEnabled(true);
                txtAjudante2.setText("");
                txtAjudante2.setEnabled(true);
                if (cSalaAB.isSelected()) {
                    txtParte2B.setText("");
                    txtAjudante2B.setText("");
                    txtParte2B.setEnabled(true);
                    txtAjudante2B.setEnabled(true);
                }
            }
            if (cRevisita.isSelected() && !cVideo.isSelected()) {
                labelParte2.setText("Revisita:");
                txtParte2.setText("");
                txtParte2.setEnabled(true);
                txtAjudante2.setText("");
                txtAjudante2.setEnabled(true);
                if (cSalaAB.isSelected()) {
                    txtParte2B.setText("");
                    txtAjudante2B.setText("");
                    txtParte2B.setEnabled(true);
                    txtAjudante2B.setEnabled(true);
                }
            } else if (cRevisita.isSelected() && !cVideo.isSelected()) {
                labelParte2.setText("Parte 2");
                txtParte2.setText("");
                txtParte2.setEnabled(true);
                txtAjudante2.setText("");
                txtAjudante2.setEnabled(true);
                if (cSalaAB.isSelected()) {
                    txtParte2B.setText("");
                    txtAjudante2B.setText("");
                    txtParte2B.setEnabled(true);
                    txtAjudante2B.setEnabled(true);
                }
            }
        });
    }//GEN-LAST:event_cRevisitaMouseClicked

    private void cRevisita1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cRevisita1MouseClicked
        SwingUtilities.invokeLater(() -> {
            if (cRevisita1.isSelected()) {
                labelParte2.setText("Revisita - 1:");
                txtParte2.setText("");
                txtParte2.setEnabled(true);
                txtAjudante2.setText("");
                txtAjudante2.setEnabled(true);
                if (cSalaAB.isSelected()) {
                    txtParte2B.setText("");
                    txtAjudante2B.setText("");
                    txtParte2B.setEnabled(true);
                    txtAjudante2B.setEnabled(true);
                }
            } else if (cRevisita1.isSelected()) {
                txtParte2.setText("");
                txtParte2.setEnabled(true);
                txtAjudante2.setText("");
                txtAjudante2.setEnabled(true);
                if (cSalaAB.isSelected()) {
                    txtParte2B.setText("");
                    txtAjudante2B.setText("");
                    txtParte2B.setEnabled(true);
                    txtAjudante2B.setEnabled(true);
                }
            }
        });
    }//GEN-LAST:event_cRevisita1MouseClicked

    private void cRevisita2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cRevisita2MouseClicked
        SwingUtilities.invokeLater(() -> {
            if (cRevisita2.isSelected()) {
                labelParte3.setText("Revisita - 2:");
                txtParte3.setText("");
                txtParte3.setEnabled(true);
                txtAjudante3.setText("");
                txtAjudante3.setEnabled(true);
                if (cSalaAB.isSelected()) {
                    txtParte3B.setText("");
                    txtParte3B.setEnabled(true);
                    txtAjudante3B.setText("");
                    txtAjudante3B.setEnabled(true);
                }
            } else {
                labelParte3.setText("Parte 3");
                txtParte3.setText("");
                txtParte3.setEnabled(true);
                txtAjudante3.setText("");
                txtAjudante3.setEnabled(true);
                if (cSalaAB.isSelected()) {
                    txtParte3B.setText("");
                    txtParte3B.setEnabled(true);
                    txtAjudante3B.setText("");
                    txtAjudante3B.setEnabled(true);
                }
            }
        });
    }//GEN-LAST:event_cRevisita2MouseClicked

    private void cEstudoBiblicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cEstudoBiblicoMouseClicked
        SwingUtilities.invokeLater(() -> {
            if (cEstudoBiblico.isSelected()) {
                labelParte3.setText("Estudo Bíblico:");
                txtAjudante3.setText("");
                txtAjudante3.setEnabled(true);
                txtParte3.setText("");
                txtParte3.setEnabled(true);
                if (cSalaAB.isSelected()) {
                    txtParte3B.setText("");
                    txtParte3B.setEnabled(true);
                    txtAjudante3B.setText("");
                    txtAjudante3B.setEnabled(true);
                }
            } else {
                labelParte3.setText("Parte 3");
                txtAjudante3.setText("");
                txtAjudante3.setEnabled(true);
                txtParte3.setText("");
                txtParte3.setEnabled(true);
                if (cSalaAB.isSelected()) {
                    txtParte3B.setText("");
                    txtParte3B.setEnabled(true);
                    txtAjudante3B.setText("");
                    txtAjudante3B.setEnabled(true);
                }
            }
        });
    }//GEN-LAST:event_cEstudoBiblicoMouseClicked

    private void cDiscursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cDiscursoMouseClicked
        SwingUtilities.invokeLater(() -> {
            if (cDiscurso.isSelected()) {
                labelParte3.setText("Discurso:");
                txtAjudante3.setText("NA");
                txtAjudante3.setEnabled(false);
                txtParte3.setText("");
                txtParte3.setEnabled(true);
                if (cSalaAB.isSelected()) {
                    txtParte3B.setText("");
                    txtParte3B.setEnabled(true);
                    txtAjudante3B.setText("NA");
                    txtAjudante3B.setEnabled(false);
                }
            } else {
                labelParte3.setText("Parte 3");
                txtAjudante3.setText("");
                txtAjudante3.setEnabled(true);
                txtParte3.setText("");
                txtParte3.setEnabled(true);
                if (cSalaAB.isSelected()) {
                    txtParte3B.setText("");
                    txtParte3B.setEnabled(true);
                    txtAjudante3B.setText("");
                    txtAjudante3B.setEnabled(true);
                }
            }
        });
    }//GEN-LAST:event_cDiscursoMouseClicked

    private void cNossaVida1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cNossaVida1MouseClicked
        if (cNossaVida1.isSelected()) {
            if (txtCrista1.getText().isEmpty()) {
                labelNossaVida1.setVisible(true);
                txtCrista1.setText("");
                txtCrista1.setEnabled(true);
            }
        } else {
            labelNossaVida1.setVisible(true);
            txtCrista1.setText(null);
            txtCrista1.setEnabled(true);
        }
    }//GEN-LAST:event_cNossaVida1MouseClicked

    private void cNossaVida2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cNossaVida2MouseClicked
        if (cNossaVida2.isSelected()) {
            if (txtNossaVida2.getText().isEmpty()) {
                labelNossaVida2.setVisible(true);
                txtNossaVida2.setText("");
                txtNossaVida2.setEnabled(true);
            }
        } else {
            labelNossaVida2.setVisible(true);
            txtNossaVida2.setText(null);
            txtNossaVida2.setEnabled(true);
        }
    }//GEN-LAST:event_cNossaVida2MouseClicked

    private void cEstudoCongregacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cEstudoCongregacaoMouseClicked
        if (cEstudoCongregacao.isSelected()) {
            if (txtEstudoCongregacao.getText().isEmpty()) {
                labelEstudoCongregacao.setVisible(true);
                txtEstudoCongregacao.setText("");
                txtEstudoCongregacao.setEnabled(true);
            }
        } else {
            labelEstudoCongregacao.setVisible(true);
            txtEstudoCongregacao.setText(null);
            txtEstudoCongregacao.setEnabled(true);
        }
    }//GEN-LAST:event_cEstudoCongregacaoMouseClicked

    private void cLeitorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cLeitorMouseClicked
        if (cLeitor.isSelected()) {
            if (txtLeitor.getText().isEmpty()) {
                labelLeitor.setVisible(true);
                txtLeitor.setText("");
                txtLeitor.setEnabled(true);
            }
        } else {
            labelLeitor.setVisible(true);
            txtLeitor.setText(null);
            txtLeitor.setEnabled(true);
        }
    }//GEN-LAST:event_cLeitorMouseClicked

    private void cOracaoFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cOracaoFinalMouseClicked
        if (cOracaoFinal.isSelected()) {
            if (txtOracaoFinal.getText().isEmpty()) {
                labelOracaoFinal.setVisible(true);
                txtOracaoFinal.setText("");
                txtOracaoFinal.setEnabled(true);
            }
        } else {
            labelOracaoFinal.setVisible(true);
            txtOracaoFinal.setText(null);
            txtOracaoFinal.setEnabled(true);
        }
    }//GEN-LAST:event_cOracaoFinalMouseClicked

    private void conferirSelecionados() {
        if (cPresidente.isSelected() && txtPresidente.getText().isEmpty()) {
            txtPresidente.setText("");
            txtPresidente.setEnabled(true);
            if (cSalaAB.isSelected() && txtPresidenteB.getText().isEmpty()) {
                txtPresidenteB.setText("");
                txtPresidenteB.setEnabled(true);
            }
        }
        if (cOracaoInicial.isSelected() && txtOracaoInicial.getText().isEmpty()) {
            txtOracaoInicial.setText("");
            txtOracaoInicial.setEnabled(true);
        }
        if (cTesouros.isSelected() && txtTesouros.getText().isEmpty()) {
            txtTesouros.setText("");
            txtTesouros.setEnabled(true);
        }
        if (cJoias.isSelected() && txtJoias.getText().isEmpty()) {
            txtJoias.setText("");
            txtJoias.setEnabled(true);
        }

        if (cLeituraBiblia.isSelected() && txtLeituraBiblia.getText().isEmpty()) {
            txtLeituraBiblia.setText("");
            txtLeituraBiblia.setEnabled(true);
            if (cSalaAB.isSelected() && txtLeituraBibliaB.getText().isEmpty()) {
                txtLeituraBibliaB.setText("");
                txtLeituraBibliaB.setEnabled(true);
            }
        }
        if (cVideo.isSelected()) {
            labelParte1.setText("Vídeo:");
            txtParte1.setText("NA");
            txtParte1.setEnabled(false);
            txtAjudante1.setText("NA");
            txtAjudante1.setEnabled(false);
            if (cSalaAB.isSelected()) {
                txtParte1B.setText("NA");
                txtParte1B.setEnabled(false);
                txtAjudante1B.setText("NA");
                txtAjudante1B.setEnabled(false);
            }
        }
        if (cPrimeiraConversa.isSelected() && !cVideo.isSelected() && txtParte1.getText().isEmpty()) {
            labelParte1.setText("Primeira Conversa:");
            txtParte1.setText("");
            txtParte1.setEnabled(true);
            txtAjudante1.setText("");
            txtAjudante1.setEnabled(true);
            if (cSalaAB.isSelected()) {
                txtParte1B.setText("");
                txtParte1B.setEnabled(true);
                txtAjudante1B.setText("");
                txtAjudante1B.setEnabled(true);
            }
        }
        if (cPrimeiraConversa.isSelected() && cVideo.isSelected() && txtParte2.getText().isEmpty()) {
            labelParte2.setText("Primeira Conversa:");
            txtParte2.setText("");
            txtParte2.setEnabled(true);
            txtAjudante2.setText("");
            txtAjudante2.setEnabled(true);
            if (cSalaAB.isSelected()) {
                txtParte2B.setText("");
                txtParte2B.setEnabled(true);
                txtAjudante2B.setText("");
                txtAjudante2B.setEnabled(true);
            }
        }
        if (cPrimeiraConversa1.isSelected() && txtParte2.getText().isEmpty()) {
            labelParte2.setText("Primeira Conversa - 1:");
            txtParte2.setText("");
            txtParte2.setEnabled(true);
            txtAjudante2.setText("");
            txtAjudante2.setEnabled(true);
            if (cSalaAB.isSelected()) {
                txtParte2B.setText("");
                txtParte2B.setEnabled(true);
                txtAjudante2B.setText("");
                txtAjudante2B.setEnabled(true);
            }
        }
        if (cPrimeiraConversa2.isSelected() && txtParte3.getText().isEmpty()) {
            labelParte3.setText("Primeira Conversa - 2:");
            txtParte3.setText("");
            txtParte3.setEnabled(true);
            txtAjudante3.setText("");
            txtAjudante3.setEnabled(true);
            if (cSalaAB.isSelected()) {
                txtParte3B.setText("");
                txtParte3B.setEnabled(true);
                txtAjudante3B.setText("");
                txtAjudante3B.setEnabled(true);
            }
        }
        if (cRevisita.isSelected() && txtParte2.getText().isEmpty() && !cVideo.isSelected()) {
            labelParte2.setText("Revisita:");
            txtParte2.setText("");
            txtParte2.setEnabled(true);
            txtAjudante2.setText("");
            txtAjudante2.setEnabled(true);
            if (cSalaAB.isSelected()) {
                txtParte2B.setText("");
                txtParte2B.setEnabled(true);
                txtAjudante2B.setText("");
                txtAjudante2B.setEnabled(true);
            }
        }

        if (cRevisita.isSelected() && txtParte3.getText().isEmpty() && cVideo.isSelected() && cPrimeiraConversa.isSelected()) {
            labelParte3.setText("Revisita:");
            txtParte3.setText("");
            txtParte3.setEnabled(true);
            txtAjudante3.setText("");
            txtAjudante3.setEnabled(true);
            if (cSalaAB.isSelected()) {
                txtParte3B.setText("");
                txtParte3B.setEnabled(true);
                txtAjudante3B.setText("");
                txtAjudante3B.setEnabled(true);
            }
        }

        if (cRevisita1.isSelected() && txtParte2.getText().isEmpty()) {
            labelParte2.setText("Revisita - 1:");
            txtParte2.setText("");
            txtParte2.setEnabled(true);
            txtAjudante2.setText("");
            txtAjudante2.setEnabled(true);
            if (cSalaAB.isSelected()) {
                txtParte2B.setText("");
                txtParte2B.setEnabled(true);
                txtAjudante2B.setText("");
                txtAjudante2B.setEnabled(true);
            }
        }
        if (cRevisita2.isSelected() && txtParte3.getText().isEmpty()) {
            labelParte3.setText("Revisita - 2:");
            txtParte3.setText("");
            txtParte3.setEnabled(true);
            txtAjudante3.setText("");
            txtAjudante3.setEnabled(true);
            if (cSalaAB.isSelected()) {
                txtParte3B.setText("");
                txtParte3B.setEnabled(true);
                txtAjudante3B.setText("");
                txtAjudante3B.setEnabled(true);
            }
        }
        if (cEstudoBiblico.isSelected() && txtParte3.getText().isEmpty()) {
            labelParte3.setText("Estudo Bíblico:");
            txtParte3.setText("");
            txtParte3.setEnabled(true);
            txtAjudante3.setText("");
            txtAjudante3.setEnabled(true);
            if (cSalaAB.isSelected()) {
                txtParte3B.setText("");
                txtParte3B.setEnabled(true);
                txtAjudante3B.setText("");
                txtAjudante3B.setEnabled(true);
            }
        }
        if (cDiscurso.isSelected() && txtParte3.getText().isEmpty()) {
            labelParte3.setText("Discurso:");
            txtParte3.setText("");
            txtParte3.setEnabled(true);
            txtAjudante3.setText("NA");
            txtAjudante3.setEnabled(false);
            if (cSalaAB.isSelected()) {
                txtParte3B.setText("");
                txtParte3B.setEnabled(true);
                txtAjudante3B.setText("NA");
                txtAjudante3B.setEnabled(false);
            }
        }
        if (cNossaVida1.isSelected() && txtCrista1.getText().isEmpty()) {
            txtCrista1.setText("");
            txtCrista1.setEnabled(true);
        }
        if (cNossaVida2.isSelected() && txtNossaVida2.getText().isEmpty()) {
            txtNossaVida2.setText("");
            txtNossaVida2.setEnabled(true);
        }
        if (cEstudoCongregacao.isSelected() && txtEstudoCongregacao.getText().isEmpty()) {
            txtEstudoCongregacao.setText("");
            txtEstudoCongregacao.setEnabled(true);
        }
        if (cLeitor.isSelected() && txtLeitor.getText().isEmpty()) {
            txtLeitor.setText("");
            txtLeitor.setEnabled(true);
        }
        if (cOracaoFinal.isSelected() && txtOracaoFinal.getText().isEmpty()) {
            txtOracaoFinal.setText("");
            txtOracaoFinal.setEnabled(true);
        }
    }

    private void iniciar() {
        txtPresidente.setText(null);
        txtPresidenteB.setText(null);
        txtOracaoInicial.setText(null);
        txtTesouros.setText(null);
        txtJoias.setText(null);
        txtCrista1.setText(null);
        txtNossaVida2.setText(null);
        txtEstudoCongregacao.setText(null);
        txtLeitor.setText(null);
        txtOracaoFinal.setText(null);
    }

    private Integer selecionarMes() {
        if (comboMes.getSelectedIndex() == 1) {
            mes = "Janeiro";
            return 1;
        }
        if (comboMes.getSelectedIndex() == 2) {
            mes = "Fevereiro";
            return 2;
        }
        if (comboMes.getSelectedIndex() == 3) {
            mes = "Março";
            return 3;
        }
        if (comboMes.getSelectedIndex() == 4) {
            mes = "Abril";
            return 4;
        }
        if (comboMes.getSelectedIndex() == 5) {
            mes = "Maio";
            return 5;
        }
        if (comboMes.getSelectedIndex() == 6) {
            mes = "Junho";
            return 6;
        }
        if (comboMes.getSelectedIndex() == 7) {
            mes = "Julho";
            return 7;
        }
        if (comboMes.getSelectedIndex() == 8) {
            mes = "Agosto";
            return 8;
        }
        if (comboMes.getSelectedIndex() == 9) {
            mes = "Setembro";
            return 9;
        }
        if (comboMes.getSelectedIndex() == 10) {
            mes = "Outubro";
            return 10;
        }
        if (comboMes.getSelectedIndex() == 11) {
            mes = "Novembro";
            return 11;
        }
        if (comboMes.getSelectedIndex() == 12) {
            mes = "Dezembro";
            return 12;
        }
        return null;
    }

    private String selecionarAno() {
        if (comboAno.getSelectedIndex() == 1) {
            ano = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
            return String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
        }
        if (comboAno.getSelectedIndex() == 2) {
            ano = String.valueOf(Calendar.getInstance().get(Calendar.YEAR) + 1);
            return String.valueOf(Calendar.getInstance().get(Calendar.YEAR) + 1);
        }
        return null;
    }

    private void verData() {
        int a = selecionarMes();
        String b = selecionarAno();
        LocalDate data = LocalDate.of(Integer.parseInt(b), a, 1);

        while (data.getMonthValue() == a) {
            if (data.getDayOfWeek() == DayOfWeek.MONDAY) {
                segundasFeiras.add(data);
            }
            data = data.plusDays(1);
        }
        SemanaDAO sDAO = new SemanaDAO();
        while (linha < segundasFeiras.size()) {
            semanaAtual = segundasFeiras.get(linha);
            if (!sDAO.verificarDataCadastrada(semanaAtual)) {
                panelA.setVisible(true);
                DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                labelDATA.setText("Semana: " + semanaAtual.format(df));
                //Salvar a variavel dia
                int diaDoMes = semanaAtual.getDayOfMonth();
                String diaDoMesFormatado = String.format("%02d", diaDoMes);
                dia = diaDoMesFormatado.substring(0, 2);
                System.out.println("Dois primeiros dígitos do dia: " + dia);
                break;  // Sai do loop ao encontrar uma semana não cadastrada
            }
            linha++;
        }
        if (linha >= segundasFeiras.size()) {
            Mensagem.mensagemAlerta("Este mês já foi designado");
        }
    }

    //Desmarcar CHECKBOX
    private void desmarcarCheck() {
        buttonGroup1.clearSelection();
        cPresidente.setSelected(false);
        cOracaoInicial.setSelected(false);
        cTesouros.setSelected(false);
        cJoias.setSelected(false);
        cLeituraBiblia.setSelected(false);
        cVideo.setSelected(false);
        cPrimeiraConversa.setSelected(false);
        cPrimeiraConversa1.setSelected(false);
        cPrimeiraConversa2.setSelected(false);
        cRevisita.setSelected(false);
        cRevisita1.setSelected(false);
        cRevisita2.setSelected(false);
        cEstudoBiblico.setSelected(false);
        cDiscurso.setSelected(false);
        cNossaVida1.setSelected(false);
        cNossaVida2.setSelected(false);
        cEstudoCongregacao.setSelected(false);
        cLeitor.setSelected(false);
        cOracaoFinal.setSelected(false);
    }

    //Desmarcar Campos de Textos
    private void limparCampoTextos() {
        txtPresidente.setText(null);
        txtPresidente.setEnabled(true);
        txtOracaoInicial.setText(null);
        txtOracaoInicial.setEnabled(true);
        txtTesouros.setText(null);
        txtTesouros.setEnabled(true);
        txtJoias.setText(null);
        txtJoias.setEnabled(true);

        txtLeituraBiblia.setText(null);
        txtLeituraBiblia.setEnabled(true);
        txtParte1.setText(null);
        txtParte1.setEnabled(true);
        txtAjudante1.setText(null);
        txtAjudante1.setEnabled(true);
        txtParte2.setText(null);
        txtParte2.setEnabled(true);
        txtAjudante2.setText(null);
        txtAjudante2.setEnabled(true);
        txtParte3.setText(null);
        txtParte3.setEnabled(true);
        txtAjudante3.setText(null);
        txtAjudante3.setEnabled(true);

        txtCrista1.setText(null);
        txtCrista1.setEnabled(true);
        txtNossaVida2.setText(null);
        txtNossaVida2.setEnabled(true);
        txtEstudoCongregacao.setText(null);
        txtEstudoCongregacao.setEnabled(true);
        txtLeitor.setText(null);
        txtLeitor.setEnabled(true);
        txtOracaoFinal.setText(null);
        txtOracaoFinal.setEnabled(true);
        txtPresidenteB.setText(null);
        txtPresidenteB.setEnabled(true);
        txtLeituraBibliaB.setText(null);
        txtLeituraBibliaB.setEnabled(true);
        txtParte1B.setText(null);
        txtParte1B.setEnabled(true);
        txtAjudante1B.setText(null);
        txtAjudante1B.setEnabled(true);
        txtParte2B.setText(null);
        txtParte2B.setEnabled(true);
        txtAjudante2B.setText(null);
        txtAjudante2B.setEnabled(false);
        txtParte3B.setText(null);
        txtParte3B.setEnabled(true);
        txtAjudante3B.setText(null);
        txtAjudante3B.setEnabled(true);
    }

    protected void altPresidenteA(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (!txtPresidente.getText().isEmpty()) {
                listaIgnorar.remove(Integer.valueOf(presidenteA.getPessoa().getId()));
                PresidenteDAO daos = new PresidenteDAO();
                presidenteA = daos.buscarPorIdPessoa(a.getId());
                txtPresidente.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorar.add(presidenteA.getPessoa().getId());
                Mensagem.mensagemExito("Designado para Presidente sala A, Alterado com Sucesso");
            } else {
                PresidenteDAO daos = new PresidenteDAO();
                presidenteA = daos.buscarPorIdPessoa(a.getId());
                txtPresidente.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorar.add(presidenteA.getPessoa().getId());
                Mensagem.mensagemExito("Designado para Presidente sala A, Alterado com Sucesso");
            }
        });
    }

    protected void altOracaoInicial(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (!txtOracaoInicial.getText().isEmpty()) {
                listaIgnorar.remove(Integer.valueOf(oracaoA.getPessoa().getId()));
                OracaoDAO daos = new OracaoDAO();
                oracaoA = daos.buscarPorIdPessoa(a.getId());
                txtOracaoInicial.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorar.add(oracaoA.getPessoa().getId());
                Mensagem.mensagemExito("Designado para Oração Inicial, Alterado com Sucesso");
            } else {
                OracaoDAO daos = new OracaoDAO();
                oracaoA = daos.buscarPorIdPessoa(a.getId());
                txtOracaoInicial.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorar.add(oracaoA.getPessoa().getId());
                Mensagem.mensagemExito("Designado para Oração Inicial, Alterado com Sucesso");
            }
        });
    }

    protected void altLeituraBibliaA(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (leituraBibliaA != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(leituraBibliaA.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                leituraBibliaA = pDAO.buscarPessoaPorId(a.getId());
                txtLeituraBiblia.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(leituraBibliaA.getId());
                Mensagem.mensagemExito("Designado para Leitura da Bíblia sala A, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                leituraBibliaA = pDAO.buscarPessoaPorId(a.getId());
                txtLeituraBiblia.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(leituraBibliaA.getId());
                Mensagem.mensagemExito("Designado para Leitura da Bíblia sala A, Alterado com Sucesso");
            }
        });
    }

    protected void altTesouros(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (!txtTesouros.getText().isEmpty()) {
                listaIgnorar.remove(Integer.valueOf(tesouros.getPessoa().getId()));
                TesourosDAO tDAO = new TesourosDAO();
                tesouros = tDAO.buscarPorIdPessoa(a.getId());
                txtTesouros.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorar.add(tesouros.getPessoa().getId());
                Mensagem.mensagemExito("Designado para Tesouros, Alterado com Sucesso");
            } else {
                TesourosDAO tDAO = new TesourosDAO();
                tesouros = tDAO.buscarPorIdPessoa(a.getId());
                txtTesouros.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorar.add(tesouros.getPessoa().getId());
                Mensagem.mensagemExito("Designado para Tesouros, Alterado com Sucesso");
            }
        });
    }

    protected void altNossaVida1(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (!txtCrista1.getText().isEmpty()) {
                listaIgnorar.remove(Integer.valueOf(nossaVida1.getPessoa().getId()));
                NossaVidaDAO vidaDAO = new NossaVidaDAO();
                nossaVida1 = vidaDAO.buscarPorIdPessoa(a.getId());
                txtCrista1.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorar.add(nossaVida1.getPessoa().getId());
                Mensagem.mensagemExito("Designado para Nossa Vida parte 1, Alterado com Sucesso");
            } else {
                NossaVidaDAO vidaDAO = new NossaVidaDAO();
                nossaVida1 = vidaDAO.buscarPorIdPessoa(a.getId());
                txtCrista1.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorar.add(nossaVida1.getPessoa().getId());
                Mensagem.mensagemExito("Designado para Nossa Vida parte 1, Alterado com Sucesso");
            }
        });
    }

    protected void altLeitorEstudo(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (!txtLeitor.getText().isEmpty()) {
                listaIgnorar.remove(Integer.valueOf(leitor.getPessoa().getId()));
                LeitorDAO leiDAO = new LeitorDAO();
                leitor = leiDAO.buscarPorIdPessoa(a.getId());
                txtLeitor.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorar.add(leitor.getPessoa().getId());
                Mensagem.mensagemExito("Designado para Leitor do Estudo Bíblico de Congregação, Alterado com Sucesso");
            } else {
                LeitorDAO leiDAO = new LeitorDAO();
                leitor = leiDAO.buscarPorIdPessoa(a.getId());
                txtLeitor.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorar.add(leitor.getPessoa().getId());
                Mensagem.mensagemExito("Designado para Leitor do Estudo Bíblico de Congregação, Alterado com Sucesso");
            }
        });
    }

    protected void altJoias(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (!txtJoias.getText().isEmpty()) {
                listaIgnorar.remove(Integer.valueOf(joias.getPessoa().getId()));
                JoiasDAO jDAO = new JoiasDAO();
                joias = jDAO.buscarPorIdPessoa(a.getId());
                txtJoias.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorar.add(joias.getPessoa().getId());
                Mensagem.mensagemExito("Designado para Joias Espirituais, Alterado com Sucesso");
            } else {
                JoiasDAO jDAO = new JoiasDAO();
                joias = jDAO.buscarPorIdPessoa(a.getId());
                txtJoias.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorar.add(joias.getPessoa().getId());
                Mensagem.mensagemExito("Designado para Joias Espirituais, Alterado com Sucesso");
            }
        });
    }

    protected void altPrimeiraConversaA(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (primeiraA != null && labelParte1.getText().equals("Primeira Conversa:")) {
                listaIgnorarEstudantes.remove(Integer.valueOf(primeiraA.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                primeiraA = pDAO.buscarPessoaPorId(a.getId());
                txtParte1.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(primeiraA.getId());
                Mensagem.mensagemExito("Designado para Primeira Conversa - sala A, Alterado com Sucesso");
            } else if (primeiraA == null && labelParte1.getText().equals("Primeira Conversa:")) {
                PessoaDAO pDAO = new PessoaDAO();
                primeiraA = pDAO.buscarPessoaPorId(a.getId());
                txtParte1.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(primeiraA.getId());
                Mensagem.mensagemExito("Designado para Primeira Conversa - sala A, Alterado com Sucesso");
            } else if (primeiraA != null && labelParte2.getText().equals("Primeira Conversa:")) {
                listaIgnorarEstudantes.remove(Integer.valueOf(primeiraA.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                primeiraA = pDAO.buscarPessoaPorId(a.getId());
                txtParte2.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(primeiraA.getId());
                Mensagem.mensagemExito("Designado para Primeira Conversa - sala A, Alterado com Sucesso");
            } else if (primeiraA == null && labelParte2.getText().equals("Primeira Conversa:")) {
                PessoaDAO pDAO = new PessoaDAO();
                primeiraA = pDAO.buscarPessoaPorId(a.getId());
                txtParte2.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(primeiraA.getId());
                Mensagem.mensagemExito("Designado para Primeira Conversa - sala A, Alterado com Sucesso");
            }
        });
    }

    protected void altAjudantePrimeiraConversaA(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (ajudantePrimeiraA != null && labelParte1.getText().equals("Primeira Conversa:")) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudantePrimeiraA.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                ajudantePrimeiraA = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante1.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudantePrimeiraA.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Primeira Conversa - sala A, Alterado com Sucesso");
            } else if (ajudantePrimeiraA == null && labelParte1.getText().equals("Primeira Conversa:")) {
                PessoaDAO pDAO = new PessoaDAO();
                ajudantePrimeiraA = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante1.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudantePrimeiraA.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Primeira Conversa - sala A, Alterado com Sucesso");
            } else if (ajudantePrimeiraA != null && labelParte2.getText().equals("Primeira Conversa:")) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudantePrimeiraA.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                ajudantePrimeiraA = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante2.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudantePrimeiraA.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Primeira Conversa - sala A, Alterado com Sucesso");
            } else if (ajudantePrimeiraA == null && labelParte2.getText().equals("Primeira Conversa:")) {
                PessoaDAO pDAO = new PessoaDAO();
                ajudantePrimeiraA = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante2.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudantePrimeiraA.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Primeira Conversa - sala A, Alterado com Sucesso");
            }
        });
    }

    protected void altPrimeiraConversa2A(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (primeira2A != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(primeira2A.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                primeira2A = pDAO.buscarPessoaPorId(a.getId());
                txtParte3.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(primeira2A.getId());
                Mensagem.mensagemExito("Designado para Primeira Conversa 2 - sala A, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                primeira2A = pDAO.buscarPessoaPorId(a.getId());
                txtParte3.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(primeira2A.getId());
                Mensagem.mensagemExito("Designado para Primeira Conversa 2 - sala A, Alterado com Sucesso");
            }
        });
    }

    protected void altAjudantePrimeiraConversa2A(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (ajudantePrimeira2A != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudantePrimeira2A.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                ajudantePrimeira2A = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante3.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudantePrimeira2A.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Primeira Conversa 2 - sala A, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                ajudantePrimeira2A = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante3.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudantePrimeira2A.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Primeira Conversa 2 - sala A, Alterado com Sucesso");
            }
        });
    }

    protected void altRevisitaA(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (revisitaA != null && labelParte2.getText().equals("Revisita:")) {
                listaIgnorarEstudantes.remove(Integer.valueOf(revisitaA.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                revisitaA = pDAO.buscarPessoaPorId(a.getId());
                txtParte2.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(revisitaA.getId());
                Mensagem.mensagemExito("Designado para Revisita - sala A, Alterado com Sucesso");
            } else if (revisitaA == null && labelParte2.getText().equals("Revisita:")) {
                PessoaDAO pDAO = new PessoaDAO();
                revisitaA = pDAO.buscarPessoaPorId(a.getId());
                txtParte2.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(revisitaA.getId());
                Mensagem.mensagemExito("Designado para Revisita - sala A, Alterado com Sucesso");
            } else if (revisitaA != null && labelParte3.getText().equals("Revisita:")) {
                listaIgnorarEstudantes.remove(Integer.valueOf(revisitaA.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                revisitaA = pDAO.buscarPessoaPorId(a.getId());
                txtParte3.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(revisitaA.getId());
                Mensagem.mensagemExito("Designado para Revisita - sala A, Alterado com Sucesso");
            } else if (revisitaA == null && labelParte3.getText().equals("Revisita:")) {
                PessoaDAO pDAO = new PessoaDAO();
                revisitaA = pDAO.buscarPessoaPorId(a.getId());
                txtParte3.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(revisitaA.getId());
                Mensagem.mensagemExito("Designado para Revisita - sala A, Alterado com Sucesso");
            }
        });
    }

    protected void altAjudanteRevisitaA(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (ajudanteRevisitaA != null && labelParte2.getText().equals("Revisita:")) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudanteRevisitaA.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                ajudanteRevisitaA = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante2.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudanteRevisitaA.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Revisita - sala A, Alterado com Sucesso");
            } else if (ajudanteRevisitaA == null && labelParte2.getText().equals("Revisita:")) {
                PessoaDAO pDAO = new PessoaDAO();
                ajudanteRevisitaA = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante2.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudanteRevisitaA.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Revisita - sala A, Alterado com Sucesso");
            } else if (ajudanteRevisitaA != null && labelParte3.getText().equals("Revisita:")) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudanteRevisitaA.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                ajudanteRevisitaA = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante3.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudanteRevisitaA.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Revisita - sala A, Alterado com Sucesso");
            } else if (ajudanteRevisitaA == null && labelParte3.getText().equals("Revisita:")) {
                PessoaDAO pDAO = new PessoaDAO();
                ajudanteRevisitaA = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante3.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudanteRevisitaA.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Revisita - sala A, Alterado com Sucesso");
            }
        });
    }

    protected void altRevisita2A(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (revisita2A != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(revisita2A.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                revisita2A = pDAO.buscarPessoaPorId(a.getId());
                txtParte3.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(revisita2A.getId());
                Mensagem.mensagemExito("Designado para Revisita 2 - sala A, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                revisita2A = pDAO.buscarPessoaPorId(a.getId());
                txtParte3.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(revisita2A.getId());
                Mensagem.mensagemExito("Designado para Revisita 2 - sala A, Alterado com Sucesso");
            }
        });
    }

    protected void altAjudanteRevisita2A(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (ajudanteRevisita2A != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudanteRevisita2A.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                ajudanteRevisita2A = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante3.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudanteRevisita2A.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Revisita 2 - sala A, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                ajudanteRevisita2A = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante3.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudanteRevisita2A.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Revisita 2 - sala A, Alterado com Sucesso");
            }
        });
    }

    protected void altEstudoBiblicoA(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (estudoA != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(estudoA.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                estudoA = pDAO.buscarPessoaPorId(a.getId());
                txtParte3.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(estudoA.getId());
                Mensagem.mensagemExito("Designado para Estudo Bíblico - sala A, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                estudoA = pDAO.buscarPessoaPorId(a.getId());
                txtParte3.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(estudoA.getId());
                Mensagem.mensagemExito("Designado para Estudo Bíblico - sala A, Alterado com Sucesso");
            }
        });
    }

    protected void altAjudanteEstudoBiblicoA(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (estudoAjudanteA != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(estudoAjudanteA.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                estudoAjudanteA = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante3.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(estudoAjudanteA.getId());
                Mensagem.mensagemExito("Designado para Ajudante do Estudo Bíblico - sala A, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                estudoAjudanteA = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante3.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(estudoAjudanteA.getId());
                Mensagem.mensagemExito("Designado para Ajudante do Estudo Bíblico - sala A, Alterado com Sucesso");
            }
        });
    }

    protected void altDiscursoA(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (discursoA != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(discursoA.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                discursoA = pDAO.buscarPessoaPorId(a.getId());
                txtParte3.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(discursoA.getId());
                Mensagem.mensagemExito("Designado para Discurso - sala A, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                discursoA = pDAO.buscarPessoaPorId(a.getId());
                txtParte3.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(discursoA.getId());
                Mensagem.mensagemExito("Designado para Discurso - sala A, Alterado com Sucesso");
            }
        });
    }

    protected void altOracaoFinal(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (!txtOracaoFinal.getText().isEmpty()) {
                listaIgnorar.remove(Integer.valueOf(oracaoB.getPessoa().getId()));
                OracaoDAO daos = new OracaoDAO();
                oracaoB = daos.buscarPorIdPessoa(a.getId());
                txtOracaoFinal.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorar.add(oracaoB.getPessoa().getId());
                Mensagem.mensagemExito("Designado para Oração Final, Alterado com Sucesso");
            } else {
                OracaoDAO daos = new OracaoDAO();
                oracaoB = daos.buscarPorIdPessoa(a.getId());
                txtOracaoFinal.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorar.add(oracaoB.getPessoa().getId());
                Mensagem.mensagemExito("Designado para Oração Final, Alterado com Sucesso");
            }
        });
    }

    protected void altNossaVida2(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (!txtNossaVida2.getText().isEmpty()) {
                listaIgnorar.remove(Integer.valueOf(nossaVida2.getPessoa().getId()));
                NossaVidaDAO vidaDAO = new NossaVidaDAO();
                nossaVida2 = vidaDAO.buscarPorIdPessoa(a.getId());
                txtNossaVida2.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorar.add(nossaVida2.getPessoa().getId());
                Mensagem.mensagemExito("Designado para Nossa Vida parte 2, Alterado com Sucesso");
            } else {
                NossaVidaDAO vidaDAO = new NossaVidaDAO();
                nossaVida2 = vidaDAO.buscarPorIdPessoa(a.getId());
                txtNossaVida2.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorar.add(nossaVida2.getPessoa().getId());
                Mensagem.mensagemExito("Designado para Nossa Vida parte 2, Alterado com Sucesso");
            }
        });
    }

    protected void altEstudoCongregacao(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (!txtEstudoCongregacao.getText().isEmpty()) {
                listaIgnorar.remove(Integer.valueOf(estudoCong.getPessoa().getId()));
                EstudoBiblicoCongregacaoDAO congDAO = new EstudoBiblicoCongregacaoDAO();
                estudoCong = congDAO.buscarPorIdPessoa(a.getId());
                txtEstudoCongregacao.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorar.add(estudoCong.getPessoa().getId());
                Mensagem.mensagemExito("Designado para o Estudo Bíblico de Congregação, Alterado com Sucesso");
            } else {
                EstudoBiblicoCongregacaoDAO congDAO = new EstudoBiblicoCongregacaoDAO();
                estudoCong = congDAO.buscarPorIdPessoa(a.getId());
                txtEstudoCongregacao.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorar.add(estudoCong.getPessoa().getId());
                Mensagem.mensagemExito("Designado para o Estudo Bíblico de Congregação, Alterado com Sucesso");
            }
        });
    }

    protected void altPresidenteB(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (!txtPresidenteB.getText().isEmpty()) {
                listaIgnorar.remove(Integer.valueOf(presidenteB.getPessoa().getId()));
                PresidenteDAO daos = new PresidenteDAO();
                presidenteB = daos.buscarPorIdPessoa(a.getId());
                txtPresidenteB.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorar.add(presidenteB.getPessoa().getId());
                Mensagem.mensagemExito("Designado para Presidente sala B, Alterado com Sucesso");
            } else {
                PresidenteDAO daos = new PresidenteDAO();
                presidenteB = daos.buscarPorIdPessoa(a.getId());
                txtPresidenteB.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorar.add(presidenteB.getPessoa().getId());
                Mensagem.mensagemExito("Designado para Presidente sala B, Alterado com Sucesso");
            }
        });
    }

    protected void altPrimeiraConversaB(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (primeiraB != null && labelParte1.getText().equals("Primeira Conversa:")) {
                listaIgnorarEstudantes.remove(Integer.valueOf(primeiraB.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                primeiraB = pDAO.buscarPessoaPorId(a.getId());
                txtParte1B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(primeiraB.getId());
                Mensagem.mensagemExito("Designado para Primeira Conversa - sala B, Alterado com Sucesso");
            } else if (primeiraB == null && labelParte1.getText().equals("Primeira Conversa:")) {
                PessoaDAO pDAO = new PessoaDAO();
                primeiraB = pDAO.buscarPessoaPorId(a.getId());
                txtParte1B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(primeiraB.getId());
                Mensagem.mensagemExito("Designado para Primeira Conversa - sala B, Alterado com Sucesso");
            } else if (primeiraB != null && labelParte2.getText().equals("Primeira Conversa:")) {
                listaIgnorarEstudantes.remove(Integer.valueOf(primeiraB.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                primeiraB = pDAO.buscarPessoaPorId(a.getId());
                txtParte2B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(primeiraB.getId());
                Mensagem.mensagemExito("Designado para Primeira Conversa - sala B, Alterado com Sucesso");
            } else if (primeiraB == null && labelParte2.getText().equals("Primeira Conversa:")) {
                PessoaDAO pDAO = new PessoaDAO();
                primeiraB = pDAO.buscarPessoaPorId(a.getId());
                txtParte2B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(primeiraB.getId());
                Mensagem.mensagemExito("Designado para Primeira Conversa - sala B, Alterado com Sucesso");
            }
        });
    }

    protected void altAjudantePrimeiraConversaB(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (ajudantePrimeiraB != null && labelParte1.getText().equals("Primeira Conversa:")) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudantePrimeiraB.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                ajudantePrimeiraB = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante1B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudantePrimeiraB.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Primeira Conversa - sala B, Alterado com Sucesso");
            } else if (ajudantePrimeiraB == null && labelParte1.getText().equals("Primeira Conversa:")) {
                PessoaDAO pDAO = new PessoaDAO();
                ajudantePrimeiraB = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante1B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudantePrimeiraB.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Primeira Conversa - sala B, Alterado com Sucesso");
            } else if (ajudantePrimeiraB != null && labelParte2.getText().equals("Primeira Conversa:")) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudantePrimeiraB.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                ajudantePrimeiraB = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante2B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudantePrimeiraB.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Primeira Conversa - sala B, Alterado com Sucesso");
            } else if (ajudantePrimeiraB == null && labelParte2.getText().equals("Primeira Conversa:")) {
                PessoaDAO pDAO = new PessoaDAO();
                ajudantePrimeiraB = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante2B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudantePrimeiraB.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Primeira Conversa - sala B, Alterado com Sucesso");
            }
        });
    }

    protected void altPrimeiraConversa2B(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (primeira2B != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(primeira2B.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                primeira2B = pDAO.buscarPessoaPorId(a.getId());
                txtParte3B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(primeira2B.getId());
                Mensagem.mensagemExito("Designado para Primeira Conversa 2 - sala B, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                primeira2B = pDAO.buscarPessoaPorId(a.getId());
                txtParte3B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(primeira2B.getId());
                Mensagem.mensagemExito("Designado para Primeira Conversa 2 - sala B, Alterado com Sucesso");
            }
        });
    }

    protected void altAjudantePrimeiraConversa2B(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (ajudantePrimeira2B != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudantePrimeira2B.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                ajudantePrimeira2B = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante3B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudantePrimeira2B.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Primeira Conversa 2 - sala B, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                ajudantePrimeira2B = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante3B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudantePrimeira2B.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Primeira Conversa 2 - sala B, Alterado com Sucesso");
            }
        });
    }

    protected void altRevisitaB(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (revisitaB != null && labelParte2.getText().equals("Revisita:")) {
                listaIgnorarEstudantes.remove(Integer.valueOf(revisitaB.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                revisitaB = pDAO.buscarPessoaPorId(a.getId());
                txtParte2B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(revisitaB.getId());
                Mensagem.mensagemExito("Designado para Revisita - sala B, Alterado com Sucesso");
            } else if (revisitaB == null && labelParte2.getText().equals("Revisita:")) {
                PessoaDAO pDAO = new PessoaDAO();
                revisitaB = pDAO.buscarPessoaPorId(a.getId());
                txtParte2B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(revisitaB.getId());
                Mensagem.mensagemExito("Designado para Revisita - sala B, Alterado com Sucesso");
            } else if (revisitaB != null && labelParte3.getText().equals("Revisita:")) {
                listaIgnorarEstudantes.remove(Integer.valueOf(revisitaB.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                revisitaB = pDAO.buscarPessoaPorId(a.getId());
                txtParte3B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(revisitaB.getId());
                Mensagem.mensagemExito("Designado para Revisita - sala B, Alterado com Sucesso");
            } else if (revisitaB == null && labelParte3.getText().equals("Revisita:")) {
                PessoaDAO pDAO = new PessoaDAO();
                revisitaB = pDAO.buscarPessoaPorId(a.getId());
                txtParte3B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(revisitaB.getId());
                Mensagem.mensagemExito("Designado para Revisita - sala B, Alterado com Sucesso");
            }
        });
    }

    protected void altAjudanteRevisitaB(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (ajudanteRevisitaB != null && labelParte2.getText().equals("Revisita:")) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudanteRevisitaB.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                ajudanteRevisitaB = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante2B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudanteRevisitaB.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Revisita - sala B, Alterado com Sucesso");
            } else if (ajudanteRevisitaB != null && labelParte2.getText().equals("Revisita:")) {
                PessoaDAO pDAO = new PessoaDAO();
                ajudanteRevisitaB = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante2B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudanteRevisitaB.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Revisita - sala B, Alterado com Sucesso");
            } else if (ajudanteRevisitaB != null && labelParte3.getText().equals("Revisita:")) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudanteRevisitaB.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                ajudanteRevisitaB = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante3B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudanteRevisitaB.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Revisita - sala B, Alterado com Sucesso");
            } else if (ajudanteRevisitaB != null && labelParte3.getText().equals("Revisita:")) {
                PessoaDAO pDAO = new PessoaDAO();
                ajudanteRevisitaB = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante3B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudanteRevisitaB.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Revisita - sala B, Alterado com Sucesso");
            }
        });
    }

    protected void altRevisita2B(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (revisita2B != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(revisita2B.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                revisita2B = pDAO.buscarPessoaPorId(a.getId());
                txtParte3B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(revisita2B.getId());
                Mensagem.mensagemExito("Designado para Revisita 2 - sala B, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                revisita2B = pDAO.buscarPessoaPorId(a.getId());
                txtParte3B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(revisita2B.getId());
                Mensagem.mensagemExito("Designado para Revisita 2 - sala B, Alterado com Sucesso");
            }
        });
    }

    protected void altAjudanteRevisita2B(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (ajudanteRevisita2B != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudanteRevisita2B.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                ajudanteRevisita2B = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante3B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudanteRevisita2B.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Revisita 2 - sala B, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                ajudanteRevisita2B = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante3B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudanteRevisita2B.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Revisita 2 - sala B, Alterado com Sucesso");
            }
        });
    }

    protected void altEstudoBiblicoB(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (estudoB != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(estudoB.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                estudoB = pDAO.buscarPessoaPorId(a.getId());
                txtParte3B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(estudoB.getId());
                Mensagem.mensagemExito("Designado para Estudo Bíblico - sala B, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                estudoB = pDAO.buscarPessoaPorId(a.getId());
                txtParte3B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(estudoB.getId());
                Mensagem.mensagemExito("Designado para Estudo Bíblico - sala B, Alterado com Sucesso");
            }
        });
    }

    protected void altAjudanteEstudoBiblicoB(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (estudoAjudanteB != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(estudoAjudanteB.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                estudoAjudanteB = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante3B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(estudoAjudanteB.getId());
                Mensagem.mensagemExito("Designado para Ajudante do Estudo Bíblico - sala B, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                estudoAjudanteB = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante3B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(estudoAjudanteB.getId());
                Mensagem.mensagemExito("Designado para Ajudante do Estudo Bíblico - sala B, Alterado com Sucesso");
            }
        });
    }

    protected void altDiscursoB(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (discursoB != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(discursoB.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                discursoB = pDAO.buscarPessoaPorId(a.getId());
                txtParte3B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(discursoB.getId());
                Mensagem.mensagemExito("Designado para Discurso - sala B, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                discursoB = pDAO.buscarPessoaPorId(a.getId());
                txtParte3B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(discursoB.getId());
                Mensagem.mensagemExito("Designado para Discurso - sala B, Alterado com Sucesso");
            }
        });
    }

    protected void altLeituraBibliaB(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (leituraBibliaB != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(leituraBibliaB.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                leituraBibliaB = pDAO.buscarPessoaPorId(a.getId());
                txtLeituraBibliaB.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(leituraBibliaB.getId());
                Mensagem.mensagemExito("Designado para Leitura da Bíblia sala B, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                leituraBibliaB = pDAO.buscarPessoaPorId(a.getId());
                txtLeituraBibliaB.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(leituraBibliaB.getId());
                Mensagem.mensagemExito("Designado para Leitura da Bíblia sala B, Alterado com Sucesso");
            }
        });
    }

    protected void altPrimeiraConversa1A(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (primeiraA != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(primeiraA.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                primeiraA = pDAO.buscarPessoaPorId(a.getId());
                txtParte2.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(primeiraA.getId());
                Mensagem.mensagemExito("Designado para Primeira Conversa 1 - sala A, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                primeiraA = pDAO.buscarPessoaPorId(a.getId());
                txtParte2.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(primeiraA.getId());
                Mensagem.mensagemExito("Designado para Primeira Conversa 1 - sala A, Alterado com Sucesso");
            }
        });
    }

    protected void altAjudantePrimeiraConversa1A(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (ajudantePrimeiraA != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudantePrimeiraA.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                ajudantePrimeiraA = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante2.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudantePrimeiraA.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Primeira Conversa 1 - sala A, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                ajudantePrimeiraA = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante2.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudantePrimeiraA.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Primeira Conversa 1 - sala A, Alterado com Sucesso");
            }
        });
    }

    protected void altPrimeiraConversa1B(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (primeiraB != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(primeiraB.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                primeiraB = pDAO.buscarPessoaPorId(a.getId());
                txtParte2B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(primeiraB.getId());
                Mensagem.mensagemExito("Designado para Primeira Conversa 1 - sala B, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                primeiraB = pDAO.buscarPessoaPorId(a.getId());
                txtParte2B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(primeiraB.getId());
                Mensagem.mensagemExito("Designado para Primeira Conversa 1 - sala B, Alterado com Sucesso");
            }
        });
    }

    protected void altAjudantePrimeiraConversa1B(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (ajudantePrimeiraB != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudantePrimeiraB.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                ajudantePrimeiraB = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante2B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudantePrimeiraB.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Primeira Conversa 1 - sala B, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                ajudantePrimeiraB = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante2B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudantePrimeiraB.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Primeira Conversa 1 - sala B, Alterado com Sucesso");
            }
        });
    }

    protected void altRevisita1A(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (revisitaA != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(revisitaA.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                revisitaA = pDAO.buscarPessoaPorId(a.getId());
                txtParte2.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(revisitaA.getId());
                Mensagem.mensagemExito("Designado para Revisita 1 - sala A, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                revisitaA = pDAO.buscarPessoaPorId(a.getId());
                txtParte2.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(revisitaA.getId());
                Mensagem.mensagemExito("Designado para Revisita 1 - sala A, Alterado com Sucesso");
            }
        });
    }

    protected void altAjudanteRevisita1A(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (ajudanteRevisitaA != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudanteRevisitaA.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                ajudanteRevisitaA = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante2.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudanteRevisitaA.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Revisita 1 - sala A, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                ajudanteRevisitaA = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante2.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudanteRevisitaA.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Revisita 1 - sala A, Alterado com Sucesso");
            }
        });
    }

    protected void altRevisita1B(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (revisitaB != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(revisitaB.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                revisitaB = pDAO.buscarPessoaPorId(a.getId());
                txtParte2B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(revisitaB.getId());
                Mensagem.mensagemExito("Designado para Revisita 1 - sala B, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                revisitaB = pDAO.buscarPessoaPorId(a.getId());
                txtParte2B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(revisitaB.getId());
                Mensagem.mensagemExito("Designado para Revisita 1 - sala B, Alterado com Sucesso");
            }
        });
    }

    protected void altAjudanteRevisita1B(Pessoa a) {
        SwingUtilities.invokeLater(() -> {
            if (ajudanteRevisitaB != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudanteRevisitaB.getId()));
                PessoaDAO pDAO = new PessoaDAO();
                ajudanteRevisitaB = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante2B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudanteRevisitaB.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Revisita 1 - sala B, Alterado com Sucesso");
            } else {
                PessoaDAO pDAO = new PessoaDAO();
                ajudanteRevisitaB = pDAO.buscarPessoaPorId(a.getId());
                txtAjudante2B.setText(a.getNome() + " " + a.getSobrenome());
                listaIgnorarEstudantes.add(ajudanteRevisitaB.getId());
                Mensagem.mensagemExito("Designado para Ajudante da Revisita 1 - sala B, Alterado com Sucesso");
            }
        });
    }

    private void salvarTodasPartes() {
        todas = new TodasPartes();
        todas.setDia(dia);
        todas.setMes(mes);
        todas.setAno(ano);
        todas.setSemana(labelDATA.getText());
        todas.setPresidenteA(txtPresidente.getText());
        todas.setPresidenteB(txtPresidenteB.getText());
        todas.setOracaoInicial(txtOracaoInicial.getText());
        todas.setTesouros(txtTesouros.getText());
        todas.setJoias(txtJoias.getText());
        todas.setLeituraBibliaA(txtLeituraBiblia.getText());
        todas.setLeituraBibliaB(txtLeituraBibliaB.getText());
        todas.setNomeParte1(labelParte1.getText());
        todas.setParte1A(txtParte1.getText());
        todas.setAjudante1A(txtAjudante1.getText());
        todas.setParte1B(txtParte1B.getText());
        todas.setAjudante1B(txtAjudante1B.getText());
        todas.setNomeParte2(labelParte2.getText());
        todas.setParte2A(txtParte2.getText());
        todas.setAjudante2A(txtAjudante2.getText());
        todas.setParte2B(txtParte2B.getText());
        todas.setAjudante2B(txtAjudante2B.getText());
        todas.setNomeparte3(labelParte3.getText());
        todas.setParte3A(txtParte3.getText());
        todas.setAjudante3A(txtAjudante3.getText());
        todas.setParte3B(txtParte3B.getText());
        todas.setAjudante3B(txtAjudante3B.getText());
        todas.setNossaVida1(txtCrista1.getText());
        todas.setNossaVida2(txtNossaVida2.getText());
        todas.setEstudoLivro(txtEstudoCongregacao.getText());
        todas.setLeitor(txtLeitor.getText());
        todas.setOracaoFinal(txtOracaoFinal.getText());

        tddao.cadastrar(todas);
    }

    private void limparVariaveis() {
        presidenteA = null;
        presidenteB = null;
        oracaoA = null;
        oracaoB = null;
        tesouros = null;
        joias = null;
        nossaVida1 = null;
        nossaVida2 = null;
        estudoCong = null;
        leitor = null;
        leituraBibliaA = null;
        leituraBibliaB = null;
        discursoA = null;
        discursoB = null;
        primeiraA = null;
        primeiraB = null;
        primeira2A = null;
        primeira2B = null;
        ajudantePrimeiraA = null;
        ajudantePrimeiraB = null;
        ajudantePrimeira2A = null;
        ajudantePrimeira2B = null;
        revisitaA = null;
        revisitaB = null;
        revisita2A = null;
        revisita2B = null;
        ajudanteRevisitaA = null;
        ajudanteRevisitaB = null;
        ajudanteRevisita2A = null;
        ajudanteRevisita2B = null;
        estudoA = null;
        estudoB = null;
        estudoAjudanteA = null;
        estudoAjudanteB = null;
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
            java.util.logging.Logger.getLogger(Tela1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoDefinirData;
    private javax.swing.JButton botaoDesignar;
    private javax.swing.JButton botaoSalvarSemana;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cDiscurso;
    private javax.swing.JRadioButton cEstudoBiblico;
    private javax.swing.JRadioButton cEstudoCongregacao;
    private javax.swing.JRadioButton cJoias;
    private javax.swing.JRadioButton cLeitor;
    private javax.swing.JRadioButton cLeituraBiblia;
    private javax.swing.JRadioButton cNossaVida1;
    private javax.swing.JRadioButton cNossaVida2;
    private javax.swing.JRadioButton cOracaoFinal;
    private javax.swing.JRadioButton cOracaoInicial;
    private javax.swing.JRadioButton cPresidente;
    private javax.swing.JRadioButton cPrimeiraConversa;
    private javax.swing.JRadioButton cPrimeiraConversa1;
    private javax.swing.JRadioButton cPrimeiraConversa2;
    private javax.swing.JRadioButton cRevisita;
    private javax.swing.JRadioButton cRevisita1;
    private javax.swing.JRadioButton cRevisita2;
    private javax.swing.JRadioButton cSalaA;
    private javax.swing.JRadioButton cSalaAB;
    private javax.swing.JRadioButton cTesouros;
    private javax.swing.JRadioButton cVideo;
    private javax.swing.JComboBox<String> comboAno;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelAjudante1;
    private javax.swing.JLabel labelAjudante2;
    private javax.swing.JLabel labelAjudante3;
    private javax.swing.JLabel labelDATA;
    private javax.swing.JLabel labelEstudoCongregacao;
    private javax.swing.JLabel labelJoias;
    private javax.swing.JLabel labelLeitor;
    private javax.swing.JLabel labelLeituraBiblia;
    private javax.swing.JLabel labelNossaVida1;
    private javax.swing.JLabel labelNossaVida2;
    private javax.swing.JLabel labelOracaoFinal;
    private javax.swing.JLabel labelOracaoInicial;
    private javax.swing.JLabel labelParte1;
    private javax.swing.JLabel labelParte2;
    private javax.swing.JLabel labelParte3;
    private javax.swing.JLabel labelPresidente;
    private javax.swing.JLabel labelTesouros;
    private javax.swing.JPanel panelA;
    private javax.swing.JPanel panelA1;
    private javax.swing.JPanel panelB;
    private javax.swing.JTextField txtAjudante1;
    private javax.swing.JTextField txtAjudante1B;
    private javax.swing.JTextField txtAjudante2;
    private javax.swing.JTextField txtAjudante2B;
    private javax.swing.JTextField txtAjudante3;
    private javax.swing.JTextField txtAjudante3B;
    private javax.swing.JTextField txtCrista1;
    private javax.swing.JTextField txtEstudoCongregacao;
    private javax.swing.JTextField txtJoias;
    private javax.swing.JTextField txtLeitor;
    private javax.swing.JTextField txtLeituraBiblia;
    private javax.swing.JTextField txtLeituraBibliaB;
    private javax.swing.JTextField txtNossaVida2;
    private javax.swing.JTextField txtOracaoFinal;
    private javax.swing.JTextField txtOracaoInicial;
    private javax.swing.JTextField txtParte1;
    private javax.swing.JTextField txtParte1B;
    private javax.swing.JTextField txtParte2;
    private javax.swing.JTextField txtParte2B;
    private javax.swing.JTextField txtParte3;
    private javax.swing.JTextField txtParte3B;
    protected javax.swing.JTextField txtPresidente;
    private javax.swing.JTextField txtPresidenteB;
    private javax.swing.JTextField txtTesouros;
    // End of variables declaration//GEN-END:variables
}
