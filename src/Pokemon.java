
public abstract class Pokemon {
    private String name;
    private int hp;
    private int maxhp;
    private int sp;
    private int maxsp;
    private int atk;
    private int skill1;
    private int skill2;
    private int ID;

    public Pokemon(String Name,int HP,int SP,int ATK,int Skill1,int Skill2,int ID){
        this.name = Name;
        this.hp = HP;
        this.maxhp = HP;
        this.sp = SP;
        this.maxsp = SP;
        this.atk = ATK;
        this.skill1 = Skill1;
        this.skill2 = Skill2;
        this.ID = ID;
    }
    
    public abstract int getsID();
    public abstract void NormalHit(Pokemon Enemy);
    public abstract void useSkill1(Pokemon Enemy);
    public abstract void useSkill2(Pokemon Enemy);
    
    public String getName(){
        return name;
    }
    
    public void ChangeName(String n) {
    	this.name = n;
    }

    public int getHP(){
        return hp;
    }

    public int getSP(){
        return sp;
    }

    public int getATK(){
        return atk;
    }
    public int getSKILL1(){
        return skill1;
    }
    
    public int getMaxHP(){
        return maxhp;
    }
    
    public int getMaxSP(){
        return maxsp;
    }
    
    public void SpUp(int Value) {
    	this.sp = sp + Value;
    }
    
    public void HpUp(int Value) {
    	this.hp = hp + Value;
    }
    
    public void AtkUp(int Value) {
    	this.atk = atk + Value;
    }
    
    public void HealHP(int heal){
        this.hp += heal;
        if(this.hp >= maxhp){
            this.hp = maxhp;
        }
    }
    
    public int getID() {
    	return this.ID;
    }
    
    public void HealSP(int heal){
        this.sp += heal;
        if(this.sp >= maxsp){
            this.sp = maxsp;
        }
    }
    
    public void useSpSkill1() {
    	if(sp >= 5)
    		this.sp = sp - 5;
    	else
    		System.out.println("Can't use No SP");
    }
    
    public void useSpSkill2() {
    	if(sp >= 10)
    		this.sp = sp - 10;
    	else
    		System.out.println("Can't use No SP");
    }
    
    public void onHit(int damage){
    	this.hp = hp - damage;
    }
}