package br.com.alexlopes.designacoes.views;

import br.com.alexlopes.designacoes.dao.PessoaDAO;
import br.com.alexlopes.designacoes.dao.SemanaDAO;
import br.com.alexlopes.designacoes.dao.TodasPartesDAO;
import br.com.alexlopes.designacoes.model.Pessoa;
import br.com.alexlopes.designacoes.model.Semana;
import br.com.alexlopes.designacoes.model.TodasPartes;
import br.com.alexlopes.designacoes.util.GerarPDF;
import br.com.alexlopes.designacoes.util.Janela;
import br.com.alexlopes.designacoes.util.Mensagem;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Substituicao extends javax.swing.JFrame {

    private TodasPartes todas;
    private int linha;
    private TodasPartes partesDaSemana;
    private String data, ParteTipo;
    private Pessoa p1, p2;
    private final PessoaDAO pDAO = new PessoaDAO();
    private TodasPartesDAO dao;

    public Substituicao() {
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtPresidenteB = new javax.swing.JTextField();
        txtLeituraBibliaB = new javax.swing.JTextField();
        txtParte1B = new javax.swing.JTextField();
        txtAjudante1B = new javax.swing.JTextField();
        txtParte2B = new javax.swing.JTextField();
        txtAjudante2B = new javax.swing.JTextField();
        txtParte3B = new javax.swing.JTextField();
        txtAjudante3B = new javax.swing.JTextField();
        txtParte4B = new javax.swing.JTextField();
        txtAjudante4B = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPresidenteA = new javax.swing.JTextField();
        txtOracaoInicial = new javax.swing.JTextField();
        txtTesouros = new javax.swing.JTextField();
        txtJoias = new javax.swing.JTextField();
        txtLeituraBibliaA = new javax.swing.JTextField();
        txtParte1A = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelParte1 = new javax.swing.JLabel();
        txtAjudante1A = new javax.swing.JTextField();
        txtParte2A = new javax.swing.JTextField();
        txtAjudante2A = new javax.swing.JTextField();
        txtParte3A = new javax.swing.JTextField();
        txtAjudante3A = new javax.swing.JTextField();
        txtNossaVida1 = new javax.swing.JTextField();
        txtNossaVida2 = new javax.swing.JTextField();
        txtEstudoCongregacao = new javax.swing.JTextField();
        txtLeitor = new javax.swing.JTextField();
        txtOracaoFinal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelParte2 = new javax.swing.JLabel();
        labelParte3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtParte4A = new javax.swing.JTextField();
        txtAjudante4A = new javax.swing.JTextField();
        labelParte4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nDiscurso = new javax.swing.JLabel();
        nJoias = new javax.swing.JLabel();
        nLeituraBiblia = new javax.swing.JLabel();
        nParte1 = new javax.swing.JLabel();
        nParte4 = new javax.swing.JLabel();
        nParte2 = new javax.swing.JLabel();
        nParte3 = new javax.swing.JLabel();
        nNossa1 = new javax.swing.JLabel();
        nNossa2 = new javax.swing.JLabel();
        nEstudoLivro = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabela.setBackground(new java.awt.Color(255, 255, 255));
        tabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tabela.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "SEMANA"
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
        tabela.setRowHeight(40);
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

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("SALA B");

        txtPresidenteB.setEditable(false);
        txtPresidenteB.setBackground(new java.awt.Color(255, 255, 255));
        txtPresidenteB.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtPresidenteB.setForeground(new java.awt.Color(0, 0, 0));
        txtPresidenteB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtPresidenteB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPresidenteBMouseClicked(evt);
            }
        });

        txtLeituraBibliaB.setEditable(false);
        txtLeituraBibliaB.setBackground(new java.awt.Color(255, 255, 255));
        txtLeituraBibliaB.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtLeituraBibliaB.setForeground(new java.awt.Color(0, 0, 102));
        txtLeituraBibliaB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtLeituraBibliaB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLeituraBibliaBMouseClicked(evt);
            }
        });

        txtParte1B.setEditable(false);
        txtParte1B.setBackground(new java.awt.Color(255, 255, 204));
        txtParte1B.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtParte1B.setForeground(new java.awt.Color(0, 0, 102));
        txtParte1B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte1B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte1BMouseClicked(evt);
            }
        });

        txtAjudante1B.setEditable(false);
        txtAjudante1B.setBackground(new java.awt.Color(255, 255, 204));
        txtAjudante1B.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtAjudante1B.setForeground(new java.awt.Color(0, 51, 0));
        txtAjudante1B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante1B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante1BMouseClicked(evt);
            }
        });

        txtParte2B.setEditable(false);
        txtParte2B.setBackground(new java.awt.Color(204, 255, 204));
        txtParte2B.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtParte2B.setForeground(new java.awt.Color(0, 0, 102));
        txtParte2B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte2B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte2BMouseClicked(evt);
            }
        });

        txtAjudante2B.setEditable(false);
        txtAjudante2B.setBackground(new java.awt.Color(204, 255, 204));
        txtAjudante2B.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtAjudante2B.setForeground(new java.awt.Color(0, 51, 0));
        txtAjudante2B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante2B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante2BMouseClicked(evt);
            }
        });

        txtParte3B.setEditable(false);
        txtParte3B.setBackground(new java.awt.Color(255, 255, 204));
        txtParte3B.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtParte3B.setForeground(new java.awt.Color(0, 0, 102));
        txtParte3B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte3B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte3BMouseClicked(evt);
            }
        });

        txtAjudante3B.setEditable(false);
        txtAjudante3B.setBackground(new java.awt.Color(255, 255, 204));
        txtAjudante3B.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtAjudante3B.setForeground(new java.awt.Color(0, 51, 0));
        txtAjudante3B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante3B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante3BMouseClicked(evt);
            }
        });

        txtParte4B.setEditable(false);
        txtParte4B.setBackground(new java.awt.Color(204, 255, 204));
        txtParte4B.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtParte4B.setForeground(new java.awt.Color(0, 0, 51));
        txtParte4B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte4B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte4BMouseClicked(evt);
            }
        });

        txtAjudante4B.setEditable(false);
        txtAjudante4B.setBackground(new java.awt.Color(204, 255, 204));
        txtAjudante4B.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtAjudante4B.setForeground(new java.awt.Color(0, 0, 0));
        txtAjudante4B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante4B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante4BMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel4)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAjudante4B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtParte4B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAjudante3B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtParte3B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAjudante2B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtParte2B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAjudante1B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtParte1B, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLeituraBibliaB, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPresidenteB, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPresidenteB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(txtLeituraBibliaB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtParte1B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAjudante1B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtParte2B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAjudante2B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtParte3B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAjudante3B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtParte4B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAjudante4B, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("SALA A");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Presidente:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Oração Inicial: ");

        txtPresidenteA.setEditable(false);
        txtPresidenteA.setBackground(new java.awt.Color(255, 255, 255));
        txtPresidenteA.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtPresidenteA.setForeground(new java.awt.Color(0, 0, 0));
        txtPresidenteA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtPresidenteA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPresidenteAMouseClicked(evt);
            }
        });

        txtOracaoInicial.setEditable(false);
        txtOracaoInicial.setBackground(new java.awt.Color(255, 255, 255));
        txtOracaoInicial.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtOracaoInicial.setForeground(new java.awt.Color(0, 0, 0));
        txtOracaoInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        txtJoias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtJoiasMouseClicked(evt);
            }
        });

        txtLeituraBibliaA.setEditable(false);
        txtLeituraBibliaA.setBackground(new java.awt.Color(255, 255, 255));
        txtLeituraBibliaA.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtLeituraBibliaA.setForeground(new java.awt.Color(0, 0, 102));
        txtLeituraBibliaA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtLeituraBibliaA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLeituraBibliaAMouseClicked(evt);
            }
        });

        txtParte1A.setEditable(false);
        txtParte1A.setBackground(new java.awt.Color(255, 255, 204));
        txtParte1A.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtParte1A.setForeground(new java.awt.Color(0, 0, 102));
        txtParte1A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte1A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte1AMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Tesouros:");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Joias Espirituais:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Leitura da Bíblia:");

        labelParte1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelParte1.setForeground(new java.awt.Color(0, 0, 102));
        labelParte1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelParte1.setText("Parte 1:");
        labelParte1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtAjudante1A.setEditable(false);
        txtAjudante1A.setBackground(new java.awt.Color(255, 255, 204));
        txtAjudante1A.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtAjudante1A.setForeground(new java.awt.Color(0, 51, 0));
        txtAjudante1A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante1A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante1AMouseClicked(evt);
            }
        });

        txtParte2A.setEditable(false);
        txtParte2A.setBackground(new java.awt.Color(204, 255, 204));
        txtParte2A.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtParte2A.setForeground(new java.awt.Color(0, 0, 102));
        txtParte2A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte2A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte2AMouseClicked(evt);
            }
        });

        txtAjudante2A.setEditable(false);
        txtAjudante2A.setBackground(new java.awt.Color(204, 255, 204));
        txtAjudante2A.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtAjudante2A.setForeground(new java.awt.Color(0, 51, 0));
        txtAjudante2A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante2A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante2AMouseClicked(evt);
            }
        });

        txtParte3A.setEditable(false);
        txtParte3A.setBackground(new java.awt.Color(255, 255, 204));
        txtParte3A.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtParte3A.setForeground(new java.awt.Color(0, 0, 102));
        txtParte3A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte3A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte3AMouseClicked(evt);
            }
        });

        txtAjudante3A.setEditable(false);
        txtAjudante3A.setBackground(new java.awt.Color(255, 255, 204));
        txtAjudante3A.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtAjudante3A.setForeground(new java.awt.Color(0, 51, 0));
        txtAjudante3A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante3A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante3AMouseClicked(evt);
            }
        });

        txtNossaVida1.setEditable(false);
        txtNossaVida1.setBackground(new java.awt.Color(255, 255, 255));
        txtNossaVida1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtNossaVida1.setForeground(new java.awt.Color(0, 0, 0));
        txtNossaVida1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtNossaVida1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNossaVida1MouseClicked(evt);
            }
        });

        txtNossaVida2.setEditable(false);
        txtNossaVida2.setBackground(new java.awt.Color(255, 255, 255));
        txtNossaVida2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtNossaVida2.setForeground(new java.awt.Color(0, 0, 0));
        txtNossaVida2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        txtOracaoFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtOracaoFinalMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 0));
        jLabel9.setText("Ajudante:");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 0));
        jLabel10.setText("Ajudante:");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 0));
        jLabel11.setText("Ajudante:");

        labelParte2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelParte2.setForeground(new java.awt.Color(0, 0, 102));
        labelParte2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelParte2.setText("Parte 2:");
        labelParte2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelParte3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelParte3.setForeground(new java.awt.Color(0, 0, 102));
        labelParte3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelParte3.setText("Parte 3:");
        labelParte3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Nossa vida Cristã 1:");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Nossa vida Cristã 2:");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Estudo Bíblico Congregação:");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Leitor:");

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Oração Final:");

        txtParte4A.setEditable(false);
        txtParte4A.setBackground(new java.awt.Color(204, 255, 204));
        txtParte4A.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtParte4A.setForeground(new java.awt.Color(0, 0, 51));
        txtParte4A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtParte4A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtParte4AMouseClicked(evt);
            }
        });

        txtAjudante4A.setEditable(false);
        txtAjudante4A.setBackground(new java.awt.Color(204, 255, 204));
        txtAjudante4A.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtAjudante4A.setForeground(new java.awt.Color(0, 0, 0));
        txtAjudante4A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtAjudante4A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAjudante4AMouseClicked(evt);
            }
        });

        labelParte4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelParte4.setForeground(new java.awt.Color(0, 0, 102));
        labelParte4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelParte4.setText("Parte 4:");
        labelParte4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 0));
        jLabel13.setText("Ajudante:");

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

        nParte4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        nParte4.setForeground(new java.awt.Color(0, 0, 0));
        nParte4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nParte4.setText(" ");

        nParte2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        nParte2.setForeground(new java.awt.Color(0, 0, 0));
        nParte2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nParte2.setText("5");

        nParte3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        nParte3.setForeground(new java.awt.Color(0, 0, 0));
        nParte3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nParte3.setText(" ");

        nNossa1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        nNossa1.setForeground(new java.awt.Color(0, 0, 0));
        nNossa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nNossa1.setText(" ");

        nNossa2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        nNossa2.setForeground(new java.awt.Color(0, 0, 0));
        nNossa2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nNossa2.setText(" ");

        nEstudoLivro.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        nEstudoLivro.setForeground(new java.awt.Color(0, 0, 0));
        nEstudoLivro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nEstudoLivro.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(227, 227, 227))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nDiscurso, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nJoias, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nLeituraBiblia, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nParte1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelParte1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nParte2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelParte2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nParte3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelParte3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel9)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(nParte4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelParte4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtOracaoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTesouros, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtJoias, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLeituraBibliaA, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtParte1A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAjudante1A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtParte2A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAjudante2A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtParte3A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAjudante3A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtParte4A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAjudante4A, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPresidenteA, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(nNossa1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(nNossa2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(nEstudoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel16)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNossaVida1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNossaVida2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstudoCongregacao, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOracaoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPresidenteA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOracaoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTesouros, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(nDiscurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJoias, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(nJoias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLeituraBibliaA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(nLeituraBiblia)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParte1A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelParte1)
                    .addComponent(nParte1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAjudante1A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParte2A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelParte2)
                    .addComponent(nParte2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAjudante2A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParte3A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelParte3)
                    .addComponent(nParte3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAjudante3A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParte4A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelParte4)
                    .addComponent(nParte4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAjudante4A, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNossaVida1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(nNossa1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNossaVida2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(nNossa2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstudoCongregacao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(nEstudoLivro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOracaoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        txtData.setBackground(new java.awt.Color(255, 255, 153));
        txtData.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        txtData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtData.setOpaque(true);

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/85542_guardar_save_icon.png"))); // NOI18N
        jButton1.setText("  Salvar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/71124_arrow_back_left_red_icon.png"))); // NOI18N
        jButton2.setText("Voltar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Escolha uma Semana");

        jLabel12.setBackground(new java.awt.Color(0, 0, 51));
        jLabel12.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Substituição");
        jLabel12.setOpaque(true);

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Excluír essa semana");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2))
                                .addGap(181, 181, 181)))))
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

    public void altParteTipo(String pt) {
        ParteTipo = pt;
    }

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        linha = -1;
        dao = new TodasPartesDAO();
        data = tabela.getValueAt(tabela.getSelectedRow(), 1).toString();
        String idss = tabela.getValueAt(tabela.getSelectedRow(), 0).toString();
        linha = Integer.parseInt(idss);
        partesDaSemana = new TodasPartes();
        partesDaSemana = dao.buscarPorSemana(data);

        txtData.setText(partesDaSemana.getSemana());
        preencherDados();

    }//GEN-LAST:event_tabelaMouseClicked

    public void mostrarDeterminadaSem(String clique) {
        partesDaSemana = new TodasPartes();
        dao = new TodasPartesDAO();

        partesDaSemana = dao.encontrarPorSemana(clique);

        txtData.setText(partesDaSemana.getSemana());
        preencherDados();
    }


    private void txtPresidenteAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPresidenteAMouseClicked
        if (!txtPresidenteA.getText().isEmpty()) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtPresidenteA.getText());
            Janela.irTrocarSubstituicao("txtPresidenteA", 1, "Presidente", "", data, "SALA  A", p1, null, "Presidente", 1);
        } else {
            //Mensagem.mensagemErro("Não tem nenhum Presidente designado para ser substituido.");
            Janela.irTrocarSubstituicao("txtPresidenteA", 1, "Presidente", "", data, "SALA  A", null, null, "Presidente", 1);
        }
    }//GEN-LAST:event_txtPresidenteAMouseClicked

    private void txtLeituraBibliaAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLeituraBibliaAMouseClicked
        if (!txtLeituraBibliaA.getText().isEmpty()) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtLeituraBibliaA.getText());
            Janela.irTrocarSubstituicao("txtLeituraBibliaA", 1, "LeituraBiblia", "Leitura da Bíblia", data, "SALA  A", p1, null, "3", 1);
        } else {
            //Mensagem.mensagemErro("Não tem ninguém designado nesse campo, para ser substituído.");
            Janela.irTrocarSubstituicao("txtLeituraBibliaA", 1, "LeituraBiblia", "Leitura da Bíblia", data, "SALA  A", null, null, "3", 1);
        }
    }//GEN-LAST:event_txtLeituraBibliaAMouseClicked

    private void txtOracaoInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOracaoInicialMouseClicked
        if (!txtOracaoInicial.getText().isEmpty()) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtOracaoInicial.getText());
            Janela.irTrocarSubstituicao("txtOracaoInicial", 1, "Oracao", "", data, "SALA  A", p1, null, "Oração Inicial", 1);
        } else {
            //Mensagem.mensagemErro("Não tem ninguém designado nesse campo, para ser substituído.");
            Janela.irTrocarSubstituicao("txtOracaoInicial", 1, "Oracao", "", data, "SALA  A", null, null, "Oração Inicial", 1);
        }
    }//GEN-LAST:event_txtOracaoInicialMouseClicked

    private void txtTesourosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTesourosMouseClicked
        if (!txtTesouros.getText().isEmpty()) {
            String tema = "";
            if (!jLabel5.getText().equals("Tesouros:")) {
                tema = jLabel5.getText();
            }
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtTesouros.getText());
            Janela.irTrocarSubstituicao("txtTesouros", 1, "Tesouros", tema, data, "SALA  A", p1, null, "1", 1);
        } else {
            //Mensagem.mensagemErro("Não tem ninguém designado nesse campo, para ser substituído.");
            String tema = JOptionPane.showInputDialog("Informe o tema do Discurso 1: ");
            jLabel5.setText(tema);
            Janela.irTrocarSubstituicao("txtTesouros", 1, "Tesouros", tema, data, "SALA  A", p1, null, "1", 1);
        }
    }//GEN-LAST:event_txtTesourosMouseClicked

    private void txtJoiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJoiasMouseClicked
        if (!txtJoias.getText().isEmpty()) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtJoias.getText());
            Janela.irTrocarSubstituicao("txtJoias", 1, "Joias", "Joias Espirituais", data, "SALA  A", p1, null, "2", 1);
        } else {
            //Mensagem.mensagemErro("Não tem ninguém designado nesse campo, para ser substituído.");
            Janela.irTrocarSubstituicao("txtJoias", 1, "Joias", "Joias Espirituais", data, "SALA  A", null, null, "2", 1);
        }
    }//GEN-LAST:event_txtJoiasMouseClicked

    private void txtNossaVida1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNossaVida1MouseClicked
        if (!txtNossaVida1.getText().isEmpty()) {
            String tema = "";
            if (!jLabel14.getText().equals("Tesouros:")) {
                tema = jLabel14.getText();
            }
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtNossaVida1.getText());
            Janela.irTrocarSubstituicao("txtNossaVida1", 1, "NossaVidaCrista", tema, data, "SALA  A", p1, null, nNossa1.getText(), 1);
        } else {
            //Mensagem.mensagemErro("Não tem ninguém designado nesse campo, para ser substituído.");
            String tema = JOptionPane.showInputDialog("Informe o tema nossa vida cristã 1: ");
            jLabel14.setText(tema);
            Janela.irTrocarSubstituicao("txtNossaVida1", 1, "NossaVidaCrista", tema, data, "SALA  A", null, null, nNossa1.getText(), 1);
        }
    }//GEN-LAST:event_txtNossaVida1MouseClicked

    private void txtNossaVida2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNossaVida2MouseClicked
        if (!txtNossaVida2.getText().isEmpty()) {
            String tema = "";
            if (!jLabel15.getText().equals("Tesouros:")) {
                tema = jLabel15.getText();
            }
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtNossaVida2.getText());
            Janela.irTrocarSubstituicao("txtNossaVida2", 1, "NossaVidaCrista", tema, data, "SALA  A", p1, null, nNossa2.getText(), 1);
        } else {
            //Mensagem.mensagemErro("Não tem ninguém designado nesse campo, para ser substituído.");
            String tema = JOptionPane.showInputDialog("Informe o tema nossa vida cristã 2: ");
            jLabel15.setText(tema);
            Janela.irTrocarSubstituicao("txtNossaVida2", 1, "NossaVidaCrista", tema, data, "SALA  A", null, null, nNossa2.getText(), 1);
        }
    }//GEN-LAST:event_txtNossaVida2MouseClicked

    private void txtEstudoCongregacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEstudoCongregacaoMouseClicked
        if (!txtEstudoCongregacao.getText().isEmpty()) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtEstudoCongregacao.getText());
            Janela.irTrocarSubstituicao("txtEstudoCongregacao", 1, "EstudoCongregacao", "Estudo Bíblico de Congregação", data, "SALA  A", p1, null, nEstudoLivro.getText(), 1);
        } else {
            //Mensagem.mensagemErro("Não tem ninguém designado nesse campo, para ser substituído.");
            Janela.irTrocarSubstituicao("txtEstudoCongregacao", 1, "EstudoCongregacao", "Estudo Bíblico de Congregação", data, "SALA  A", null, null, nEstudoLivro.getText(), 1);
        }
    }//GEN-LAST:event_txtEstudoCongregacaoMouseClicked

    private void txtLeitorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLeitorMouseClicked
        if (!txtLeitor.getText().isEmpty()) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtLeitor.getText());
            Janela.irTrocarSubstituicao("txtLeitor", 1, "LeituraEstudo", "Leitor do Estudo de Livro", data, "SALA  A", p1, null, "Leitura", 1);
        } else {
            //Mensagem.mensagemErro("Não tem ninguém designado nesse campo, para ser substituído.");
            Janela.irTrocarSubstituicao("txtLeitor", 1, "LeituraEstudo", "Leitor do Estudo de Livro", data, "SALA  A", p1, null, "Leitura", 1);
        }
    }//GEN-LAST:event_txtLeitorMouseClicked

    private void txtOracaoFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtOracaoFinalMouseClicked
        if (!txtOracaoFinal.getText().isEmpty()) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtOracaoFinal.getText());
            Janela.irTrocarSubstituicao("txtOracaoFinal", 1, "Oracao", "", data, "SALA  A", p1, null, "Oração Final", 1);
        } else {
            //Mensagem.mensagemErro("Não tem ninguém designado nesse campo, para ser substituído.");
            Janela.irTrocarSubstituicao("txtOracaoFinal", 1, "Oracao", "", data, "SALA  A", null, null, "Oração Final", 1);
        }
    }//GEN-LAST:event_txtOracaoFinalMouseClicked

    private void txtParte1AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte1AMouseClicked
        if (!txtParte1A.getText().isEmpty() && !txtParte1A.getText().equals("NA")) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte1A.getText());
            p2 = pDAO.buscarPessoaPorNomeESobrenomes(txtAjudante1A.getText());
            String qual = labelParte1.getText();
            Janela.irTrocarSubstituicao("txtParte1A", 2, qual, labelParte1.getText(), data, "SALA  A", p1, p2, "4", 1);
        } else {
            //Mensagem.mensagemErro("Não tem ninguém designado nesse campo, para ser substituído.");
            Janela.irQual("4");
            labelParte1.setText(ParteTipo);
            Janela.irTrocarSubstituicao("txtParte1A", 2, ParteTipo, labelParte1.getText(), data, "SALA  A", null, null, "4", 1);
            ParteTipo = "";
        }
    }//GEN-LAST:event_txtParte1AMouseClicked

    private void txtAjudante1AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante1AMouseClicked
        if (!txtAjudante1A.getText().isEmpty() && !txtAjudante1A.getText().equals("NA")) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte1A.getText());
            p2 = pDAO.buscarPessoaPorNomeESobrenomes(txtAjudante1A.getText());
            String qual = labelParte1.getText();
            Janela.irTrocarSubstituicao("txtParte1A", 2, qual, labelParte1.getText(), data, "SALA  A", p1, p2, "4", 2);
        } else {
            if (!txtParte1A.getText().isEmpty()) {
                p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte1A.getText());
                Janela.irTrocarSubstituicao("txtParte1A", 2, labelParte1.getText(), labelParte1.getText(), data, "SALA  A", p1, null, "4", 2);
            } else {
                Mensagem.mensagemAlerta("Primeiro, selecione o Responsavel pela parte");
            }
        }
    }//GEN-LAST:event_txtAjudante1AMouseClicked

    private void txtParte2AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte2AMouseClicked
        if (!txtParte2A.getText().isEmpty() && !txtParte2A.getText().equals("NA")) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte2A.getText());
            p2 = pDAO.buscarPessoaPorNomeESobrenomes(txtAjudante2A.getText());
            String qual = labelParte2.getText();
            Janela.irTrocarSubstituicao("txtParte2A", 2, qual, labelParte2.getText(), data, "SALA  A", p1, p2, "5", 1);
        } else {
            //Mensagem.mensagemErro("Não tem ninguém designado nesse campo, para ser substituído.");
            Janela.irQual("5");
            labelParte2.setText(ParteTipo);
            Janela.irTrocarSubstituicao("txtParte2A", 2, ParteTipo, labelParte2.getText(), data, "SALA  A", null, null, "5", 1);
            ParteTipo = "";
        }
    }//GEN-LAST:event_txtParte2AMouseClicked

    private void txtAjudante2AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante2AMouseClicked
        if (!txtAjudante2A.getText().isEmpty() && !txtAjudante2A.getText().equals("NA")) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte2A.getText());
            p2 = pDAO.buscarPessoaPorNomeESobrenomes(txtAjudante2A.getText());
            Janela.irTrocarSubstituicao("txtParte2A", 2, labelParte2.getText(), labelParte2.getText(), data, "SALA  A", p1, p2, "5", 2);
        } else {
            if (!txtParte2A.getText().isEmpty()) {
                p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte2A.getText());
                Janela.irTrocarSubstituicao("txtParte2A", 2, labelParte2.getText(), labelParte2.getText(), data, "SALA  A", p1, null, "5", 2);
            } else {
                Mensagem.mensagemAlerta("Primeiro, selecione o Responsavel pela parte");
            }
        }
    }//GEN-LAST:event_txtAjudante2AMouseClicked

    private void txtParte3AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte3AMouseClicked
        if (!txtParte3A.getText().isEmpty() && !txtParte3A.getText().equals("NA")) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte3A.getText());
            if (!txtAjudante3A.getText().isEmpty()) {
                p2 = pDAO.buscarPessoaPorNomeESobrenomes(txtAjudante3A.getText());
                String qual = labelParte3.getText();
                Janela.irTrocarSubstituicao("txtParte3A", 2, qual, labelParte3.getText(), data, "SALA  A", p1, p2, "6", 1);
            } else {
                String qual = labelParte3.getText();
                Janela.irTrocarSubstituicao("txtParte3A", 2, qual, labelParte3.getText(), data, "SALA  A", p1, null, "6", 1);
            }
        } else {
            //Mensagem.mensagemErro("Não tem ninguém designado nesse campo, para ser substituído.");
            Janela.irQual("6");
            labelParte3.setText(ParteTipo);
            Janela.irTrocarSubstituicao("txtParte3A", 2, labelParte3.getText(), labelParte3.getText(), data, "SALA  A", null, null, "6", 1);
            ParteTipo = "";
        }
    }//GEN-LAST:event_txtParte3AMouseClicked

    private void txtAjudante3AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante3AMouseClicked
        if (!txtAjudante3A.getText().isEmpty() && !txtAjudante3A.getText().equals("NA")) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte3A.getText());
            p2 = pDAO.buscarPessoaPorNomeESobrenomes(txtAjudante3A.getText());
            String qual = labelParte3.getText();
            Janela.irTrocarSubstituicao("txtParte3A", 2, qual, labelParte3.getText(), data, "SALA  A", p1, p2, "6", 2);
        } else {
            if (!txtParte3A.getText().isEmpty()) {
                Janela.irTrocarSubstituicao("txtParte3A", 2, labelParte3.getText(), labelParte3.getText(), data, "SALA  A", p1, null, "6", 2);
            } else {
                Mensagem.mensagemAlerta("Primeiro, selecione o Responsavel pela parte");
            }
        }
    }//GEN-LAST:event_txtAjudante3AMouseClicked

    private void txtPresidenteBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPresidenteBMouseClicked
        if (!txtPresidenteB.getText().isEmpty()) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtPresidenteB.getText());
            Janela.irTrocarSubstituicao("txtPresidenteB", 1, "Presidente", "", data, "SALA  B", p1, null, "Presidente", 1);
        } else {
            //Mensagem.mensagemErro("Não tem nenhum Presidente designado para ser substituido.");
            Janela.irTrocarSubstituicao("txtPresidenteB", 1, "Presidente", "", data, "SALA  B", null, null, "Presidente", 1);
        }
    }//GEN-LAST:event_txtPresidenteBMouseClicked

    private void txtLeituraBibliaBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLeituraBibliaBMouseClicked
        if (!txtLeituraBibliaB.getText().isEmpty()) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtLeituraBibliaB.getText());
            Janela.irTrocarSubstituicao("txtLeituraBibliaB", 1, "LeituraBiblia", "Leitura da Bíblia", data, "SALA  B", p1, null, "3", 1);
        } else {
            //Mensagem.mensagemErro("Não tem ninguém designado nesse campo, para ser substituído.");
            Janela.irTrocarSubstituicao("txtLeituraBibliaB", 1, "LeituraBiblia", "Leitura da Bíblia", data, "SALA  B", null, null, "3", 1);
        }
    }//GEN-LAST:event_txtLeituraBibliaBMouseClicked

    private void txtParte1BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte1BMouseClicked
        if (!txtParte1B.getText().isEmpty() && !txtParte1B.getText().equals("NA")) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte1B.getText());
            p2 = pDAO.buscarPessoaPorNomeESobrenomes(txtAjudante1B.getText());
            String qual = labelParte1.getText();
            Janela.irTrocarSubstituicao("txtParte1B", 2, qual, labelParte1.getText(), data, "SALA  B", p1, p2, "4", 1);
        } else {
            //Mensagem.mensagemErro("Não tem ninguém designado nesse campo, para ser substituído.");
            Janela.irTrocarSubstituicao("txtParte1B", 2, labelParte1.getText(), labelParte1.getText(), data, "SALA  B", null, null, "4", 1);
        }
    }//GEN-LAST:event_txtParte1BMouseClicked

    private void txtAjudante1BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante1BMouseClicked
        if (!txtAjudante1B.getText().isEmpty() && !txtAjudante1B.getText().equals("NA")) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte1B.getText());
            p2 = pDAO.buscarPessoaPorNomeESobrenomes(txtAjudante1B.getText());
            String qual = labelParte1.getText();
            Janela.irTrocarSubstituicao("txtParte1B", 2, qual, labelParte1.getText(), data, "SALA  B", p1, p2, "4", 2);
        } else {
            if (!txtParte1B.getText().isEmpty()) {
                p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte1B.getText());
                Janela.irTrocarSubstituicao("txtParte1B", 2, labelParte1.getText(), labelParte1.getText(), data, "SALA  B", p1, null, "4", 2);
            } else {
                Mensagem.mensagemAlerta("Primeiro, selecione o Responsavel pela parte");
            }
        }
    }//GEN-LAST:event_txtAjudante1BMouseClicked

    private void txtParte2BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte2BMouseClicked
        if (!txtParte2B.getText().isEmpty() && !txtParte2B.getText().equals("NA")) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte2B.getText());
            p2 = pDAO.buscarPessoaPorNomeESobrenomes(txtAjudante2B.getText());
            String qual = labelParte2.getText();
            Janela.irTrocarSubstituicao("txtParte2B", 2, qual, labelParte2.getText(), data, "SALA  B", p1, p2, "5", 1);
        } else {
            //Mensagem.mensagemErro("Não tem ninguém designado nesse campo, para ser substituído.");
            Janela.irTrocarSubstituicao("txtParte2B", 2, labelParte2.getText(), labelParte2.getText(), data, "SALA  B", null, null, "5", 1);
        }
    }//GEN-LAST:event_txtParte2BMouseClicked

    private void txtAjudante2BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante2BMouseClicked
        if (!txtAjudante2B.getText().isEmpty() && !txtAjudante2B.getText().equals("NA")) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte2B.getText());
            p2 = pDAO.buscarPessoaPorNomeESobrenomes(txtAjudante2B.getText());
            String qual = labelParte2.getText();
            Janela.irTrocarSubstituicao("txtParte2B", 2, qual, labelParte2.getText(), data, "SALA  B", p1, p2, "5", 2);
        } else {
            if (!txtParte2B.getText().isEmpty()) {
                p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte2B.getText());
                Janela.irTrocarSubstituicao("txtParte2B", 2, labelParte2.getText(), labelParte2.getText(), data, "SALA  B", p1, null, "5", 2);
            } else {
                Mensagem.mensagemAlerta("Primeiro, selecione o Responsavel pela parte");
            }
        }
    }//GEN-LAST:event_txtAjudante2BMouseClicked

    private void txtParte3BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte3BMouseClicked
        if (!txtParte3B.getText().isEmpty() && !txtParte3B.getText().equals("NA")) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte3B.getText());
            if (!txtAjudante3B.getText().isEmpty()) {
                p2 = pDAO.buscarPessoaPorNomeESobrenomes(txtAjudante3B.getText());
                String qual = labelParte3.getText();
                Janela.irTrocarSubstituicao("txtParte3B", 2, qual, labelParte3.getText(), data, "SALA  B", p1, p2, "6", 1);
            } else {
                String qual = labelParte3.getText();
                Janela.irTrocarSubstituicao("txtParte3B", 2, qual, labelParte3.getText(), data, "SALA  B", p1, null, "6", 1);
            }
        } else {
            //Mensagem.mensagemErro("Não tem ninguém designado nesse campo, para ser substituído.");
            Janela.irTrocarSubstituicao("txtParte3B", 2, labelParte3.getText(), labelParte3.getText(), data, "SALA  B", null, null, "6", 1);
        }
    }//GEN-LAST:event_txtParte3BMouseClicked

    private void txtAjudante3BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante3BMouseClicked
        if (!txtAjudante3B.getText().isEmpty() && !txtAjudante3B.getText().equals("NA")) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte3B.getText());
            p2 = pDAO.buscarPessoaPorNomeESobrenomes(txtAjudante3B.getText());
            String qual = labelParte3.getText();
            Janela.irTrocarSubstituicao("txtParte3B", 2, qual, labelParte3.getText(), data, "SALA  B", p1, p2, "6", 2);
        } else {
            if (!txtParte3B.getText().isEmpty()) {
                p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte3B.getText());
                Janela.irTrocarSubstituicao("txtParte3B", 2, labelParte3.getText(), labelParte3.getText(), data, "SALA  B", p1, null, "6", 2);
            } else {
                Mensagem.mensagemAlerta("Primeiro, selecione o Responsavel pela parte");
            }
        }
    }//GEN-LAST:event_txtAjudante3BMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        atualizarTodasPartes();
        salvarPdf();
        this.dispose();
        Mensagem.mensagemExito("Semana alterada com Sucesso! \nPdf Salvo \nFolha de Designação Salva");
        Janela.irSubstituicao();
        linha = -1;
        mostrarTabela();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        Janela.irMenu();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        String tema = JOptionPane.showInputDialog("Tema:");
        jLabel5.setText(tema);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        String tema = JOptionPane.showInputDialog("Tema:");
        jLabel14.setText(tema);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        String tema = JOptionPane.showInputDialog("Tema:");
        jLabel15.setText(tema);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void txtParte4AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte4AMouseClicked
        if (!txtParte4A.getText().isEmpty() && !txtParte4A.getText().equals("NA")) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte4A.getText());
            if (!txtAjudante4A.getText().isEmpty()) {
                p2 = pDAO.buscarPessoaPorNomeESobrenomes(txtAjudante4A.getText());
                String qual = labelParte4.getText();
                Janela.irTrocarSubstituicao("txtParte4A", 2, qual, labelParte4.getText(), data, "SALA  A", p1, p2, "7", 1);
            } else {
                String qual = labelParte4.getText();
                Janela.irTrocarSubstituicao("txtParte4A", 2, qual, labelParte4.getText(), data, "SALA  A", p1, null, "7", 1);
            }
        } else {
            //Mensagem.mensagemErro("Não tem ninguém designado nesse campo, para ser substituído.");
            Janela.irQual("7");
            labelParte4.setText(ParteTipo);
            Janela.irTrocarSubstituicao("txtParte4A", 2, ParteTipo, labelParte4.getText(), data, "SALA  A", null, null, "7", 1);
            ParteTipo = "";
        }
    }//GEN-LAST:event_txtParte4AMouseClicked

    private void txtAjudante4AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante4AMouseClicked
        if (!txtAjudante4A.getText().isEmpty() && !txtAjudante4A.getText().equals("NA")) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte4A.getText());
            p2 = pDAO.buscarPessoaPorNomeESobrenomes(txtAjudante4A.getText());
            String qual = labelParte4.getText();
            Janela.irTrocarSubstituicao("txtParte4A", 2, qual, labelParte4.getText(), data, "SALA  A", p1, p2, "7", 2);
        } else {
            if (!txtParte4A.getText().isEmpty()) {
                p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte4A.getText());
                Janela.irTrocarSubstituicao("txtParte4A", 2, labelParte4.getText(), labelParte4.getText(), data, "SALA  A", p1, null, "7", 2);
            } else {
                Mensagem.mensagemAlerta("Primeiro, selecione o Responsavel pela parte");
            }
        }
    }//GEN-LAST:event_txtAjudante4AMouseClicked

    private void txtParte4BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtParte4BMouseClicked
        if (!txtParte4B.getText().isEmpty() && !txtParte4B.getText().equals("NA")) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte4B.getText());
            if (!txtAjudante4B.getText().isEmpty()) {
                p2 = pDAO.buscarPessoaPorNomeESobrenomes(txtAjudante4B.getText());
                String qual = labelParte4.getText();
                Janela.irTrocarSubstituicao("txtParte4B", 2, qual, labelParte4.getText(), data, "SALA  B", p1, p2, "7", 1);
            } else {
                String qual = labelParte4.getText();
                Janela.irTrocarSubstituicao("txtParte4B", 2, qual, labelParte4.getText(), data, "SALA  B", p1, null, "7", 1);
            }
        } else {
            //Mensagem.mensagemErro("Não tem ninguém designado nesse campo, para ser substituído.");            
            Janela.irTrocarSubstituicao("txtParte4B", 2, labelParte4.getText(), labelParte4.getText(), data, "SALA  B", null, null, "7", 1);
        }
    }//GEN-LAST:event_txtParte4BMouseClicked

    private void txtAjudante4BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAjudante4BMouseClicked
        if (!txtAjudante4B.getText().isEmpty() && !txtAjudante4B.getText().equals("NA")) {
            p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte4B.getText());
            p2 = pDAO.buscarPessoaPorNomeESobrenomes(txtAjudante4B.getText());
            String qual = labelParte4.getText();
            Janela.irTrocarSubstituicao("txtParte4B", 2, qual, labelParte4.getText(), data, "SALA  B", p1, p2, "7", 2);
        } else {
            if (!txtParte4B.getText().isEmpty()) {
                p1 = pDAO.buscarPessoaPorNomeESobrenomes(txtParte4B.getText());
                Janela.irTrocarSubstituicao("txtParte4B", 2, labelParte4.getText(), labelParte4.getText(), data, "SALA  B", p1, null, "7", 2);
            } else {
                Mensagem.mensagemAlerta("Primeiro, selecione o Responsavel pela parte");
            }
        }
    }//GEN-LAST:event_txtAjudante4BMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if (confirmarExcluir()) {
                SemanaDAO semanaDAO = new SemanaDAO();
                semanaDAO.excluirSemana(linha);
                dao.excluirPorSemana("Semana: " + data);
                linha = -1;
                mostrarTabela();
                Janela.menu.mostrarTabela();
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private boolean confirmarExcluir() {
        Object[] options = {"Sim", "Não"};
        int option = JOptionPane.showOptionDialog(this, "Deseja realmente excluí essa semana?\n "
                + "Essa ação não poderá ser desfeita", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        return option == JOptionPane.YES_OPTION;
    }

    private void salvarPdf() {
        try {
            GerarPDF pdf = new GerarPDF();
            pdf.salvar(todas);
        } catch (Exception e) {
            e.printStackTrace();
            Mensagem.mensagemErro("Erro ao salvar a lista em PDF");
        }
    }

    public void mostrarTabela() {
        SemanaDAO semanaDAO = new SemanaDAO();
        List<Semana> semanas = semanaDAO.listarSemanasOrdenadasPorDataDesc();

        DefaultTableModel tab = (DefaultTableModel) tabela.getModel();
        tab.setNumRows(0);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Crie um renderizador de células para alinhar o conteúdo centralmente
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Aplique o renderizador às colunas desejadas (substitua 0 e 1 pelos índices das colunas que você deseja centralizar)
        tabela.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tabela.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);

        for (Semana a : semanas) {
            String data = a.getData().format(df);
            tab.addRow(new Object[]{
                a.getId(),
                data
            });
        }
    }

    private void preencherDados() {
        txtPresidenteA.setText(partesDaSemana.getPresidenteA());
        txtPresidenteB.setText(partesDaSemana.getPresidenteB());
        txtOracaoInicial.setText(partesDaSemana.getOracaoInicial());

        jLabel5.setText(partesDaSemana.getLabelTesouros());

        txtTesouros.setText(partesDaSemana.getTesouros());
        txtJoias.setText(partesDaSemana.getJoias());
        txtLeituraBibliaA.setText(partesDaSemana.getLeituraBibliaA());

        labelParte1.setText(partesDaSemana.getNomeParte1());
        txtParte1A.setText(partesDaSemana.getParte1A());
        txtAjudante1A.setText(partesDaSemana.getAjudante1A());

        labelParte2.setText(partesDaSemana.getNomeParte2());
        txtParte2A.setText(partesDaSemana.getParte2A());
        txtAjudante2A.setText(partesDaSemana.getAjudante2A());

        labelParte3.setText(partesDaSemana.getNomeparte3());
        txtParte3A.setText(partesDaSemana.getParte3A());
        txtAjudante3A.setText(partesDaSemana.getAjudante3A());

        labelParte4.setText(partesDaSemana.getNomeParte4());
        txtParte4A.setText(partesDaSemana.getParte4A());
        txtAjudante4A.setText(partesDaSemana.getAjudante4A());

        txtLeituraBibliaB.setText(partesDaSemana.getLeituraBibliaB());
        txtParte1B.setText(partesDaSemana.getParte1B());
        txtAjudante1B.setText(partesDaSemana.getAjudante1B());
        txtParte2B.setText(partesDaSemana.getParte2B());
        txtAjudante2B.setText(partesDaSemana.getAjudante2B());
        txtParte3B.setText(partesDaSemana.getParte3B());
        txtAjudante3B.setText(partesDaSemana.getAjudante3B());
        txtParte4B.setText(partesDaSemana.getParte4B());
        txtAjudante4B.setText(partesDaSemana.getAjudante4B());

        jLabel14.setText(partesDaSemana.getLabelNossaVida1());
        txtNossaVida1.setText(partesDaSemana.getNossaVida1());
        jLabel15.setText(partesDaSemana.getLabelNossaVida2());
        txtNossaVida2.setText(partesDaSemana.getNossaVida2());
        txtEstudoCongregacao.setText(partesDaSemana.getEstudoLivro());
        txtLeitor.setText(partesDaSemana.getLeitor());
        txtOracaoFinal.setText(partesDaSemana.getOracaoFinal());
        verNumeroParte();
    }

    private void atualizarTodasPartes() {
        todas = new TodasPartes();
        todas.setId(partesDaSemana.getId());
        todas.setDia(partesDaSemana.getDia());
        todas.setMes(partesDaSemana.getMes());
        todas.setAno(partesDaSemana.getAno());
        todas.setSemana(partesDaSemana.getSemana());
        todas.setPresidenteA(txtPresidenteA.getText());
        todas.setPresidenteB(txtPresidenteB.getText());
        todas.setOracaoInicial(txtOracaoInicial.getText());
        todas.setLabelTesouros(jLabel5.getText());
        todas.setTesouros(txtTesouros.getText());
        todas.setJoias(txtJoias.getText());
        todas.setLeituraBibliaA(txtLeituraBibliaA.getText());
        todas.setLeituraBibliaB(txtLeituraBibliaB.getText());
        todas.setNomeParte1(labelParte1.getText());
        todas.setParte1A(txtParte1A.getText());
        todas.setAjudante1A(txtAjudante1A.getText());
        todas.setParte1B(txtParte1B.getText());
        todas.setAjudante1B(txtAjudante1B.getText());
        todas.setNomeParte2(labelParte2.getText());
        todas.setParte2A(txtParte2A.getText());
        todas.setAjudante2A(txtAjudante2A.getText());
        todas.setParte2B(txtParte2B.getText());
        todas.setAjudante2B(txtAjudante2B.getText());
        todas.setNomeparte3(labelParte3.getText());
        todas.setParte3A(txtParte3A.getText());
        todas.setAjudante3A(txtAjudante3A.getText());
        todas.setParte3B(txtParte3B.getText());
        todas.setAjudante3B(txtAjudante3B.getText());
        todas.setNomeParte4(labelParte4.getText());
        todas.setParte4A(txtParte4A.getText());
        todas.setAjudante4A(txtAjudante4A.getText());
        todas.setParte4B(txtParte4B.getText());
        todas.setAjudante4B(txtAjudante4B.getText());
        todas.setLabelNossaVida1(jLabel14.getText());
        todas.setNossaVida1(txtNossaVida1.getText());
        todas.setLabelNossaVida2(jLabel15.getText());
        todas.setNossaVida2(txtNossaVida2.getText());
        todas.setEstudoLivro(txtEstudoCongregacao.getText());
        todas.setLeitor(txtLeitor.getText());
        todas.setOracaoFinal(txtOracaoFinal.getText());

        dao.atualizar(todas);
    }

    public void alttxtPresidenteA(Pessoa a1) {
        txtPresidenteA.setText(a1.getNome() + " " + a1.getSobrenome());
    }

    public void alttxtOracaoInicial(Pessoa a1) {
        txtOracaoInicial.setText(a1.getNome() + " " + a1.getSobrenome());
    }

    public void alttxtTesouros(Pessoa a1) {
        txtTesouros.setText(a1.getNome() + " " + a1.getSobrenome());
    }

    public void alttxtJoias(Pessoa a1) {
        txtJoias.setText(a1.getNome() + " " + a1.getSobrenome());
    }

    public void alttxtLeituraBibliaA(Pessoa a1) {
        txtLeituraBibliaA.setText(a1.getNome() + " " + a1.getSobrenome());
    }

    public void alttxtNossaVida1(Pessoa a1) {
        txtNossaVida1.setText(a1.getNome() + " " + a1.getSobrenome());
        verNumeroParte();
    }

    public void alttxtNossaVida2(Pessoa a1) {
        txtNossaVida2.setText(a1.getNome() + " " + a1.getSobrenome());
        verNumeroParte();
    }

    public void alttxtEstudoCongregacao(Pessoa a1) {
        txtEstudoCongregacao.setText(a1.getNome() + " " + a1.getSobrenome());
        verNumeroParte();
    }

    public void alttxtLeitor(Pessoa a1) {
        txtLeitor.setText(a1.getNome() + " " + a1.getSobrenome());
    }

    public void alttxtOracaoFinal(Pessoa a1) {
        txtOracaoFinal.setText(a1.getNome() + " " + a1.getSobrenome());       
    }

    public void alttxtPresidenteB(Pessoa a1) {
        txtPresidenteB.setText(a1.getNome() + " " + a1.getSobrenome());
    }

    public void alttxtParte1A(Pessoa a1, Pessoa b1) {
        txtParte1A.setText(a1.getNome() + " " + a1.getSobrenome());
        if (b1 != null) {
            txtAjudante1A.setText(b1.getNome() + " " + b1.getSobrenome());
        }
        verNumeroParte();
    }

    public void alttxtParte2A(Pessoa a1, Pessoa b1) {
        txtParte2A.setText(a1.getNome() + " " + a1.getSobrenome());
        if (b1 != null) {
            txtAjudante2A.setText(b1.getNome() + " " + b1.getSobrenome());
        }
        verNumeroParte();
    }

    public void alttxtParte3A(Pessoa a1, Pessoa b1) {
        txtParte3A.setText(a1.getNome() + " " + a1.getSobrenome());
        if (b1 != null) {
            txtAjudante3A.setText(b1.getNome() + " " + b1.getSobrenome());
        }
        verNumeroParte();
    }

    public void alttxtParte1B(Pessoa a1, Pessoa b1) {
        txtParte1B.setText(a1.getNome() + " " + a1.getSobrenome());
        if (b1 != null) {
            txtAjudante1B.setText(b1.getNome() + " " + b1.getSobrenome());
        }
        verNumeroParte();
    }

    public void alttxtParte2B(Pessoa a1, Pessoa b1) {
        txtParte2B.setText(a1.getNome() + " " + a1.getSobrenome());
        if (b1 != null) {
            txtAjudante2B.setText(b1.getNome() + " " + b1.getSobrenome());
        }
        verNumeroParte();
    }

    public void alttxtParte3B(Pessoa a1, Pessoa b1) {
        txtParte3B.setText(a1.getNome() + " " + a1.getSobrenome());
        if (b1 != null) {
            txtAjudante3B.setText(b1.getNome() + " " + b1.getSobrenome());
        }
        verNumeroParte();
    }

    public void alttxtParte4A(Pessoa a1, Pessoa b1) {
        txtParte4A.setText(a1.getNome() + " " + a1.getSobrenome());
        if (b1 != null) {
            txtAjudante4A.setText(b1.getNome() + " " + b1.getSobrenome());
        }
        verNumeroParte();
    }

    public void alttxtParte4B(Pessoa a1, Pessoa b1) {
        txtParte4B.setText(a1.getNome() + " " + a1.getSobrenome());
        if (b1 != null) {
            txtAjudante4B.setText(b1.getNome() + " " + b1.getSobrenome());
        }
        verNumeroParte();
    }

    public void alttxtLeituraBibliaB(Pessoa a1) {
        txtLeituraBibliaB.setText(a1.getNome() + " " + a1.getSobrenome());
        verNumeroParte();
    }

    private void verNumeroParte() {
        int a = 5;
        if (!txtParte3A.getText().isEmpty()) {
            a++;
            nParte3.setText(String.valueOf(a));
        }
        if (!txtParte4A.getText().isEmpty()) {
            a++;
            nParte4.setText(String.valueOf(a));
        }
        if (!txtNossaVida1.getText().isEmpty()) {
            a++;
            nNossa1.setText(String.valueOf(a));
        }
        if (!txtNossaVida2.getText().isEmpty()) {
            a++;
            nNossa2.setText(String.valueOf(a));
        }
        if (!txtEstudoCongregacao.getText().isEmpty()) {
            a++;
            nEstudoLivro.setText(String.valueOf(a));
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
            java.util.logging.Logger.getLogger(Substituicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Substituicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Substituicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Substituicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Substituicao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelParte1;
    private javax.swing.JLabel labelParte2;
    private javax.swing.JLabel labelParte3;
    private javax.swing.JLabel labelParte4;
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
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtAjudante1A;
    private javax.swing.JTextField txtAjudante1B;
    private javax.swing.JTextField txtAjudante2A;
    private javax.swing.JTextField txtAjudante2B;
    private javax.swing.JTextField txtAjudante3A;
    private javax.swing.JTextField txtAjudante3B;
    private javax.swing.JTextField txtAjudante4A;
    private javax.swing.JTextField txtAjudante4B;
    private javax.swing.JLabel txtData;
    private javax.swing.JTextField txtEstudoCongregacao;
    private javax.swing.JTextField txtJoias;
    private javax.swing.JTextField txtLeitor;
    private javax.swing.JTextField txtLeituraBibliaA;
    private javax.swing.JTextField txtLeituraBibliaB;
    private javax.swing.JTextField txtNossaVida1;
    private javax.swing.JTextField txtNossaVida2;
    private javax.swing.JTextField txtOracaoFinal;
    private javax.swing.JTextField txtOracaoInicial;
    private javax.swing.JTextField txtParte1A;
    private javax.swing.JTextField txtParte1B;
    private javax.swing.JTextField txtParte2A;
    private javax.swing.JTextField txtParte2B;
    private javax.swing.JTextField txtParte3A;
    private javax.swing.JTextField txtParte3B;
    private javax.swing.JTextField txtParte4A;
    private javax.swing.JTextField txtParte4B;
    private javax.swing.JTextField txtPresidenteA;
    private javax.swing.JTextField txtPresidenteB;
    private javax.swing.JTextField txtTesouros;
    // End of variables declaration//GEN-END:variables
}
