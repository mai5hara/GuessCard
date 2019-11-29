
public class RedBlackGame {
	
	public RedBlackGame(Player[] players, int turn) {
		GameSample.setPlayers(players, turn);
		GameSample.setTurn(turn);
	}

	public void playRedBlackGame() {
		
		System.out.println("You choose 'Red/Black'");
		
		//add money -1
		GameSample.getPlayers()[GameSample.getTurn()].addMoney(-1);
		
		//System out instructions
		System.out.println();
		System.out.println("Choose Black or Red");
		String chooseColor = GameSample.getScanner().next();
		
		//create deck and get a card
		Deck deck = new Deck();
		Card card = deck.getRandomCard();
		System.out.println("You Got " + card.getDisplay());
		
		//check if card matches r or b option - card.isBlack(), card.isRed()
		//if winner, add money
		System.out.println(chooseColor);
		
		if ("Red".equals(chooseColor)) {
			if (card.isRed()) {
				System.out.println("You win!");
				GameSample.getPlayers()[GameSample.getTurn()].addMoney(2);
			} else {
				System.out.println("You lost.");
			}
		} else if ("Black".contentEquals(chooseColor)) {
			if (card.isBlack()) {
				System.out.println("You win!");
				GameSample.getPlayers()[GameSample.getTurn()].addMoney(2);
			} else {
				System.out.println("You lost.");
			}
		}
	}
}
