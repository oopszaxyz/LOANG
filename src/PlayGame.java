import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlayGame extends JFrame{
    private Player player;

    public PlayGame(){
        super("Welcome To Pokemon World !!");
        player = new Player("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1360, 800);
        setVisible(true);
        Container s = getContentPane();
        
        JLabel background;
        ImageIcon img = new ImageIcon("StartBackGround.png");
        s.setLayout(new FlowLayout());
        background = new JLabel(img);
        background.setLayout(null);
        
        s.add(background);
        pack();

        JButton StartBott = new JButton();
        StartBott.setBounds(590, 430, 198, 50);
        StartBott.setSize(450, 100);
        getContentPane();
        background.add(StartBott);
        StartBott.setIcon(new ImageIcon("StartBott.png"));
        StartBott.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String name = JOptionPane.showInputDialog(null,"Enter Your Name","Player1");   
                setVisible(false);
                player.mainName(name);
                SelectPoke PickPoke = new SelectPoke(player);
            }
        });
        }
    
    public static void main(String[] args){
        PlayGame NewGame = new PlayGame();
    }
}