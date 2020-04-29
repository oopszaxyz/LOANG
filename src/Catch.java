import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Catch extends JFrame{
	private Player player;
	
	public Catch(Player player) {
		this.player = player;
		setSize(1360,800);
		setTitle("CATCH POKEMON");
		setVisible(true);
		Container s = getContentPane();
        s.setLayout(null);
        
        JLabel background;
        ImageIcon img = new ImageIcon("CatchBG.png");
        s.setLayout(new FlowLayout());
        background = new JLabel(img);
        background.setLayout(null);
        s.add(background);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        
        
        JButton celebi = new JButton("CATCH");
        celebi.setBounds(120,310,150,50);
        celebi.setFont(new Font("Serif", Font.PLAIN, 20));
        background.add(celebi);
        
        celebi.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                CatchCelebi pick = new CatchCelebi(player);
                setVisible(false);
            }
        });
        
        JButton ditto = new JButton("CATCH");
        ditto.setBounds(410,310,150,50);
        ditto.setFont(new Font("Serif", Font.PLAIN, 20));
        background.add(ditto);
        
        ditto.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                CatchDitto pick = new CatchDitto(player);
                setVisible(false);
            }
        });
        
        JButton eevee = new JButton("CATCH");
        eevee.setBounds(670,310,150,50);
        eevee.setFont(new Font("Serif", Font.PLAIN, 20));
        background.add(eevee);
        
        eevee.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                CatchEevee pick = new CatchEevee(player);
                setVisible(false);
            }
        });
        
        JButton snorlax = new JButton("CATCH");
        snorlax.setBounds(940,310,150,50);
        snorlax.setFont(new Font("Serif", Font.PLAIN, 20));
        background.add(snorlax);
        
        snorlax.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                CatchSnorlax pick = new CatchSnorlax(player);
                setVisible(false);
            }
        });
        
        JButton squir = new JButton("CATCH");
        squir.setBounds(1260,310,150,50);
        squir.setFont(new Font("Serif", Font.PLAIN, 20));
        background.add(squir);
        
        squir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                CatchSquirtle pick = new CatchSquirtle(player);
                setVisible(false);
            }
        });
        
        JButton bulba = new JButton("CATCH");
        bulba.setBounds(120,650,150,50);
        bulba.setFont(new Font("Serif", Font.PLAIN, 20));
        background.add(bulba);
        
        bulba.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                CatchBulbasaur pick = new CatchBulbasaur(player);
                setVisible(false);
            }
        });
        
        JButton gyara = new JButton("CATCH");
        gyara.setBounds(410,650,150,50);
        gyara.setFont(new Font("Serif", Font.PLAIN, 20));
        background.add(gyara);
        
        gyara.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                CatchGyarados pick = new CatchGyarados(player);
                setVisible(false);
            }
        });
        
        JButton chaman = new JButton("CATCH");
        chaman.setBounds(670,650,150,50);
        chaman.setFont(new Font("Serif", Font.PLAIN, 20));
        background.add(chaman);
        
        chaman.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                CatchCharmander pick = new CatchCharmander(player);
                setVisible(false);
            }
        });
        
        JButton picka = new JButton("CATCH");
        picka.setBounds(940,650,150,50);
        picka.setFont(new Font("Serif", Font.PLAIN, 20));
        background.add(picka);
        
        picka.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                CatchPickachu pick = new CatchPickachu(player);
                setVisible(false);
            }
        });

        JButton raichu = new JButton("CATCH");
        raichu.setBounds(1260,650,150,50);
        raichu.setFont(new Font("Serif", Font.PLAIN, 20));
        background.add(raichu);
        
        raichu.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                CatchRaichu pick = new CatchRaichu(player);
                setVisible(false);
            }
        });
        
        JButton back = new JButton();
        back.setBounds(10,10,70,70);
        background.add(back);
        back.setIcon(new ImageIcon("back.png"));

        back.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            MainManu main = new MainManu(player);
            setVisible(false);
        	}
        });
        
	}
}