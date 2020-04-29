import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CatchDitto extends JFrame{
	private Player player;
	public CatchDitto(Player player) {
		this.player = player;
		setSize(1360,800);
		setTitle("BAG");
		setVisible(true);
		Container s = getContentPane();
        s.setLayout(null);
        
        JLabel background;
        ImageIcon img = new ImageIcon("BallBG.png");
        s.setLayout(new FlowLayout());
        background = new JLabel(img);
        background.setLayout(null);
        s.add(background);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        
        JLabel Pokeball = new JLabel("Poke Ball : "+player.getBallBag().get(0).getValue());
        Pokeball.setBounds(650,170,300,300);
        Pokeball.setFont(new Font("Serif", Font.PLAIN, 30));
        background.add(Pokeball);
        
        JLabel Ultraball = new JLabel("Ultra Ball : "+player.getBallBag().get(1).getValue());
        Ultraball.setBounds(650,310,300,300);
        Ultraball.setFont(new Font("Serif", Font.PLAIN, 30));
        background.add(Ultraball);
        
        JLabel Masterball = new JLabel("Master Ball : "+player.getBallBag().get(2).getValue());
        Masterball.setBounds(650,450,300,300);
        Masterball.setFont(new Font("Serif", Font.PLAIN, 30));
        background.add(Masterball);
        
        JButton usePokeBall = new JButton("USE");
        usePokeBall.setBounds(910, 295, 100, 50);
        usePokeBall.setFont(new Font("Serif", Font.PLAIN, 30));
        background.add(usePokeBall);
        
        JButton useUltra = new JButton("USE");
        useUltra.setBounds(910, 435, 100, 50);
        useUltra.setFont(new Font("Serif", Font.PLAIN, 30));
        background.add(useUltra);
        
        JButton useMaster = new JButton("USE");
        useMaster.setBounds(910, 575, 100, 50);
        useMaster.setFont(new Font("Serif", Font.PLAIN, 30));
        background.add(useMaster);
        
        usePokeBall.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(player.getBallBag().get(0).getValue() > 0){
        			player.usePokeBall();
        			int gotit = 1;
        			int random = (int)(Math.random()*3) + 1 ; 
        			if(gotit == random) {
        				player.getPokeBag().add(new Ditto("Wild Ditto"));
        				setVisible(false);
        				JOptionPane.showMessageDialog(background,"Congrat ,You got it !!!.");
        				player.addMoney(300);
        			}
        		}
        		setVisible(false);
        		CatchDitto ree = new CatchDitto(player);
        	}
        });
        
        useUltra.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(player.getBallBag().get(1).getValue() > 0){
        			player.useUltraBall();
        			int gotit = 2;
        			int random = (int)(Math.random()*2) + 1 ; 
        			if(gotit == random) {
        				player.getPokeBag().add(new Ditto("Wild Ditto"));
        				setVisible(false);
        				JOptionPane.showMessageDialog(background,"Congrat ,You got it !!!.");
        				player.addMoney(300);
        			}
        		}
        		setVisible(false);
        		CatchDitto ree = new CatchDitto(player);
        	}
        });
        
        useMaster.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(player.getBallBag().get(2).getValue() > 0){
        			player.useMasterBall();
        			int gotit = 1;
        			int random = 1 ; 
        			if(gotit == random) {
        				player.getPokeBag().add(new Ditto("Wild Ditto"));
        				setVisible(false);
        				JOptionPane.showMessageDialog(background,"Congrat ,You got it !!!.");
        				player.addMoney(300);
        			}
        		}
        		setVisible(false);
        		CatchDitto ree = new CatchDitto(player);
        	}
        });
        
        JButton back = new JButton();
        back.setBounds(10,10,70,70);
        background.add(back);
        back.setIcon(new ImageIcon("back.png"));

        back.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        	Catch goback = new Catch(player);
            setVisible(false);
        	}
        });
	}
}