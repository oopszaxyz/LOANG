import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Details2 extends JFrame{
	private Player player;
	private ArrayList<Pokemon> Poke;
	public Details2(Player player) {
		this.player = player;
		this.Poke = player.getPokeBag();
		setSize(1360,800);
		setTitle("Details");
		setVisible(true);
		Container s = getContentPane();
        s.setLayout(null);
        
        JLabel background;
        ImageIcon img = new ImageIcon("Details.png");
        s.setLayout(new FlowLayout());
        background = new JLabel(img);
        background.setLayout(null);
        s.add(background);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        JLabel Pic = new JLabel();
        Pic.setBounds(110,100,600,600);
        
        if(Poke.get(1).getID() == 0){
            Pic.setIcon(new ImageIcon("Bulbasaur.png"));
            background.add(Pic);
        }
        else if(Poke.get(1).getID() == 1){
            Pic.setIcon(new ImageIcon("Celebi.png"));
            background.add(Pic);
        }
        else if(Poke.get(1).getID() == 2){
            Pic.setIcon(new ImageIcon("Charmander.png"));
            background.add(Pic);
        }
        else if(Poke.get(1).getID() == 3){
            Pic.setIcon(new ImageIcon("Ditto.png"));
            background.add(Pic);
        }
        else if(Poke.get(1).getID() == 4){
            Pic.setIcon(new ImageIcon("Eevee.png"));
            background.add(Pic);
        }
        else if(Poke.get(1).getID() == 5){
            Pic.setIcon(new ImageIcon("Gyarados.png"));
            background.add(Pic);
        }
        else if(Poke.get(1).getID() == 6){
            Pic.setIcon(new ImageIcon("Pickachu.png"));
            background.add(Pic);
        }
        else if(Poke.get(1).getID() == 7){
            Pic.setIcon(new ImageIcon("Raichu.png"));
            background.add(Pic);
        }
        else if(Poke.get(1).getID() == 8){
            Pic.setIcon(new ImageIcon("Snorlax.png"));
            background.add(Pic);
        }
        else if(Poke.get(1).getID() == 9){
            Pic.setIcon(new ImageIcon("Squirtle.png"));
            background.add(Pic);
        }
        
        JLabel name = new JLabel("Name : "+Poke.get(1).getName());
        name.setBounds(800,120,800,200);
        name.setFont(new Font("Serif", Font.PLAIN, 30));
        background.add(name);
        
        JLabel hp = new JLabel("HP : "+Poke.get(1).getHP());
        hp.setBounds(800,170,800,200);
        hp.setFont(new Font("Serif", Font.PLAIN, 30));
        background.add(hp);
        
        JLabel sp = new JLabel("SP : "+Poke.get(1).getSP());
        sp.setBounds(800,220,800,200);
        sp.setFont(new Font("Serif", Font.PLAIN, 30));
        background.add(sp);
        
        JLabel atk = new JLabel("ATK : "+Poke.get(1).getATK());
        atk.setBounds(800,270,800,200);
        atk.setFont(new Font("Serif", Font.PLAIN, 30));
        background.add(atk);
        
        JButton ChangeName = new JButton("Change Name");
        ChangeName.setBounds(850,420,300,70);
        ChangeName.setFont(new Font("Serif", Font.PLAIN, 30));
        background.add(ChangeName);
   
        ChangeName.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        	String newname = JOptionPane.showInputDialog(null,"Enter Your Pokemon Name","name");
        	player.getPokeBag().get(1).ChangeName(newname);
            Details2 re = new Details2(player);
            setVisible(false);
        	}
        });
        
        JButton back = new JButton();
        back.setBounds(10,10,70,70);
        background.add(back);
        back.setIcon(new ImageIcon("back.png"));

        back.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Status status = new Status(player);
            setVisible(false);
        	}
        });
	}
}
