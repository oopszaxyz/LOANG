public class YourPoke extends Pokemon{
    public String PokeName = "";
	public int Level = 0;
    public int HP = 0;
    public int SP = 0;
    public int Atk = 0;
    public int Def = 0;
    public int Skill = 0;

    public YourPoke (String PN,int L,int Hp,int Sp,int atk,int def,int skill){
    this.PokeName = PN;
	this.Level = L;
    this.HP = Hp;
    this.SP = Sp;
    this.Atk = atk;
    this.Def = def;
    this.Skill = skill;
    }
}
