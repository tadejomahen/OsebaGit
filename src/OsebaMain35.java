import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OsebaMain35 implements ActionListener {
	
	private JTextField v1, v2, v3, v4; 
	private OsebaModelTable modelTabele;
	
	public OsebaMain35() {
		// glavno okno prgrama
		JFrame okno = new JFrame("Osebe");
		// določimo lastnsoti
		okno.setSize(1200, 400);
		okno.setVisible(true);
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// površina z elementi
		JPanel povrsina = new JPanel(new BorderLayout());
		// dodamo površino na okno
		okno.add(povrsina);
		// površina na vrhu
		JPanel povrsinaVrh = new JPanel();
		// dodamo površino na vrhu
		povrsina.add(povrsinaVrh, BorderLayout.NORTH);
		// napis
		JLabel napis = new JLabel("Starost:");
		povrsinaVrh.add(napis);
		v1 = new JTextField("", 16);
		povrsinaVrh.add(v1);
		JLabel napis2 = new JLabel("Visina:");
		povrsinaVrh.add(napis2);
		v2 = new JTextField("", 16);
		povrsinaVrh.add(v2);		
		JLabel napis3 = new JLabel("Teza:");
		povrsinaVrh.add(napis3);
		v3 = new JTextField("", 16);
		povrsinaVrh.add(v3);
		JLabel napis4 = new JLabel("Ime:");
		povrsinaVrh.add(napis4);
		v4 = new JTextField("", 16);
		povrsinaVrh.add(v4);
		
		// dodamo gumb 
		JButton gumb = new JButton("Dodaj osebo!");
		// gumbu doadamo poslušalec dogodkov
		gumb.addActionListener(this);		
		// gumb dodamo na zgornjo površino
		povrsinaVrh.add(gumb);				
	
		// dodamo model tabele
		modelTabele = new OsebaModelTable();		
		// dodamo tabelo z modelom
		JTable tabela = new JTable(modelTabele);
		povrsina.add(tabela, BorderLayout.CENTER);		
		
		okno.invalidate();
		okno.validate();
		okno.repaint();
	}
	
	public void actionPerformed(ActionEvent e) {
		int starost = Integer.parseInt(v1.getText());
		int visina = Integer.parseInt(v2.getText());
		int teza = Integer.parseInt(v3.getText());
		String ime = v4.getText();
		Oseba o = new Oseba(starost, visina, teza, ime);
		modelTabele.dodajOsebo(o);		
	}
	
	public static void main(String[] args) {
		new OsebaMain35();
	}
	
}

