public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	private String result;
	
	public TennisGame(int player1Points, int player2Points, boolean gameEnded) 
	{
		this.player1Points = player1Points;
		this.player2Points = player2Points;
		this.gameEnded = gameEnded;
	}

	public void player1Scored() throws TennisGameException 
	{
		if (player1Points == 0) {
			player1Points = 15;
		} else if (player1Points == 15) {
			player1Points = 30;			
		} else if (player1Points == 30) {
			player1Points = 40;
		} else if (player1Points == 40 && player1Points > player2Points) {
			gameEnded = true;
		} else if (player1Points == 40 && player2Points == 40) {
			result = "deuce";
		}
	}

	public void player2Scored() throws TennisGameException 
	{
		if (player2Points == 0) {
			player2Points = 15;
		} else if (player2Points == 15) {
			player2Points = 30;
		} else if(player2Points == 30) {
			player2Points = 40;
		} else if (player2Points == 40 && player2Points > player1Points) {
			gameEnded = true;
		} else if (player2Points == 40 && player1Points == 40) {
			result = "deuce";
		}
	}
	
	private void checkGameEnded()
	{ 
		// TO BE IMPLEMENTED
	}

	private String getScore(int points) 
	{
		if (points == 0) {
			return "0";
		} else if (points == 15) {
			return "15";
		} else if (points == 30) {
			return "30";
		} else if (points == 40) {
			return "40";
		} else {
			return "";
		}
	}
	
	public String getScore() 
	{
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
		
		return getScore(player1Points) + " - " + getScore(player2Points);
				
	}
				
	public int getPlayer1Points() {
		return player1Points;
	}

	public int getPlayer2Points() {
		return player2Points;
	}

	public boolean isGameEnded() {
		return gameEnded;
	}

	public void setPlayer1Points(int player1Points) {
		this.player1Points = player1Points;
	}

	public void setPlayer2Points(int player2Points) {
		this.player2Points = player2Points;
	}

	public void setGameEnded(boolean gameEnded) {
		this.gameEnded = gameEnded;
	}
}
