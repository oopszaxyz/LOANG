
public class Celebi extends Pokemon{
	private int id = 1;
	public Celebi(String name) {
		super(name, 100, 25, 10, 15, 20, 1);
		// TODO Auto-generated constructor stub
	}
	
	public int getsID() {
		return this.id;
	}
	
	public void NormalHit(Pokemon Enemy) {
		System.out.println(this.getName()+" is Hiting "+ Enemy.getName());
		Enemy.onHit(15);
	}

	public void useSkill1(Pokemon Enemy) {
		System.out.println(this.getName()+" is Using Skill 1 To "+ Enemy.getName());
		Enemy.onHit(25);
		this.useSpSkill1();
	}
	
	public void useSkill2(Pokemon Enemy) {
		System.out.println(this.getName()+" is Using Skill 2 To "+ Enemy.getName());
		Enemy.onHit(30);
		this.useSpSkill2();
	}
}
