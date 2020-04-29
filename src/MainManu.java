import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainManu extends JFrame{
	private Player player; 
	public MainManu(Player player) {
		this.player = player;
		setSize(1360,800);
		setTitle("MainManu");
		setVisible(true);
		Container s = getContentPane();
        s.setLayout(null);
        
        JLabel background;
        ImageIcon img = new ImageIcon("MainManuBG.png");
        s.setLayout(new FlowLayout());
        background = new JLabel(img);
        background.setLayout(null);
        s.add(background);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        
        JButton AllBag = new JButton();
        AllBag.setBounds(200, 280, 428, 171);
        AllBag.setBackground(null);
        AllBag.setIcon(new ImageIcon("Allbag.png"));
        
        JButton Status = new JButton();
        Status.setBounds(200, 480, 428, 171);
        Status.setBackground(null);
        Status.setIcon(new ImageIcon("Status.png"));
        
        JButton Shop = new JButton();
        Shop.setBounds(900, 280, 428, 171);
        Shop.setBackground(null);
        Shop.setIcon(new ImageIcon("Shop.png"));
        
        JButton CatchButt = new JButton();
        CatchButt.setBounds(900, 480, 428, 171);
        CatchButt.setBackground(null);
        CatchButt.setIcon(new ImageIcon("CatchButt.png"));
        
        
        background.add(AllBag);
        background.add(Status);
        background.add(Shop);
        background.add(CatchButt);
        
        
        AllBag.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        		Allbag bag = new Allbag(player);
        	}
        });
        
        Status.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        		Status status = new Status(player);
        	}
        });
        
        Shop.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        		Shop shop = new Shop(player);
        	}
        });
        
        CatchButt.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        		Catch catch1 = new Catch(player);
        	}
        });
        
        JLabel playname = new JLabel("Player:  "+player.getName());
        playname.setBounds(60,45,500,100);
        playname.setFont(new Font("Serif", Font.BOLD, 30));
        background.add(playname);
	}
}
