import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SelectPoke extends JFrame{
	private Player player;
	
	public SelectPoke(Player player) {
		this.player = player;
		setTitle("Select Your First Pokemon");
        setSize(1360, 800);
        setVisible(true);
        Container s = getContentPane();
        s.setLayout(null);
        
        JLabel background;
        ImageIcon img = new ImageIcon("SelectPoke.png");
        s.setLayout(new FlowLayout());
        background = new JLabel(img);
        background.setLayout(null);
        s.add(background);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        
	
	JButton Charmander = new JButton();
	Charmander.setBounds(660, 300, 250, 70);
	Charmander.setBackground(Color.black);
	Charmander.setIcon(new ImageIcon("Pickme.png"));
	
	JButton Bulbasaur = new JButton();
	Bulbasaur.setBounds(1080, 660 , 250, 70);
	Bulbasaur.setBackground(Color.black);
	Bulbasaur.setIcon(new ImageIcon("Pickme.png"));
	
	JButton Squirtle = new JButton();
	Squirtle.setBounds(270, 660, 250, 70);
	Squirtle.setBackground(Color.black);
	Squirtle.setIcon(new ImageIcon("Pickme.png"));
	
	background.add(Charmander);
	background.add(Bulbasaur);
	background.add(Squirtle);
	
	Charmander.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			player.getPokeBag().add(new Charmander("Charmander"));
			setVisible(false);
			MainManu goMain = new MainManu(player);
		}
	});
	
	Bulbasaur.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			player.getPokeBag().add(new Bulbasaur("Bulbasaur"));
			setVisible(false);
			MainManu goMain1 = new MainManu(player);
		}
	});
	
	Squirtle.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			player.getPokeBag().add(new Squirtle("Squirtle"));
			setVisible(false);
			MainManu goMain2 = new MainManu(player);
		}
	});
	
	}

}