import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Allbag extends JFrame{
	private Player player;
	public Allbag(Player player) {
		this.player = player;
		setSize(1360,800);
		setTitle("BAG");
		setVisible(true);
		Container s = getContentPane();
        s.setLayout(null);
        
        JLabel background;
        ImageIcon img = new ImageIcon("BagBG.png");
        s.setLayout(new FlowLayout());
        background = new JLabel(img);
        background.setLayout(null);
        s.add(background);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        
        JButton ItemBag = new JButton();
        ItemBag.setBounds(200, 400, 428, 171);
        ItemBag.setBackground(null);
        ItemBag.setIcon(new ImageIcon("Potionbag.png"));
        background.add(ItemBag);

        ItemBag.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        		ItembagGUI itembag = new ItembagGUI(player);
        	}
        });
        
        JButton BallBag = new JButton();
        BallBag.setBounds(900, 400, 428, 171);
        BallBag.setBackground(null);
        BallBag.setIcon(new ImageIcon("Ballbag.png"));
        background.add(BallBag);

        BallBag.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        		BallbagGUI ballbag = new BallbagGUI(player);
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
