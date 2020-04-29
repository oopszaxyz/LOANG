import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FeedSmall extends JFrame{
	private Player player;
	public FeedSmall(Player player) {
		this.player = player;
		setSize(1360,800);
		setTitle("Status");
		setVisible(true);
		Container s = getContentPane();
        s.setLayout(null);
        
        JLabel background;
        ImageIcon img = new ImageIcon("FeedBG.png");
        s.setLayout(new FlowLayout());
        background = new JLabel(img);
        background.setLayout(null);
        s.add(background);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
       
        
        JButton butt[] = {new JButton(),new JButton(),new JButton(),new JButton()};
        int i=0,y=50;
        for(Pokemon loop:player.getPokeBag()){
        	butt[i].setText(" " + loop.getName());
            butt[i].setBounds(600 , y , 400 , 55);
            butt[i].setFont(new Font("Serif", Font.PLAIN, 30));
            y+=100;
            background.add(butt[i]);
            i++;
        }
        
        butt[0].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				player.getPokeBag().get(0).AtkUp(1);
				player.getPokeBag().get(0).HpUp(1);
				setVisible(false);
				ItembagGUI re0 = new ItembagGUI(player);
				
			}
        });
        
        butt[1].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				player.getPokeBag().get(1).AtkUp(1);
				player.getPokeBag().get(1).HpUp(1);
				setVisible(false);
				ItembagGUI re1 = new ItembagGUI(player);
				
			}
        });
        
        butt[2].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				player.getPokeBag().get(2).AtkUp(1);
				player.getPokeBag().get(2).HpUp(1);
				setVisible(false);
				ItembagGUI re2 = new ItembagGUI(player);
				
			}
        });
        
        butt[3].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				player.getPokeBag().get(3).AtkUp(1);
				player.getPokeBag().get(3).HpUp(1);
				setVisible(false);
				ItembagGUI re3 = new ItembagGUI(player);
				
			}
        });
        
                
        JButton back = new JButton();
        back.setBounds(10,10,70,70);
        background.add(back);
        back.setIcon(new ImageIcon("back.png"));

        back.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            ItembagGUI goback = new ItembagGUI(player);
            setVisible(false);
        	}
        });
	}
	
	
}
