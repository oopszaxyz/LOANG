import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BallbagGUI extends JFrame{
	private Player player;
	public BallbagGUI(Player player) {
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
        
        JButton back = new JButton();
        back.setBounds(10,10,70,70);
        background.add(back);
        back.setIcon(new ImageIcon("back.png"));

        back.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        	Allbag goback = new Allbag(player);
            setVisible(false);
        	}
        });
	}
}