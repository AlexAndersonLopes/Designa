package br.com.alexlopes.designacoes.views;

import br.com.alexlopes.designacoes.dao.EstudoBiblicoCongregacaoDAO;
import br.com.alexlopes.designacoes.dao.LeitorDAO;
import br.com.alexlopes.designacoes.dao.OracaoDAO;
import br.com.alexlopes.designacoes.dao.PessoaDAO;
import br.com.alexlopes.designacoes.dao.PresidenteDAO;
import br.com.alexlopes.designacoes.dao.SemanaDAO;
import br.com.alexlopes.designacoes.dao.TesourosDAO;
import br.com.alexlopes.designacoes.dao.TodasPartesDAO;
import br.com.alexlopes.designacoes.model.EstudoBiblicoCongregacao;
import br.com.alexlopes.designacoes.model.Leitor;
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
import br.com.alexlopes.designacoes.util.whats.WhatsApp;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Tela2 extends javax.swing.JFrame {

    private TodasPartes todas;
    private final TodasPartesDAO tddao = new TodasPartesDAO();
    private FolhaDesignacao folha = new FolhaDesignacao();
    private PresidenteDAO preDAO = new PresidenteDAO();
    private Presidente presidenteA, presidenteB;
    private Pessoa pessoa;
    private PessoaDAO pDAO = new PessoaDAO();
    private OracaoDAO oDAO = new OracaoDAO();
    private Oracao oracaoA, oracaoB;
    private TesourosDAO tDAO = new TesourosDAO();
    private Tesouros tesouros;
    private EstudoBiblicoCongregacaoDAO congDAO = new EstudoBiblicoCongregacaoDAO();
    private EstudoBiblicoCongregacao estudoCong;
    private LeitorDAO leiDAO = new LeitorDAO();
    private Leitor leitor;

    private Pessoa joias, nossaVida1, nossaVida2;
    private Pessoa leituraBibliaA, leituraBibliaB;
    private Pessoa parte1B, parte2B, parte3B, parte4B;
    private Pessoa ajudante1B, ajudante2B, ajudante3B, ajudante4B;
    private Pessoa parte1A, parte2A, parte3A, parte4A;
    private Pessoa ajudante1A, ajudante2A, ajudante3A, ajudante4A;

    private int linha = 0;
    private LocalDate semanaAtual;
    private String ano, mes, dia;

    private List<LocalDate> segundasFeiras = new ArrayList<>();
    private List<Integer> listaIgnorarEstudantes = new ArrayList<>();
    private boolean salvo = false;

    public Tela2() {
        initComponents();
        // Definir a imagem como ícone da janela
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagem/designacaoo.png"));
        Image image = icon.getImage();
        setIconImage(image);
        comboAno.addItem("           ANO");
        comboAno.addItem(String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
        comboAno.addItem(String.valueOf(Calendar.getInstance().get(Calendar.YEAR) + 1));
        listaIgnorarEstudantes.add(-1);
        panelA.setVisible(false);
        painelSalas.setVisible(false);
        painelBotoes.setVisible(false);
        getWhatsappIniciar();
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
        comboMes = new javax.swing.JComboBox<>();
        comboAno = new javax.swing.JComboBox<>();
        botaoDefinirData = new javax.swing.JButton();
        panelA = new javax.swing.JPanel();
        cOracaoFinal = new javax.swing.JRadioButton();
        cLeitorEstudo = new javax.swing.JRadioButton();
        cEstudoCongregacao = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        cNossaVida2 = new javax.swing.JRadioButton();
        temaNossaVida2 = new javax.swing.JTextField();
        cNossaVida1 = new javax.swing.JRadioButton();
        temaNossaVida1 = new javax.swing.JTextField();
        cLeituraBiblia = new javax.swing.JRadioButton();
        jTextField14 = new javax.swing.JTextField();
        cJoias = new javax.swing.JRadioButton();
        jTextField15 = new javax.swing.JTextField();
        cTesouros = new javax.swing.JRadioButton();
        temaDiscurso = new javax.swing.JTextField();
        cOracaoInicial = new javax.swing.JRadioButton();
        jTextField17 = new javax.swing.JTextField();
        comboParte4 = new javax.swing.JComboBox<>();
        comboParte3 = new javax.swing.JComboBox<>();
        comboParte2 = new javax.swing.JComboBox<>();
        comboParte1 = new javax.swing.JComboBox<>();
        cPresidente = new javax.swing.JRadioButton();
        jTextField18 = new javax.swing.JTextField();
        txtPresidente = new javax.swing.JTextField();
        txtOracaoInicial = new javax.swing.JTextField();
        txtTesouros = new javax.swing.JTextField();
        txtJoias = new javax.swing.JTextField();
        txtLeituraBiblia = new javax.swing.JTextField();
        txtParte1 = new javax.swing.JTextField();
        txtAjudante1 = new javax.swing.JTextField();
        txtParte2 = new javax.swing.JTextField();
        txtAjudante2 = new javax.swing.JTextField();
        txtParte3 = new javax.swing.JTextField();
        txtAjudante3 = new javax.swing.JTextField();
        txtParte4 = new javax.swing.JTextField();
        txtAjudante4 = new javax.swing.JTextField();
        txtNossaVida2 = new javax.swing.JTextField();
        txtCrista1 = new javax.swing.JTextField();
        txtEstudoCongregacao = new javax.swing.JTextField();
        txtLeitor = new javax.swing.JTextField();
        txtOracaoFinal = new javax.swing.JTextField();
        enviarPresidenteA = new javax.swing.JButton();
        enviarOracaoInicial = new javax.swing.JButton();
        enviarDiscurso = new javax.swing.JButton();
        enviarJoias = new javax.swing.JButton();
        enviarLeituraBiblia = new javax.swing.JButton();
        enviarParte1A = new javax.swing.JButton();
        enviarParte2A = new javax.swing.JButton();
        enviarParte3A = new javax.swing.JButton();
        enviarParte4A = new javax.swing.JButton();
        enviarNossaVida1 = new javax.swing.JButton();
        enviarNossaVida2 = new javax.swing.JButton();
        enviarEstudoCongregacao = new javax.swing.JButton();
        enviarEstudoLeitor = new javax.swing.JButton();
        enviarOracaoFinal = new javax.swing.JButton();
        txtPresidenteB = new javax.swing.JTextField();
        enviarPresidenteB = new javax.swing.JButton();
        txtParte1B = new javax.swing.JTextField();
        enviarParte1B = new javax.swing.JButton();
        txtParte2B = new javax.swing.JTextField();
        enviarParte2B = new javax.swing.JButton();
        txtAjudante1B = new javax.swing.JTextField();
        txtAjudante2B = new javax.swing.JTextField();
        txtParte3B = new javax.swing.JTextField();
        enviarParte3B = new javax.swing.JButton();
        txtAjudante3B = new javax.swing.JTextField();
        txtParte4B = new javax.swing.JTextField();
        enviarParte4B = new javax.swing.JButton();
        txtAjudante4B = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLeituraBibliaB = new javax.swing.JTextField();
        enviarLeituraBibliaB = new javax.swing.JButton();
        temaVideo1 = new javax.swing.JTextField();
        temaVideo2 = new javax.swing.JTextField();
        temaVideo3 = new javax.swing.JTextField();
        temaVideo4 = new javax.swing.JTextField();
        nParte2 = new javax.swing.JLabel();
        nDiscurso = new javax.swing.JLabel();
        nJoias = new javax.swing.JLabel();
        nLeituraBiblia = new javax.swing.JLabel();
        nParte1 = new javax.swing.JLabel();
        nParte3 = new javax.swing.JLabel();
        nParte4 = new javax.swing.JLabel();
        nNossa1 = new javax.swing.JLabel();
        nNossa2 = new javax.swing.JLabel();
        nEstudoLivro = new javax.swing.JLabel();
        labelDATA = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        painelSalas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cSalaA = new javax.swing.JRadioButton();
        cSalaAB = new javax.swing.JRadioButton();
        painelBotoes = new javax.swing.JPanel();
        adicionar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        proximaSemana = new javax.swing.JButton();
        botaoRecomecar = new javax.swing.JButton();
        botaoConectar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Designação");

        jDesktopPane1.setMinimumSize(new java.awt.Dimension(1352, 683));

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

        panelA.setBackground(new java.awt.Color(204, 204, 204));
        panelA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        cOracaoFinal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cOracaoFinal.setForeground(new java.awt.Color(0, 0, 0));
        cOracaoFinal.setContentAreaFilled(false);
        cOracaoFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cOracaoFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cOracaoFinalMouseClicked(evt);
            }
        });

        cLeitorEstudo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cLeitorEstudo.setForeground(new java.awt.Color(0, 0, 0));
        cLeitorEstudo.setContentAreaFilled(false);
        cLeitorEstudo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cLeitorEstudo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cLeitorEstudoMouseClicked(evt);
            }
        });

        cEstudoCongregacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cEstudoCongregacao.setForeground(new java.awt.Color(0, 0, 0));
        cEstudoCongregacao.setContentAreaFilled(false);
        cEstudoCongregacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cEstudoCongregacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cEstudoCongregacaoMouseClicked(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("Oração Final");
        jTextField1.setPreferredSize(new java.awt.Dimension(73, 25));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setText("Leitor");
        jTextField2.setPreferredSize(new java.awt.Dimension(73, 25));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.setText("Estudo Bíblico de Congregação");
        jTextField3.setPreferredSize(new java.awt.Dimension(73, 25));

        cNossaVida2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cNossaVida2.setForeground(new java.awt.Color(0, 0, 0));
        cNossaVida2.setContentAreaFilled(false);
        cNossaVida2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cNossaVida2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cNossaVida2MouseClicked(evt);
            }
        });

        temaNossaVida2.setBackground(new java.awt.Color(255, 255, 255));
        temaNossaVida2.setForeground(new java.awt.Color(0, 0, 0));
        temaNossaVida2.setText("Nossa Vida Cristã - parte 2");
        temaNossaVida2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        temaNossaVida2.setPreferredSize(new java.awt.Dimension(73, 25));

        cNossaVida1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cNossaVida1.setForeground(new java.awt.Color(0, 0, 0));
        cNossaVida1.setContentAreaFilled(false);
        cNossaVida1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cNossaVida1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cNossaVida1MouseClicked(evt);
            }
        });

        temaNossaVida1.setBackground(new java.awt.Color(255, 255, 255));
        temaNossaVida1.setForeground(new java.awt.Color(0, 0, 0));
        temaNossaVida1.setText("Nossa Vida Cristã - parte 1");
        temaNossaVida1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        temaNossaVida1.setPreferredSize(new java.awt.Dimension(73, 25));

        cLeituraBiblia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cLeituraBiblia.setForeground(new java.awt.Color(0, 0, 0));
        cLeituraBiblia.setContentAreaFilled(false);
        cLeituraBiblia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cLeituraBiblia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cLeituraBibliaMouseClicked(evt);
            }
        });

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(255, 255, 255));
        jTextField14.setForeground(new java.awt.Color(0, 0, 0));
        jTextField14.setText("Leitura da Bíblia");
        jTextField14.setMinimumSize(new java.awt.Dimension(13, 25));
        jTextField14.setPreferredSize(new java.awt.Dimension(73, 25));

        cJoias.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cJoias.setForeground(new java.awt.Color(0, 0, 0));
        cJoias.setContentAreaFilled(false);
        cJoias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cJoias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cJoiasMouseClicked(evt);
            }
        });

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(255, 255, 255));
        jTextField15.setForeground(new java.awt.Color(0, 0, 0));
        jTextField15.setText("Joias Espirituais");
        jTextField15.setMinimumSize(new java.awt.Dimension(13, 25));
        jTextField15.setPreferredSize(new java.awt.Dimension(73, 25));

        cTesouros.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cTesouros.setForeground(new java.awt.Color(0, 0, 0));
        cTesouros.setContentAreaFilled(false);
        cTesouros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cTesouros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cTesourosMouseClicked(evt);
            }
        });

        temaDiscurso.setBackground(new java.awt.Color(255, 255, 255));
        temaDiscurso.setForeground(new java.awt.Color(0, 0, 0));
        temaDiscurso.setText("Discurso");
        temaDiscurso.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        temaDiscurso.setMinimumSize(new java.awt.Dimension(13, 25));
        temaDiscurso.setPreferredSize(new java.awt.Dimension(73, 25));

        cOracaoInicial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cOracaoInicial.setForeground(new java.awt.Color(0, 0, 0));
        cOracaoInicial.setContentAreaFilled(false);
        cOracaoInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cOracaoInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cOracaoInicialMouseClicked(evt);
            }
        });

        jTextField17.setEditable(false);
        jTextField17.setBackground(new java.awt.Color(255, 255, 255));
        jTextField17.setForeground(new java.awt.Color(0, 0, 0));
        jTextField17.setText("Oração Inicial");
        jTextField17.setMinimumSize(new java.awt.Dimension(13, 25));
        jTextField17.setPreferredSize(new java.awt.Dimension(73, 25));

        comboParte4.setBackground(new java.awt.Color(51, 255, 102));
        comboParte4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboParte4.setForeground(new java.awt.Color(0, 0, 0));
        comboParte4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Faça seu melhor no ministério", "Iniciando conversas", "Cultivando o interesse", "Explicando suas crenças", "Fazendo discipulos", "Discurso", "Consideração da Brocura" }));
        comboParte4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboParte4.setPreferredSize(new java.awt.Dimension(73, 25));
        comboParte4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboParte4ActionPerformed(evt);
            }
        });

        comboParte3.setBackground(new java.awt.Color(255, 255, 0));
        comboParte3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboParte3.setForeground(new java.awt.Color(0, 0, 0));
        comboParte3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Faça seu melhor no ministério", "Iniciando conversas", "Cultivando o interesse", "Explicando suas crenças", "Fazendo discipulos", "Discurso", "Consideração da Brocura" }));
        comboParte3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboParte3.setPreferredSize(new java.awt.Dimension(73, 25));
        comboParte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboParte3ActionPerformed(evt);
            }
        });

        comboParte2.setBackground(new java.awt.Color(51, 255, 102));
        comboParte2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboParte2.setForeground(new java.awt.Color(0, 0, 0));
        comboParte2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Faça seu melhor no ministério", "Iniciando conversas", "Cultivando o interesse", "Explicando suas crenças", "Fazendo discipulos", "Discurso", "Consideração da Brocura" }));
        comboParte2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboParte2.setPreferredSize(new java.awt.Dimension(73, 25));
        comboParte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboParte2ActionPerformed(evt);
            }
        });

        comboParte1.setBackground(new java.awt.Color(255, 255, 0));
        comboParte1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboParte1.setForeground(new java.awt.Color(0, 0, 0));
        comboParte1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Faça seu melhor no ministério", "Iniciando conversas", "Cultivando o interesse", "Explicando suas crenças", "Fazendo discipulos", "Discurso", "Consideração da Brocura" }));
        comboParte1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboParte1.setPreferredSize(new java.awt.Dimension(73, 25));
        comboParte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboParte1ActionPerformed(evt);
            }
        });

        cPresidente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cPresidente.setForeground(new java.awt.Color(0, 0, 0));
        cPresidente.setContentAreaFilled(false);
        cPresidente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cPresidente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cPresidenteMouseClicked(evt);
            }
        });

        jTextField18.setEditable(false);
        jTextField18.setBackground(new java.awt.Color(255, 255, 255));
        jTextField18.setForeground(new java.awt.Color(0, 0, 0));
        jTextField18.setText("Presidente");
        jTextField18.setPreferredSize(new java.awt.Dimension(73, 25));

        txtPresidente.setEditable(false);
        txtPresidente.setBackground(new java.awt.Color(255, 255, 255));
        txtPresidente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtPresidente.setForeground(new java.awt.Color(0, 0, 0));
        txtPresidente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtPresidente.setPreferredSize(new java.awt.Dimension(13, 25));
        txtPresidente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPresidenteMouseClicked(evt);
            }
        });

        txtOracaoInicial.setEditable(false);
        txtOracaoInicial.setBackground(new java.awt.Color(255, 255, 255));
        txtOracaoInicial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtOracaoInicial.setForeground(new java.awt.Color(0, 0, 0));
        txtOracaoInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtOracaoInicial.setPreferredSize(new java.awt.Dimension(13, 25));
        txtOracaoInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOracaoInicialMouseClicked(evt);
            }
        });

        txtTesouros.setEditable(false);
        txtTesouros.setBackground(new java.awt.Color(255, 255, 255));
        txtTesouros.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTesouros.setForeground(new java.awt.Color(0, 0, 0));
        txtTesouros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTesouros.setPreferredSize(new java.awt.Dimension(13, 25));
        txtTesouros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTesourosMouseClicked(evt);
            }
        });

        txtJoias.setEditable(false);
        txtJoias.setBackground(new java.awt.Color(255, 255, 255));
        txtJoias.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtJoias.setForeground(new java.awt.Color(0, 0, 0));
        txtJoias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtJoias.setPreferredSize(new java.awt.Dimension(13, 25));
        txtJoias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtJoiasMouseClicked(evt);
            }
        });

        txtLeituraBiblia.setEditable(false);
        txtLeituraBiblia.setBackground(new java.awt.Color(255, 255, 255));
        txtLeituraBiblia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtLeituraBiblia.setForeground(new java.awt.Color(0, 0, 0));
        txtLeituraBiblia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtLeituraBiblia.setPreferredSize(new java.awt.Dimension(13, 25));
        txtLeituraBiblia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLeituraBibliaMouseClicked(evt);
            }
        });

        txtParte1.setEditable(false);
        txtParte1.setBackground(new java.awt.Color(255, 255, 204));
        txtParte1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtParte1.setForeground(new java.awt.Color(0, 0, 0));
        txtParte1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte1.setPreferredSize(new java.awt.Dimension(13, 25));
        txtParte1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte1MouseClicked(evt);
            }
        });

        txtAjudante1.setEditable(false);
        txtAjudante1.setBackground(new java.awt.Color(255, 255, 204));
        txtAjudante1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAjudante1.setForeground(new java.awt.Color(0, 0, 0));
        txtAjudante1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante1.setPreferredSize(new java.awt.Dimension(13, 25));
        txtAjudante1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante1MouseClicked(evt);
            }
        });

        txtParte2.setEditable(false);
        txtParte2.setBackground(new java.awt.Color(204, 255, 204));
        txtParte2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtParte2.setForeground(new java.awt.Color(0, 0, 0));
        txtParte2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte2.setPreferredSize(new java.awt.Dimension(13, 25));
        txtParte2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte2MouseClicked(evt);
            }
        });

        txtAjudante2.setEditable(false);
        txtAjudante2.setBackground(new java.awt.Color(204, 255, 204));
        txtAjudante2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAjudante2.setForeground(new java.awt.Color(0, 0, 0));
        txtAjudante2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante2.setPreferredSize(new java.awt.Dimension(13, 25));
        txtAjudante2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante2MouseClicked(evt);
            }
        });

        txtParte3.setEditable(false);
        txtParte3.setBackground(new java.awt.Color(255, 255, 204));
        txtParte3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtParte3.setForeground(new java.awt.Color(0, 0, 0));
        txtParte3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte3.setPreferredSize(new java.awt.Dimension(13, 25));
        txtParte3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte3MouseClicked(evt);
            }
        });

        txtAjudante3.setEditable(false);
        txtAjudante3.setBackground(new java.awt.Color(255, 255, 204));
        txtAjudante3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAjudante3.setForeground(new java.awt.Color(0, 0, 0));
        txtAjudante3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante3.setPreferredSize(new java.awt.Dimension(13, 25));
        txtAjudante3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante3MouseClicked(evt);
            }
        });

        txtParte4.setEditable(false);
        txtParte4.setBackground(new java.awt.Color(204, 255, 204));
        txtParte4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtParte4.setForeground(new java.awt.Color(0, 0, 0));
        txtParte4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte4.setPreferredSize(new java.awt.Dimension(13, 25));
        txtParte4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte4MouseClicked(evt);
            }
        });

        txtAjudante4.setEditable(false);
        txtAjudante4.setBackground(new java.awt.Color(204, 255, 204));
        txtAjudante4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAjudante4.setForeground(new java.awt.Color(0, 0, 0));
        txtAjudante4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante4.setPreferredSize(new java.awt.Dimension(13, 25));
        txtAjudante4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante4MouseClicked(evt);
            }
        });

        txtNossaVida2.setEditable(false);
        txtNossaVida2.setBackground(new java.awt.Color(255, 255, 255));
        txtNossaVida2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNossaVida2.setForeground(new java.awt.Color(0, 0, 0));
        txtNossaVida2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtNossaVida2.setPreferredSize(new java.awt.Dimension(13, 25));
        txtNossaVida2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNossaVida2MouseClicked(evt);
            }
        });

        txtCrista1.setEditable(false);
        txtCrista1.setBackground(new java.awt.Color(255, 255, 255));
        txtCrista1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCrista1.setForeground(new java.awt.Color(0, 0, 0));
        txtCrista1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtCrista1.setPreferredSize(new java.awt.Dimension(13, 25));
        txtCrista1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCrista1MouseClicked(evt);
            }
        });

        txtEstudoCongregacao.setEditable(false);
        txtEstudoCongregacao.setBackground(new java.awt.Color(255, 255, 255));
        txtEstudoCongregacao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEstudoCongregacao.setForeground(new java.awt.Color(0, 0, 0));
        txtEstudoCongregacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEstudoCongregacao.setPreferredSize(new java.awt.Dimension(13, 25));
        txtEstudoCongregacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEstudoCongregacaoMouseClicked(evt);
            }
        });

        txtLeitor.setEditable(false);
        txtLeitor.setBackground(new java.awt.Color(255, 255, 255));
        txtLeitor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtLeitor.setForeground(new java.awt.Color(0, 0, 0));
        txtLeitor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtLeitor.setPreferredSize(new java.awt.Dimension(13, 25));
        txtLeitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLeitorMouseClicked(evt);
            }
        });

        txtOracaoFinal.setEditable(false);
        txtOracaoFinal.setBackground(new java.awt.Color(255, 255, 255));
        txtOracaoFinal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtOracaoFinal.setForeground(new java.awt.Color(0, 0, 0));
        txtOracaoFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtOracaoFinal.setPreferredSize(new java.awt.Dimension(13, 25));
        txtOracaoFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOracaoFinalMouseClicked(evt);
            }
        });

        enviarPresidenteA.setBackground(new java.awt.Color(255, 153, 153));
        enviarPresidenteA.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        enviarPresidenteA.setForeground(new java.awt.Color(0, 0, 0));
        enviarPresidenteA.setText("Enviar");
        enviarPresidenteA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarPresidenteA.setMaximumSize(new java.awt.Dimension(76, 25));
        enviarPresidenteA.setMinimumSize(new java.awt.Dimension(76, 25));
        enviarPresidenteA.setPreferredSize(new java.awt.Dimension(73, 25));
        enviarPresidenteA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarPresidenteAActionPerformed(evt);
            }
        });

        enviarOracaoInicial.setBackground(new java.awt.Color(255, 153, 153));
        enviarOracaoInicial.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        enviarOracaoInicial.setForeground(new java.awt.Color(0, 0, 0));
        enviarOracaoInicial.setText("Enviar");
        enviarOracaoInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarOracaoInicial.setMaximumSize(new java.awt.Dimension(76, 25));
        enviarOracaoInicial.setMinimumSize(new java.awt.Dimension(76, 25));
        enviarOracaoInicial.setPreferredSize(new java.awt.Dimension(73, 25));
        enviarOracaoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarOracaoInicialActionPerformed(evt);
            }
        });

        enviarDiscurso.setBackground(new java.awt.Color(255, 153, 153));
        enviarDiscurso.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        enviarDiscurso.setForeground(new java.awt.Color(0, 0, 0));
        enviarDiscurso.setText("Enviar");
        enviarDiscurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarDiscurso.setMaximumSize(new java.awt.Dimension(76, 25));
        enviarDiscurso.setMinimumSize(new java.awt.Dimension(76, 25));
        enviarDiscurso.setPreferredSize(new java.awt.Dimension(73, 25));
        enviarDiscurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarDiscursoActionPerformed(evt);
            }
        });

        enviarJoias.setBackground(new java.awt.Color(255, 153, 153));
        enviarJoias.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        enviarJoias.setForeground(new java.awt.Color(0, 0, 0));
        enviarJoias.setText("Enviar");
        enviarJoias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarJoias.setMaximumSize(new java.awt.Dimension(76, 25));
        enviarJoias.setMinimumSize(new java.awt.Dimension(76, 25));
        enviarJoias.setPreferredSize(new java.awt.Dimension(73, 25));
        enviarJoias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarJoiasActionPerformed(evt);
            }
        });

        enviarLeituraBiblia.setBackground(new java.awt.Color(255, 153, 153));
        enviarLeituraBiblia.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        enviarLeituraBiblia.setForeground(new java.awt.Color(0, 0, 0));
        enviarLeituraBiblia.setText("Enviar");
        enviarLeituraBiblia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarLeituraBiblia.setMaximumSize(new java.awt.Dimension(76, 25));
        enviarLeituraBiblia.setMinimumSize(new java.awt.Dimension(76, 25));
        enviarLeituraBiblia.setPreferredSize(new java.awt.Dimension(73, 25));
        enviarLeituraBiblia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarLeituraBibliaActionPerformed(evt);
            }
        });

        enviarParte1A.setBackground(new java.awt.Color(255, 153, 153));
        enviarParte1A.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        enviarParte1A.setForeground(new java.awt.Color(0, 0, 0));
        enviarParte1A.setText("Enviar");
        enviarParte1A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarParte1A.setMaximumSize(new java.awt.Dimension(76, 25));
        enviarParte1A.setMinimumSize(new java.awt.Dimension(76, 25));
        enviarParte1A.setPreferredSize(new java.awt.Dimension(73, 25));
        enviarParte1A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarParte1AActionPerformed(evt);
            }
        });

        enviarParte2A.setBackground(new java.awt.Color(255, 153, 153));
        enviarParte2A.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        enviarParte2A.setForeground(new java.awt.Color(0, 0, 0));
        enviarParte2A.setText("Enviar");
        enviarParte2A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarParte2A.setMaximumSize(new java.awt.Dimension(76, 25));
        enviarParte2A.setMinimumSize(new java.awt.Dimension(76, 25));
        enviarParte2A.setPreferredSize(new java.awt.Dimension(73, 25));
        enviarParte2A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarParte2AActionPerformed(evt);
            }
        });

        enviarParte3A.setBackground(new java.awt.Color(255, 153, 153));
        enviarParte3A.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        enviarParte3A.setForeground(new java.awt.Color(0, 0, 0));
        enviarParte3A.setText("Enviar");
        enviarParte3A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarParte3A.setMaximumSize(new java.awt.Dimension(76, 25));
        enviarParte3A.setMinimumSize(new java.awt.Dimension(76, 25));
        enviarParte3A.setPreferredSize(new java.awt.Dimension(73, 25));
        enviarParte3A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarParte3AActionPerformed(evt);
            }
        });

        enviarParte4A.setBackground(new java.awt.Color(255, 153, 153));
        enviarParte4A.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        enviarParte4A.setForeground(new java.awt.Color(0, 0, 0));
        enviarParte4A.setText("Enviar");
        enviarParte4A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarParte4A.setMaximumSize(new java.awt.Dimension(76, 25));
        enviarParte4A.setMinimumSize(new java.awt.Dimension(76, 25));
        enviarParte4A.setPreferredSize(new java.awt.Dimension(73, 25));
        enviarParte4A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarParte4AActionPerformed(evt);
            }
        });

        enviarNossaVida1.setBackground(new java.awt.Color(255, 153, 153));
        enviarNossaVida1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        enviarNossaVida1.setForeground(new java.awt.Color(0, 0, 0));
        enviarNossaVida1.setText("Enviar");
        enviarNossaVida1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarNossaVida1.setMaximumSize(new java.awt.Dimension(76, 25));
        enviarNossaVida1.setMinimumSize(new java.awt.Dimension(76, 25));
        enviarNossaVida1.setPreferredSize(new java.awt.Dimension(73, 25));
        enviarNossaVida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarNossaVida1ActionPerformed(evt);
            }
        });

        enviarNossaVida2.setBackground(new java.awt.Color(255, 153, 153));
        enviarNossaVida2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        enviarNossaVida2.setForeground(new java.awt.Color(0, 0, 0));
        enviarNossaVida2.setText("Enviar");
        enviarNossaVida2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarNossaVida2.setMaximumSize(new java.awt.Dimension(76, 25));
        enviarNossaVida2.setMinimumSize(new java.awt.Dimension(76, 25));
        enviarNossaVida2.setPreferredSize(new java.awt.Dimension(73, 25));
        enviarNossaVida2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarNossaVida2ActionPerformed(evt);
            }
        });

        enviarEstudoCongregacao.setBackground(new java.awt.Color(255, 153, 153));
        enviarEstudoCongregacao.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        enviarEstudoCongregacao.setForeground(new java.awt.Color(0, 0, 0));
        enviarEstudoCongregacao.setText("Enviar");
        enviarEstudoCongregacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarEstudoCongregacao.setMaximumSize(new java.awt.Dimension(76, 25));
        enviarEstudoCongregacao.setMinimumSize(new java.awt.Dimension(76, 25));
        enviarEstudoCongregacao.setPreferredSize(new java.awt.Dimension(73, 25));
        enviarEstudoCongregacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarEstudoCongregacaoActionPerformed(evt);
            }
        });

        enviarEstudoLeitor.setBackground(new java.awt.Color(255, 153, 153));
        enviarEstudoLeitor.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        enviarEstudoLeitor.setForeground(new java.awt.Color(0, 0, 0));
        enviarEstudoLeitor.setText("Enviar");
        enviarEstudoLeitor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarEstudoLeitor.setMaximumSize(new java.awt.Dimension(76, 25));
        enviarEstudoLeitor.setMinimumSize(new java.awt.Dimension(76, 25));
        enviarEstudoLeitor.setPreferredSize(new java.awt.Dimension(73, 25));
        enviarEstudoLeitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarEstudoLeitorActionPerformed(evt);
            }
        });

        enviarOracaoFinal.setBackground(new java.awt.Color(255, 153, 153));
        enviarOracaoFinal.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        enviarOracaoFinal.setForeground(new java.awt.Color(0, 0, 0));
        enviarOracaoFinal.setText("Enviar");
        enviarOracaoFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarOracaoFinal.setMaximumSize(new java.awt.Dimension(76, 25));
        enviarOracaoFinal.setMinimumSize(new java.awt.Dimension(76, 25));
        enviarOracaoFinal.setPreferredSize(new java.awt.Dimension(73, 25));
        enviarOracaoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarOracaoFinalActionPerformed(evt);
            }
        });

        txtPresidenteB.setEditable(false);
        txtPresidenteB.setBackground(new java.awt.Color(255, 255, 255));
        txtPresidenteB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtPresidenteB.setForeground(new java.awt.Color(0, 0, 0));
        txtPresidenteB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtPresidenteB.setPreferredSize(new java.awt.Dimension(13, 25));
        txtPresidenteB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPresidenteBMouseClicked(evt);
            }
        });

        enviarPresidenteB.setBackground(new java.awt.Color(255, 153, 153));
        enviarPresidenteB.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        enviarPresidenteB.setForeground(new java.awt.Color(0, 0, 0));
        enviarPresidenteB.setText("Enviar");
        enviarPresidenteB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarPresidenteB.setMaximumSize(new java.awt.Dimension(76, 25));
        enviarPresidenteB.setMinimumSize(new java.awt.Dimension(76, 25));
        enviarPresidenteB.setPreferredSize(new java.awt.Dimension(73, 25));
        enviarPresidenteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarPresidenteBActionPerformed(evt);
            }
        });

        txtParte1B.setEditable(false);
        txtParte1B.setBackground(new java.awt.Color(255, 255, 204));
        txtParte1B.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtParte1B.setForeground(new java.awt.Color(0, 0, 0));
        txtParte1B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte1B.setPreferredSize(new java.awt.Dimension(13, 25));
        txtParte1B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte1BMouseClicked(evt);
            }
        });

        enviarParte1B.setBackground(new java.awt.Color(255, 153, 153));
        enviarParte1B.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        enviarParte1B.setForeground(new java.awt.Color(0, 0, 0));
        enviarParte1B.setText("Enviar");
        enviarParte1B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarParte1B.setMaximumSize(new java.awt.Dimension(76, 25));
        enviarParte1B.setMinimumSize(new java.awt.Dimension(76, 25));
        enviarParte1B.setPreferredSize(new java.awt.Dimension(73, 25));
        enviarParte1B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarParte1BActionPerformed(evt);
            }
        });

        txtParte2B.setEditable(false);
        txtParte2B.setBackground(new java.awt.Color(204, 255, 204));
        txtParte2B.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtParte2B.setForeground(new java.awt.Color(0, 0, 0));
        txtParte2B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte2B.setPreferredSize(new java.awt.Dimension(13, 25));
        txtParte2B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte2BMouseClicked(evt);
            }
        });

        enviarParte2B.setBackground(new java.awt.Color(255, 153, 153));
        enviarParte2B.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        enviarParte2B.setForeground(new java.awt.Color(0, 0, 0));
        enviarParte2B.setText("Enviar");
        enviarParte2B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarParte2B.setMaximumSize(new java.awt.Dimension(76, 25));
        enviarParte2B.setMinimumSize(new java.awt.Dimension(76, 25));
        enviarParte2B.setPreferredSize(new java.awt.Dimension(73, 25));
        enviarParte2B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarParte2BActionPerformed(evt);
            }
        });

        txtAjudante1B.setEditable(false);
        txtAjudante1B.setBackground(new java.awt.Color(255, 255, 204));
        txtAjudante1B.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAjudante1B.setForeground(new java.awt.Color(0, 0, 0));
        txtAjudante1B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante1B.setPreferredSize(new java.awt.Dimension(13, 25));
        txtAjudante1B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante1BMouseClicked(evt);
            }
        });

        txtAjudante2B.setEditable(false);
        txtAjudante2B.setBackground(new java.awt.Color(204, 255, 204));
        txtAjudante2B.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAjudante2B.setForeground(new java.awt.Color(0, 0, 0));
        txtAjudante2B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante2B.setPreferredSize(new java.awt.Dimension(13, 25));
        txtAjudante2B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante2BMouseClicked(evt);
            }
        });

        txtParte3B.setEditable(false);
        txtParte3B.setBackground(new java.awt.Color(255, 255, 204));
        txtParte3B.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtParte3B.setForeground(new java.awt.Color(0, 0, 0));
        txtParte3B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte3B.setPreferredSize(new java.awt.Dimension(13, 25));
        txtParte3B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte3BMouseClicked(evt);
            }
        });

        enviarParte3B.setBackground(new java.awt.Color(255, 153, 153));
        enviarParte3B.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        enviarParte3B.setForeground(new java.awt.Color(0, 0, 0));
        enviarParte3B.setText("Enviar");
        enviarParte3B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarParte3B.setMaximumSize(new java.awt.Dimension(76, 25));
        enviarParte3B.setMinimumSize(new java.awt.Dimension(76, 25));
        enviarParte3B.setPreferredSize(new java.awt.Dimension(73, 25));
        enviarParte3B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarParte3BActionPerformed(evt);
            }
        });

        txtAjudante3B.setEditable(false);
        txtAjudante3B.setBackground(new java.awt.Color(255, 255, 204));
        txtAjudante3B.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAjudante3B.setForeground(new java.awt.Color(0, 0, 0));
        txtAjudante3B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante3B.setPreferredSize(new java.awt.Dimension(13, 25));
        txtAjudante3B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante3BMouseClicked(evt);
            }
        });

        txtParte4B.setEditable(false);
        txtParte4B.setBackground(new java.awt.Color(204, 255, 204));
        txtParte4B.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtParte4B.setForeground(new java.awt.Color(0, 0, 0));
        txtParte4B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte4B.setPreferredSize(new java.awt.Dimension(13, 25));
        txtParte4B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte4BMouseClicked(evt);
            }
        });

        enviarParte4B.setBackground(new java.awt.Color(255, 153, 153));
        enviarParte4B.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        enviarParte4B.setForeground(new java.awt.Color(0, 0, 0));
        enviarParte4B.setText("Enviar");
        enviarParte4B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarParte4B.setMaximumSize(new java.awt.Dimension(76, 25));
        enviarParte4B.setMinimumSize(new java.awt.Dimension(76, 25));
        enviarParte4B.setPreferredSize(new java.awt.Dimension(73, 25));
        enviarParte4B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarParte4BActionPerformed(evt);
            }
        });

        txtAjudante4B.setEditable(false);
        txtAjudante4B.setBackground(new java.awt.Color(204, 255, 204));
        txtAjudante4B.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAjudante4B.setForeground(new java.awt.Color(0, 0, 0));
        txtAjudante4B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante4B.setPreferredSize(new java.awt.Dimension(13, 25));
        txtAjudante4B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante4BMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("SALA  B");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("SALA  A");

        txtLeituraBibliaB.setEditable(false);
        txtLeituraBibliaB.setBackground(new java.awt.Color(255, 255, 255));
        txtLeituraBibliaB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtLeituraBibliaB.setForeground(new java.awt.Color(0, 0, 0));
        txtLeituraBibliaB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtLeituraBibliaB.setPreferredSize(new java.awt.Dimension(13, 25));
        txtLeituraBibliaB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLeituraBibliaBMouseClicked(evt);
            }
        });

        enviarLeituraBibliaB.setBackground(new java.awt.Color(255, 153, 153));
        enviarLeituraBibliaB.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        enviarLeituraBibliaB.setForeground(new java.awt.Color(0, 0, 0));
        enviarLeituraBibliaB.setText("Enviar");
        enviarLeituraBibliaB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarLeituraBibliaB.setMaximumSize(new java.awt.Dimension(76, 25));
        enviarLeituraBibliaB.setMinimumSize(new java.awt.Dimension(76, 25));
        enviarLeituraBibliaB.setPreferredSize(new java.awt.Dimension(73, 25));
        enviarLeituraBibliaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarLeituraBibliaBActionPerformed(evt);
            }
        });

        temaVideo1.setBackground(new java.awt.Color(255, 255, 204));
        temaVideo1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        temaVideo1.setForeground(new java.awt.Color(0, 0, 0));
        temaVideo1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        temaVideo1.setPreferredSize(new java.awt.Dimension(13, 25));

        temaVideo2.setBackground(new java.awt.Color(204, 255, 204));
        temaVideo2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        temaVideo2.setForeground(new java.awt.Color(0, 0, 0));
        temaVideo2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        temaVideo2.setPreferredSize(new java.awt.Dimension(13, 25));

        temaVideo3.setBackground(new java.awt.Color(255, 255, 204));
        temaVideo3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        temaVideo3.setForeground(new java.awt.Color(0, 0, 0));
        temaVideo3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        temaVideo3.setPreferredSize(new java.awt.Dimension(13, 25));

        temaVideo4.setBackground(new java.awt.Color(204, 255, 204));
        temaVideo4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        temaVideo4.setForeground(new java.awt.Color(0, 0, 0));
        temaVideo4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        temaVideo4.setPreferredSize(new java.awt.Dimension(13, 25));

        nParte2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        nParte2.setForeground(new java.awt.Color(0, 0, 0));
        nParte2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nParte2.setText("5");

        nDiscurso.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        nDiscurso.setForeground(new java.awt.Color(0, 0, 0));
        nDiscurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nDiscurso.setText("1");

        nJoias.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        nJoias.setForeground(new java.awt.Color(0, 0, 0));
        nJoias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nJoias.setText("2");

        nLeituraBiblia.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        nLeituraBiblia.setForeground(new java.awt.Color(0, 0, 0));
        nLeituraBiblia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nLeituraBiblia.setText("3");

        nParte1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        nParte1.setForeground(new java.awt.Color(0, 0, 0));
        nParte1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nParte1.setText("4");

        nParte3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        nParte3.setForeground(new java.awt.Color(0, 0, 0));
        nParte3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nParte3.setText("?");

        nParte4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        nParte4.setForeground(new java.awt.Color(0, 0, 0));
        nParte4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nParte4.setText("?");

        nNossa1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        nNossa1.setForeground(new java.awt.Color(0, 0, 0));
        nNossa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nNossa1.setText("?");

        nNossa2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        nNossa2.setForeground(new java.awt.Color(0, 0, 0));
        nNossa2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nNossa2.setText("?");

        nEstudoLivro.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        nEstudoLivro.setForeground(new java.awt.Color(0, 0, 0));
        nEstudoLivro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nEstudoLivro.setText("?");

        javax.swing.GroupLayout panelALayout = new javax.swing.GroupLayout(panelA);
        panelA.setLayout(panelALayout);
        panelALayout.setHorizontalGroup(
            panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelALayout.createSequentialGroup()
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelALayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nParte2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nDiscurso, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nJoias, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nLeituraBiblia, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nParte1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nParte3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nParte4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nNossa1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nNossa2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelALayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nEstudoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelALayout.createSequentialGroup()
                        .addComponent(cOracaoFinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOracaoFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelALayout.createSequentialGroup()
                        .addComponent(cLeitorEstudo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLeitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelALayout.createSequentialGroup()
                        .addComponent(cEstudoCongregacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEstudoCongregacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelALayout.createSequentialGroup()
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(comboParte1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelALayout.createSequentialGroup()
                                .addComponent(cNossaVida1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(temaNossaVida1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboParte4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(temaVideo4, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtParte1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtParte4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAjudante4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelALayout.createSequentialGroup()
                        .addComponent(cJoias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtJoias, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelALayout.createSequentialGroup()
                        .addComponent(cTesouros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(temaDiscurso, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTesouros, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelALayout.createSequentialGroup()
                        .addComponent(cOracaoInicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOracaoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelALayout.createSequentialGroup()
                        .addComponent(cLeituraBiblia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLeituraBiblia, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelALayout.createSequentialGroup()
                        .addComponent(cPresidente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPresidente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelALayout.createSequentialGroup()
                        .addComponent(temaVideo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAjudante2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelALayout.createSequentialGroup()
                        .addComponent(temaVideo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAjudante1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelALayout.createSequentialGroup()
                        .addComponent(comboParte2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtParte2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelALayout.createSequentialGroup()
                        .addComponent(cNossaVida2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(temaNossaVida2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCrista1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNossaVida2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelALayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelALayout.createSequentialGroup()
                        .addComponent(temaVideo3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAjudante3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelALayout.createSequentialGroup()
                        .addComponent(comboParte3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtParte3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelALayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enviarOracaoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enviarDiscurso, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enviarJoias, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enviarNossaVida1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enviarNossaVida2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enviarEstudoCongregacao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enviarEstudoLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enviarOracaoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelALayout.createSequentialGroup()
                                    .addComponent(enviarLeituraBiblia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtLeituraBibliaB, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(enviarLeituraBibliaB, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelALayout.createSequentialGroup()
                                    .addComponent(enviarPresidenteA, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(txtPresidenteB, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(enviarPresidenteB, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelALayout.createSequentialGroup()
                                    .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelALayout.createSequentialGroup()
                                            .addComponent(enviarParte1A, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelALayout.createSequentialGroup()
                                            .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(enviarParte2A, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(enviarParte3A, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(enviarParte4A, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(50, 50, 50)))
                                    .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelALayout.createSequentialGroup()
                                            .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtAjudante1B, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtParte4B, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtAjudante4B, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(txtParte2B, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtAjudante2B, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtParte3B, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtAjudante3B, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(enviarParte2B, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(enviarParte3B, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(enviarParte4B, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(panelALayout.createSequentialGroup()
                                            .addComponent(txtParte1B, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(enviarParte1B, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(panelALayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(109, 109, 109)))
                .addGap(30, 30, 30))
        );
        panelALayout.setVerticalGroup(
            panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelALayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOracaoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enviarOracaoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelALayout.createSequentialGroup()
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cPresidente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPresidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(enviarPresidenteA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPresidenteB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(enviarPresidenteB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cOracaoInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtOracaoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(enviarOracaoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cTesouros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(temaDiscurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTesouros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enviarDiscurso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(nDiscurso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nJoias)
                            .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cJoias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtJoias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enviarJoias, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nLeituraBiblia)
                            .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cLeituraBiblia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLeituraBibliaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enviarLeituraBibliaB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLeituraBiblia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enviarLeituraBiblia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboParte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtParte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enviarParte1A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtParte1B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enviarParte1B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nParte1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelALayout.createSequentialGroup()
                                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAjudante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(temaVideo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtParte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboParte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enviarParte2A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nParte2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAjudante2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(temaVideo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtParte3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboParte3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enviarParte3A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nParte3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAjudante3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(temaVideo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboParte4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtParte4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enviarParte4A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nParte4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAjudante4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(temaVideo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelALayout.createSequentialGroup()
                                .addComponent(txtAjudante1B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtParte2B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enviarParte2B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAjudante2B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtParte3B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enviarParte3B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAjudante3B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtParte4B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enviarParte4B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAjudante4B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cNossaVida1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(temaNossaVida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCrista1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enviarNossaVida1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(nNossa1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cNossaVida2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(temaNossaVida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNossaVida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enviarNossaVida2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(nNossa2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cEstudoCongregacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstudoCongregacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enviarEstudoCongregacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(nEstudoLivro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(enviarEstudoLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cLeitorEstudo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(panelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelALayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(cOracaoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        labelDATA.setBackground(new java.awt.Color(255, 255, 255));
        labelDATA.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        labelDATA.setForeground(new java.awt.Color(0, 0, 0));
        labelDATA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDATA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        labelDATA.setOpaque(true);

        jPanel2.setOpaque(false);

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/71124_arrow_back_left_red_icon.png"))); // NOI18N
        jButton1.setText("Voltar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelSalas.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Escolha as Salas que serão designadas:");

        buttonGroup1.add(cSalaA);
        cSalaA.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        cSalaA.setForeground(new java.awt.Color(0, 0, 0));
        cSalaA.setText("Sala A");
        cSalaA.setContentAreaFilled(false);
        cSalaA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cSalaA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cSalaAMouseClicked(evt);
            }
        });

        buttonGroup1.add(cSalaAB);
        cSalaAB.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        cSalaAB.setForeground(new java.awt.Color(0, 0, 0));
        cSalaAB.setText("Salas A e B");
        cSalaAB.setContentAreaFilled(false);
        cSalaAB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cSalaAB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cSalaABMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelSalasLayout = new javax.swing.GroupLayout(painelSalas);
        painelSalas.setLayout(painelSalasLayout);
        painelSalasLayout.setHorizontalGroup(
            painelSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSalasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cSalaA)
                .addGap(41, 41, 41)
                .addComponent(cSalaAB)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSalasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelSalasLayout.setVerticalGroup(
            painelSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSalasLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(painelSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cSalaA)
                    .addComponent(cSalaAB))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        painelBotoes.setOpaque(false);

        adicionar.setBackground(new java.awt.Color(255, 255, 204));
        adicionar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        adicionar.setForeground(new java.awt.Color(0, 0, 0));
        adicionar.setText("Adicionar Participante");
        adicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });

        alterar.setBackground(new java.awt.Color(255, 255, 204));
        alterar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        alterar.setForeground(new java.awt.Color(0, 0, 0));
        alterar.setText("Alterar Participante");
        alterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        botaoSalvar.setBackground(new java.awt.Color(204, 0, 0));
        botaoSalvar.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/85542_guardar_save_icon.png"))); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        proximaSemana.setBackground(new java.awt.Color(255, 255, 204));
        proximaSemana.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        proximaSemana.setForeground(new java.awt.Color(0, 0, 0));
        proximaSemana.setText("Proxima semana");
        proximaSemana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proximaSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximaSemanaActionPerformed(evt);
            }
        });

        botaoRecomecar.setBackground(new java.awt.Color(255, 255, 204));
        botaoRecomecar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoRecomecar.setForeground(new java.awt.Color(0, 0, 0));
        botaoRecomecar.setText("Recomeçar essa Semana");
        botaoRecomecar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoRecomecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRecomecarActionPerformed(evt);
            }
        });

        botaoConectar.setBackground(new java.awt.Color(51, 204, 0));
        botaoConectar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botaoConectar.setForeground(new java.awt.Color(0, 0, 0));
        botaoConectar.setText("Conectar WhatsApp");
        botaoConectar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotoesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(alterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoRecomecar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(proximaSemana, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(botaoConectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoRecomecar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proximaSemana, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jDesktopPane1.setLayer(comboMes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(comboAno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(botaoDefinirData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(panelA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(labelDATA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(painelSalas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(painelBotoes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(comboAno, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(botaoDefinirData, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(labelDATA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelSalas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoDefinirData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboAno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelDATA, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(painelSalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void salvarFalso() {
        Thread thread = new Thread(() -> {
            SwingUtilities.invokeLater(() -> {
                botaoSalvar.setBackground(new Color(204, 0, 0));
            });
            salvo = false;
        });
        thread.start();
    }

    private void salvarVerdadeiro() {
        Thread thread = new Thread(() -> {
            SwingUtilities.invokeLater(() -> {
                botaoSalvar.setBackground(new Color(37, 211, 102));
            });
            salvo = true;
        });
        thread.start();
    }

    //Retornar verdadeiro se o whatsapp estiver conectado
    private boolean getWhatsApp() {
        try {
            String a = WhatsApp.getWhatsAppStatus();
            return a.equals("{\"status\":\"conectado\"}");
        } catch (Exception e) {
            Mensagem.mensagemErro("Por favor, conecte ao servidor do WhatsApp!");
            return false;
        }
    }

    private void getWhatsappIniciar() {
        try {
            String a = WhatsApp.getWhatsAppStatus();
            if (a.equals("{\"status\":\"conectado\"}")) {
                botaoConectar.setText("WhatsApp - Conectado");
            } else {
                botaoConectar.setText("WhatsApp - Não Conectado");
            }
        } catch (Exception e) {
            botaoConectar.setText("WhatsApp - Não Conectado");
        }
    }

    private void botaoDefinirDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDefinirDataActionPerformed
        linha = 0;
        redefinirComboBox();
        limparTelaListas();
        segundasFeiras.clear();
        if (comboMes.getSelectedIndex() != 0) {
            if (comboAno.getSelectedIndex() != 0) {
                verData();
                setTema();
                painelSalas.setVisible(true);
                todas = null;
            } else {
                Mensagem.mensagemAlerta("Selecione o Ano");
            }
        } else {
            Mensagem.mensagemAlerta("Selecione o Mês");
        }
    }//GEN-LAST:event_botaoDefinirDataActionPerformed

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
                DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                labelDATA.setText("Semana: " + semanaAtual.format(df));
                //Salvar a variavel dia
                int diaDoMes = semanaAtual.getDayOfMonth();
                String diaDoMesFormatado = String.format("%02d", diaDoMes);
                dia = diaDoMesFormatado.substring(0, 2);
                break;  // Sai do loop ao encontrar uma semana não cadastrada
            }
            linha++;
        }
        if (linha >= segundasFeiras.size()) {
            Mensagem.mensagemAlerta("Este mês já foi designado");
        }
    }

    private void setTema() {
        Thread thread = new Thread(() -> {
            SwingUtilities.invokeLater(() -> {
                temaNossaVida1.setText("Nossa Vida Cristã - parte 1");
                temaNossaVida2.setText("Nossa Vida Cristã - parte 2");
                temaDiscurso.setText("Discurso");
                temaVideo1.setText("");
                temaVideo1.setVisible(false);
                temaVideo2.setText("");
                temaVideo2.setVisible(false);
                temaVideo3.setText("");
                temaVideo3.setVisible(false);
                temaVideo4.setText("");
                temaVideo4.setVisible(false);
            });
        });
        thread.start();
    }

    private void limparTelaListas() {
        // Limpar as listas ignorar 
        listaIgnorarEstudantes.clear();
        // Recondicionar as Listas
        listaIgnorarEstudantes.add(-1);
        //Limpar Tela
        desmarcarCheck();
        limparCampoTextos();
    }

    private void desmarcarCheck() {
        cPresidente.setSelected(false);
        cOracaoInicial.setSelected(false);
        cTesouros.setSelected(false);
        cJoias.setSelected(false);
        cLeituraBiblia.setSelected(false);
        cNossaVida1.setSelected(false);
        cNossaVida2.setSelected(false);
        cEstudoCongregacao.setSelected(false);
        cLeitorEstudo.setSelected(false);
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
        txtParte1.setText(null);
        txtAjudante1.setText(null);
        txtParte2.setText(null);
        txtAjudante2.setText(null);
        txtParte3.setText(null);
        txtAjudante3.setText(null);
        txtParte4.setText(null);
        txtAjudante4.setText(null);
        txtCrista1.setText(null);
        txtNossaVida2.setText(null);
        txtEstudoCongregacao.setText(null);
        txtLeitor.setText(null);
        txtOracaoFinal.setText(null);
        txtPresidenteB.setText(null);
        txtLeituraBibliaB.setText(null);
        txtParte1B.setText(null);
        txtAjudante1B.setText(null);
        txtParte2B.setText(null);
        txtAjudante2B.setText(null);
        txtParte3B.setText(null);
        txtAjudante3B.setText(null);
        txtParte4B.setText(null);
        txtAjudante4B.setText(null);
    }

    private void cSalaAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cSalaAMouseClicked
        painelBotoes.setVisible(true);
        if (!labelDATA.getText().equals("")) {
            painelSalas.setBackground(new Color(173, 216, 230));
            panelA.setVisible(true);
            txtPresidenteB.setEnabled(false);
            txtPresidenteB.setText(null);
            presidenteB = null;
            txtLeituraBibliaB.setEnabled(false);
            txtLeituraBibliaB.setText(null);
            leituraBibliaB = null;
            txtParte1B.setEnabled(false);
            txtParte1B.setText(null);
            parte1B = null;
            txtAjudante1B.setEnabled(false);
            txtAjudante1B.setText(null);
            ajudante1B = null;
            txtParte2B.setEnabled(false);
            txtParte2B.setText(null);
            parte2B = null;
            txtAjudante2B.setEnabled(false);
            txtAjudante2B.setText(null);
            ajudante2B = null;
            txtParte3B.setEnabled(false);
            txtParte3B.setText(null);
            parte3B = null;
            txtAjudante3B.setEnabled(false);
            txtAjudante3B.setText(null);
            ajudante3B = null;
            txtParte4B.setEnabled(false);
            txtParte4B.setText(null);
            parte4B = null;
            txtAjudante4B.setEnabled(false);
            ajudante4B = null;
            enviarPresidenteB.setEnabled(false);
            enviarLeituraBibliaB.setEnabled(false);
            enviarParte1B.setEnabled(false);
            enviarParte2B.setEnabled(false);
            enviarParte3B.setEnabled(false);
            enviarParte4B.setEnabled(false);
        }
    }//GEN-LAST:event_cSalaAMouseClicked

    private void cSalaABMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cSalaABMouseClicked
        painelBotoes.setVisible(true);
        if (!labelDATA.getText().equals("")) {
            painelSalas.setBackground(new Color(173, 216, 230));
            panelA.setVisible(true);
            txtPresidenteB.setEnabled(true);
            txtLeituraBibliaB.setEnabled(true);
            txtParte1B.setEnabled(true);
            txtAjudante1B.setEnabled(true);
            txtParte2B.setEnabled(true);
            txtAjudante2B.setEnabled(true);
            txtParte3B.setEnabled(true);
            txtAjudante3B.setEnabled(true);
            txtParte4B.setEnabled(true);
            txtAjudante4B.setEnabled(true);
            enviarPresidenteB.setEnabled(true);
            enviarLeituraBibliaB.setEnabled(true);
            enviarParte1B.setEnabled(true);
            enviarParte2B.setEnabled(true);
            enviarParte3B.setEnabled(true);
            enviarParte4B.setEnabled(true);
        }
    }//GEN-LAST:event_cSalaABMouseClicked

    private void cPresidenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cPresidenteMouseClicked
        if (txtPresidente.getText().isEmpty()) {
            if (presidenteA != null) {
                txtPresidente.setText(presidenteA.getPessoa().getNome() + " " + presidenteA.getPessoa().getSobrenome());
                listaIgnorarEstudantes.add(presidenteA.getPessoa().getId());
            } else {
                presidenteA = preDAO.buscarPresidenteAntigoFezParteNaSala_B();
                if (presidenteA == null) {
                    presidenteA = preDAO.buscarPresidenteAntigoFezParteNaSala_A();
                    pessoa = pDAO.buscarPessoaPorId(presidenteA.getPessoa().getId());
                    txtPresidente.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
                    listaIgnorarEstudantes.add(presidenteA.getPessoa().getId());
                } else {
                    pessoa = pDAO.buscarPessoaPorId(presidenteA.getPessoa().getId());
                    txtPresidente.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
                    listaIgnorarEstudantes.add(presidenteA.getPessoa().getId());
                }
            }
        }
        if (cSalaAB.isSelected() && txtPresidenteB.getText().isEmpty()) {
            if (presidenteB != null) {
                txtPresidenteB.setText(presidenteB.getPessoa().getNome() + " " + presidenteB.getPessoa().getSobrenome());
                listaIgnorarEstudantes.add(presidenteB.getPessoa().getId());
            } else {
                //Definir o presidente da sala B
                presidenteB = preDAO.buscarPresidenteAntigoFezParteNaSala_A(presidenteA.getId());
                pessoa = pDAO.buscarPessoaPorId(presidenteB.getPessoa().getId());
                txtPresidenteB.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
                listaIgnorarEstudantes.add(presidenteB.getPessoa().getId());
            }
        }
        if (!cPresidente.isSelected()) {
            listaIgnorarEstudantes.remove(Integer.valueOf(presidenteA.getId()));
            txtPresidente.setText(null);
            if (cSalaAB.isSelected()) {
                listaIgnorarEstudantes.remove(Integer.valueOf(presidenteB.getId()));
                txtPresidenteB.setText(null);
            }
        }
        salvarFalso();
    }//GEN-LAST:event_cPresidenteMouseClicked

    private void cOracaoInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cOracaoInicialMouseClicked
        if (txtOracaoInicial.getText().isEmpty()) {
            if (oracaoA != null) {
                txtOracaoInicial.setText(oracaoA.getPessoa().getNome() + " " + oracaoA.getPessoa().getSobrenome());
                listaIgnorarEstudantes.add(oracaoA.getPessoa().getId());
            } else {
                oracaoA = oDAO.buscarOracaoSemDataMaisAntigaParaPessoas(listaIgnorarEstudantes);
                if (oracaoA == null) {
                    oracaoA = oDAO.buscarOracaoSemDataMaisAntigaParaPessoas2();
                }
                pessoa = pDAO.buscarPessoaPorId(oracaoA.getPessoa().getId());
                txtOracaoInicial.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
                listaIgnorarEstudantes.add(oracaoA.getPessoa().getId());
            }
        }
        if (!cOracaoInicial.isSelected()) {
            listaIgnorarEstudantes.remove(Integer.valueOf(oracaoA.getId()));
            txtOracaoInicial.setText(null);
        }
        salvarFalso();
    }//GEN-LAST:event_cOracaoInicialMouseClicked

    private void cTesourosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cTesourosMouseClicked
        if (txtTesouros.getText().isEmpty()) {
            if (tesouros != null) {
                txtTesouros.setText(tesouros.getPessoa().getNome() + " " + tesouros.getPessoa().getSobrenome());
                listaIgnorarEstudantes.add(tesouros.getPessoa().getId());
            } else {
                tesouros = tDAO.buscarTesouroSemDataMaisAntigaParaPessoas(listaIgnorarEstudantes);
                if (tesouros == null) {
                    tesouros = tDAO.buscarTesouroSemDataMaisAntigaParaPessoas2();
                }
                pessoa = pDAO.buscarPessoaPorId(tesouros.getPessoa().getId());
                txtTesouros.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
                listaIgnorarEstudantes.add(tesouros.getPessoa().getId());
            }
        }
        if (!cTesouros.isSelected()) {
            listaIgnorarEstudantes.remove(Integer.valueOf(tesouros.getId()));
            txtTesouros.setText(null);
        }
        String tema = JOptionPane.showInputDialog("Informe o tema do Discurso:");
        if (tema.isEmpty()) {
            temaDiscurso.setText("Discurso");
            salvarFalso();
        } else {
            temaDiscurso.setText(tema);
            salvarFalso();
        }
    }//GEN-LAST:event_cTesourosMouseClicked

    private void cJoiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cJoiasMouseClicked
        if (txtJoias.getText().isEmpty()) {
            if (joias != null) {
                txtJoias.setText(joias.getNome() + " " + joias.getSobrenome());
                listaIgnorarEstudantes.add(joias.getId());
            } else {
                //joias = jDAO.buscarJoiaSemDataMaisAntigaParaPessoas(listaIgnorarEstudantes);
                joias = pDAO.buscarPartes("Joias", "Homem", listaIgnorarEstudantes);
                if (joias == null) {
                    joias = pDAO.buscarPessoaComCondicoesSalaB2("Joias", null);
                }
                pessoa = pDAO.buscarPessoaPorId(joias.getId());
                txtJoias.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
                listaIgnorarEstudantes.add(joias.getId());
            }
        }
        if (!cJoias.isSelected()) {
            listaIgnorarEstudantes.remove(Integer.valueOf(joias.getId()));
            txtJoias.setText(null);
        }
        salvarFalso();
    }//GEN-LAST:event_cJoiasMouseClicked

    private void cLeituraBibliaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cLeituraBibliaMouseClicked
        if (txtLeituraBiblia.getText().isEmpty()) {
            if (leituraBibliaA != null) {
                txtLeituraBiblia.setText(leituraBibliaA.getNome() + " " + leituraBibliaA.getSobrenome());
                listaIgnorarEstudantes.add(leituraBibliaA.getId());
            } else {
                //SALA A
                leituraBibliaA = pDAO.buscarPessoaComCondicoesSalaB("LeituraBiblia", null, listaIgnorarEstudantes, "SalaA");
                if (leituraBibliaA == null) {
                    leituraBibliaA = pDAO.buscarPessoaComCondicoesSalaB2("LeituraBiblia", null);
                }
                txtLeituraBiblia.setText(leituraBibliaA.getNome() + " " + leituraBibliaA.getSobrenome());
                listaIgnorarEstudantes.add(leituraBibliaA.getId());
            }
        }
        if (cSalaAB.isSelected() && txtLeituraBibliaB.getText().isEmpty()) {
            if (leituraBibliaB != null) {
                txtLeituraBibliaB.setText(leituraBibliaB.getNome() + " " + leituraBibliaB.getSobrenome());
                listaIgnorarEstudantes.add(leituraBibliaB.getId());
            } else {
                //SALA B
                leituraBibliaB = pDAO.buscarPessoaComCondicoesSalaB("LeituraBiblia", null, listaIgnorarEstudantes, "SalaB");
                if (leituraBibliaB == null) {
                    leituraBibliaB = pDAO.buscarPessoaComCondicoesSalaB2("LeituraBiblia", null);
                }
                txtLeituraBibliaB.setText(leituraBibliaB.getNome() + " " + leituraBibliaB.getSobrenome());
                listaIgnorarEstudantes.add(leituraBibliaB.getId());
            }
        }
        if (!cLeituraBiblia.isSelected()) {
            listaIgnorarEstudantes.remove(Integer.valueOf(leituraBibliaA.getId()));
            txtLeituraBiblia.setText(null);
            if (cSalaAB.isSelected()) {
                listaIgnorarEstudantes.remove(Integer.valueOf(leituraBibliaB.getId()));
                txtLeituraBibliaB.setText(null);
            }
        }
        salvarFalso();
    }//GEN-LAST:event_cLeituraBibliaMouseClicked

    private void cNossaVida1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cNossaVida1MouseClicked
        if (txtCrista1.getText().isEmpty()) {
            if (nossaVida1 != null) {
                txtCrista1.setText(nossaVida1.getNome() + " " + nossaVida1.getSobrenome());
                listaIgnorarEstudantes.add(nossaVida1.getId());
            } else {
                nossaVida1 = pDAO.buscarPartes("NossaVidaCrista", "Homem", listaIgnorarEstudantes);
                if (nossaVida1 == null) {
                    nossaVida1 = pDAO.buscarPessoaComCondicoesSalaB2("NossaVidaCrista", null);
                }
                pessoa = pDAO.buscarPessoaPorId(nossaVida1.getId());
                txtCrista1.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
                listaIgnorarEstudantes.add(nossaVida1.getId());
            }
        }
        if (!cNossaVida1.isSelected()) {
            listaIgnorarEstudantes.remove(Integer.valueOf(nossaVida1.getId()));
            txtCrista1.setText(null);
        }
        parteNumero();
        String tema = JOptionPane.showInputDialog("Informe o tema da parte número: " + nNossa1.getText());
        if (tema.isEmpty()) {
            temaNossaVida1.setText("Nossa Vida Cristã - parte 1");
            salvarFalso();
        } else {
            temaNossaVida1.setText(tema);
            salvarFalso();
        }
    }//GEN-LAST:event_cNossaVida1MouseClicked

    private void cNossaVida2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cNossaVida2MouseClicked
        if (txtNossaVida2.getText().isEmpty()) {
            if (nossaVida2 != null) {
                txtNossaVida2.setText(nossaVida2.getNome() + " " + nossaVida2.getSobrenome());
                listaIgnorarEstudantes.add(nossaVida2.getId());
            } else {
                nossaVida2 = pDAO.buscarPartes("NossaVidaCrista", "Homem", listaIgnorarEstudantes);
                if (nossaVida2 == null) {
                    nossaVida2 = pDAO.buscarPessoaComCondicoesSalaB2("NossaVidaCrista", null);
                }
                pessoa = pDAO.buscarPessoaPorId(nossaVida2.getId());
                txtNossaVida2.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
                listaIgnorarEstudantes.add(nossaVida2.getId());
            }
        }
        if (!cNossaVida2.isSelected()) {
            listaIgnorarEstudantes.remove(Integer.valueOf(nossaVida2.getId()));
            txtNossaVida2.setText(null);
        }
        parteNumero();
        String tema = JOptionPane.showInputDialog("Informe o tema da parte número: " + nNossa2.getText());
        if (tema.isEmpty()) {
            temaNossaVida2.setText("Nossa Vida Cristã - parte 2");
            salvarFalso();
        } else {
            temaNossaVida2.setText(tema);
            salvarFalso();
        }
    }//GEN-LAST:event_cNossaVida2MouseClicked

    private void cEstudoCongregacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cEstudoCongregacaoMouseClicked
        if (txtEstudoCongregacao.getText().isEmpty()) {
            if (estudoCong != null) {
                txtEstudoCongregacao.setText(estudoCong.getPessoa().getNome() + " " + estudoCong.getPessoa().getSobrenome());
                listaIgnorarEstudantes.add(estudoCong.getPessoa().getId());
            } else {
                estudoCong = congDAO.buscarEstudoBiblicoCongregacaoSemDataMaisAntigaParaPessoas(listaIgnorarEstudantes);
                if (estudoCong == null) {
                    estudoCong = congDAO.buscarEstudoBiblicoCongregacaoSemDataMaisAntigaParaPessoas2();
                }
                pessoa = pDAO.buscarPessoaPorId(estudoCong.getPessoa().getId());
                txtEstudoCongregacao.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
                listaIgnorarEstudantes.add(estudoCong.getPessoa().getId());
            }
        }
        if (!cEstudoCongregacao.isSelected()) {
            listaIgnorarEstudantes.remove(Integer.valueOf(estudoCong.getId()));
            txtEstudoCongregacao.setText(null);
        }
        parteNumero();
        salvarFalso();
    }//GEN-LAST:event_cEstudoCongregacaoMouseClicked

    private void cLeitorEstudoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cLeitorEstudoMouseClicked
        if (txtLeitor.getText().isEmpty()) {
            if (leitor != null) {
                txtLeitor.setText(leitor.getPessoa().getNome() + " " + leitor.getPessoa().getSobrenome());
                listaIgnorarEstudantes.add(leitor.getPessoa().getId());
            } else {
                leitor = leiDAO.buscarLeitorSemDataMaisAntigaParaPessoas(listaIgnorarEstudantes);
                if (leitor == null) {
                    leitor = leiDAO.buscarLeitorSemDataMaisAntigaParaPessoas2();
                }
                pessoa = pDAO.buscarPessoaPorId(leitor.getPessoa().getId());
                txtLeitor.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
                listaIgnorarEstudantes.add(leitor.getPessoa().getId());
            }
        }
        if (!cLeitorEstudo.isSelected()) {
            listaIgnorarEstudantes.remove(Integer.valueOf(leitor.getId()));
            txtLeitor.setText(null);
        }
        salvarFalso();
    }//GEN-LAST:event_cLeitorEstudoMouseClicked

    private void cOracaoFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cOracaoFinalMouseClicked
        if (txtOracaoFinal.getText().isEmpty()) {
            if (oracaoB != null) {
                txtOracaoFinal.setText(oracaoB.getPessoa().getNome() + " " + oracaoB.getPessoa().getSobrenome());
                listaIgnorarEstudantes.add(oracaoB.getPessoa().getId());
            } else {
                oracaoB = oDAO.buscarOracaoSemDataMaisAntigaParaPessoas(listaIgnorarEstudantes);
                if (oracaoB == null) {
                    oracaoB = oDAO.buscarOracaoSemDataMaisAntigaParaPessoas2();
                }
                pessoa = pDAO.buscarPessoaPorId(oracaoB.getPessoa().getId());
                txtOracaoFinal.setText(pessoa.getNome() + " " + pessoa.getSobrenome());
                listaIgnorarEstudantes.add(oracaoB.getPessoa().getId());
            }
        }
        if (!cOracaoFinal.isSelected()) {
            listaIgnorarEstudantes.remove(Integer.valueOf(oracaoB.getId()));
            txtOracaoFinal.setText(null);
        }
        salvarFalso();
    }//GEN-LAST:event_cOracaoFinalMouseClicked

    private void comboParte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboParte1ActionPerformed
        salvarFalso();
        String parte = (String) comboParte1.getSelectedItem();
        if (parte.equals("Consideração da Brocura")) {
            parte1A = pDAO.buscarPessoaComCondicoes("Video", null, listaIgnorarEstudantes);
            if (parte1A == null) {
                parte1A = pDAO.buscarPessoaComCondicoesSalaB2(parte, null);
            }
            txtParte1.setText(parte1A.getNome() + " " + parte1A.getSobrenome());
            listaIgnorarEstudantes.add(parte1A.getId());
            if (cSalaAB.isSelected()) {
                redefinirParticipantes();
                cSalaA.setSelected(true);
                java.awt.event.MouseEvent evts = null;
                cSalaAMouseClicked(evts);
            }
            String tema = JOptionPane.showInputDialog("Informe o tema:");
            temaVideo1.setText(tema);
            temaVideo1.setVisible(true);
        } else if (!parte.equals("Consideração da Brocura") && !parte.equals("Faça seu melhor no ministério")) {
            temaVideo1.setVisible(false);
            if (cSalaA.isSelected() && txtParte1.getText().equals("")) {
                parte1A = pDAO.buscarPessoaComCondicoes(parte, null, listaIgnorarEstudantes);
                if (parte1A == null) {
                    parte1A = pDAO.buscarPessoaComCondicoesSalaB2(parte, null);
                }

                txtParte1.setText(parte1A.getNome() + " " + parte1A.getSobrenome());
                listaIgnorarEstudantes.add(parte1A.getId());

                //AJUDANTE SALA A
                if (!parte.equals("Discurso") && txtAjudante1.getText().equals("")) {
                    ajudante1A = pDAO.buscarPessoaComCondicoesAjudante("Ajudante", parte1A.getSexo(), listaIgnorarEstudantes, parte1A.getAjudante());
                    if (ajudante1A == null) {
                        ajudante1A = pDAO.buscarPessoaComCondicoes3("Ajudante", parte1A.getSexo());
                    }

                    txtAjudante1.setText(ajudante1A.getNome() + " " + ajudante1A.getSobrenome());
                    listaIgnorarEstudantes.add(ajudante1A.getId());

                }
            } else if (cSalaAB.isSelected() && txtParte1.getText().equals("")) {
                //SALA A
                parte1A = pDAO.buscarPessoaComCondicoesSalaB(parte, null, listaIgnorarEstudantes, "SalaA");
                if (parte1A == null) {
                    parte1A = pDAO.buscarPessoaComCondicoesSalaB2(parte, null);
                }
                txtParte1.setText(parte1A.getNome() + " " + parte1A.getSobrenome());
                listaIgnorarEstudantes.add(parte1A.getId());

                //SALA B
                parte1B = pDAO.buscarPessoaComCondicoesSalaB(parte, null, listaIgnorarEstudantes, "SalaB");
                if (parte1B == null) {
                    parte1B = pDAO.buscarPessoaComCondicoesSalaB2(parte, null);
                }
                txtParte1B.setText(parte1B.getNome() + " " + parte1B.getSobrenome());
                listaIgnorarEstudantes.add(parte1B.getId());

                if (!parte.equals("Discurso") && txtAjudante1.getText().equals("")) {
                    //AJUDANTE SALA A
                    ajudante1A = pDAO.buscarPessoaComCondicoes2("Ajudante", parte1A.getSexo(), listaIgnorarEstudantes, parte1A.getAjudante(), "SalaA");
                    if (ajudante1A == null) {
                        ajudante1A = pDAO.buscarPessoaComCondicoes3("Ajudante", parte1A.getSexo());
                    }
                    txtAjudante1.setText(ajudante1A.getNome() + " " + ajudante1A.getSobrenome());
                    listaIgnorarEstudantes.add(ajudante1A.getId());

                    //AJUDANTE SALA B
                    ajudante1B = pDAO.buscarPessoaComCondicoes2("Ajudante", parte1B.getSexo(), listaIgnorarEstudantes, parte1B.getAjudante(), "SalaB");
                    if (ajudante1B == null) {
                        ajudante1B = pDAO.buscarPessoaComCondicoes3("Ajudante", parte1B.getSexo());
                    }
                    txtAjudante1B.setText(ajudante1B.getNome() + " " + ajudante1B.getSobrenome());
                    listaIgnorarEstudantes.add(ajudante1B.getId());
                }
            }
            if (parte.equals("Discurso")) {
                String tema = JOptionPane.showInputDialog("Informe o tema:");
                temaVideo1.setText(tema);
                temaVideo1.setVisible(true);
            }

        } else if (parte.equals("Faça seu melhor no ministério")) {
            temaVideo1.setText("");
            temaVideo1.setVisible(false);
            txtParte1.setText("");
            txtParte1B.setText("");
            txtAjudante1.setText("");
            txtAjudante1B.setText("");
            if (parte1A != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(parte1A.getId()));
                parte1A = null;
            }
            if (ajudante1A != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudante1A.getId()));
                ajudante1A = null;
            }
            if (parte1B != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(parte1B.getId()));
                parte1B = null;
            }
            if (ajudante1B != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudante1B.getId()));
                ajudante1B = null;
            }
        }
    }//GEN-LAST:event_comboParte1ActionPerformed

    private void comboParte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboParte2ActionPerformed
        salvarFalso();
        String parte = (String) comboParte2.getSelectedItem();
        if (parte.equals("Consideração da Brocura")) {
            temaVideo2.setVisible(true);
            parte2A = pDAO.buscarPessoaComCondicoes("Video", null, listaIgnorarEstudantes);
            if (parte2A == null) {
                parte2A = pDAO.buscarPessoaComCondicoesSalaB2(parte, null);
            }
            txtParte2.setText(parte2A.getNome() + " " + parte2A.getSobrenome());
            listaIgnorarEstudantes.add(parte2A.getId());
            if (cSalaAB.isSelected()) {
                redefinirParticipantes();
                cSalaA.setSelected(true);
                java.awt.event.MouseEvent evts = null;
                cSalaAMouseClicked(evts);
            }
            String tema = JOptionPane.showInputDialog("Informe o tema:");
            temaVideo2.setText(tema);
        } else if (!parte.equals("Consideração da Brocura") && !parte.equals("Faça seu melhor no ministério")) {
            temaVideo2.setVisible(false);
            if (cSalaA.isSelected() && txtParte2.getText().equals("")) {
                parte2A = pDAO.buscarPessoaComCondicoes(parte, null, listaIgnorarEstudantes);
                if (parte2A == null) {
                    parte2A = pDAO.buscarPessoaComCondicoesSalaB2(parte, null);
                }
                txtParte2.setText(parte2A.getNome() + " " + parte2A.getSobrenome());
                listaIgnorarEstudantes.add(parte2A.getId());

                //AJUDANTE SALA A
                if (!parte.equals("Discurso") && txtAjudante2.getText().equals("")) {
                    ajudante2A = pDAO.buscarPessoaComCondicoesAjudante("Ajudante", parte2A.getSexo(), listaIgnorarEstudantes, parte2A.getAjudante());
                    if (ajudante2A == null) {
                        ajudante2A = pDAO.buscarPessoaComCondicoes3("Ajudante", parte2A.getSexo());
                    }

                    txtAjudante2.setText(ajudante2A.getNome() + " " + ajudante2A.getSobrenome());
                    listaIgnorarEstudantes.add(ajudante2A.getId());

                }
            } else if (cSalaAB.isSelected() && txtParte2.getText().equals("")) {
                //SALA A
                parte2A = pDAO.buscarPessoaComCondicoesSalaB(parte, null, listaIgnorarEstudantes, "SalaA");
                if (parte2A == null) {
                    parte2A = pDAO.buscarPessoaComCondicoesSalaB2(parte, null);
                }
                txtParte2.setText(parte2A.getNome() + " " + parte2A.getSobrenome());
                listaIgnorarEstudantes.add(parte2A.getId());

                //SALA B
                parte2B = pDAO.buscarPessoaComCondicoesSalaB(parte, null, listaIgnorarEstudantes, "SalaB");
                if (parte2B == null) {
                    parte2B = pDAO.buscarPessoaComCondicoesSalaB2(parte, null);
                }
                txtParte2B.setText(parte2B.getNome() + " " + parte2B.getSobrenome());
                listaIgnorarEstudantes.add(parte2B.getId());

                if (!parte.equals("Discurso") && txtAjudante2.getText().equals("")) {
                    //AJUDANTE SALA A
                    ajudante2A = pDAO.buscarPessoaComCondicoes2("Ajudante", parte2A.getSexo(), listaIgnorarEstudantes, parte2A.getAjudante(), "SalaA");
                    if (ajudante2A == null) {
                        ajudante2A = pDAO.buscarPessoaComCondicoes3("Ajudante", parte2A.getSexo());
                    }
                    txtAjudante2.setText(ajudante2A.getNome() + " " + ajudante2A.getSobrenome());
                    listaIgnorarEstudantes.add(ajudante2A.getId());
                    //AJUDANTE SALA B
                    ajudante2B = pDAO.buscarPessoaComCondicoes2("Ajudante", parte2B.getSexo(), listaIgnorarEstudantes, parte2B.getAjudante(), "SalaB");
                    if (ajudante2B == null) {
                        ajudante2B = pDAO.buscarPessoaComCondicoes3("Ajudante", parte2B.getSexo());
                    }
                    txtAjudante2B.setText(ajudante2B.getNome() + " " + ajudante2B.getSobrenome());
                    listaIgnorarEstudantes.add(ajudante2B.getId());
                }
            }
            if (parte.equals("Discurso")) {
                String tema = JOptionPane.showInputDialog("Informe o tema:");
                temaVideo2.setText(tema);
                temaVideo2.setVisible(true);
            }
        } else if (parte.equals("Faça seu melhor no ministério")) {
            temaVideo2.setText("");
            temaVideo2.setVisible(false);
            txtParte2.setText("");
            txtParte2B.setText("");
            txtAjudante2.setText("");
            txtAjudante2B.setText("");
            if (parte2A != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(parte2A.getId()));
                parte2A = null;
            }
            if (ajudante2A != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudante2A.getId()));
                ajudante2A = null;
            }
            if (parte2B != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(parte2B.getId()));
                parte2B = null;
            }
            if (ajudante2B != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudante2B.getId()));
                ajudante2B = null;
            }
        }
    }//GEN-LAST:event_comboParte2ActionPerformed

    private void comboParte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboParte3ActionPerformed
        salvarFalso();
        String parte = (String) comboParte3.getSelectedItem();
        if (parte.equals("Consideração da Brocura")) {
            temaVideo3.setVisible(true);
            parte3A = pDAO.buscarPessoaComCondicoes("Video", null, listaIgnorarEstudantes);
            if (parte3A == null) {
                parte3A = pDAO.buscarPessoaComCondicoesSalaB2(parte, null);
            }
            txtParte3.setText(parte3A.getNome() + " " + parte3A.getSobrenome());
            listaIgnorarEstudantes.add(parte3A.getId());
            if (cSalaAB.isSelected()) {
                redefinirParticipantes();
                cSalaA.setSelected(true);
                java.awt.event.MouseEvent evts = null;
                cSalaAMouseClicked(evts);
            }
            String tema = JOptionPane.showInputDialog("Informe o tema:");
            temaVideo3.setText(tema);
        } else if (!parte.equals("Consideração da Brocura") && !parte.equals("Faça seu melhor no ministério")) {
            temaVideo3.setVisible(false);
            if (cSalaA.isSelected() && txtParte3.getText().equals("")) {
                parte3A = pDAO.buscarPessoaComCondicoes(parte, null, listaIgnorarEstudantes);
                if (parte3A == null) {
                    parte3A = pDAO.buscarPessoaComCondicoesSalaB2(parte, null);
                }
                txtParte3.setText(parte3A.getNome() + " " + parte3A.getSobrenome());
                listaIgnorarEstudantes.add(parte3A.getId());

                if (!parte.equals("Discurso") && txtAjudante3.getText().equals("")) {
                    //AJUDANTE SALA A
                    ajudante3A = pDAO.buscarPessoaComCondicoesAjudante("Ajudante", parte3A.getSexo(), listaIgnorarEstudantes, parte3A.getAjudante());
                    if (ajudante3A == null) {
                        ajudante3A = pDAO.buscarPessoaComCondicoes3("Ajudante", parte3A.getSexo());
                    }

                    txtAjudante3.setText(ajudante3A.getNome() + " " + ajudante3A.getSobrenome());
                    listaIgnorarEstudantes.add(ajudante3A.getId());

                }

            } else if (cSalaAB.isSelected() && txtParte3.getText().equals("")) {
                //SALA A
                parte3A = pDAO.buscarPessoaComCondicoesSalaB(parte, null, listaIgnorarEstudantes, "SalaA");
                if (parte3A == null) {
                    parte3A = pDAO.buscarPessoaComCondicoesSalaB2(parte, null);
                }
                txtParte3.setText(parte3A.getNome() + " " + parte3A.getSobrenome());
                listaIgnorarEstudantes.add(parte3A.getId());

                //SALA B
                parte3B = pDAO.buscarPessoaComCondicoesSalaB(parte, null, listaIgnorarEstudantes, "SalaB");
                if (parte3B == null) {
                    parte3B = pDAO.buscarPessoaComCondicoesSalaB2(parte, null);
                }
                txtParte3B.setText(parte3B.getNome() + " " + parte3B.getSobrenome());
                listaIgnorarEstudantes.add(parte3B.getId());

                if (!parte.equals("Discurso") && txtAjudante3.getText().equals("")) {
                    //AJUDANTE SALA A
                    ajudante3A = pDAO.buscarPessoaComCondicoes2("Ajudante", parte3A.getSexo(), listaIgnorarEstudantes, parte3A.getAjudante(), "SalaA");
                    if (ajudante3A == null) {
                        ajudante3A = pDAO.buscarPessoaComCondicoes3("Ajudante", parte3A.getSexo());
                    }
                    txtAjudante3.setText(ajudante3A.getNome() + " " + ajudante3A.getSobrenome());
                    listaIgnorarEstudantes.add(ajudante3A.getId());

                    //AJUDANTE SALA B
                    ajudante3B = pDAO.buscarPessoaComCondicoes2("Ajudante", parte3B.getSexo(), listaIgnorarEstudantes, parte3B.getAjudante(), "SalaB");
                    if (ajudante3B == null) {
                        ajudante3B = pDAO.buscarPessoaComCondicoes3("Ajudante", parte3B.getSexo());
                    }
                    txtAjudante3B.setText(ajudante3B.getNome() + " " + ajudante3B.getSobrenome());
                    listaIgnorarEstudantes.add(ajudante3B.getId());
                }
            }
            if (parte.equals("Discurso")) {
                String tema = JOptionPane.showInputDialog("Informe o tema:");
                temaVideo3.setText(tema);
                temaVideo3.setVisible(true);
            }
        } else if (parte.equals("Faça seu melhor no ministério")) {
            temaVideo3.setText("");
            temaVideo3.setVisible(false);
            txtParte3.setText("");
            txtParte3B.setText("");
            txtAjudante3.setText("");
            txtAjudante3B.setText("");
            if (parte3A != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(parte3A.getId()));
                parte3A = null;
            }
            if (ajudante3A != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudante3A.getId()));
                ajudante3A = null;
            }
            if (parte3B != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(parte3B.getId()));
                parte3B = null;
            }
            if (ajudante3B != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudante3B.getId()));
                ajudante3B = null;
            }
        }
        parteNumero();
    }//GEN-LAST:event_comboParte3ActionPerformed

    private void comboParte4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboParte4ActionPerformed
        salvarFalso();
        String parte = (String) comboParte4.getSelectedItem();
        if (parte.equals("Consideração da Brocura")) {
            temaVideo4.setVisible(true);
            parte4A = pDAO.buscarPessoaComCondicoes("Video", null, listaIgnorarEstudantes);
            if (parte4A == null) {
                parte4A = pDAO.buscarPessoaComCondicoesSalaB2(parte, null);
            }
            txtParte4.setText(parte4A.getNome() + " " + parte4A.getSobrenome());
            listaIgnorarEstudantes.add(parte4A.getId());
            if (cSalaAB.isSelected()) {
                redefinirParticipantes();
                cSalaA.setSelected(true);
                java.awt.event.MouseEvent evts = null;
                cSalaAMouseClicked(evts);
            }
            String tema = JOptionPane.showInputDialog("Informe o tema:");
            temaVideo4.setText(tema);
        }
        if (!parte.equals("Consideração da Brocura") && txtParte4.getText().equals("") && !parte.equals("Faça seu melhor no ministério")) {
            temaVideo4.setVisible(false);
            if (cSalaA.isSelected()) {
                parte4A = pDAO.buscarPessoaComCondicoes(parte, null, listaIgnorarEstudantes);
                if (parte4A == null) {
                    parte4A = pDAO.buscarPessoaComCondicoesSalaB2(parte, null);
                }
                txtParte4.setText(parte4A.getNome() + " " + parte4A.getSobrenome());
                listaIgnorarEstudantes.add(parte4A.getId());

                //AJUDANTE SALA A
                if (!parte.equals("Discurso") && txtAjudante4.getText().equals("")) {
                    ajudante4A = pDAO.buscarPessoaComCondicoesAjudante("Ajudante", parte4A.getSexo(), listaIgnorarEstudantes, parte4A.getAjudante());
                    if (ajudante4A == null) {
                        ajudante4A = pDAO.buscarPessoaComCondicoes3("Ajudante", parte4A.getSexo());
                    }

                    txtAjudante4.setText(ajudante4A.getNome() + " " + ajudante4A.getSobrenome());
                    listaIgnorarEstudantes.add(ajudante4A.getId());

                }

            } else if (cSalaAB.isSelected() && txtParte4.getText().equals("")) {
                //SALA A
                parte4A = pDAO.buscarPessoaComCondicoesSalaB(parte, null, listaIgnorarEstudantes, "SalaA");
                if (parte4A == null) {
                    parte4A = pDAO.buscarPessoaComCondicoesSalaB2(parte, null);
                }
                txtParte4.setText(parte4A.getNome() + " " + parte4A.getSobrenome());
                listaIgnorarEstudantes.add(parte4A.getId());

                //SALA B
                parte4B = pDAO.buscarPessoaComCondicoesSalaB(parte, null, listaIgnorarEstudantes, "SalaB");
                if (parte4B == null) {
                    parte4B = pDAO.buscarPessoaComCondicoesSalaB2(parte, null);
                }
                txtParte4B.setText(parte4B.getNome() + " " + parte4B.getSobrenome());
                listaIgnorarEstudantes.add(parte4B.getId());

                if (!parte.equals("Discurso") && txtAjudante4.getText().equals("")) {
                    //AJUDANTE SALA A
                    ajudante4A = pDAO.buscarPessoaComCondicoes2("Ajudante", parte4A.getSexo(), listaIgnorarEstudantes, parte4A.getAjudante(), "SalaA");
                    if (ajudante4A == null) {
                        ajudante4A = pDAO.buscarPessoaComCondicoes3("Ajudante", parte4A.getSexo());
                    }
                    txtAjudante4.setText(ajudante4A.getNome() + " " + ajudante4A.getSobrenome());
                    listaIgnorarEstudantes.add(ajudante4A.getId());

                    //AJUDANTE SALA B
                    ajudante4B = pDAO.buscarPessoaComCondicoes2("Ajudante", parte4B.getSexo(), listaIgnorarEstudantes, parte4B.getAjudante(), "SalaB");
                    if (ajudante4B == null) {
                        ajudante4B = pDAO.buscarPessoaComCondicoes3("Ajudante", parte4B.getSexo());
                    }
                    txtAjudante4B.setText(ajudante4B.getNome() + " " + ajudante4B.getSobrenome());
                    listaIgnorarEstudantes.add(ajudante4B.getId());
                }
            }
            if (parte.equals("Discurso")) {
                String tema = JOptionPane.showInputDialog("Informe o tema:");
                temaVideo4.setText(tema);
                temaVideo4.setVisible(true);
            }
        } else if (parte.equals("Faça seu melhor no ministério")) {
            temaVideo4.setText("");
            temaVideo4.setVisible(false);
            txtParte4.setText("");
            txtParte4B.setText("");
            txtAjudante4.setText("");
            txtAjudante4B.setText("");
            if (parte4A != null) {

                listaIgnorarEstudantes.remove(Integer.valueOf(parte4A.getId()));
                parte4A = null;
            }
            if (ajudante4A != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudante4A.getId()));
                ajudante4A = null;
            }
            if (parte4B != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(parte4B.getId()));
                parte4B = null;
            }
            if (ajudante4B != null) {
                listaIgnorarEstudantes.remove(Integer.valueOf(ajudante4B.getId()));
                ajudante4B = null;
            }
        }
        parteNumero();
    }//GEN-LAST:event_comboParte4ActionPerformed

    private void txtPresidenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPresidenteMouseClicked
        salvarFalso();
        if (!txtPresidente.getText().isEmpty()) {
            Janela.irTrocar(2, presidenteA.getPessoa().getSexo(), presidenteA.getPessoa(), listaIgnorarEstudantes, null);
        } else {
            Janela.irTrocar2(2, "Homem", listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtPresidenteMouseClicked

    private void txtOracaoInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOracaoInicialMouseClicked
        salvarFalso();
        if (!txtOracaoInicial.getText().isEmpty()) {
            Janela.irTrocar(4, oracaoA.getPessoa().getSexo(), oracaoA.getPessoa(), listaIgnorarEstudantes, null);
        } else {
            Janela.irTrocar2(4, "Homem", listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtOracaoInicialMouseClicked

    private void txtTesourosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTesourosMouseClicked
        salvarFalso();
        if (!txtTesouros.getText().isEmpty()) {
            Janela.irTrocar(3, tesouros.getPessoa().getSexo(), tesouros.getPessoa(), listaIgnorarEstudantes, null);
        } else {
            Janela.irTrocar2(3, "Homem", listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtTesourosMouseClicked

    private void txtLeituraBibliaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLeituraBibliaMouseClicked
        salvarFalso();
        if (!txtLeituraBiblia.getText().isEmpty()) {
            Janela.irTrocar(1, leituraBibliaA.getSexo(), leituraBibliaA, listaIgnorarEstudantes, null);
        } else {
            Janela.irTrocar2(1, "Homem", listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtLeituraBibliaMouseClicked

    private void txtCrista1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCrista1MouseClicked
        salvarFalso();
        if (!txtCrista1.getText().isEmpty()) {
            Janela.irTrocar(5, nossaVida1.getSexo(), nossaVida1, listaIgnorarEstudantes, null);
        } else {
            Janela.irTrocar2(5, "Homem", listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtCrista1MouseClicked

    private void txtLeitorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLeitorMouseClicked
        salvarFalso();
        if (!txtLeitor.getText().isEmpty()) {
            Janela.irTrocar(6, leitor.getPessoa().getSexo(), leitor.getPessoa(), listaIgnorarEstudantes, null);
        } else {
            Janela.irTrocar2(6, "Homem", listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtLeitorMouseClicked

    private void txtJoiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJoiasMouseClicked
        salvarFalso();
        if (!txtJoias.getText().isEmpty()) {
            Janela.irTrocar(7, joias.getSexo(), joias, listaIgnorarEstudantes, null);
        } else {
            Janela.irTrocar2(7, "Homem", listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtJoiasMouseClicked

    private void txtOracaoFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOracaoFinalMouseClicked
        salvarFalso();
        if (!txtOracaoFinal.getText().isEmpty()) {
            Janela.irTrocar(19, oracaoB.getPessoa().getSexo(), oracaoB.getPessoa(), listaIgnorarEstudantes, null);
        } else {
            Janela.irTrocar2(19, "Homem", listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtOracaoFinalMouseClicked

    private void txtNossaVida2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNossaVida2MouseClicked
        salvarFalso();
        if (!txtNossaVida2.getText().isEmpty()) {
            Janela.irTrocar(20, nossaVida2.getSexo(), nossaVida2, listaIgnorarEstudantes, null);
        } else {
            Janela.irTrocar2(20, "Homem", listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtNossaVida2MouseClicked

    private void txtEstudoCongregacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEstudoCongregacaoMouseClicked
        salvarFalso();
        if (!txtEstudoCongregacao.getText().isEmpty()) {
            Janela.irTrocar(21, estudoCong.getPessoa().getSexo(), estudoCong.getPessoa(), listaIgnorarEstudantes, null);
        } else {
            Janela.irTrocar2(21, "Homem", listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtEstudoCongregacaoMouseClicked

    private void txtPresidenteBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPresidenteBMouseClicked
        salvarFalso();
        if (cSalaA.isSelected()) {
            Mensagem.mensagemAlerta("A sala B não foi selecionada");
        } else if (!txtPresidenteB.getText().isEmpty()) {
            Janela.irTrocar(22, presidenteB.getPessoa().getSexo(), presidenteB.getPessoa(), listaIgnorarEstudantes, null);
        } else {
            Janela.irTrocar2(22, "Homem", listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtPresidenteBMouseClicked

    private void txtLeituraBibliaBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLeituraBibliaBMouseClicked
        salvarFalso();
        if (cSalaA.isSelected()) {
            Mensagem.mensagemAlerta("A sala B não foi selecionada");
        } else if (!txtLeituraBibliaB.getText().isEmpty() && !txtLeituraBibliaB.getText().equals("")) {
            Janela.irTrocar(34, leituraBibliaB.getSexo(), leituraBibliaB, listaIgnorarEstudantes, null);
        } else {
            Janela.irTrocar2(34, "Homem", listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtLeituraBibliaBMouseClicked

    private void txtParte1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte1MouseClicked
        salvarFalso();
        String parte = (String) comboParte1.getSelectedItem();
        if (!txtParte1.getText().isEmpty() && !txtParte1.getText().equals("")) {
            Janela.irTrocar(8, parte1A.getSexo(), parte1A, listaIgnorarEstudantes, parte);
        } else {
            Janela.irTrocar2(8, null, listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtParte1MouseClicked

    private void txtAjudante1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante1MouseClicked
        salvarFalso();
        if (!txtParte1.getText().isEmpty()) {
            if (!txtAjudante1.getText().isEmpty()) {
                Janela.irTrocar(9, ajudante1A.getSexo(), ajudante1A, listaIgnorarEstudantes, null);
            } else {
                Janela.irTrocar2(9, parte1A.getSexo(), listaIgnorarEstudantes);
            }
        } else {
            Mensagem.mensagemAlerta("Primeiro selecione quem fará a parte");
        }
    }//GEN-LAST:event_txtAjudante1MouseClicked

    private void txtParte1BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte1BMouseClicked
        salvarFalso();
        if (cSalaA.isSelected()) {
            Mensagem.mensagemAlerta("A sala B não foi selecionada");
        } else if (!txtParte1B.getText().isEmpty() && !txtParte1B.getText().equals("")) {
            String parte = (String) comboParte1.getSelectedItem();
            Janela.irTrocar(10, parte1B.getSexo(), parte1B, listaIgnorarEstudantes, parte);
        } else {
            Janela.irTrocar2(10, null, listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtParte1BMouseClicked

    private void txtAjudante1BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante1BMouseClicked
        salvarFalso();
        if (cSalaA.isSelected()) {
            Mensagem.mensagemAlerta("A sala B não foi selecionada");
        } else if (!txtParte1B.getText().isEmpty()) {
            if (!txtAjudante1B.getText().isEmpty()) {
                Janela.irTrocar(11, ajudante1B.getSexo(), ajudante1B, listaIgnorarEstudantes, null);
            } else {
                Janela.irTrocar2(11, parte1B.getSexo(), listaIgnorarEstudantes);
            }
        } else {
            Mensagem.mensagemAlerta("Primeiro selecione quem fará a parte");
        }
    }//GEN-LAST:event_txtAjudante1BMouseClicked

    private void txtParte2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte2MouseClicked
        salvarFalso();
        String parte = (String) comboParte2.getSelectedItem();
        if (!txtParte2.getText().isEmpty() && !txtParte2.getText().equals("")) {
            Janela.irTrocar(12, parte2A.getSexo(), parte2A, listaIgnorarEstudantes, parte);
        } else {
            Janela.irTrocar2(12, null, listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtParte2MouseClicked

    private void txtAjudante2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante2MouseClicked
        salvarFalso();
        if (!txtParte2.getText().isEmpty()) {
            if (!txtAjudante2.getText().isEmpty()) {
                Janela.irTrocar(13, ajudante2A.getSexo(), ajudante2A, listaIgnorarEstudantes, null);
            } else {
                Janela.irTrocar2(13, parte2A.getSexo(), listaIgnorarEstudantes);
            }
        } else {
            Mensagem.mensagemAlerta("Primeiro selecione quem fará a parte");
        }
    }//GEN-LAST:event_txtAjudante2MouseClicked

    private void txtParte2BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte2BMouseClicked
        salvarFalso();
        if (cSalaA.isSelected()) {
            Mensagem.mensagemAlerta("A sala B não foi selecionada");
        } else if (!txtParte2B.getText().isEmpty() && !txtParte2B.getText().equals("")) {
            String parte = (String) comboParte2.getSelectedItem();
            Janela.irTrocar(14, parte2B.getSexo(), parte2B, listaIgnorarEstudantes, parte);
        } else {
            Janela.irTrocar2(14, null, listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtParte2BMouseClicked

    private void txtAjudante2BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante2BMouseClicked
        salvarFalso();
        if (cSalaA.isSelected()) {
            Mensagem.mensagemAlerta("A sala B não foi selecionada");
        } else if (!txtParte2B.getText().isEmpty()) {
            if (!txtAjudante2B.getText().isEmpty()) {
                Janela.irTrocar(15, ajudante2B.getSexo(), ajudante2B, listaIgnorarEstudantes, null);
            } else {
                Janela.irTrocar2(15, parte2B.getSexo(), listaIgnorarEstudantes);
            }
        } else {
            Mensagem.mensagemAlerta("Primeiro selecione quem fará a parte");
        }
    }//GEN-LAST:event_txtAjudante2BMouseClicked

    private void txtParte3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte3MouseClicked
        salvarFalso();
        String parte = (String) comboParte3.getSelectedItem();
        if (!txtParte3.getText().isEmpty() && !txtParte3.getText().equals("")) {
            Janela.irTrocar(16, parte3A.getSexo(), parte3A, listaIgnorarEstudantes, parte);
        } else {
            Janela.irTrocar2(16, null, listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtParte3MouseClicked

    private void txtAjudante3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante3MouseClicked
        salvarFalso();
        if (!txtParte3.getText().isEmpty()) {
            if (!txtAjudante3.getText().isEmpty()) {
                Janela.irTrocar(17, ajudante3A.getSexo(), ajudante3A, listaIgnorarEstudantes, null);
            } else {
                Janela.irTrocar2(17, parte3A.getSexo(), listaIgnorarEstudantes);
            }
        } else {
            Mensagem.mensagemAlerta("Primeiro selecione quem fará a parte");
        }
    }//GEN-LAST:event_txtAjudante3MouseClicked

    private void txtParte3BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte3BMouseClicked
        salvarFalso();
        if (cSalaA.isSelected()) {
            Mensagem.mensagemAlerta("A sala B não foi selecionada");
        } else if (!txtParte3B.getText().isEmpty() && !txtParte3B.getText().equals("")) {
            String parte = (String) comboParte3.getSelectedItem();
            Janela.irTrocar(27, parte3B.getSexo(), parte3B, listaIgnorarEstudantes, parte);
        } else {
            Janela.irTrocar2(27, null, listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtParte3BMouseClicked

    private void txtAjudante3BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante3BMouseClicked
        salvarFalso();
        if (cSalaA.isSelected()) {
            Mensagem.mensagemAlerta("A sala B não foi selecionada");
        } else if (!txtParte3B.getText().isEmpty()) {
            if (!txtAjudante3B.getText().isEmpty()) {
                Janela.irTrocar(28, ajudante3B.getSexo(), ajudante3B, listaIgnorarEstudantes, null);
            } else {
                Janela.irTrocar2(28, parte3B.getSexo(), listaIgnorarEstudantes);
            }
        } else {
            Mensagem.mensagemAlerta("Primeiro selecione quem fará a parte");
        }
    }//GEN-LAST:event_txtAjudante3BMouseClicked

    private void txtParte4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte4MouseClicked
        salvarFalso();
        String parte = (String) comboParte4.getSelectedItem();
        if (!txtParte4.getText().isEmpty() && !txtParte4.getText().equals("")) {
            Janela.irTrocar(23, parte4A.getSexo(), parte4A, listaIgnorarEstudantes, parte);
        } else {
            Janela.irTrocar2(23, null, listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtParte4MouseClicked

    private void txtAjudante4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante4MouseClicked
        salvarFalso();
        if (!txtParte4.getText().isEmpty()) {
            if (!txtAjudante4.getText().isEmpty()) {
                Janela.irTrocar(24, ajudante4A.getSexo(), ajudante4A, listaIgnorarEstudantes, null);
            } else {
                Janela.irTrocar2(24, parte4A.getSexo(), listaIgnorarEstudantes);
            }
        } else {
            Mensagem.mensagemAlerta("Primeiro selecione quem fará a parte");
        }
    }//GEN-LAST:event_txtAjudante4MouseClicked

    private void txtParte4BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte4BMouseClicked
        salvarFalso();
        if (cSalaA.isSelected()) {
            Mensagem.mensagemAlerta("A sala B não foi selecionada");
        } else if (!txtParte4B.getText().isEmpty() && !txtParte4B.getText().equals("")) {
            String parte = (String) comboParte4.getSelectedItem();
            Janela.irTrocar(25, parte4B.getSexo(), parte4B, listaIgnorarEstudantes, parte);
        } else {
            Janela.irTrocar2(25, null, listaIgnorarEstudantes);
        }
    }//GEN-LAST:event_txtParte4BMouseClicked

    private void txtAjudante4BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante4BMouseClicked
        salvarFalso();
        if (cSalaA.isSelected()) {
            Mensagem.mensagemAlerta("A sala B não foi selecionada");
        } else if (!txtParte4B.getText().isEmpty()) {
            if (!txtAjudante4B.getText().isEmpty()) {
                Janela.irTrocar(26, ajudante4B.getSexo(), ajudante4B, listaIgnorarEstudantes, null);
            } else {
                Janela.irTrocar2(26, parte4B.getSexo(), listaIgnorarEstudantes);
            }
        } else {
            Mensagem.mensagemAlerta("Primeiro selecione quem fará a parte");
        }
    }//GEN-LAST:event_txtAjudante4BMouseClicked

    private void enviarPresidenteAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarPresidenteAActionPerformed
        Thread thread = new Thread(() -> {
            if (getWhatsApp()) {
                try {
                    if (salvo) {
                        SwingUtilities.invokeLater(() -> {
                            Janela.irAguarde2(txtPresidente.getText());
                        });
                        folha = new FolhaDesignacao(presidenteA.getPessoa(), null, labelDATA.getText(), "", "SALA A", "Presidente", 2);
                        SwingUtilities.invokeLater(() -> {
                            enviarPresidenteA.setBackground(new Color(37, 211, 102));
                            enviarPresidenteA.setText("Enviar");
                            Janela.a2.fechar();
                        });
                    } else {
                        Mensagem.mensagemAlerta("Antes de enviar, Salve os dados dessa semana.");
                    }
                } catch (Exception e) {
                    Mensagem.mensagemErro("Erro ao enviar, conecte o WhatsApp novamente.");
                }
            }
        });
        thread.start();
    }//GEN-LAST:event_enviarPresidenteAActionPerformed

    private void enviarOracaoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarOracaoInicialActionPerformed
        Thread thread = new Thread(() -> {
            if (getWhatsApp()) {
                try {
                    if (salvo) {
                        SwingUtilities.invokeLater(() -> {
                            Janela.irAguarde2(txtOracaoInicial.getText());
                        });
                        folha = new FolhaDesignacao(oracaoA.getPessoa(), null, labelDATA.getText(), "", "SALA A", "Oração Inicial", 2);
                        SwingUtilities.invokeLater(() -> {
                            enviarOracaoInicial.setBackground(new Color(37, 211, 102));
                            Janela.a2.fechar();
                        });
                    } else {
                        Mensagem.mensagemAlerta("Antes de enviar, Salve os dados dessa semana.");
                    }
                } catch (Exception e) {
                    Mensagem.mensagemErro("Erro ao enviar, conecte o WhatsApp novamente.");
                }
            }
        });
        thread.start();
    }//GEN-LAST:event_enviarOracaoInicialActionPerformed

    private void enviarDiscursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarDiscursoActionPerformed
        Thread thread = new Thread(() -> {
            if (getWhatsApp()) {
                try {
                    if (salvo) {
                        SwingUtilities.invokeLater(() -> {
                            Janela.irAguarde2(txtTesouros.getText());
                        });
                        folha = new FolhaDesignacao(tesouros.getPessoa(), null, labelDATA.getText(), temaDiscurso.getText(), "SALA A", "1", 2);
                        SwingUtilities.invokeLater(() -> {
                            enviarDiscurso.setBackground(new Color(37, 211, 102));
                            Janela.a2.fechar();
                        });
                    } else {
                        Mensagem.mensagemAlerta("Antes de enviar, Salve os dados dessa semana.");
                    }
                } catch (Exception e) {
                    Mensagem.mensagemErro("Erro ao enviar, conecte o WhatsApp novamente.");
                }
            }
        });
        thread.start();
    }//GEN-LAST:event_enviarDiscursoActionPerformed

    private void enviarJoiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarJoiasActionPerformed
        Thread thread = new Thread(() -> {
            if (getWhatsApp()) {
                try {
                    if (salvo) {
                        SwingUtilities.invokeLater(() -> {
                            Janela.irAguarde2(txtJoias.getText());
                        });
                        folha = new FolhaDesignacao(joias, null, labelDATA.getText(), "Joias Espirítuais", "SALA A", "2", 2);
                        SwingUtilities.invokeLater(() -> {
                            enviarJoias.setBackground(new Color(37, 211, 102));
                            Janela.a2.fechar();
                        });
                    } else {
                        Mensagem.mensagemAlerta("Antes de enviar, Salve os dados dessa semana.");
                    }
                } catch (Exception e) {
                    Mensagem.mensagemErro("Erro ao enviar, conecte o WhatsApp novamente.");
                }
            }
        });
        thread.start();
    }//GEN-LAST:event_enviarJoiasActionPerformed

    private void enviarLeituraBibliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarLeituraBibliaActionPerformed
        Thread thread = new Thread(() -> {
            if (getWhatsApp()) {
                try {
                    if (salvo) {
                        SwingUtilities.invokeLater(() -> {
                            Janela.irAguarde2(txtLeituraBiblia.getText());
                        });
                        folha = new FolhaDesignacao(leituraBibliaA, null, labelDATA.getText(), "Leitura da Bíblia", "SALA A", "3", 2);
                        SwingUtilities.invokeLater(() -> {
                            enviarLeituraBiblia.setBackground(new Color(37, 211, 102));
                            Janela.a2.fechar();
                        });
                    } else {
                        Mensagem.mensagemAlerta("Antes de enviar, Salve os dados dessa semana.");
                    }
                } catch (Exception e) {
                    Mensagem.mensagemErro("Erro ao enviar, conecte o WhatsApp novamente.");
                }
            }
        });
        thread.start();
    }//GEN-LAST:event_enviarLeituraBibliaActionPerformed

    private void enviarParte1AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarParte1AActionPerformed
        Thread thread = new Thread(() -> {
            if (getWhatsApp()) {
                try {
                    if (salvo) {
                        SwingUtilities.invokeLater(() -> {
                            Janela.irAguarde2(txtParte1.getText());
                        });
                        String tema = comboParte1.getSelectedItem() + ": " + temaVideo1.getText();
                        folha = new FolhaDesignacao(parte1A, ajudante1A, labelDATA.getText(), tema, "SALA A", "4", 2);
                        SwingUtilities.invokeLater(() -> {
                            enviarParte1A.setBackground(new Color(37, 211, 102));
                            Janela.a2.fechar();
                        });
                    } else {
                        Mensagem.mensagemAlerta("Antes de enviar, Salve os dados dessa semana.");
                    }
                } catch (Exception e) {
                    Mensagem.mensagemErro("Erro ao enviar, conecte o WhatsApp novamente.");
                }
            }
        });
        thread.start();
    }//GEN-LAST:event_enviarParte1AActionPerformed

    private void enviarParte2AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarParte2AActionPerformed
        Thread thread = new Thread(() -> {
            if (getWhatsApp()) {
                try {
                    if (salvo) {
                        SwingUtilities.invokeLater(() -> {
                            Janela.irAguarde2(txtParte2.getText());
                        });
                        String tema = comboParte2.getSelectedItem() + ": " + temaVideo2.getText();
                        folha = new FolhaDesignacao(parte2A, ajudante2A, labelDATA.getText(), tema, "SALA A", "5", 2);
                        SwingUtilities.invokeLater(() -> {
                            enviarParte2A.setBackground(new Color(37, 211, 102));
                            Janela.a2.fechar();
                        });
                    } else {
                        Mensagem.mensagemAlerta("Antes de enviar, Salve os dados dessa semana.");
                    }
                } catch (Exception e) {
                    Mensagem.mensagemErro("Erro ao enviar, conecte o WhatsApp novamente.");
                }
            }
        });
        thread.start();
    }//GEN-LAST:event_enviarParte2AActionPerformed

    private void enviarParte3AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarParte3AActionPerformed
        Thread thread = new Thread(() -> {
            if (getWhatsApp()) {
                try {
                    if (salvo) {
                        SwingUtilities.invokeLater(() -> {
                            Janela.irAguarde2(txtParte3.getText());
                        });
                        String tema = comboParte3.getSelectedItem() + ": " + temaVideo3.getText();
                        folha = new FolhaDesignacao(parte3A, ajudante3A, labelDATA.getText(), tema, "SALA A", nParte3.getText(), 2);
                        SwingUtilities.invokeLater(() -> {
                            enviarParte3A.setBackground(new Color(37, 211, 102));
                            Janela.a2.fechar();
                        });
                    } else {
                        Mensagem.mensagemAlerta("Antes de enviar, Salve os dados dessa semana.");
                    }
                } catch (Exception e) {
                    Mensagem.mensagemErro("Erro ao enviar, conecte o WhatsApp novamente.");
                }
            }
        });
        thread.start();
    }//GEN-LAST:event_enviarParte3AActionPerformed

    private void enviarParte4AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarParte4AActionPerformed
        Thread thread = new Thread(() -> {
            if (getWhatsApp()) {
                try {
                    if (salvo) {
                        SwingUtilities.invokeLater(() -> {
                            Janela.irAguarde2(txtParte4.getText());
                        });
                        String tema = comboParte4.getSelectedItem() + ": " + temaVideo4.getText();
                        folha = new FolhaDesignacao(parte4A, ajudante4A, labelDATA.getText(), tema, "SALA A", nParte4.getText(), 2);
                        SwingUtilities.invokeLater(() -> {
                            enviarParte4A.setBackground(new Color(37, 211, 102));
                            Janela.a2.fechar();
                        });
                    } else {
                        Mensagem.mensagemAlerta("Antes de enviar, Salve os dados dessa semana.");
                    }
                } catch (Exception e) {
                    Mensagem.mensagemErro("Erro ao enviar, conecte o WhatsApp novamente.");
                }
            }
        });
        thread.start();
    }//GEN-LAST:event_enviarParte4AActionPerformed

    private void enviarLeituraBibliaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarLeituraBibliaBActionPerformed
        Thread thread = new Thread(() -> {
            if (getWhatsApp()) {
                try {
                    if (salvo) {
                        SwingUtilities.invokeLater(() -> {
                            Janela.irAguarde2(txtLeituraBibliaB.getText());
                        });
                        folha = new FolhaDesignacao(leituraBibliaB, null, labelDATA.getText(), "Leitura da Bíblia", "SALA B", "3", 2);
                        SwingUtilities.invokeLater(() -> {
                            enviarLeituraBibliaB.setBackground(new Color(37, 211, 102));
                            Janela.a2.fechar();
                        });
                    } else {
                        Mensagem.mensagemAlerta("Antes de enviar, Salve os dados dessa semana.");
                    }
                } catch (Exception e) {
                    Mensagem.mensagemErro("Erro ao enviar, conecte o WhatsApp novamente.");
                }
            }
        });
        thread.start();
    }//GEN-LAST:event_enviarLeituraBibliaBActionPerformed

    private void enviarParte1BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarParte1BActionPerformed
        Thread thread = new Thread(() -> {
            if (getWhatsApp()) {
                try {
                    if (salvo) {
                        SwingUtilities.invokeLater(() -> {
                            Janela.irAguarde2(txtParte1B.getText());
                        });
                        String tema = comboParte1.getSelectedItem() + ": " + temaVideo1.getText();
                        folha = new FolhaDesignacao(parte1B, ajudante1B, labelDATA.getText(), tema, "SALA B", "4", 2);
                        SwingUtilities.invokeLater(() -> {
                            enviarParte1B.setBackground(new Color(37, 211, 102));
                            Janela.a2.fechar();
                        });
                    } else {
                        Mensagem.mensagemAlerta("Antes de enviar, Salve os dados dessa semana.");
                    }
                } catch (Exception e) {
                    Mensagem.mensagemErro("Erro ao enviar, conecte o WhatsApp novamente.");
                }
            }
        });
        thread.start();
    }//GEN-LAST:event_enviarParte1BActionPerformed

    private void enviarParte2BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarParte2BActionPerformed
        Thread thread = new Thread(() -> {
            if (getWhatsApp()) {
                try {
                    if (salvo) {
                        SwingUtilities.invokeLater(() -> {
                            Janela.irAguarde2(txtParte2B.getText());
                        });
                        String tema = comboParte2.getSelectedItem() + ": " + temaVideo2.getText();
                        folha = new FolhaDesignacao(parte2B, ajudante2B, labelDATA.getText(), tema, "SALA B", "5", 2);
                        SwingUtilities.invokeLater(() -> {
                            enviarParte2B.setBackground(new Color(37, 211, 102));
                            Janela.a2.fechar();
                        });
                    } else {
                        Mensagem.mensagemAlerta("Antes de enviar, Salve os dados dessa semana.");
                    }
                } catch (Exception e) {
                    Mensagem.mensagemErro("Erro ao enviar, conecte o WhatsApp novamente.");
                }
            }
        });
        thread.start();
    }//GEN-LAST:event_enviarParte2BActionPerformed

    private void enviarParte3BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarParte3BActionPerformed
        Thread thread = new Thread(() -> {
            if (getWhatsApp()) {
                try {
                    if (salvo) {
                        SwingUtilities.invokeLater(() -> {
                            Janela.irAguarde2(txtParte3B.getText());
                        });
                        String tema = comboParte3.getSelectedItem() + ": " + temaVideo3.getText();
                        folha = new FolhaDesignacao(parte3B, ajudante3B, labelDATA.getText(), tema, "SALA B", nParte3.getText(), 2);
                        SwingUtilities.invokeLater(() -> {
                            enviarParte3B.setBackground(new Color(37, 211, 102));
                            Janela.a2.fechar();
                        });
                    } else {
                        Mensagem.mensagemAlerta("Antes de enviar, Salve os dados dessa semana.");
                    }
                } catch (Exception e) {
                    Mensagem.mensagemErro("Erro ao enviar, conecte o WhatsApp novamente.");
                }
            }
        });
        thread.start();
    }//GEN-LAST:event_enviarParte3BActionPerformed

    private void enviarParte4BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarParte4BActionPerformed
        Thread thread = new Thread(() -> {
            if (getWhatsApp()) {
                try {
                    if (salvo) {
                        SwingUtilities.invokeLater(() -> {
                            Janela.irAguarde2(txtParte4B.getText());
                        });
                        String tema = comboParte4.getSelectedItem() + ": " + temaVideo4.getText();
                        folha = new FolhaDesignacao(parte4B, ajudante4B, labelDATA.getText(), tema, "SALA B", nParte4.getText(), 2);
                        SwingUtilities.invokeLater(() -> {
                            enviarParte4B.setBackground(new Color(37, 211, 102));
                            Janela.a2.fechar();
                        });
                    } else {
                        Mensagem.mensagemAlerta("Antes de enviar, Salve os dados dessa semana.");
                    }
                } catch (Exception e) {
                    Mensagem.mensagemErro("Erro ao enviar, conecte o WhatsApp novamente.");
                }
            }
        });
        thread.start();
    }//GEN-LAST:event_enviarParte4BActionPerformed

    private void enviarPresidenteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarPresidenteBActionPerformed
        Thread thread = new Thread(() -> {
            if (getWhatsApp()) {
                try {
                    if (salvo) {
                        SwingUtilities.invokeLater(() -> {
                            Janela.irAguarde2(txtPresidenteB.getText());
                        });
                        folha = new FolhaDesignacao(presidenteB.getPessoa(), null, labelDATA.getText(), "", "SALA B", "Presidente", 2);
                        SwingUtilities.invokeLater(() -> {
                            enviarPresidenteB.setBackground(new Color(37, 211, 102));
                            Janela.a2.fechar();
                        });
                    } else {
                        Mensagem.mensagemAlerta("Antes de enviar, Salve os dados dessa semana.");
                    }
                } catch (Exception e) {
                    Mensagem.mensagemErro("Erro ao enviar, conecte o WhatsApp novamente.");
                }
            }
        });
        thread.start();
    }//GEN-LAST:event_enviarPresidenteBActionPerformed

    private void enviarNossaVida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarNossaVida1ActionPerformed
        Thread thread = new Thread(() -> {
            if (getWhatsApp()) {
                try {
                    if (salvo) {
                        SwingUtilities.invokeLater(() -> {
                            Janela.irAguarde2(txtCrista1.getText());
                        });
                        folha = new FolhaDesignacao(nossaVida1, null, labelDATA.getText(), temaNossaVida1.getText(), "SALA A", nNossa1.getText(), 2);
                        SwingUtilities.invokeLater(() -> {
                            enviarNossaVida1.setBackground(new Color(37, 211, 102));
                            Janela.a2.fechar();
                        });
                    } else {
                        Mensagem.mensagemAlerta("Antes de enviar, Salve os dados dessa semana.");
                    }
                } catch (Exception e) {
                    Mensagem.mensagemErro("Erro ao enviar, conecte o WhatsApp novamente.");
                }
            }
        });
        thread.start();
    }//GEN-LAST:event_enviarNossaVida1ActionPerformed

    private void enviarNossaVida2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarNossaVida2ActionPerformed
        Thread thread = new Thread(() -> {
            if (getWhatsApp()) {
                try {
                    if (salvo) {
                        SwingUtilities.invokeLater(() -> {
                            Janela.irAguarde2(txtNossaVida2.getText());
                        });
                        folha = new FolhaDesignacao(nossaVida2, null, labelDATA.getText(), temaNossaVida2.getText(), "SALA A", nNossa2.getText(), 2);
                        SwingUtilities.invokeLater(() -> {
                            enviarNossaVida2.setBackground(new Color(37, 211, 102));
                            Janela.a2.fechar();
                        });
                    } else {
                        Mensagem.mensagemAlerta("Antes de enviar, Salve os dados dessa semana.");
                    }
                } catch (Exception e) {
                    Mensagem.mensagemErro("Erro ao enviar, conecte o WhatsApp novamente.");
                }
            }
        });
        thread.start();
    }//GEN-LAST:event_enviarNossaVida2ActionPerformed

    private void enviarEstudoCongregacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarEstudoCongregacaoActionPerformed
        Thread thread = new Thread(() -> {
            if (getWhatsApp()) {
                try {
                    if (salvo) {
                        SwingUtilities.invokeLater(() -> {
                            Janela.irAguarde2(txtEstudoCongregacao.getText());
                        });
                        folha = new FolhaDesignacao(estudoCong.getPessoa(), null, labelDATA.getText(), "Estudo Bíblico de Congregação", "SALA A", nEstudoLivro.getText(), 2);
                        SwingUtilities.invokeLater(() -> {
                            enviarEstudoCongregacao.setBackground(new Color(37, 211, 102));
                            Janela.a2.fechar();
                        });
                    } else {
                        Mensagem.mensagemAlerta("Antes de enviar, Salve os dados dessa semana.");
                    }
                } catch (Exception e) {
                    Mensagem.mensagemErro("Erro ao enviar, conecte o WhatsApp novamente.");
                }
            }
        });
        thread.start();
    }//GEN-LAST:event_enviarEstudoCongregacaoActionPerformed

    private void enviarEstudoLeitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarEstudoLeitorActionPerformed
        Thread thread = new Thread(() -> {
            if (getWhatsApp()) {
                try {
                    if (salvo) {
                        SwingUtilities.invokeLater(() -> {
                            Janela.irAguarde2(txtLeitor.getText());
                        });
                        folha = new FolhaDesignacao(leitor.getPessoa(), null, labelDATA.getText(), "Leitura do estudo Bíblico de congregação", "SALA A", "Leitor", 2);
                        SwingUtilities.invokeLater(() -> {
                            enviarEstudoLeitor.setBackground(new Color(37, 211, 102));
                            Janela.a2.fechar();
                        });
                    } else {
                        Mensagem.mensagemAlerta("Antes de enviar, Salve os dados dessa semana.");
                    }
                } catch (Exception e) {
                    Mensagem.mensagemErro("Erro ao enviar, conecte o WhatsApp novamente.");
                }
            }
        });
        thread.start();
    }//GEN-LAST:event_enviarEstudoLeitorActionPerformed

    private void enviarOracaoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarOracaoFinalActionPerformed
        Thread thread = new Thread(() -> {
            if (getWhatsApp()) {
                try {
                    if (salvo) {
                        SwingUtilities.invokeLater(() -> {
                            Janela.irAguarde2(txtOracaoFinal.getText());
                        });
                        folha = new FolhaDesignacao(oracaoB.getPessoa(), null, labelDATA.getText(), "", "SALA A", "Oração Final", 2);
                        SwingUtilities.invokeLater(() -> {
                            enviarOracaoFinal.setBackground(new Color(37, 211, 102));
                            Janela.a2.fechar();
                        });
                    } else {
                        Mensagem.mensagemAlerta("Antes de enviar, Salve os dados dessa semana.");
                    }
                } catch (Exception e) {
                    Mensagem.mensagemErro("Erro ao enviar, conecte o WhatsApp novamente.");
                }
            }
        });
        thread.start();
    }//GEN-LAST:event_enviarOracaoFinalActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        try {
            // Cadastrar na tabela do banco de dados: SEMANA
            cadastrarSemana();

            // Cadastrar cada parte no BD
            salvarAlterar();

            // SALVAR NA CLASSE TODAS AS PARTES
            if (todas == null) {
                salvarTodasPartes();
            } else {
                atualizarTodasPartes();
            }

            salvarFolhaDesignacaos();

            // Salvar em arquivo .pdf
            salvarPdf();

            salvarVerdadeiro();

            Janela.menu.mostrarTabela();

        } catch (Exception e) {
            Mensagem.mensagemErro("Feche o programa, e tente novamente. "
                    + "\nAbra o programa clicando com o botão direito e selecione:\nExecutar como Administrador.");
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void redefinirComboBox() {
        comboParte1.setSelectedIndex(0);
        comboParte2.setSelectedIndex(0);
        comboParte3.setSelectedIndex(0);
        comboParte4.setSelectedIndex(0);
    }

    private void salvarFolhaDesignacaos() {
        try {
            folha.salvarFolhaDesignacao(todas);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void salvarPdf() {
        try {
            GerarPDF pdf = new GerarPDF();
            pdf.salvar(todas);
        } catch (Exception e) {
        }
    }

    private void salvarAlterar() {
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
            pDAO.alterarDataUltimaPessoa(joias.getId(), semanaAtual, null);
        }
        if (leituraBibliaA != null) {
            pDAO.alterarDataUltimaPessoa(leituraBibliaA.getId(), semanaAtual, "SalaA");
        }
        if (nossaVida1 != null) {
            pDAO.alterarDataUltimaPessoa(nossaVida1.getId(), semanaAtual, null);
        }
        if (nossaVida2 != null) {
            pDAO.alterarDataUltimaPessoa(nossaVida2.getId(), semanaAtual, null);
        }
        if (estudoCong != null) {
            congDAO.alterarDataEstudoBiblicoCongregacao(estudoCong.getId(), semanaAtual); //Botão Salvar
            pDAO.alterarDataUltimaPessoa(estudoCong.getPessoa().getId(), semanaAtual, null);
        }
        if (leitor != null) {
            leiDAO.alterarDataLeitor(leitor.getId(), semanaAtual); //Botão Salvar
        }

        if (presidenteB != null) {
            preDAO.alterarSalaEDataPresidente(presidenteB.getId(), "SalaB", semanaAtual); //Botão Salvar
            pDAO.alterarDataUltimaPessoa(presidenteB.getPessoa().getId(), semanaAtual, "SalaB");
        }
        if (leituraBibliaB != null) {
            pDAO.alterarDataUltimaPessoa(leituraBibliaB.getId(), semanaAtual, "SalaB");
        }
        if (parte1A != null) {
            pDAO.alterarDataUltimaPessoa(parte1A.getId(), semanaAtual, "SalaA");//Botão Salvar
        }
        if (parte2A != null) {
            pDAO.alterarDataUltimaPessoa(parte2A.getId(), semanaAtual, "SalaA");//Botão Salvar
        }
        if (parte3A != null) {
            pDAO.alterarDataUltimaPessoa(parte3A.getId(), semanaAtual, "SalaA");//Botão Salvar
        }
        if (parte4A != null) {
            pDAO.alterarDataUltimaPessoa(parte4A.getId(), semanaAtual, "SalaA");//Botão Salvar
        }
        if (parte1B != null) {
            pDAO.alterarDataUltimaPessoa(parte1B.getId(), semanaAtual, "SalaB");//Botão Salvar
        }
        if (parte2B != null) {
            pDAO.alterarDataUltimaPessoa(parte2B.getId(), semanaAtual, "SalaB");//Botão Salvar
        }
        if (parte3B != null) {
            pDAO.alterarDataUltimaPessoa(parte3B.getId(), semanaAtual, "SalaB");//Botão Salvar
        }
        if (parte4B != null) {
            pDAO.alterarDataUltimaPessoa(parte4B.getId(), semanaAtual, "SalaB");//Botão Salvar
        }
        if (ajudante1A != null) {
            pDAO.alterarDataUltimaPessoa(parte1A.getId(), semanaAtual, "SalaA");//Botão Salvar
            pDAO.atualizarAjudante(ajudante1A.getId(), semanaAtual);
        }
        if (ajudante2A != null) {
            pDAO.alterarDataUltimaPessoa(ajudante2A.getId(), semanaAtual, "SalaA");//Botão Salvar
            pDAO.atualizarAjudante(ajudante2A.getId(), semanaAtual);
        }
        if (ajudante3A != null) {
            pDAO.alterarDataUltimaPessoa(ajudante3A.getId(), semanaAtual, "SalaA");//Botão Salvar
            pDAO.atualizarAjudante(ajudante3A.getId(), semanaAtual);
        }
        if (ajudante4A != null) {
            pDAO.alterarDataUltimaPessoa(ajudante4A.getId(), semanaAtual, "SalaA");//Botão Salvar
            pDAO.atualizarAjudante(ajudante4A.getId(), semanaAtual);
        }
        if (ajudante1B != null) {
            pDAO.alterarDataUltimaPessoa(ajudante1B.getId(), semanaAtual, "SalaB");//Botão Salvar
            pDAO.atualizarAjudante(ajudante1B.getId(), semanaAtual);
        }
        if (ajudante2B != null) {
            pDAO.alterarDataUltimaPessoa(ajudante2B.getId(), semanaAtual, "SalaB");//Botão Salvar
            pDAO.atualizarAjudante(ajudante2B.getId(), semanaAtual);
        }
        if (ajudante3B != null) {
            pDAO.alterarDataUltimaPessoa(ajudante3B.getId(), semanaAtual, "SalaB");//Botão Salvar
            pDAO.atualizarAjudante(ajudante3B.getId(), semanaAtual);
        }
        if (ajudante4B != null) {
            pDAO.alterarDataUltimaPessoa(ajudante4B.getId(), semanaAtual, "SalaB");//Botão Salvar
            pDAO.atualizarAjudante(ajudante4B.getId(), semanaAtual);
        }
    }

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
        Janela.irCadastroParticipantes();
    }//GEN-LAST:event_adicionarActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        Janela.irAlterarParticipantes();
    }//GEN-LAST:event_alterarActionPerformed

    private void proximaSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximaSemanaActionPerformed
        try {
            if (salvo) {
                //Limpar Listas
                limparTelaListas();

                // Verificar se há mais segundas-feiras a processar
                verificarSegundas();

                //Limpar todas variaveis
                limparVariaveis();

                //Redefinir temas das partes 
                redefinirTemas();

                todas = null;

                redefinirComboBox();

                salvarFalso();
            } else {
                Mensagem.mensagemAlerta("Primeiro salve essa semana para depois prosseguir.");
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_proximaSemanaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Janela.irMenu();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botaoRecomecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRecomecarActionPerformed
        Object[] options = {"Sim", "Cancelar"};
        int option = JOptionPane.showOptionDialog(this, "Deseja realmente recomeçar essa semana?\nSe a semana já foi salva, essa ação não é recomendada.", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (option == JOptionPane.YES_OPTION) {
            redefinirComboBox();
            redefinirTemas();
            todas = null;
            salvarFalso();
            java.awt.event.ActionEvent evts = null;
            botaoDefinirDataActionPerformed(evts);
        } else {
        }
    }//GEN-LAST:event_botaoRecomecarActionPerformed

    private void botaoConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConectarActionPerformed
        try {
            WhatsApp.iniciarWhatsApp();
            String a = WhatsApp.getWhatsAppStatus();
            if (a.equals("{\"status\":\"conectado\"}")) {
                botaoConectar.setText("CONECTADO");
                Mensagem.mensagemExito("Está tudo certo, pode enviar as designações!");
            } else {
                botaoConectar.setText("NÃO CONECTADO");
                Mensagem.mensagemErro("Por favor, conecte ao servidor do WhatsApp!");
            }
        } catch (Exception e) {
            botaoConectar.setText("NÃO CONECTADO");
            Mensagem.mensagemErro("Por favor, conecte ao servidor do WhatsApp!");
        }
    }//GEN-LAST:event_botaoConectarActionPerformed

    private void redefinirParticipantes() {
        if (presidenteB != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(presidenteB.getPessoa().getId()));
            presidenteB = null;
        }
        if (leituraBibliaB != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(leituraBibliaB.getId()));
            leituraBibliaB = null;
        }
        if (parte1B != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(parte1B.getId()));
            parte1B = null;
        }
        if (ajudante1B != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(ajudante1B.getId()));
            ajudante1B = null;
        }
        if (parte2B != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(parte2B.getId()));
            parte2B = null;
        }
        if (ajudante2B != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(ajudante2B.getId()));
            ajudante2B = null;
        }
        if (parte3B != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(parte3B.getId()));
            parte3B = null;
        }
        if (ajudante3B != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(ajudante3B.getId()));
            ajudante3B = null;
        }
        if (parte4B != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(parte4B.getId()));
            parte4B = null;
        }
        if (ajudante4B != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(ajudante4B.getId()));
            ajudante4B = null;
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

    private void redefinirTemas() {
        Thread thread = new Thread(() -> {
            SwingUtilities.invokeLater(() -> {
                temaDiscurso.setText("Discurso");
                temaVideo1.setText("");
                temaVideo2.setText("");
                temaVideo3.setText("");
                temaVideo4.setText("");
                temaNossaVida1.setText("Nossa Vida Cristã - parte 1");
                temaNossaVida2.setText("Nossa Vida Cristã - parte 2");
                nParte3.setText("?");
                nParte4.setText("?");
                nNossa1.setText("?");
                nNossa2.setText("?");
                nEstudoLivro.setText("?");
            });
        });
        thread.start();
    }

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
            Thread thread = new Thread(() -> {
                SwingUtilities.invokeLater(() -> {
                    panelA.setVisible(false);
                    painelBotoes.setVisible(false);
                    cSalaA.setSelected(false);
                    cSalaAB.setSelected(false);
                    painelSalas.setBackground(new java.awt.Color(204, 0, 0));
                    painelSalas.setVisible(false);
                });
            });
            thread.start();
        }
        int diaDoMes = semanaAtual.getDayOfMonth();
        String diaDoMesFormatado = String.format("%02d", diaDoMes);
        dia = diaDoMesFormatado.substring(0, 2);
    }

    protected void altParte4B(Pessoa a) {
        if (parte4B != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(parte4B.getId()));
        }
        parte4B = pDAO.buscarPessoaPorId(a.getId());
        txtParte4B.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(parte4B.getId());
        Mensagem.mensagemExito("Designado para " + comboParte4.getSelectedItem() + " - sala B, Alterado com Sucesso");
    }

    protected void altAjudante4B(Pessoa a) {
        if (ajudante4B != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(ajudante4B.getId()));
        }
        ajudante4B = pDAO.buscarPessoaPorId(a.getId());
        txtAjudante4B.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(ajudante4B.getId());
        Mensagem.mensagemExito("Ajudante para " + comboParte4.getSelectedItem() + " - sala B, Alterado com Sucesso");
    }

    protected void altParte4A(Pessoa a) {
        if (parte4A != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(parte4A.getId()));
        }
        parte4A = pDAO.buscarPessoaPorId(a.getId());
        txtParte4.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(parte4A.getId());
        Mensagem.mensagemExito("Designado para " + comboParte4.getSelectedItem() + " - sala A, Alterado com Sucesso");
    }

    protected void altAjudante4A(Pessoa a) {
        if (ajudante4A != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(ajudante4A.getId()));
        }
        ajudante4A = pDAO.buscarPessoaPorId(a.getId());
        txtAjudante4.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(ajudante4A.getId());
        Mensagem.mensagemExito("Ajudante para " + comboParte4.getSelectedItem() + " - sala A, Alterado com Sucesso");
    }

    protected void altParte3B(Pessoa a) {
        if (parte3B != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(parte3B.getId()));
        }
        parte3B = pDAO.buscarPessoaPorId(a.getId());
        txtParte3B.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(parte3B.getId());
        Mensagem.mensagemExito("Designado para " + comboParte3.getSelectedItem() + " - sala B, Alterado com Sucesso");
    }

    protected void altAjudante3B(Pessoa a) {
        if (ajudante3B != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(ajudante3B.getId()));
        }
        ajudante3B = pDAO.buscarPessoaPorId(a.getId());
        txtAjudante3B.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(ajudante3B.getId());
        Mensagem.mensagemExito("Ajudante para " + comboParte3.getSelectedItem() + " - sala B, Alterado com Sucesso");
    }

    protected void altParte3A(Pessoa a) {
        if (parte3A != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(parte3A.getId()));
        }
        parte3A = pDAO.buscarPessoaPorId(a.getId());
        txtParte3.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(parte3A.getId());
        Mensagem.mensagemExito("Designado para " + comboParte3.getSelectedItem() + " - sala A, Alterado com Sucesso");
    }

    protected void altAjudante3A(Pessoa a) {
        if (ajudante3A != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(ajudante3A.getId()));
        }
        ajudante3A = pDAO.buscarPessoaPorId(a.getId());
        txtAjudante3.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(ajudante3A.getId());
        Mensagem.mensagemExito("Ajudante para " + comboParte3.getSelectedItem() + " - sala A, Alterado com Sucesso");
    }

    protected void altParte2B(Pessoa a) {
        if (parte2B != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(parte2B.getId()));
        }
        parte2B = pDAO.buscarPessoaPorId(a.getId());
        txtParte2B.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(parte2B.getId());
        Mensagem.mensagemExito("Designado para " + comboParte2.getSelectedItem() + " - sala B, Alterado com Sucesso");
    }

    protected void altAjudante2B(Pessoa a) {
        if (ajudante2B != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(ajudante2B.getId()));
        }
        ajudante2B = pDAO.buscarPessoaPorId(a.getId());
        txtAjudante2B.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(ajudante2B.getId());
        Mensagem.mensagemExito("Ajudante para " + comboParte2.getSelectedItem() + " - sala B, Alterado com Sucesso");
    }

    protected void altParte2A(Pessoa a) {
        if (parte2A != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(parte2A.getId()));
        }
        parte2A = pDAO.buscarPessoaPorId(a.getId());
        txtParte2.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(parte2A.getId());
        Mensagem.mensagemExito("Designado para " + comboParte2.getSelectedItem() + " - sala A, Alterado com Sucesso");
    }

    protected void altAjudante2A(Pessoa a) {
        if (ajudante2A != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(ajudante2A.getId()));
        }
        ajudante2A = pDAO.buscarPessoaPorId(a.getId());
        txtAjudante2.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(ajudante2A.getId());
        Mensagem.mensagemExito("Ajudante para " + comboParte2.getSelectedItem() + " - sala A, Alterado com Sucesso");
    }

    protected void altParte1A(Pessoa a) {
        if (parte1A != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(parte1A.getId()));
        }
        parte1A = pDAO.buscarPessoaPorId(a.getId());
        txtParte1.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(parte1A.getId());
        Mensagem.mensagemExito("Designado para " + comboParte1.getSelectedItem() + " - sala A, Alterado com Sucesso");
    }

    protected void altAjudante1A(Pessoa a) {
        if (ajudante1A != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(ajudante1A.getId()));
        }
        ajudante1A = pDAO.buscarPessoaPorId(a.getId());
        txtAjudante1.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(ajudante1A.getId());
        Mensagem.mensagemExito("Ajudante para " + comboParte1.getSelectedItem() + " - sala A, Alterado com Sucesso");
    }

    protected void altParte1B(Pessoa a) {
        if (parte1B != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(parte1B.getId()));
        }
        parte1B = pDAO.buscarPessoaPorId(a.getId());
        txtParte1B.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(parte1B.getId());
        Mensagem.mensagemExito("Designado para " + comboParte1.getSelectedItem() + " - sala B, Alterado com Sucesso");
    }

    protected void altAjudante1B(Pessoa a) {
        if (ajudante1B != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(ajudante1B.getId()));
        }
        ajudante1B = pDAO.buscarPessoaPorId(a.getId());
        txtAjudante1B.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(ajudante1B.getId());
        Mensagem.mensagemExito("Ajudante para " + comboParte1.getSelectedItem() + " - sala B, Alterado com Sucesso");
    }

    protected void altPresidenteA(Pessoa a) {
        if (!txtPresidente.getText().isEmpty()) {
            listaIgnorarEstudantes.remove(Integer.valueOf(presidenteA.getPessoa().getId()));
        }
        PresidenteDAO daos = new PresidenteDAO();
        presidenteA = daos.buscarPorIdPessoa(a.getId());
        txtPresidente.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(presidenteA.getPessoa().getId());
        Mensagem.mensagemExito("Designado para Presidente sala A, Alterado com Sucesso");
    }

    protected void altOracaoInicial(Pessoa a) {
        if (!txtOracaoInicial.getText().isEmpty()) {
            listaIgnorarEstudantes.remove(Integer.valueOf(oracaoA.getPessoa().getId()));
        }
        OracaoDAO daos = new OracaoDAO();
        oracaoA = daos.buscarPorIdPessoa(a.getId());
        txtOracaoInicial.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(oracaoA.getPessoa().getId());
        Mensagem.mensagemExito("Designado para Oração Inicial, Alterado com Sucesso");
    }

    protected void altLeituraBibliaA(Pessoa a) {
        if (leituraBibliaA != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(leituraBibliaA.getId()));
            leituraBibliaA = pDAO.buscarPessoaPorId(a.getId());
            txtLeituraBiblia.setText(a.getNome() + " " + a.getSobrenome());
            listaIgnorarEstudantes.add(leituraBibliaA.getId());
            Mensagem.mensagemExito("Designado para Leitura da Bíblia sala A, Alterado com Sucesso");
        } else {
            leituraBibliaA = pDAO.buscarPessoaPorId(a.getId());
            txtLeituraBiblia.setText(a.getNome() + " " + a.getSobrenome());
            listaIgnorarEstudantes.add(leituraBibliaA.getId());
            Mensagem.mensagemExito("Designado para Leitura da Bíblia sala A, Alterado com Sucesso");
        }
    }

    protected void altLeituraBibliaB(Pessoa a) {
        if (leituraBibliaB != null) {
            listaIgnorarEstudantes.remove(Integer.valueOf(leituraBibliaB.getId()));
        } else {
            leituraBibliaB = pDAO.buscarPessoaPorId(a.getId());
            txtLeituraBibliaB.setText(a.getNome() + " " + a.getSobrenome());
            listaIgnorarEstudantes.add(leituraBibliaB.getId());
            Mensagem.mensagemExito("Designado para Leitura da Bíblia sala B, Alterado com Sucesso");
        }
    }

    protected void altTesouros(Pessoa a) {
        if (!txtTesouros.getText().isEmpty()) {
            listaIgnorarEstudantes.remove(Integer.valueOf(tesouros.getPessoa().getId()));
        }
        tesouros = tDAO.buscarPorIdPessoa(a.getId());
        txtTesouros.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(tesouros.getPessoa().getId());
        Mensagem.mensagemExito("Designado para Tesouros, Alterado com Sucesso");
    }

    protected void altNossaVida1(Pessoa a) {
        if (!txtCrista1.getText().isEmpty()) {
            listaIgnorarEstudantes.remove(Integer.valueOf(nossaVida1.getId()));
        }
        nossaVida1 = pDAO.buscarPessoaPorId(a.getId());
        txtCrista1.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(nossaVida1.getId());
        Mensagem.mensagemExito("Designado para Nossa Vida parte 1, Alterado com Sucesso");
    }

    protected void altLeitorEstudo(Pessoa a) {
        if (!txtLeitor.getText().isEmpty()) {
            listaIgnorarEstudantes.remove(Integer.valueOf(leitor.getPessoa().getId()));
        }
        leitor = leiDAO.buscarPorIdPessoa(a.getId());
        txtLeitor.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(leitor.getPessoa().getId());
        Mensagem.mensagemExito("Designado para Leitor do Estudo Bíblico de Congregação, Alterado com Sucesso");
    }

    protected void altJoias(Pessoa a) {
        if (!txtJoias.getText().isEmpty()) {
            listaIgnorarEstudantes.remove(Integer.valueOf(joias.getId()));
        }
        joias = pDAO.buscarPessoaPorId(a.getId());
        txtJoias.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(joias.getId());
        Mensagem.mensagemExito("Designado para Joias Espirituais, Alterado com Sucesso");
    }

    protected void altOracaoFinal(Pessoa a) {
        if (!txtOracaoFinal.getText().isEmpty()) {
            listaIgnorarEstudantes.remove(Integer.valueOf(oracaoB.getPessoa().getId()));
        }
        OracaoDAO daos = new OracaoDAO();
        oracaoB = daos.buscarPorIdPessoa(a.getId());
        txtOracaoFinal.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(oracaoB.getPessoa().getId());
        Mensagem.mensagemExito("Designado para Oração Final, Alterado com Sucesso");
    }

    protected void altNossaVida2(Pessoa a) {
        if (!txtNossaVida2.getText().isEmpty()) {
            listaIgnorarEstudantes.remove(Integer.valueOf(nossaVida2.getId()));
        }
        nossaVida2 = pDAO.buscarPessoaPorId(a.getId());
        txtNossaVida2.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(nossaVida2.getId());
        Mensagem.mensagemExito("Designado para Nossa Vida parte 2, Alterado com Sucesso");
    }

    protected void altEstudoCongregacao(Pessoa a) {
        if (!txtEstudoCongregacao.getText().isEmpty()) {
            listaIgnorarEstudantes.remove(Integer.valueOf(estudoCong.getPessoa().getId()));
        }
        estudoCong = congDAO.buscarPorIdPessoa(a.getId());
        txtEstudoCongregacao.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(estudoCong.getPessoa().getId());
        Mensagem.mensagemExito("Designado para o Estudo Bíblico de Congregação, Alterado com Sucesso");
    }

    protected void altPresidenteB(Pessoa a) {
        if (!txtPresidenteB.getText().isEmpty()) {
            listaIgnorarEstudantes.remove(Integer.valueOf(presidenteB.getPessoa().getId()));
        }
        PresidenteDAO daos = new PresidenteDAO();
        presidenteB = daos.buscarPorIdPessoa(a.getId());
        txtPresidenteB.setText(a.getNome() + " " + a.getSobrenome());
        listaIgnorarEstudantes.add(presidenteB.getPessoa().getId());
        Mensagem.mensagemExito("Designado para Presidente sala B, Alterado com Sucesso");
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
        todas.setLabelTesouros(temaDiscurso.getText());
        todas.setTesouros(txtTesouros.getText());
        todas.setJoias(txtJoias.getText());
        todas.setLeituraBibliaA(txtLeituraBiblia.getText());
        todas.setLeituraBibliaB(txtLeituraBibliaB.getText());
        if (comboParte1.getSelectedItem().equals("Faça seu melhor no ministério")) {
            todas.setNomeParte1("");
        } else {
            todas.setNomeParte1(comboParte1.getSelectedItem() + " " + temaVideo1.getText());
        }
        todas.setParte1A(txtParte1.getText());
        todas.setAjudante1A(txtAjudante1.getText());
        todas.setParte1B(txtParte1B.getText());
        todas.setAjudante1B(txtAjudante1B.getText());
        if (comboParte2.getSelectedItem().equals("Faça seu melhor no ministério")) {
            todas.setNomeParte2("");
        } else {
            todas.setNomeParte2(comboParte2.getSelectedItem() + " " + temaVideo2.getText());
        }
        todas.setParte2A(txtParte2.getText());
        todas.setAjudante2A(txtAjudante2.getText());
        todas.setParte2B(txtParte2B.getText());
        todas.setAjudante2B(txtAjudante2B.getText());
        if (comboParte3.getSelectedItem().equals("Faça seu melhor no ministério")) {
            todas.setNomeparte3("");
        } else {
            todas.setNomeparte3(comboParte3.getSelectedItem() + " " + temaVideo3.getText());
        }
        todas.setParte3A(txtParte3.getText());
        todas.setAjudante3A(txtAjudante3.getText());
        todas.setParte3B(txtParte3B.getText());
        todas.setAjudante3B(txtAjudante3B.getText());
        if (comboParte4.getSelectedItem().equals("Faça seu melhor no ministério")) {
            todas.setNomeParte4("");
        } else {
            todas.setNomeParte4(comboParte4.getSelectedItem() + " " + temaVideo4.getText());
        }
        todas.setParte4A(txtParte4.getText());
        todas.setAjudante4A(txtAjudante4.getText());
        todas.setParte4B(txtParte4B.getText());
        todas.setAjudante4B(txtAjudante4B.getText());
        todas.setLabelNossaVida1(temaNossaVida1.getText());
        todas.setNossaVida1(txtCrista1.getText());
        todas.setLabelNossaVida2(temaNossaVida2.getText());
        todas.setNossaVida2(txtNossaVida2.getText());
        todas.setEstudoLivro(txtEstudoCongregacao.getText());
        todas.setLeitor(txtLeitor.getText());
        todas.setOracaoFinal(txtOracaoFinal.getText());
        tddao.cadastrar(todas);
    }

    private void atualizarTodasPartes() {
        todas.setDia(dia);
        todas.setMes(mes);
        todas.setAno(ano);
        todas.setSemana(labelDATA.getText());
        todas.setPresidenteA(txtPresidente.getText());
        todas.setPresidenteB(txtPresidenteB.getText());
        todas.setOracaoInicial(txtOracaoInicial.getText());
        todas.setLabelTesouros(temaDiscurso.getText());
        todas.setTesouros(txtTesouros.getText());
        todas.setJoias(txtJoias.getText());
        todas.setLeituraBibliaA(txtLeituraBiblia.getText());
        todas.setLeituraBibliaB(txtLeituraBibliaB.getText());
        if (comboParte1.getSelectedItem().equals("Faça seu melhor no ministério")) {
            todas.setNomeParte1("");
        } else {
            todas.setNomeParte1(comboParte1.getSelectedItem() + " " + temaVideo1.getText());
        }
        todas.setParte1A(txtParte1.getText());
        todas.setAjudante1A(txtAjudante1.getText());
        todas.setParte1B(txtParte1B.getText());
        todas.setAjudante1B(txtAjudante1B.getText());

        if (comboParte2.getSelectedItem().equals("Faça seu melhor no ministério")) {
            todas.setNomeParte2("");
        } else {
            todas.setNomeParte2(comboParte2.getSelectedItem() + " " + temaVideo2.getText());
        }
        todas.setParte2A(txtParte2.getText());
        todas.setAjudante2A(txtAjudante2.getText());
        todas.setParte2B(txtParte2B.getText());
        todas.setAjudante2B(txtAjudante2B.getText());

        if (comboParte3.getSelectedItem().equals("Faça seu melhor no ministério")) {
            todas.setNomeparte3("");
        } else {
            todas.setNomeparte3(comboParte3.getSelectedItem() + " " + temaVideo3.getText());
        }
        todas.setParte3A(txtParte3.getText());
        todas.setAjudante3A(txtAjudante3.getText());
        todas.setParte3B(txtParte3B.getText());
        todas.setAjudante3B(txtAjudante3B.getText());

        if (comboParte4.getSelectedItem().equals("Faça seu melhor no ministério")) {
            todas.setNomeParte4("");
        } else {
            todas.setNomeParte4(comboParte4.getSelectedItem() + " " + temaVideo4.getText());
        }
        todas.setParte4A(txtParte4.getText());
        todas.setAjudante4A(txtAjudante4.getText());
        todas.setParte4B(txtParte4B.getText());
        todas.setAjudante4B(txtAjudante4B.getText());
        todas.setLabelNossaVida1(temaNossaVida1.getText());
        todas.setNossaVida1(txtCrista1.getText());
        todas.setLabelNossaVida2(temaNossaVida2.getText());
        todas.setNossaVida2(txtNossaVida2.getText());
        todas.setEstudoLivro(txtEstudoCongregacao.getText());
        todas.setLeitor(txtLeitor.getText());
        todas.setOracaoFinal(txtOracaoFinal.getText());

        tddao.atualizar(todas);
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
        parte1A = null;
        parte2A = null;
        parte3A = null;
        parte4A = null;
        ajudante1A = null;
        ajudante2A = null;
        ajudante3A = null;
        ajudante4A = null;
        parte1B = null;
        parte2B = null;
        parte3B = null;
        parte4B = null;
        ajudante1B = null;
        ajudante2B = null;
        ajudante3B = null;
        ajudante4B = null;
        enviarOracaoInicial.setBackground(new java.awt.Color(255, 153, 153));
        enviarPresidenteA.setBackground(new java.awt.Color(255, 153, 153));
        enviarPresidenteB.setBackground(new java.awt.Color(255, 153, 153));
        enviarDiscurso.setBackground(new java.awt.Color(255, 153, 153));
        enviarJoias.setBackground(new java.awt.Color(255, 153, 153));
        enviarLeituraBiblia.setBackground(new java.awt.Color(255, 153, 153));
        enviarLeituraBibliaB.setBackground(new java.awt.Color(255, 153, 153));
        enviarNossaVida1.setBackground(new java.awt.Color(255, 153, 153));
        enviarNossaVida2.setBackground(new java.awt.Color(255, 153, 153));
        enviarEstudoCongregacao.setBackground(new java.awt.Color(255, 153, 153));
        enviarEstudoLeitor.setBackground(new java.awt.Color(255, 153, 153));
        enviarOracaoFinal.setBackground(new java.awt.Color(255, 153, 153));
        enviarParte1A.setBackground(new java.awt.Color(255, 153, 153));
        enviarParte2A.setBackground(new java.awt.Color(255, 153, 153));
        enviarParte3A.setBackground(new java.awt.Color(255, 153, 153));
        enviarParte4A.setBackground(new java.awt.Color(255, 153, 153));
        enviarParte1B.setBackground(new java.awt.Color(255, 153, 153));
        enviarParte2B.setBackground(new java.awt.Color(255, 153, 153));
        enviarParte3B.setBackground(new java.awt.Color(255, 153, 153));
        enviarParte4B.setBackground(new java.awt.Color(255, 153, 153));
    }

    private void parteNumero() {
        int num = 5;
        if (!txtParte3.getText().isEmpty()) {
            num++;
            nParte3.setText(String.valueOf(num));
        }
        if (!txtParte4.getText().isEmpty()) {
            num++;
            nParte4.setText(String.valueOf(num));
        }
        if (!txtCrista1.getText().isEmpty()) {
            num++;
            nNossa1.setText(String.valueOf(num));
        }
        if (!txtNossaVida2.getText().isEmpty()) {
            num++;
            nNossa2.setText(String.valueOf(num));
        }
        if (!txtEstudoCongregacao.getText().isEmpty()) {
            num++;
            nEstudoLivro.setText(String.valueOf(num));
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
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar;
    private javax.swing.JButton alterar;
    private javax.swing.JButton botaoConectar;
    private javax.swing.JButton botaoDefinirData;
    private javax.swing.JButton botaoRecomecar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cEstudoCongregacao;
    private javax.swing.JRadioButton cJoias;
    private javax.swing.JRadioButton cLeitorEstudo;
    private javax.swing.JRadioButton cLeituraBiblia;
    private javax.swing.JRadioButton cNossaVida1;
    private javax.swing.JRadioButton cNossaVida2;
    private javax.swing.JRadioButton cOracaoFinal;
    private javax.swing.JRadioButton cOracaoInicial;
    private javax.swing.JRadioButton cPresidente;
    private javax.swing.JRadioButton cSalaA;
    private javax.swing.JRadioButton cSalaAB;
    private javax.swing.JRadioButton cTesouros;
    private javax.swing.JComboBox<String> comboAno;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.JComboBox<String> comboParte1;
    private javax.swing.JComboBox<String> comboParte2;
    private javax.swing.JComboBox<String> comboParte3;
    private javax.swing.JComboBox<String> comboParte4;
    private javax.swing.JButton enviarDiscurso;
    private javax.swing.JButton enviarEstudoCongregacao;
    private javax.swing.JButton enviarEstudoLeitor;
    private javax.swing.JButton enviarJoias;
    private javax.swing.JButton enviarLeituraBiblia;
    private javax.swing.JButton enviarLeituraBibliaB;
    private javax.swing.JButton enviarNossaVida1;
    private javax.swing.JButton enviarNossaVida2;
    private javax.swing.JButton enviarOracaoFinal;
    private javax.swing.JButton enviarOracaoInicial;
    private javax.swing.JButton enviarParte1A;
    private javax.swing.JButton enviarParte1B;
    private javax.swing.JButton enviarParte2A;
    private javax.swing.JButton enviarParte2B;
    private javax.swing.JButton enviarParte3A;
    private javax.swing.JButton enviarParte3B;
    private javax.swing.JButton enviarParte4A;
    private javax.swing.JButton enviarParte4B;
    private javax.swing.JButton enviarPresidenteA;
    private javax.swing.JButton enviarPresidenteB;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel labelDATA;
    private javax.swing.JLabel nDiscurso;
    private javax.swing.JLabel nEstudoLivro;
    private javax.swing.JLabel nJoias;
    private javax.swing.JLabel nLeituraBiblia;
    private javax.swing.JLabel nNossa1;
    private javax.swing.JLabel nNossa2;
    private javax.swing.JLabel nParte1;
    private javax.swing.JLabel nParte2;
    private javax.swing.JLabel nParte3;
    private javax.swing.JLabel nParte4;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelSalas;
    private javax.swing.JPanel panelA;
    private javax.swing.JButton proximaSemana;
    private javax.swing.JTextField temaDiscurso;
    private javax.swing.JTextField temaNossaVida1;
    private javax.swing.JTextField temaNossaVida2;
    private javax.swing.JTextField temaVideo1;
    private javax.swing.JTextField temaVideo2;
    private javax.swing.JTextField temaVideo3;
    private javax.swing.JTextField temaVideo4;
    private javax.swing.JTextField txtAjudante1;
    private javax.swing.JTextField txtAjudante1B;
    private javax.swing.JTextField txtAjudante2;
    private javax.swing.JTextField txtAjudante2B;
    private javax.swing.JTextField txtAjudante3;
    private javax.swing.JTextField txtAjudante3B;
    private javax.swing.JTextField txtAjudante4;
    private javax.swing.JTextField txtAjudante4B;
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
    private javax.swing.JTextField txtParte4;
    private javax.swing.JTextField txtParte4B;
    private javax.swing.JTextField txtPresidente;
    private javax.swing.JTextField txtPresidenteB;
    private javax.swing.JTextField txtTesouros;
    // End of variables declaration//GEN-END:variables
}
