package br.com.alexlopes.designacoes.util;

import br.com.alexlopes.designacoes.dao.TodasPartesDAO;
import br.com.alexlopes.designacoes.model.TodasPartes;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArquivoPDF {

   // private final String cam = System.getProperty("user.home") + "\\OneDrive\\Área de Trabalho\\Designações\\";
    private final String cam = System.getProperty("user.dir") + File.separator + "Designacoes" + File.separator;
    private String seguir;
    private String caminho;

    public void salvar(TodasPartes dados) {
        seguir = "Designados" + dados.getMes() + dados.getAno() + ".pdf";
        caminho = cam + seguir;

        TodasPartesDAO dao = new TodasPartesDAO();
        List<TodasPartes> lista = new ArrayList<>();
        lista = dao.buscarPorMesEAno(dados.getMes(), dados.getAno());

        try {
            File file = new File(caminho);
            if (!verificarArquivoExiste()) {
                criarArquivo();
            }

            Document docPdf = new Document();
            PdfWriter.getInstance(docPdf, new FileOutputStream(file, true));

            docPdf.open();

            for (TodasPartes a : lista) {
                docPdf.newPage();

                Paragraph a1 = new Paragraph();
                a1.setAlignment(Element.ALIGN_CENTER);
                Font font = new Font(Font.HELVETICA, 24, Font.BOLD);
                a1.setFont(font);
                a1.add(new Paragraph(a.getSemana()));
                docPdf.add(a1);

                Paragraph b1 = new Paragraph();
                b1.setAlignment(Element.ALIGN_LEFT);
                b1.add(new Paragraph("\n"));
                b1.add(new Paragraph("Presidente Sala A: " + a.getPresidenteA()));
                docPdf.add(b1);

                Paragraph c1 = new Paragraph();
                c1.setAlignment(Element.ALIGN_CENTER);
                c1.add(new Paragraph("\n\tPresidente Sala B: " + a.getPresidenteB()));
                docPdf.add(c1);

                Paragraph d1 = new Paragraph();
                d1.setAlignment(Element.ALIGN_LEFT);
                d1.add(new Paragraph("\n"));
                d1.add(new Paragraph("Oração Inicial: " + a.getOracaoInicial()));
                d1.add(new Paragraph("\nTesouros: " + a.getTesouros()));
                d1.add(new Paragraph("Joias: " + a.getJoias()));
                d1.add(new Paragraph("\n_____SALA A_____\n"));
                d1.add(new Paragraph("Leitura da Bíblia Sala A: " + a.getLeituraBibliaA()));
                d1.add(new Paragraph("\n" + a.getNomeParte1() + " " + a.getParte1A()));
                d1.add(new Paragraph("Ajudante: " + a.getAjudante1A()));
                d1.add(new Paragraph("\n" + a.getNomeParte2() + " " + a.getParte2A()));
                d1.add(new Paragraph("Ajudante: " + a.getAjudante2A()));
                d1.add(new Paragraph("\n" + a.getNomeparte3() + " " + a.getParte3A()));
                d1.add(new Paragraph("Ajudante: " + a.getAjudante3A()));
                docPdf.add(d1);

                if (!a.getLeituraBibliaB().equals("NA") && !a.getNomeParte2().equals("NA") && !a.getNomeparte3().equals("NA")) {
                    Paragraph e1 = new Paragraph();
                    e1.setAlignment(Element.ALIGN_CENTER);
                    e1.add(new Paragraph("\n_____SALA B_____\n"));
                    e1.add(new Paragraph("Leitura da Bíblia Sala B: " + a.getLeituraBibliaB()));
                    e1.add(new Paragraph("\n" + a.getNomeParte1() + " " + a.getParte1B()));
                    e1.add(new Paragraph("Ajudante: " + a.getAjudante1B()));
                    e1.add(new Paragraph("\n" + a.getNomeParte2() + " " + a.getParte2B()));
                    e1.add(new Paragraph("Ajudante: " + a.getAjudante2B()));
                    e1.add(new Paragraph("\n" + a.getNomeparte3() + " " + a.getParte3B()));
                    e1.add(new Paragraph("Ajudante: " + a.getAjudante3B()));
                    docPdf.add(e1);
                }

                Paragraph f1 = new Paragraph();
                f1.setAlignment(Element.ALIGN_LEFT);
                f1.add(new Paragraph("\nNossa Vida Cristã parte 1: " + a.getNossaVida1()));
                f1.add(new Paragraph("Nossa Vida Cristã parte 2: " + a.getNossaVida2()));
                f1.add(new Paragraph("\nEstudo de Livro: " + a.getEstudoLivro()));
                f1.add(new Paragraph("Leitor: " + a.getLeitor()));
                f1.add(new Paragraph("\nOração Final: " + a.getOracaoFinal()));
                docPdf.add(f1);

            }
            docPdf.close();

        } catch (IOException | DocumentException ex) {
            System.out.println("Erro ao manipular o PDF: " + ex.getMessage());
        }
    }

    public boolean verificarArquivoExiste() {
        File file = new File(caminho);
        return file.exists();
    }

    public void criarArquivo() throws IOException, DocumentException {
        File file = new File(caminho);
        file.getParentFile().mkdirs();
        Document docPdf = new Document();
        PdfWriter.getInstance(docPdf, new FileOutputStream(caminho));
    }

}
