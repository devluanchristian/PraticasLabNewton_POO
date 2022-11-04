package Exe03;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        int numero, volume, tiragem;
        String dataEdicao;

        String tituloRevista;
        long issn;
        String periodicidade;

        String titulo, resumo, autores;

        tituloRevista = JOptionPane.showInputDialog("Titulo da Revista");
        issn = Long.parseLong(JOptionPane.showInputDialog("issn"));
        periodicidade = JOptionPane.showInputDialog("periodicidade");

        numero = Integer.parseInt(JOptionPane.showInputDialog("numero"));
        volume = Integer.parseInt(JOptionPane.showInputDialog("volume"));
        tiragem = Integer.parseInt(JOptionPane.showInputDialog("tiragem"));
        dataEdicao = JOptionPane.showInputDialog("Titulo da Revista");

        Edicao ed1 = new Edicao(numero, volume, dataEdicao, tiragem);
        RevistaCientifica revista1 = new RevistaCientifica(tituloRevista, issn, periodicidade);

        ArrayList<Artigo> artigos = new ArrayList<Artigo>();
        for (int i = 0; i < 10; i++) {
            titulo = JOptionPane.showInputDialog("Digite titulo do artigo");
            resumo = JOptionPane.showInputDialog("Resumo");
            autores = JOptionPane.showInputDialog("Autores");
            artigos.add(new Artigo(titulo, resumo, autores));
            ed1.adicionarArtigos(artigos.get(i));
        }

    }

}
