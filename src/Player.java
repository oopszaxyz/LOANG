import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Player {
	private String Name;
	private int Money = 500;
	private ArrayList<Pokemon> Pokebag ;
	private ArrayList<ItemBag> Itembag ;
	private ArrayList<PokeBall> Ballbag ;
	
	public Player (String name) {
		this.Name = name;
		Pokebag = new ArrayList<Pokemon>();
		Itembag = new ArrayList<ItemBag>();
		Ballbag = new ArrayList<PokeBall>();
		ItemBag BeginItem = new ItemBag("Small Potion", 10);
		ItemBag BeginItem2 = new ItemBag("Super Potion", 5); 
		ItemBag BeginItem3 = new ItemBag("MaxHP Potion", 2); 
		Itembag.add(BeginItem);
		Itembag.add(BeginItem2);
		Itembag.add(BeginItem3);
		PokeBall BeginBall = new PokeBall("PokeBall",3);
		PokeBall BeginBall2 = new PokeBall("Ultra Ball",1);
		PokeBall BeginBall3 = new PokeBall("Master Ball",0);
		Ballbag.add(BeginBall);
		Ballbag.add(BeginBall2);
		Ballbag.add(BeginBall3);
	}
	
	public String getName() {
		return Name;
	}
		
	public int getMoney() {
		return Money;
	}
	
	public void addMoney(int Value){
		this.Money = Money +  Value;
	}
	
	public void useMoney(int Value) {
		if(Money - Value >= 0 )
			this.Money = Money - Value;
	}
	
	public void useSmallPotion() {
		Itembag.get(0).useItem(1);
	}
	
	public void useSuperPotion() {
		Itembag.get(1).useItem(1);
	}
	
	public void useMaxPotion() {
		Itembag.get(2).useItem(1);
	}
	
	public void usePokeBall() {
		Ballbag.get(0).useBall(1);
	}
	
	public void useUltraBall() {
		Ballbag.get(1).useBall(1);
	}
	
	public void useMasterBall() {
		Ballbag.get(2).useBall(1);
	}
	
	public void buySmallPotion() {
		Itembag.get(0).addItem(1);
	}
	
	public void buySuperPotion() {
		Itembag.get(1).addItem(1);
	}
	
	public void buyMaxPotion() {
		Itembag.get(2).addItem(1);
	}
	
	public void buyPokeBall() {
		Ballbag.get(0).addBall(1);
	}
	
	public void buyUltraBall() {
		Ballbag.get(1).addBall(1);
	}
	
	public void buyMasterBall() {
		Ballbag.get(2).addBall(1);
	}
	
	public ArrayList<Pokemon> getPokeBag(){
		return Pokebag;
	}
	
	public ArrayList<ItemBag> getItemBag(){
		return Itembag;
	}
	
	public ArrayList<PokeBall> getBallBag(){
		return Ballbag;
	}

	public void mainName(String name) {
		// TODO Auto-generated method stub
		this.Name = name;
	}
}

