package bilting;

public class Main {

	public static void main(String[] args) {
		
		
		UI ui = new SimpleWindow("GuessingGame");	
		GuessingGame game = new GuessingGame(Config.RANGE);
		GuessingGameController controller = new GuessingGameController(ui,game);
		controller.playGame();
	}

}
