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
    public Trocar(int a, String b, Pessoa p, List<Integer> lista) {
        initComponents();
        pessoa = p;
        labelNomeAntigo.setText(p.getNome() + " " + p.getSobrenome());
        listaIgnorar.addAll(lista);
        //1 = leitura da Biblia A
        if (a == 1) {
            numero = 1;
            des = "LeituraBiblia";
            mostrarTabelaPessoa(b, "LeituraBiblia");
        }
        //2 = presidente A
        if (a == 2) {
            numero = 2;
            des = "Presidente";
            mostrarTabelaPessoa(b, "Presidente");
        }
        //3 = tesouros
        if (a == 3) {
            numero = 3;
            des = "Tesouros";
            mostrarTabelaPessoa(b, "Tesouros");
        }
        //4 = Oração inicial
        if (a == 4) {
            numero = 4;
            des = "Oracao";
            mostrarTabelaOracao();
        }
        //5 = Nossa Vida 1
        if (a == 5) {
            numero = 5;
            des = "NossaVidaCrista";
            mostrarTabelaPessoa(b, "NossaVidaCrista");
        }
        //6 = leitor estudo de livro
        if (a == 6) {
            numero = 6;
            des = "LeituraEstudo";
            mostrarTabelaLeitor();
        }
        //7 = joias
        if (a == 7) {
            numero = 7;
            des = "Joias";
            mostrarTabelaPessoa(b, "Joias");
        }
        //8 = primeira conversa A
        if (a == 8) {
            numero = 8;
            des = "PrimeiraConversa";
            mostrarTabelaPessoa(b, "PrimeiraConversa");
        }
        //9 = ajudante primeira conversa A
        if (a == 9) {
            numero = 9;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //10 = primeira conversa 2 A
        if (a == 10) {
            numero = 10;
            des = "PrimeiraConversa";
            mostrarTabelaPessoa(b, "PrimeiraConversa");
        }
        //11 = ajudante primeira conversa 2 A
        if (a == 11) {
            numero = 11;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //12 = revisita A
        if (a == 12) {
            numero = 12;
            des = "Revisita";
            mostrarTabelaPessoa(b, "Revisita");
        }
        //13 = ajudante revisita A
        if (a == 13) {
            numero = 13;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //14 = revisita 2 A
        if (a == 14) {
            numero = 14;
            des = "Revisita";
            mostrarTabelaPessoa(b, "Revisita");
        }
        //15 = ajudante revisita 2 A
        if (a == 15) {
            numero = 15;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //16 = estudo biblico A
        if (a == 16) {
            numero = 16;
            des = "EstudoBiblico";
            mostrarTabelaPessoa(b, "EstudoBiblico");
        }
        //17 = ajudante estudo biblico A
        if (a == 17) {
            numero = 17;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //18 = discurso A
        if (a == 18) {
            numero = 18;
            des = "Discurso";
            mostrarTabelaPessoa(b, "Discurso");
        }
        //19 = oracao final
        if (a == 19) {
            numero = 19;
            des = "Oracao";
            mostrarTabelaOracao();
        }
        //20 = nossa vida 2
        if (a == 20) {
            numero = 20;
            des = "NossaVidaCrista";
            mostrarTabelaPessoa(b, "NossaVidaCrista");
        }
        //21 = estudo biblico de congregação
        if (a == 21) {
            numero = 21;
            des = "EstudoCongregacao";
            mostrarTabelaPessoa(b, "EstudoCongregacao");
        }
        //22 = presidente B
        if (a == 22) {
            numero = 22;
            des = "Presidente";
            mostrarTabelaPessoa(b, "Presidente");
        }
        //23 = primeira conversa B
        if (a == 23) {
            numero = 23;
            des = "PrimeiraConversa";
            mostrarTabelaPessoa(b, "PrimeiraConversa");
        }
        //24 = ajudante primeira conversa B
        if (a == 24) {
            numero = 24;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //25 = primeira conversa 2 B
        if (a == 25) {
            numero = 25;
            des = "PrimeiraConversa";
            mostrarTabelaPessoa(b, "PrimeiraConversa");
        }
        //26 = ajudante primeira conversa 2 B
        if (a == 26) {
            numero = 26;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //27 = revisita B
        if (a == 27) {
            numero = 27;
            des = "Revisita";
            mostrarTabelaPessoa(b, "Revisita");
        }
        //28 = ajudante revisita B
        if (a == 28) {
            numero = 28;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //29 = revisita 2 B
        if (a == 29) {
            numero = 29;
            des = "Revisita";
            mostrarTabelaPessoa(b, "Revisita");
        }
        //30 = ajudante revisita 2 B
        if (a == 30) {
            numero = 30;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //31 = estudo biblico B
        if (a == 31) {
            numero = 31;
            des = "EstudoBiblico";
            mostrarTabelaPessoa(b, "EstudoBiblico");
        }
        //32 = ajudante estudo biblico B
        if (a == 32) {
            numero = 32;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //33 = discurso B
        if (a == 33) {
            numero = 33;
            des = "Discurso";
            mostrarTabelaPessoa(b, "Discurso");
        }
        //34= leitura biblia B
        if (a == 34) {
            numero = 34;
            des = "LeituraBiblia";
            mostrarTabelaPessoa(b, "LeituraBiblia");
        }
        //35 = primeira conversa 1 A
        if (a == 35) {
            numero = 35;
            des = "PrimeiraConversa";
            mostrarTabelaPessoa(b, "PrimeiraConversa");
        }
        //36 = ajudante primeira conversa 1 A
        if (a == 36) {
            numero = 36;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //37 = primeira conversa 1 B
        if (a == 37) {
            numero = 37;
            des = "PrimeiraConversa";
            mostrarTabelaPessoa(b, "PrimeiraConversa");
        }
        //38 = ajudante primeira conversa 1 B
        if (a == 38) {
            numero = 38;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //39 = revisita 1 A
        if (a == 39) {
            numero = 39;
            des = "Revisita";
            mostrarTabelaPessoa(b, "Revisita");
        }
        //40 = ajudante revisita 1 A
        if (a == 40) {
            numero = 40;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //41 = revisita 1 B
        if (a == 41) {
            numero = 41;
            des = "Revisita";
            mostrarTabelaPessoa(b, "Revisita");
        }
        //42 = ajudante revisita 1 B
        if (a == 42) {
            numero = 42;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        botaoLista.setText("Lista: " + des);
    }

    //METODO 2 CONSTRUTOR 2
    //int é o tipo da parte que o usuario quer alterar
    //string b é o sexo do participante
    public Trocar(int a, String b, List<Integer> lista) {
        initComponents();
        listaIgnorar.addAll(lista);
        //1 = leitura da Biblia A
        if (a == 1) {
            numero = 1;
            des = "LeituraBiblia";
            mostrarTabelaPessoa(b, "LeituraBiblia");
        }
        //2 = presidente A
        if (a == 2) {
            numero = 2;
            des = "Presidente";
            mostrarTabelaPessoa(b, "Presidente");
        }
        //3 = tesouros
        if (a == 3) {
            numero = 3;
            des = "Tesouros";
            mostrarTabelaPessoa(b, "Tesouros");
        }
        //4 = Oração inicial
        if (a == 4) {
            numero = 4;
            des = "Oracao";
            mostrarTabelaOracao();
        }
        //5 = Nossa Vida 1
        if (a == 5) {
            numero = 5;
            des = "NossaVidaCrista";
            mostrarTabelaPessoa(b, "NossaVidaCrista");
        }
        //6 = leitor estudo de livro
        if (a == 6) {
            numero = 6;
            des = "LeituraEstudo";
            mostrarTabelaLeitor();
        }
        //7 = joias
        if (a == 7) {
            numero = 7;
            des = "Joias";
            mostrarTabelaPessoa(b, "Joias");
        }
        //8 = primeira conversa A
        if (a == 8) {
            numero = 8;
            des = "PrimeiraConversa";
            mostrarTabelaPessoa(b, "PrimeiraConversa");
        }
        //9 = ajudante primeira conversa A
        if (a == 9) {
            numero = 9;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //10 = primeira conversa 2 A
        if (a == 10) {
            numero = 10;
            des = "PrimeiraConversa";
            mostrarTabelaPessoa(b, "PrimeiraConversa");
        }
        //11 = ajudante primeira conversa 2 A
        if (a == 11) {
            numero = 11;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //12 = revisita A
        if (a == 12) {
            numero = 12;
            des = "Revisita";
            mostrarTabelaPessoa(b, "Revisita");
        }
        //13 = ajudante revisita A
        if (a == 13) {
            numero = 13;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //14 = revisita 2 A
        if (a == 14) {
            numero = 14;
            des = "Revisita";
            mostrarTabelaPessoa(b, "Revisita");
        }
        //15 = ajudante revisita 2 A
        if (a == 15) {
            numero = 15;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //16 = estudo biblico A
        if (a == 16) {
            numero = 16;
            des = "EstudoBiblico";
            mostrarTabelaPessoa(b, "EstudoBiblico");
        }
        //17 = ajudante estudo biblico A
        if (a == 17) {
            numero = 17;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //18 = discurso A
        if (a == 18) {
            numero = 18;
            des = "Discurso";
            mostrarTabelaPessoa(b, "Discurso");
        }
        //19 = oracao final
        if (a == 19) {
            numero = 19;
            des = "Oracao";
            mostrarTabelaOracao();
        }
        //20 = nossa vida 2
        if (a == 20) {
            numero = 20;
            des = "NossaVidaCrista";
            mostrarTabelaPessoa(b, "NossaVidaCrista");
        }
        //21 = estudo biblico de congregação
        if (a == 21) {
            numero = 21;
            des = "EstudoCongregacao";
            mostrarTabelaPessoa(b, "EstudoCongregacao");
        }
        //22 = presidente B
        if (a == 22) {
            numero = 22;
            des = "Presidente";
            mostrarTabelaPessoa(b, "Presidente");
        }
        //23 = primeira conversa B
        if (a == 23) {
            numero = 23;
            des = "PrimeiraConversa";
            mostrarTabelaPessoa(b, "PrimeiraConversa");
        }
        //24 = ajudante primeira conversa B
        if (a == 24) {
            numero = 24;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //25 = primeira conversa 2 B
        if (a == 25) {
            numero = 25;
            des = "PrimeiraConversa";
            mostrarTabelaPessoa(b, "PrimeiraConversa");
        }
        //26 = ajudante primeira conversa 2 B
        if (a == 26) {
            numero = 26;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //27 = revisita B
        if (a == 27) {
            numero = 27;
            des = "Revisita";
            mostrarTabelaPessoa(b, "Revisita");
        }
        //28 = ajudante revisita B
        if (a == 28) {
            numero = 28;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //29 = revisita 2 B
        if (a == 29) {
            numero = 29;
            des = "Revisita";
            mostrarTabelaPessoa(b, "Revisita");
        }
        //30 = ajudante revisita 2 B
        if (a == 30) {
            numero = 30;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //31 = estudo biblico B
        if (a == 31) {
            numero = 31;
            des = "EstudoBiblico";
            mostrarTabelaPessoa(b, "EstudoBiblico");
        }
        //32 = ajudante estudo biblico B
        if (a == 32) {
            numero = 32;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //33 = discurso B
        if (a == 33) {
            numero = 33;
            des = "Discurso";
            mostrarTabelaPessoa(b, "Discurso");
        }
        //34= leitura biblia B
        if (a == 34) {
            numero = 34;
            des = "LeituraBiblia";
            mostrarTabelaPessoa(b, "LeituraBiblia");
        }
        //35 = primeira conversa 1 A
        if (a == 35) {
            numero = 35;
            des = "PrimeiraConversa";
            mostrarTabelaPessoa(b, "PrimeiraConversa");
        }
        //36 = ajudante primeira conversa 1 A
        if (a == 36) {
            numero = 36;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //37 = primeira conversa 1 B
        if (a == 37) {
            numero = 37;
            des = "PrimeiraConversa";
            mostrarTabelaPessoa(b, "PrimeiraConversa");
        }
        //38 = ajudante primeira conversa 1 B
        if (a == 38) {
            numero = 38;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //39 = revisita 1 A
        if (a == 39) {
            numero = 39;
            des = "Revisita";
            mostrarTabelaPessoa(b, "Revisita");
        }
        //40 = ajudante revisita 1 A
        if (a == 40) {
            numero = 40;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        //41 = revisita 1 B
        if (a == 41) {
            numero = 41;
            des = "Revisita";
            mostrarTabelaPessoa(b, "Revisita");
        }
        //42 = ajudante revisita 1 B
        if (a == 42) {
            numero = 42;
            des = "Ajudante";
            mostrarTabelaPessoa(b, "Ajudante");
        }
        botaoLista.setText("Lista: " + des);
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

        tabela.setBackground(new java.awt.Color(204, 204, 204));
        tabela.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PARTICIPANTE", "DATA - Última parte qualquer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
            tabela.getColumnModel().getColumn(2).setMinWidth(175);
            tabela.getColumnModel().getColumn(2).setPreferredWidth(175);
            tabela.getColumnModel().getColumn(2).setMaxWidth(175);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        List<Object[]> lista = pesDAO.buscarDeterminadaPessoa(des, txtProcurar.getText());
        tab = (DefaultTableModel) tabela.getModel();
        tab.setNumRows(0);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (Object[] a : lista) {
            int id = (int) a[0]; // ID da pessoa
            String nomeCompleto = (String) a[1]; // Nome completo
            LocalDate dataUltima = (LocalDate) a[2]; // Data última

            String formattedDate = "";
            if (dataUltima != null) {
                formattedDate = dataUltima.format(dateFormatter);
            }

            tab.addRow(new Object[]{
                id,
                nomeCompleto,
                formattedDate 
            });
        }
    }//GEN-LAST:event_txtProcurarKeyReleased

    private void botaoListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListaActionPerformed
        txtProcurar.setText(null);
        if (numero == 6) {
            mostrarTabelaLeitor();
        } else if (numero == 19 || numero == 4) {
            mostrarTabelaOracao();
        } else {
            mostrarTabelaPessoa(pessoa.getSexo(), des);
        }
    }//GEN-LAST:event_botaoListaActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void irTela1() {
        if (numero == 1) {
            Janela.tela1.altLeituraBibliaA(pessoa2);
        }
        if (numero == 2) {
            Janela.tela1.altPresidenteA(pessoa2);
        }
        if (numero == 3) {
            Janela.tela1.altTesouros(pessoa2);
        }
        if (numero == 4) {
            Janela.tela1.altOracaoInicial(pessoa2);
        }
        if (numero == 5) {
            Janela.tela1.altNossaVida1(pessoa2);
        }
        if (numero == 6) {
            Janela.tela1.altLeitorEstudo(pessoa2);
        }
        if (numero == 7) {
            Janela.tela1.altJoias(pessoa2);
        }
        if (numero == 8) {
            Janela.tela1.altPrimeiraConversaA(pessoa2);
        }
        if (numero == 9) {
            Janela.tela1.altAjudantePrimeiraConversaA(pessoa2);
        }
        if (numero == 10) {
            Janela.tela1.altPrimeiraConversa2A(pessoa2);
        }
        if (numero == 11) {
            Janela.tela1.altAjudantePrimeiraConversa2A(pessoa2);
        }
        if (numero == 12) {
            Janela.tela1.altRevisitaA(pessoa2);
        }
        if (numero == 13) {
            Janela.tela1.altAjudanteRevisitaA(pessoa2);
        }
        if (numero == 14) {
            Janela.tela1.altRevisita2A(pessoa2);
        }
        if (numero == 15) {
            Janela.tela1.altAjudanteRevisita2A(pessoa2);
        }
        if (numero == 16) {
            Janela.tela1.altEstudoBiblicoA(pessoa2);
        }
        if (numero == 17) {
            Janela.tela1.altAjudanteEstudoBiblicoA(pessoa2);
        }
        if (numero == 18) {
            Janela.tela1.altDiscursoA(pessoa2);
        }
        if (numero == 19) {
            Janela.tela1.altOracaoFinal(pessoa2);
        }
        if (numero == 20) {
            Janela.tela1.altNossaVida2(pessoa2);
        }
        if (numero == 21) {
            Janela.tela1.altEstudoCongregacao(pessoa2);
        }
        if (numero == 22) {
            Janela.tela1.altPresidenteB(pessoa2);
        }
        if (numero == 23) {
            Janela.tela1.altPrimeiraConversaB(pessoa2);
        }
        if (numero == 24) {
            Janela.tela1.altAjudantePrimeiraConversaB(pessoa2);
        }
        if (numero == 25) {
            Janela.tela1.altPrimeiraConversa2B(pessoa2);
        }
        if (numero == 26) {
            Janela.tela1.altAjudantePrimeiraConversa2B(pessoa2);
        }
        if (numero == 27) {
            Janela.tela1.altRevisitaB(pessoa2);
        }
        if (numero == 28) {
            Janela.tela1.altAjudanteRevisitaB(pessoa2);
        }
        if (numero == 29) {
            Janela.tela1.altRevisita2B(pessoa2);
        }
        if (numero == 30) {
            Janela.tela1.altAjudanteRevisita2B(pessoa2);
        }
        if (numero == 31) {
            Janela.tela1.altEstudoBiblicoB(pessoa2);
        }
        if (numero == 32) {
            Janela.tela1.altAjudanteEstudoBiblicoB(pessoa2);
        }
        if (numero == 33) {
            Janela.tela1.altDiscursoB(pessoa2);
        }
        if (numero == 34) {
            Janela.tela1.altLeituraBibliaB(pessoa2);
        }
        if (numero == 35) {
            Janela.tela1.altPrimeiraConversa1A(pessoa2);
        }
        if (numero == 36) {
            Janela.tela1.altAjudantePrimeiraConversa1A(pessoa2);
        }
        if (numero == 37) {
            Janela.tela1.altPrimeiraConversa1B(pessoa2);
        }
        if (numero == 38) {
            Janela.tela1.altAjudantePrimeiraConversa1B(pessoa2);
        }
        if (numero == 39) {
            Janela.tela1.altRevisita1A(pessoa2);
        }
        if (numero == 40) {
            Janela.tela1.altRevisita1A(pessoa2);
        }
        if (numero == 41) {
            Janela.tela1.altRevisita1B(pessoa2);
        }
        if (numero == 42) {
            Janela.tela1.altAjudanteRevisita1B(pessoa2);
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
            String dataUltimaFormatada = "";
            if (dataUltima != null) {
                dataUltimaFormatada = dataUltima.format(df);
            }
            tab.addRow(new Object[]{
                idPessoa,
                nomeCompleto,
                dataUltimaFormatada
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
                dataFormatada
            });
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
                dataFormatada
            });
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
