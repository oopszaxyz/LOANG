public class PokeBall {
	private String BallName;
	private int Value;
	
	public PokeBall (String name, int value) {
		this.BallName = name;
		this.Value = value;
	}
	
	public String getBallName() {
		return BallName;
	}
	
	public int getValue() {
		return Value;
	}
	
	public void useBall(int use) {
		if(Value - use >= 0) 
			this.Value = Value - use;
	}
	
	public void addBall(int add) {
		this.Value = Value + add;
	}
}
