public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		this.gameEnded = false;
	}
	
	public TennisGame(int player1Points, int player2Points) {
		this.player1Points = player1Points;
		this.player2Points = player2Points;
		this.gameEnded = false;
	}

	public void player1Scored() throws TennisGameException 
	{
		if(this.gameEnded == true) {
			throw new TennisGameException();
		}
		else
			this.player1Points++;
		this.checkGameEnded();
	}

	public void player2Scored() throws TennisGameException 
	{
		if(this.gameEnded == true) {
			throw new TennisGameException();
		}
		else
			this.player2Points++;
		this.checkGameEnded();
	}
	
	private void checkGameEnded()
	{ 
		if ((this.player1Points == 4 && this.player2Points <= 2)
				|| (this.player1Points <= 2 && this.player2Points == 4)) {
			this.gameEnded = true;
		}
		else if ((this.player1Points == this.player2Points+2) || (this.player2Points == this.player1Points+2)) {
			this.gameEnded = true;
		}
		else {
			this.gameEnded = false;
		}
	}

	private String getScore(int points) 
	{
		if (points == 0) {
			return "0";
		}
		else if (points == 1) {
			return "15";
		}
		else if (points == 2) {
			return "30";
		}
		else if (points == 3) {
			return "40";
		}
		else {
			return "advantage";
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
		
		if (this.player1Points >= 4 && this.player2Points <= this.player1Points-2) {
			return "game player1";
		}
		else if (this.player2Points >= 4 && this.player1Points <= this.player2Points-2) {
			return "game player2";
		}
		else if (this.player1Points < 3 || this.player2Points < 3) {
			return this.getScore(player1Points) +  " - " + this.getScore(player2Points);
		}
		else if (this.player1Points == 3 && this.player2Points == 3) {
			return "deuce";
		}
		else if ((this.player1Points == 4 && this.player2Points < 4)) {
			return this.getScore(player1Points) + " player1";
		}
		else if ((this.player2Points == 4 && this.player1Points < 4)) {
			return this.getScore(player2Points) + " player2";
		}
		
		return "";
	}
}
