import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ItembagGUI extends JFrame{
	private Player player;
	public ItembagGUI(Player player) {
		this.player = player;
		setSize(1360,800);
		setTitle("BAG");
		setVisible(true);
		Container s = getContentPane();
        s.setLayout(null);
        
        JLabel background;
        ImageIcon img = new ImageIcon("PotionBG.png");
        s.setLayout(new FlowLayout());
        background = new JLabel(img);
        background.setLayout(null);
        s.add(background);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        
        JLabel SmallPotion = new JLabel("Small Potion : "+player.getItemBag().get(0).getValue());
        SmallPotion.setBounds(650,170,300,300);
        SmallPotion.setFont(new Font("Serif", Font.PLAIN, 30));
        background.add(SmallPotion);
        
        JLabel SuperPotion = new JLabel("Super Potion : "+player.getItemBag().get(1).getValue());
        SuperPotion.setBounds(650,310,300,300);
        SuperPotion.setFont(new Font("Serif", Font.PLAIN, 30));
        background.add(SuperPotion);
        
        JLabel MaxPotion = new JLabel("Max Potion : "+player.getItemBag().get(2).getValue());
        MaxPotion.setBounds(650,450,300,300);
        MaxPotion.setFont(new Font("Serif", Font.PLAIN, 30));
        background.add(MaxPotion);
        
        JButton FeedSmall = new JButton("Feed");
        FeedSmall.setBounds(910, 295, 100, 50);
        FeedSmall.setFont(new Font("Serif", Font.PLAIN, 30));
        background.add(FeedSmall);
        
        JButton FeedSuper = new JButton("Feed");
        FeedSuper.setBounds(910, 435, 100, 50);
        FeedSuper.setFont(new Font("Serif", Font.PLAIN, 30));
        background.add(FeedSuper);
        
        JButton FeedMax = new JButton("Feed");
        FeedMax.setBounds(910, 575, 100, 50);
        FeedMax.setFont(new Font("Serif", Font.PLAIN, 30));
        background.add(FeedMax);
        
        FeedSmall.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(player.getItemBag().get(0).getValue() > 0){
        			player.useSmallPotion();
        			setVisible(false);
        			FeedSmall feed = new FeedSmall(player);
        		}
        	}
        });
        
        FeedSuper.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(player.getItemBag().get(1).getValue() > 0){
        			player.useSuperPotion();
        			setVisible(false);
        			FeedSuper feed = new FeedSuper(player);
        		}
        	}
        });
        
        FeedMax.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(player.getItemBag().get(2).getValue() > 0){
        			player.useMaxPotion();
        			setVisible(false);
        			FeedMax feed = new FeedMax(player);
        		}
        	}
        });
        
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