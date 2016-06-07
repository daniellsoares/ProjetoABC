package br.ufpb.projeto.GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImagemGUI extends JFrame {
	JLabel linha1, linha2;
	ImageIcon alfabetizandoImg = new ImageIcon("C:/Users/Daniel/Pictures/alfabetizando.png");
	ImageIcon casaImg = new ImageIcon("C:/Users/Daniel/Pictures/casa.gif");
	JButton botaoPalavra;
	public ImagemGUI(){
		setTitle("Exercicio das imagens");
		setSize(600,600);
		setLocation(200,200);
		setResizable (false);
		getContentPane().setBackground(Color.white);
		linha1 = new JLabel("Imagem teste",JLabel.CENTER);
		linha1.setForeground(Color.BLACK);
		linha1.setFont(new Font("Serif", Font.BOLD, 24));
		linha2 = new JLabel(alfabetizandoImg, JLabel.CENTER);
		botaoPalavra = new JButton(	casaImg);
		getContentPane().setLayout(new GridLayout(2, 1));
		getContentPane().add(linha1);
		getContentPane().add(botaoPalavra);
		getContentPane().add(linha2);
		getContentPane().add(new JLabel());
	}
	
public static void main (String [] args){
	JFrame janela = new ImagemGUI();
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janela.setVisible(true);
}
}
