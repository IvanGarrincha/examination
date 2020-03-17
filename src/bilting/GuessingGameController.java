package bilting;

public class GuessingGameController {
	
	private GuessingGame game;
	private UI ui;
	
	
	public GuessingGameController(UI ui, GuessingGame game) {
		this.ui = ui;
		this.game = game;
	}

	public void playGame() {
		String input = "yes";
		while (!input.equals("no")) {
			ui.addString("New game, range is 1 to " + game.getRange() + "\n");
			ui.addString("Start guessing\n");
			GuessResult result = null;
			while (result != GuessResult.correct) {
				int guess = ui.getInt();
				result = game.makeGuess(guess);
				ui.addString(guess + " is " + result + "\n");
			}
			ui.addString("You did it in " + game.getNumberOfGuesses() + " guesses\n");
			ui.addString("Another game?\n");	
			input = ui.getString();
			game.newGame();
			
		}
		ui.exit();
		
	}

}
