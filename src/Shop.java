import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Shop extends JFrame{
	private Player player;
	public Shop(Player player) {
		this.player = player;
		setSize(1360,800);
		setTitle("SHOP");
		setVisible(true);
		Container s = getContentPane();
        s.setLayout(null);
        
        JLabel background;
        ImageIcon img = new ImageIcon("ShopBG.png");
        s.setLayout(new FlowLayout());
        background = new JLabel(img);
        background.setLayout(null);
        s.add(background);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        
        
        JButton buySmallPo = new JButton("$100 Small Potion : "+player.getItemBag().get(0).getValue());
        buySmallPo.setBounds(300,350,200,70);
        background.add(buySmallPo);
        
        JButton buySuperPo = new JButton("$150 Super Potion : "+player.getItemBag().get(1).getValue());
        buySuperPo.setBounds(300,500,200,70);
        background.add(buySuperPo);
        
        JButton buyMaxPo = new JButton("$200 Max Potion : "+player.getItemBag().get(2).getValue());
        buyMaxPo.setBounds(300,650,200,70);
        background.add(buyMaxPo);
        
        JButton buyPokeball = new JButton("$200 Poke Ball : "+player.getBallBag().get(0).getValue());
        buyPokeball.setBounds(1100,350,200,70);
        background.add(buyPokeball);
        
        JButton buyUltraball = new JButton("$350 Ultra Ball : "+player.getBallBag().get(1).getValue());
        buyUltraball.setBounds(1100,500,200,70);
        background.add(buyUltraball);
        
        JButton buyMasterball = new JButton("$450 Master Ball : "+player.getBallBag().get(2).getValue());
        buyMasterball.setBounds(1100,650,200,70);
        background.add(buyMasterball);
        
        buySmallPo.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		if(player.getMoney() >= 100) {
        			player.buySmallPotion();
        			player.useMoney(100);
        			setVisible(false);
            		Shop shop = new Shop(player);
        		}
        	}
        });
        
        buySuperPo.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		if(player.getMoney() >= 150) {
        			player.buySuperPotion();
        			player.useMoney(150);
        			setVisible(false);
            		Shop shop = new Shop(player);
        		}
        	}
        });
        
        buyMaxPo.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		if(player.getMoney() >= 200) {
        			player.buyMaxPotion();
        			player.useMoney(200);
        			setVisible(false);
            		Shop shop = new Shop(player);
        		}
        	}
        });
        
        buyPokeball.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		if(player.getMoney() >= 200) {
        			player.buyPokeBall();
        			player.useMoney(200);
        			setVisible(false);
            		Shop shop = new Shop(player);
        		}
        	}
        });
        
        buyUltraball.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		if(player.getMoney() >= 350) {
        			player.buyUltraBall();
        			player.useMoney(350);
        			setVisible(false);
            		Shop shop = new Shop(player);
        		}
        		
        	}
        });
        
        buyMasterball.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		if(player.getMoney() >= 450) {
        			player.buyMasterBall();
        			player.useMoney(450);
        			setVisible(false);
            		Shop shop = new Shop(player);
        		}
        	}
        });
        
        JLabel money = new JLabel("Money : "+player.getMoney());
        money.setBounds(1320,9,300,100);
        money.setFont(new Font("Serif", Font.PLAIN, 30));
        background.add(money);
        
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