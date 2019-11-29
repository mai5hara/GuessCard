import java.util.Scanner;
import java.util.Random;

public class GameSample {

	private static final String OPTION_EXIT = "0";
	private static final String OPTION_RED_BLACK = "1";
	private static final String OPTION_HIGH_LOW = "2";
	private static final String OPTION_DIAMONDS = "3";
	private static final int STARTING_MONEY = 100;
	
	private static Scanner scanner;
	private static Player[] players;
	private static int turn = 0;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		System.out.println("How many players?");
		int playerCount = scanner.nextInt();
		players = new Player[playerCount];
		
		for (int i = 0; i < playerCount; i++) {
			System.out.println("Player " + i + ": Please enter your name: ");
			String name = scanner.next();
			players[i] = new Player(STARTING_MONEY);
			players[i].setName(name);
		}
		
		System.out.println();
		showGameOptions();
		scanner.close();
	}
	
	private static void showGameOptions() {
		
		System.out.println("Player " + turn + ": " + players[turn].getName() + " $" + players[turn].getMoney());
		System.out.println("Which game would you like to play?");
		System.out.println("");
		System.out.println("1) Red/Black");
		System.out.println("2) High/Low");
		System.out.println("3) Diamonds");
		System.out.println("0) Exit");
		System.out.println("");
		System.out.print("Please enter a selection: ");
		
		String selectNum = scanner.next();
		
		switch(selectNum) {
		case OPTION_RED_BLACK:
			RedBlackGame redblackgame = new RedBlackGame(players, turn);
			redblackgame.playRedBlackGame();
			break;
		case OPTION_HIGH_LOW:
			HighLowGame highlowgame = new HighLowGame(players, turn);
			highlowgame.playHighLowGame();
			break;
		case OPTION_DIAMONDS:
			DiamondGame diamondgame = new DiamondGame(players, turn);
			diamondgame.playDiamondGame();			
			break;
		case OPTION_EXIT:
//			for (int i = 0; i < players.length; i++) {
//				System.out.println("Player " + i + ": " + players[i].getName() + " $" + players[i].getMoney());
//			}
			for (Player player: players) {
				System.out.println("Player: " + player.getName() + " $" + player.getMoney());
			}
			System.out.println("Exiting");
			return;
		default:
			System.out.println("Unrecognized selection. Please try again.");
			break;
		}
		
		System.out.println("");
		turn = (turn + 1) % players.length;
		showGameOptions();
	}
	
	public static void setTurn(int turn) {
		 GameSample.turn = turn;
	}
	
	public static int getTurn() {
		return turn;
	}
	
	public static void setPlayers(Player[] players, int turn) {
		GameSample.players = players;
	}
	
	public static Player[] getPlayers() {
		return players;
	}
	
	public static void setScanner(Scanner scanner) {
		GameSample.scanner = scanner;
	}
	
	public static Scanner getScanner() {
		return scanner;
	}
	
}
