
public class HighLowGame {

	public HighLowGame(Player[] players, int turn) {
		GameSample.setPlayers(players, turn);
		GameSample.setTurn(turn);
	}
	
	public void playHighLowGame() {
		
		System.out.println("You choose 'High/Low'");
		GameSample.getPlayers()[GameSample.getTurn()].addMoney(-1);
		
		Deck deck = new Deck();
		Card card = deck.getRandomCard();
		
		System.out.println();
		System.out.println("Choose Number");
		int chooseNum = GameSample.getScanner().next();
		
		System.out.println("You Got " + card.getDisplay());
		System.out.println(chooseNum);
		
		if (chooseNum) {
			
		}
		
	}
	
}


