package br.com.alexlopes.designacoes.login;

import br.com.alexlopes.designacoes.dao.UsuarioDAO;
import br.com.alexlopes.designacoes.model.Usuario;
import br.com.alexlopes.designacoes.util.ClasseEmail;
import br.com.alexlopes.designacoes.util.Janela;
import br.com.alexlopes.designacoes.util.Mensagem;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class CadastrarUsuario extends javax.swing.JFrame {

    private boolean senhaVisivel = false;
    private boolean senhaVisivel2 = false;
    private final Usuario usuario = new Usuario();
    private final UsuarioDAO dao = new UsuarioDAO();

    public CadastrarUsuario() {
        initComponents();
        txtNome.requestFocus();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                confirmarSaida();
            }
        });
    }

    private void confirmarSaida() {
        Object[] options = {"Sim", "Não"};
        int option = JOptionPane.showOptionDialog(this, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (option == JOptionPane.YES_OPTION) {
            dispose();
        } else {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon(getClass().getResource("/Imagem/bazul.jpeg"));
            Image image = icon.getImage();
            public void paintComponent(Graphics g){
                super.paintComponent(g); // Chama o método paintComponent da superclasse
                g.drawImage(image, 0,0, getWidth(), getHeight(),this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        mostrar1 = new javax.swing.JLabel();
        mostrar2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        botaoCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Usuário");
        setMaximumSize(new java.awt.Dimension(761, 511));
        setMinimumSize(new java.awt.Dimension(761, 511));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(744, 511));
        jPanel1.setMinimumSize(new java.awt.Dimension(744, 511));
        jPanel1.setPreferredSize(new java.awt.Dimension(744, 511));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Bem Vindo");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html>Para garantir que os dados inseridos no programa estejam sempre seguros e protegidos, limitamos o cadastro a apenas um usuário.</html>");
        jLabel2.setToolTipText("");

        jPanel2.setMaximumSize(new java.awt.Dimension(531, 239));
        jPanel2.setMinimumSize(new java.awt.Dimension(531, 239));
        jPanel2.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome:");

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Email:");

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Senha:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 0));
        jLabel6.setText("Confirmar Senha:");

        txtSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });

        txtConfirmarSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtConfirmarSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtConfirmarSenha.setForeground(new java.awt.Color(51, 0, 0));
        txtConfirmarSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmarSenhaKeyPressed(evt);
            }
        });

        mostrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/mostrarSenha.png"))); // NOI18N
        mostrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrar1MouseClicked(evt);
            }
        });

        mostrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/mostrarSenha.png"))); // NOI18N
        mostrar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrar2MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("WhatsApp:");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mostrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCelular)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(mostrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mostrar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        botaoCadastrar.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(0, 0, 51));
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(247, 247, 247))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        usuario.setNome(txtNome.getText());
        usuario.setEmail(txtEmail.getText());
        usuario.setCelular(txtCelular.getText());
        char[] senhaChars = txtSenha.getPassword();
        String senhamd5 = dao.calculateSHA256(senhaChars);
        usuario.setSenha(senhamd5);

        if (validarCampos()) {
            if (validarSenhas()) {
                if (validarEmail()) {
                    dao.cadastrar(usuario);
                    enviarDados();
                    this.dispose();
                    Janela.irEntrar();
                } else {
                    Mensagem.mensagemErro("Codigo Inválido");
                }

            }

        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void mostrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar1MouseClicked
        txtSenha.setEchoChar('•');
        if (senhaVisivel) {
            txtSenha.setEchoChar('•');
            senhaVisivel = false;
        } else {
            txtSenha.setEchoChar((char) 0);
            senhaVisivel = true;
        }
    }//GEN-LAST:event_mostrar1MouseClicked

    private void mostrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar2MouseClicked
        txtConfirmarSenha.setEchoChar('•');
        if (senhaVisivel2) {
            txtConfirmarSenha.setEchoChar('•');
            senhaVisivel2 = false;
        } else {
            txtConfirmarSenha.setEchoChar((char) 0);
            senhaVisivel2 = true;
        }
    }//GEN-LAST:event_mostrar2MouseClicked

    private void txtCelularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusGained
        try {
            MaskFormatter maskFormatter = new MaskFormatter("(##)#####-####");
            maskFormatter.setValueContainsLiteralCharacters(false);
            txtCelular.setFormatterFactory(new DefaultFormatterFactory(maskFormatter));
        } catch (java.text.ParseException ex) {
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
        }
    }//GEN-LAST:event_txtCelularFocusLost

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            txtCelular.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtNome.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            txtSenha.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtCelularKeyPressed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            txtConfirmarSenha.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtCelular.requestFocus();
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtConfirmarSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            java.awt.event.ActionEvent evts = null;
            botaoCadastrarActionPerformed(evts);
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtSenha.requestFocus();
        }
    }//GEN-LAST:event_txtConfirmarSenhaKeyPressed

    private boolean validarCampos() {
        if (txtNome.getText().isEmpty()) {
            Mensagem.mensagemAlerta("O campo Nome não pode estar vazio");
            return false;
        }
        if (txtEmail.getText().isEmpty()) {
            Mensagem.mensagemAlerta("O campo Email não pode estar vazio");
            return false;
        }
        if (txtCelular.getText().isEmpty()) {
            Mensagem.mensagemAlerta("O campo WhatsApp não pode estar vazio");
            return false;
        }
        if (txtSenha.getPassword().length == 0) {
            Mensagem.mensagemAlerta("O campo Senha não pode estar vazio");
            return false;
        }
        if (txtConfirmarSenha.getPassword().length == 0) {
            Mensagem.mensagemAlerta("O campo Confirmar Senha não pode estar vazio");
            return false;
        }
        if (!Arrays.equals(txtSenha.getPassword(), txtConfirmarSenha.getPassword())) {
            Mensagem.mensagemAlerta("O Campo Senha e Confirmar Senha não são iguais");
            return false;
        }
        return true;
    }

    private boolean validarSenhas() {
        if (txtSenha.getPassword().length > 0) {
            char[] senha1 = txtSenha.getPassword();
            boolean a = validarSenha(senha1);
            return a;
        }
        return false;
    }

    private static boolean validarSenha(char[] senha) {
        // Verifica se a senha tem pelo menos 8 caracteres
        if (senha.length < 8) {
            Mensagem.mensagemErro("A senha deve conter pelo menos 8 caracteres.");
            return false;
        }
        // Verifica se a senha contém pelo menos uma letra e um número
        String senhaString = new String(senha);
        Pattern padrao = Pattern.compile("(?=.*[a-zA-Z])(?=.*[0-9])[a-zA-Z0-9]+");
        Matcher matcher = padrao.matcher(senhaString);
        if (!matcher.matches()) {
            Mensagem.mensagemErro("A senha deve conter letra e número.");
            return false;
        }
        return true;
    }

    private boolean validarEmail() {
        ClasseEmail email = new ClasseEmail();
        String to = txtEmail.getText();
        String subject = "Cadastro de Usuário";
        String content = "";
        String a = email.emailValidarCadastro(to, subject, content);
        while (true) {
            String b = JOptionPane.showInputDialog("Abra o seu email e copie o codigo.\n"
                    + "Digite o codigo aqui:\n ");
            if (a.equals(b)) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Código incorreto. Tente novamente.");
            }
        }
    }

    private void enviarDados() {
        try {
            ClasseEmail classe = new ClasseEmail();
        classe.enviarEmail("Novo Cadastro efetuado", "Nome: " + txtNome.getText() + "\n"
                + "Email: " + txtEmail.getText() + "\n" + "Celular: " + txtCelular.getText());
        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mostrar1;
    private javax.swing.JLabel mostrar2;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
