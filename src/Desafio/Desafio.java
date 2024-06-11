package Desafio;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Desafio {

	public static void main(String[] args) {

		JFrame janela = new JFrame("Homework7");
		janela.setSize(700, 350);
		janela.setLayout(new BorderLayout());

		JPanel painelPrincipal = new JPanel();
		JPanel painelEsquerda = new JPanel();
		JPanel painelDireita = new JPanel();
		JPanel painelCentro = new JPanel();

		painelPrincipal.setLayout(new GridLayout(1, 2));
		painelEsquerda.setLayout(new GridLayout(2, 3));
		painelDireita.setLayout(new BorderLayout(0, 2));
		painelCentro.setLayout(new BorderLayout());

		JButton primeiroBotao = new JButton("BUTTON 01");
		JButton segundoBotao = new JButton("BUTTON 02");
		JButton terceiroBotao = new JButton("BUTTON 03");
		JButton quartoBotao = new JButton("BUTTON 04");
		JButton quintoBotao = new JButton("BUTTON 05");
		JButton sextoBotao = new JButton("BUTTON 06");
		JButton setimoBotao = new JButton("BUTTON 07");
		JButton oitavoBotao = new JButton("BUTTON 08");
		JButton nonoBotao = new JButton("BUTTON 09");
		JButton decimoBotao = new JButton("BUTTON 10");
		JButton decimoPrimeiroBotao = new JButton("BUTTON 11");
		JButton decimoSegundoBotao = new JButton("BUTTON 12");
		JButton decimoTerceiroBotao = new JButton("BUTTON 13");
		JButton decimoQuartoBotao = new JButton("BUTTON 14");
		JButton decimoQuintoBotao = new JButton("BUTTON 15");
		JButton decimoSextoBotao = new JButton("BUTTON 16");
		JButton decimoSetimoBotao = new JButton("BUTTON 17");
		JButton decimoOitavoBotao = new JButton("BUTTON 18");

		painelEsquerda.add(primeiroBotao);
		painelEsquerda.add(segundoBotao);
		painelEsquerda.add(terceiroBotao);
		painelEsquerda.add(quartoBotao);
		painelEsquerda.add(quintoBotao);
		painelEsquerda.add(sextoBotao);

		painelCentro.add(decimoPrimeiroBotao);
		painelCentro.add(decimoSegundoBotao);
		painelCentro.add(decimoTerceiroBotao);
		painelCentro.add(decimoQuartoBotao);
		painelCentro.add(decimoQuintoBotao);
		painelCentro.add(decimoSextoBotao);
		painelCentro.add(decimoSetimoBotao);
		painelCentro.add(decimoOitavoBotao);

		painelDireita.add("North", setimoBotao);
		painelDireita.add("South", oitavoBotao);
		painelDireita.add("East", nonoBotao);
		painelDireita.add("West", decimoBotao);
		painelDireita.add("Center", painelCentro);

		painelPrincipal.add(painelEsquerda);
		painelPrincipal.add(painelDireita);

		janela.add(painelPrincipal);

		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
