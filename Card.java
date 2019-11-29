
public class Card {

	public static final int SUIT_DIAMOND = 0;
	public static final int SUIT_SPADE = 1;
	public static final int SUIT_CLUB = 2;
	public static final int SUIT_HEART = 3;
	private static final String[] DISPLAY_NUMBERS = new String[] {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	private static final String[] DISPLAY_SUITS = new String[] {"diamond", "spade", "club", "heart"};
	public static final int COUNT_NUMBERS = DISPLAY_NUMBERS.length;
	public static final int COUNT_SUITS = DISPLAY_SUITS.length;
	
	private int suit;
	private int number;
	
	public Card(int suit, int number) {
		this.suit = suit;
		this.number = number;
	}
	
	public int getSuit() {
		return suit;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getDisplayNumber() {
		return DISPLAY_NUMBERS[number];
	}
	
	public String getDisplaySuit() {
		return DISPLAY_SUITS[suit];
	}
	
	public String getDisplay() {
		return getDisplayNumber() + " of " + getDisplaySuit();
	}
	
	public boolean isSuit(int suit) {
		return this.suit == suit;
	}
	
	public boolean isDiamond() {
		return suit == SUIT_DIAMOND;
	}
	
	public boolean isHeart() {
		return suit == SUIT_HEART;
	}
	
	public boolean isSpade() {
		return suit == SUIT_SPADE;
	}
	
	public boolean isClub() {
		return suit == SUIT_CLUB;
	}
	
	public boolean isRed() {
		return isDiamond() || isHeart();
	}
	
	public boolean isBlack() {
		return isSpade() || isClub();
	}
}
