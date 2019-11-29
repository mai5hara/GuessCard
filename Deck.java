import java.util.Random;

public class Deck {

	private Card[] cards;
	
	public Deck() {
		cards = new Card[52];
		for (int suit = 0; suit < Card.COUNT_SUITS; suit++) {
			for (int number = 0; number < Card.COUNT_NUMBERS; number++) {
				cards[suit * Card.COUNT_NUMBERS + number] = new Card(suit, number);
			}
		}
	}
	
	public Card getRandomCard() {
		Random random = new Random();
		int randomIndex = random.nextInt(52);
		return cards[randomIndex]; 
	}
}
