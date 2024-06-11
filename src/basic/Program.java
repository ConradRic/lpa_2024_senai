package basic;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame janela = new JFrame();
		JPanel painel = new JPanel();

		JButton norte = new JButton("NORTE");
		JButton sul = new JButton("SUL");
		JButton leste = new JButton("LESTE");
		JButton oeste = new JButton("OESTE");
		JButton centro = new JButton("CENTRO");

		janela.setSize(700, 500);
		janela.setTitle("Exemplo BorderLayout");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		painel.setLayout(new BorderLayout(10, 20));

		painel.add("North", norte);
		painel.add("West", leste);
		painel.add("Center", centro);
		painel.add("East", oeste);
		painel.add("South", sul);

		janela.add(painel);
		janela.setVisible(true);

	}

}
