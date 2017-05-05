public class TennisGame {
	private int player1Points;
	private int player2Points;
	private boolean gameEnded, gameEnded1 = false, gameEnded2 = false;

	public TennisGame() {
		this.player1Points = 0;
		this.player2Points = 0;
		this.gameEnded = false;
	}

	public void player1Scored() throws TennisGameException {
		
		if(player1Points == 3 && player2Points == 4)
			player2Points -= 1;
		else if(player1Points == 3 && player2Points == 3)
			player1Points += 1;
		else if(player1Points == 4 && player2Points == 3){
			gameEnded1 = true;
			checkGameEnded();
		}
		else if(player1Points == 3 && player2Points <= 2){
			gameEnded1 = true;
			checkGameEnded();
		}
		else
			player1Points += 1;
	}

	public void player2Scored() throws TennisGameException {
		
		if(player2Points == 3 && player1Points == 4)
			player1Points -= 1;
		else if(player2Points == 3 && player1Points == 3)
			player2Points += 1;
		else if(player2Points == 4 && player1Points == 3){
			gameEnded2 = true;
			checkGameEnded();
		}
		else if(player2Points == 3 && player1Points <= 2){
			gameEnded2 = true;
			checkGameEnded();
		}
		else
			player2Points += 1;
	}

	private void checkGameEnded() {
		gameEnded = true;
	}

	private String getScore(int points) {
		
		if(points == 1)
			return "15";
		else if(points == 2)
			return "30";
		else if(points == 3)
			return "40";
		
		return "0";
	}

	public String getScore() {
		
		if(player1Points == 3 && player2Points == 3)
			return "deuce";
		
		if(player1Points == 4 && player2Points == 3)
			return "advantage player1";
		else if(player1Points == 3 && player2Points == 4)
			return "advantage player2";
		
		if(gameEnded1)
			return "game player1";
		else if(gameEnded2)
			return "game player2";
		
		return getScore(player1Points) + " - " + getScore(player2Points);
		
		// Scores format: "player1Score - player2Score"
		// "0 - 0"
		// "15 - 15"
		// "30 - 30"
		// "deuce"
		// "15 - 0", "0 - 15"
		// "30 - 0", "0 - 30"
		// "40 - 0", "0 - 40"
		// "30 - 15", "15 - 30"
		// "40 - 15", "15 - 40"
		// "advantage player1"
		// "advantage player2"
		// "game player1"
		// "game player2"

		// TO BE IMPLEMENTED
	}
}
