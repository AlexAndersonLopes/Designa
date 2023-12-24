package br.com.alexlopes.designacoes.util;

import br.com.alexlopes.designacoes.login.AlterarDados;
import br.com.alexlopes.designacoes.login.CadastrarUsuario;
import br.com.alexlopes.designacoes.login.Entrar;
import br.com.alexlopes.designacoes.model.Pessoa;
import br.com.alexlopes.designacoes.model.Usuario;
import br.com.alexlopes.designacoes.util.whats.Aguarde;
import br.com.alexlopes.designacoes.util.whats.Aguarde2;
import br.com.alexlopes.designacoes.views.AlterarParticipantes;
import br.com.alexlopes.designacoes.views.CadastroParticipantes;
import br.com.alexlopes.designacoes.views.Duvidas;
import br.com.alexlopes.designacoes.views.FalarCom;
import br.com.alexlopes.designacoes.views.MenuPrincipal;
import br.com.alexlopes.designacoes.views.Substituicao;
import br.com.alexlopes.designacoes.views.Tela2;
import br.com.alexlopes.designacoes.views.Trocar;
import br.com.alexlopes.designacoes.views.TrocarSubstituicao;
import java.util.List;
import javax.swing.JFrame;

public class Janela {

    public static Aguarde2 a2;
    public static Tela2 tela2;
    public static Substituicao sub;
    public static Aguarde ag;
    private static Usuario usuario;
    public static MenuPrincipal menu;

    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
        Janela.usuario = usuario;
    }

    public static void irMenu() {
        if (menu == null) {
            menu = new MenuPrincipal();
            menu.pack();
            menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
            menu.setVisible(true);
        } else {
            menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
            menu.setVisible(true);
        }
    }
    
    public static void irDuvidas(){
        Duvidas a = new Duvidas();
        a.pack();
        a.setLocationRelativeTo(null);
        a.setVisible(true);
    }

    public static void irAlterarDados() {
        AlterarDados a = new AlterarDados(usuario);
        a.pack();
        a.setLocationRelativeTo(null);
        a.setVisible(true);
    }

    public static void irCadastrarUsuario() {
        CadastrarUsuario b = new CadastrarUsuario();
        b.pack();
        b.setLocationRelativeTo(null);
        b.setVisible(true);
    }

    public static void irEntrar() {
        Entrar a = new Entrar();
        a.setLocationRelativeTo(null);
        a.pack();
        a.setVisible(true);
    }

    public static void irAguarde() {
        if (ag == null) {
            ag = new Aguarde();
            ag.setTitle("Alterar particpante para Reunião do Meio de Semana");
            ag.setLocationRelativeTo(null);
            ag.pack();
            ag.setVisible(true);
        } else {
            ag.setLocationRelativeTo(null);
            ag.setVisible(true);
        }
    }

    public static void irAguarde2(String nome) {
        a2 = new Aguarde2(tela2, false, nome);
        a2.setLocationRelativeTo(null);
        a2.pack();
        a2.setVisible(true);
    }

    public static void irTela2() {
        if (tela2 == null) {
            tela2 = new Tela2();
            tela2.pack();
            tela2.setExtendedState(JFrame.MAXIMIZED_BOTH);
            tela2.setVisible(true);
        } else {
            tela2.setExtendedState(JFrame.MAXIMIZED_BOTH);
            tela2.setVisible(true);
        }
    }

    public static void irCadastroParticipantes() {
        CadastroParticipantes a = new CadastroParticipantes();
        a.setTitle("Cadastrar particpantes para Reunião do Meio de Semana");
        a.setExtendedState(JFrame.MAXIMIZED_BOTH);
        a.pack();
        a.setVisible(true);
    }

    public static void irAlterarParticipantes() {
        AlterarParticipantes a = new AlterarParticipantes();
        a.setTitle("Alterar particpante para Reunião do Meio de Semana");
        a.setExtendedState(JFrame.MAXIMIZED_BOTH);
        a.pack();
        a.setVisible(true);
    }

    public static void irTrocar(int c, String b, Pessoa p, List<Integer> lista, String parte) {
        Trocar a = new Trocar(c, b, p, lista, parte);
        a.setTitle("Alterar particpante para Reunião do Meio de Semana");
        a.setLocationRelativeTo(null);
        a.pack();
        a.setVisible(true);
    }

    public static void irTrocar2(int c, String b, List<Integer> lista) {
        Trocar a = new Trocar(c, b, lista);
        a.setTitle("Alterar particpante para Reunião do Meio de Semana");
        a.setLocationRelativeTo(null);
        a.pack();
        a.setVisible(true);
    }

    public static void irTrocarSubstituicao(String campo, int num, String parteBD, String parte, String data, String sala, Pessoa a, Pessoa b, String numero) {
        TrocarSubstituicao t = new TrocarSubstituicao(campo, num, parteBD, parte, data, sala, a, b, numero);
        t.setTitle("Tela de Substituição");
        t.setLocationRelativeTo(null);
        t.pack();
        t.setVisible(true);
    }

    public static void irSubstituicao() {
        if (sub == null) {
            sub = new Substituicao();
            sub.setTitle("Tela de Substituição");
            sub.setExtendedState(JFrame.MAXIMIZED_BOTH);
            sub.pack();
            sub.setVisible(true);
            sub.mostrarTabela();
        } else {
            sub.setExtendedState(JFrame.MAXIMIZED_BOTH);
            sub.setVisible(true);
            sub.mostrarTabela();
        }
    }

    public static void irFalarCom() {
        FalarCom a = new FalarCom();
        a.setLocationRelativeTo(null);
        a.pack();
        a.setVisible(true);
    }

}
