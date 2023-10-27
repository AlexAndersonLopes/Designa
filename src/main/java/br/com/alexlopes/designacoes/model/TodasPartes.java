package br.com.alexlopes.designacoes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TodasPartes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String dia;
    private String mes;
    private String ano;
    private String semana;
    private String presidenteA;
    private String presidenteB;
    private String oracaoInicial;
    private String labelTesouros;
    private String tesouros;
    private String joias;
    private String leituraBibliaA;
    private String leituraBibliaB;
    private String nomeParte1;
    private String parte1A;
    private String ajudante1A;
    private String parte1B;
    private String ajudante1B;
    private String nomeParte2;
    private String parte2A;
    private String ajudante2A;
    private String parte2B;
    private String ajudante2B;
    private String nomeparte3;
    private String parte3A;
    private String ajudante3A;
    private String parte3B;
    private String ajudante3B;
    private String labelNossaVida1;
    private String nossaVida1;
    private String labelNossaVida2;
    private String nossaVida2;
    private String estudoLivro;
    private String leitor;
    private String oracaoFinal;

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getSemana() {
        return semana;
    }

    public void setSemana(String semana) {
        this.semana = semana;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPresidenteA() {
        return presidenteA;
    }

    public void setPresidenteA(String presidenteA) {
        this.presidenteA = presidenteA;
    }

    public String getPresidenteB() {
        return presidenteB;
    }

    public void setPresidenteB(String presidenteB) {
        this.presidenteB = presidenteB;
    }

    public String getOracaoInicial() {
        return oracaoInicial;
    }

    public void setOracaoInicial(String oracaoInicial) {
        this.oracaoInicial = oracaoInicial;
    }

    public String getTesouros() {
        return tesouros;
    }

    public String getLabelTesouros() {
        return labelTesouros;
    }

    public void setLabelTesouros(String labelTesouros) {
        this.labelTesouros = labelTesouros;
    }    

    public void setTesouros(String tesouros) {
        this.tesouros = tesouros;
    }

    public String getJoias() {
        return joias;
    }

    public void setJoias(String joias) {
        this.joias = joias;
    }

    public String getLeituraBibliaA() {
        return leituraBibliaA;
    }

    public void setLeituraBibliaA(String leituraBibliaA) {
        this.leituraBibliaA = leituraBibliaA;
    }

    public String getLeituraBibliaB() {
        return leituraBibliaB;
    }

    public void setLeituraBibliaB(String leituraBibliaB) {
        this.leituraBibliaB = leituraBibliaB;
    }

    public String getNomeParte1() {
        return nomeParte1;
    }

    public void setNomeParte1(String nomeParte1) {
        this.nomeParte1 = nomeParte1;
    }

    public String getParte1A() {
        return parte1A;
    }

    public void setParte1A(String parte1A) {
        this.parte1A = parte1A;
    }

    public String getAjudante1A() {
        return ajudante1A;
    }

    public void setAjudante1A(String ajudante1A) {
        this.ajudante1A = ajudante1A;
    }

    public String getParte1B() {
        return parte1B;
    }

    public void setParte1B(String parte1B) {
        this.parte1B = parte1B;
    }

    public String getAjudante1B() {
        return ajudante1B;
    }

    public void setAjudante1B(String ajudante1B) {
        this.ajudante1B = ajudante1B;
    }

    public String getNomeParte2() {
        return nomeParte2;
    }

    public void setNomeParte2(String nomeParte2) {
        this.nomeParte2 = nomeParte2;
    }

    public String getParte2A() {
        return parte2A;
    }

    public void setParte2A(String parte2A) {
        this.parte2A = parte2A;
    }

    public String getAjudante2A() {
        return ajudante2A;
    }

    public void setAjudante2A(String ajudante2A) {
        this.ajudante2A = ajudante2A;
    }

    public String getParte2B() {
        return parte2B;
    }

    public void setParte2B(String parte2B) {
        this.parte2B = parte2B;
    }

    public String getAjudante2B() {
        return ajudante2B;
    }

    public void setAjudante2B(String ajudante2B) {
        this.ajudante2B = ajudante2B;
    }

    public String getNomeparte3() {
        return nomeparte3;
    }

    public void setNomeparte3(String nomeparte3) {
        this.nomeparte3 = nomeparte3;
    }

    public String getParte3A() {
        return parte3A;
    }

    public void setParte3A(String parte3A) {
        this.parte3A = parte3A;
    }

    public String getAjudante3A() {
        return ajudante3A;
    }

    public void setAjudante3A(String ajudante3A) {
        this.ajudante3A = ajudante3A;
    }

    public String getParte3B() {
        return parte3B;
    }

    public void setParte3B(String parte3B) {
        this.parte3B = parte3B;
    }

    public String getAjudante3B() {
        return ajudante3B;
    }

    public void setAjudante3B(String ajudante3B) {
        this.ajudante3B = ajudante3B;
    }

    public String getLabelNossaVida1() {
        return labelNossaVida1;
    }

    public void setLabelNossaVida1(String labelNossaVida1) {
        this.labelNossaVida1 = labelNossaVida1;
    }

    public String getLabelNossaVida2() {
        return labelNossaVida2;
    }

    public void setLabelNossaVida2(String labelNossaVida2) {
        this.labelNossaVida2 = labelNossaVida2;
    }

    public String getNossaVida1() {
        return nossaVida1;
    }

    public void setNossaVida1(String nossaVida1) {
        this.nossaVida1 = nossaVida1;
    }

    public String getNossaVida2() {
        return nossaVida2;
    }

    public void setNossaVida2(String nossaVida2) {
        this.nossaVida2 = nossaVida2;
    }

    public String getEstudoLivro() {
        return estudoLivro;
    }

    public void setEstudoLivro(String estudoLivro) {
        this.estudoLivro = estudoLivro;
    }

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }

    public String getOracaoFinal() {
        return oracaoFinal;
    }

    public void setOracaoFinal(String oracaoFinal) {
        this.oracaoFinal = oracaoFinal;
    }

}
