public class ItemBag {
	private String ItemName;
	private int Value;
	
	public ItemBag(String name, int value) {
		this.ItemName = name;
		this.Value = value;
	}
	
	public String getItemName() {
		return ItemName;
	}
	
	public int getValue() {
		return Value;
	}
	
	public void useItem(int use) {
		if(Value - use >= 0)
			this.Value = Value - use;
	}
	
	public void addItem(int add) {
		this.Value = Value + add;
	}
}
