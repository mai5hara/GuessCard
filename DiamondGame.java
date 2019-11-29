
public class DiamondGame {
	
	
	public DiamondGame(Player[] players, int turn) {
		GameSample.setPlayers(players, turn);
		GameSample.setTurn(turn);
	}

	public void playDiamondGame() {
		
		System.out.println("You choose 'Diamonds'");
		GameSample.getPlayers()[GameSample.getTurn()].addMoney(-1);
		
		Deck deck = new Deck();
		Card card = deck.getRandomCard();

		System.out.println("You got " + card.getDisplay());

//		if (card.isSuit(Card.SUIT_DIAMOND)) {
//		if (card.getSuit() == Card.SUIT_DIAMOND) {
		if (card.isDiamond()) {
			System.out.println("You win!");
			GameSample.getPlayers()[GameSample.getTurn()].addMoney(4);
		} else {
			System.out.println("You lost");
		}
	}
	
}
