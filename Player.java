
public class Player {

	private String name;
	private int money;
	
	public Player(int startingMoney) {
		money = startingMoney;
	}
	
	public void setName(String playerName) {
		name = playerName;
	}
	
	public String getName() {
		return name;
	}

	public void addMoney(int playerMoney) {
		money += playerMoney;
	}
	
	public int getMoney() {
		return money;
	}
	
}
