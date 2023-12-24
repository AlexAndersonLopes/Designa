package br.com.alexlopes.designacoes.views;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Duvidas extends javax.swing.JFrame {

    private static WebDriver driver;

    public Duvidas() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        cadastrarParticipante = new javax.swing.JLabel();
        alterarParticipante = new javax.swing.JLabel();
        fazerDesignacoes = new javax.swing.JLabel();
        fazerDesignacoes1 = new javax.swing.JLabel();
        conectar = new javax.swing.JLabel();
        enviar = new javax.swing.JLabel();
        comoEnviar = new javax.swing.JLabel();
        ondeFoiSalvo = new javax.swing.JLabel();
        seguro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        programafaz = new javax.swing.JLabel();
        teste = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tutorial e dúvidas");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 5));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        cadastrarParticipante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cadastrarParticipante.setForeground(new java.awt.Color(0, 0, 0));
        cadastrarParticipante.setText("Como cadastrar participantes?");
        cadastrarParticipante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarParticipante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarParticipanteMouseClicked(evt);
            }
        });

        alterarParticipante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        alterarParticipante.setForeground(new java.awt.Color(0, 0, 0));
        alterarParticipante.setText("Como alterar participantes?");
        alterarParticipante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        alterarParticipante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alterarParticipanteMouseClicked(evt);
            }
        });

        fazerDesignacoes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        fazerDesignacoes.setForeground(new java.awt.Color(0, 0, 0));
        fazerDesignacoes.setText("Como fazer designações?");
        fazerDesignacoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fazerDesignacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fazerDesignacoesMouseClicked(evt);
            }
        });

        fazerDesignacoes1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        fazerDesignacoes1.setForeground(new java.awt.Color(0, 0, 0));
        fazerDesignacoes1.setText("Substituír designados");
        fazerDesignacoes1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fazerDesignacoes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fazerDesignacoes1MouseClicked(evt);
            }
        });

        conectar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        conectar.setForeground(new java.awt.Color(0, 0, 0));
        conectar.setText("Conectando o WhatsApp");
        conectar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        conectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conectarMouseClicked(evt);
            }
        });

        enviar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        enviar.setForeground(new java.awt.Color(0, 0, 0));
        enviar.setText("Enviar designações pelo WhatsApp");
        enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviarMouseClicked(evt);
            }
        });

        comoEnviar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        comoEnviar.setForeground(new java.awt.Color(0, 0, 0));
        comoEnviar.setText("Como enviar depois as designações?");
        comoEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comoEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comoEnviarMouseClicked(evt);
            }
        });

        ondeFoiSalvo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ondeFoiSalvo.setForeground(new java.awt.Color(0, 0, 0));
        ondeFoiSalvo.setText("Onde foi salvo meu arquivos?");
        ondeFoiSalvo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ondeFoiSalvo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ondeFoiSalvoMouseClicked(evt);
            }
        });

        seguro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        seguro.setForeground(new java.awt.Color(0, 0, 0));
        seguro.setText("Este programa é seguro?");
        seguro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seguro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seguroMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clique no assunto para ver o vídeo explicativo");
        jLabel1.setOpaque(true);

        programafaz.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        programafaz.setForeground(new java.awt.Color(0, 0, 102));
        programafaz.setText("O que esse programa faz?");
        programafaz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        programafaz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                programafazMouseClicked(evt);
            }
        });

        teste.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        teste.setForeground(new java.awt.Color(0, 0, 0));
        teste.setText("Teste após a instalação - Importante");
        teste.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        teste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                testeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teste)
                    .addComponent(programafaz)
                    .addComponent(seguro)
                    .addComponent(ondeFoiSalvo)
                    .addComponent(comoEnviar)
                    .addComponent(enviar)
                    .addComponent(conectar)
                    .addComponent(fazerDesignacoes1)
                    .addComponent(fazerDesignacoes)
                    .addComponent(alterarParticipante)
                    .addComponent(cadastrarParticipante))
                .addGap(153, 153, 153))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(programafaz, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teste, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(cadastrarParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alterarParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fazerDesignacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fazerDesignacoes1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(conectar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comoEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ondeFoiSalvo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(seguro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarParticipanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarParticipanteMouseClicked
        abrirVideo("eJF86M13VGI");
    }//GEN-LAST:event_cadastrarParticipanteMouseClicked

    private void alterarParticipanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alterarParticipanteMouseClicked
        abrirVideo("hiVYVzzGVvU");
    }//GEN-LAST:event_alterarParticipanteMouseClicked

    private void fazerDesignacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fazerDesignacoesMouseClicked
        abrirVideo("CsspqHkuJx4");
    }//GEN-LAST:event_fazerDesignacoesMouseClicked

    private void fazerDesignacoes1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fazerDesignacoes1MouseClicked
        abrirVideo("BlWqfGhjKlc");
    }//GEN-LAST:event_fazerDesignacoes1MouseClicked

    private void conectarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conectarMouseClicked
        abrirVideo("gGPoc2o5HqM");
    }//GEN-LAST:event_conectarMouseClicked

    private void enviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarMouseClicked
        abrirVideo("aygSXCXZx_E");
    }//GEN-LAST:event_enviarMouseClicked

    private void comoEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comoEnviarMouseClicked
        abrirVideo("aygSXCXZx_E");
    }//GEN-LAST:event_comoEnviarMouseClicked

    private void ondeFoiSalvoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ondeFoiSalvoMouseClicked
        abrirVideo("1nJMmIl2IXU");
    }//GEN-LAST:event_ondeFoiSalvoMouseClicked

    private void seguroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seguroMouseClicked
        abrirVideo("1RM0XzIZwXw");
    }//GEN-LAST:event_seguroMouseClicked

    private void programafazMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_programafazMouseClicked
        abrirVideo("zJ4-EDYOsf0");
    }//GEN-LAST:event_programafazMouseClicked

    private void testeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testeMouseClicked
        abrirVideo("E-bPlS_DwBE");
    }//GEN-LAST:event_testeMouseClicked

    private void abrirVideo(String videoId) {
        try {
            inicializarDriver();
            // Construa a URL do vídeo do YouTube
            String youtubeUrl = "https://www.youtube.com/watch?v=" + videoId;

            // Abra a URL no navegador controlado pelo WebDriver
            driver.get(youtubeUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   private static boolean verificarPaginaWebAberta() {
        try {
            Set<String> windowHandles = driver.getWindowHandles();

            if (!windowHandles.isEmpty()) {
                // Já existem janelas abertas, verificar se a janela está minimizada
                for (String handle : windowHandles) {
                    driver.switchTo().window(handle);
                    if (driver.manage().window().getPosition().getX() == -32000) {
                        // A posição -32000 indica que a janela está minimizada
                        driver.manage().window().maximize();
                        break;
                    }
                }
                return true;
            }

            driver.manage().window().maximize();
            WebElement searchBar = driver.findElement(By.xpath("//div[@contenteditable='true']"));
            searchBar.click();
            // Se não ocorreu uma exceção, então a barra de pesquisa está presente, indicando que a página está aberta
            return true;
        } catch (Exception e) {
            // Se ocorreu uma exceção, a barra de pesquisa não foi encontrada, indicando que a página não está aberta
            driver = null;
            return false;
        }
    }

    public static void inicializarDriver() {
        if (!verificarPaginaWebAberta()) {
            // Configurar o driver do Chrome usando o WebDriverManager
            ChromeOptions options = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
        }
        // Verificar se a janela do WhatsApp já está aberta
        Set<String> windowHandles = driver.getWindowHandles();
        boolean whatsappWindowFound = false;

        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
            if (driver.getCurrentUrl().startsWith("https://www.youtube.com/watch?v=")) {
                whatsappWindowFound = true;
                break;
            }
        }
        // Abrir o WhatsApp Web se a janela não foi encontrada
        if (!whatsappWindowFound) {
            driver.get("https://www.youtube.com/watch?v=");
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
            java.util.logging.Logger.getLogger(Duvidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Duvidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Duvidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Duvidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Duvidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alterarParticipante;
    private javax.swing.JLabel cadastrarParticipante;
    private javax.swing.JLabel comoEnviar;
    private javax.swing.JLabel conectar;
    private javax.swing.JLabel enviar;
    private javax.swing.JLabel fazerDesignacoes;
    private javax.swing.JLabel fazerDesignacoes1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel ondeFoiSalvo;
    private javax.swing.JLabel programafaz;
    private javax.swing.JLabel seguro;
    private javax.swing.JLabel teste;
    // End of variables declaration//GEN-END:variables
}
