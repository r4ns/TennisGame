public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame(){
		
	}
	
	public TennisGame(int prvi, int drugi, boolean igra) 
	{
		player1Points = prvi;
		player2Points = drugi;
		gameEnded = igra;
	}

	public void player1Scored() throws TennisGameException 
	{
		player1Points = player1Points + 1;
	}

	public void player2Scored() throws TennisGameException 
	{
		player2Points = player2Points + 1;
	}
	
	private void checkGameEnded()
	{ 
		if(player1Points == 4 && player2Points < 3){
			gameEnded = true;
		} else if (player2Points == 4 && player1Points < 3){
			gameEnded = true;
		} else {
			gameEnded = false;
		}
	
	}

	private String getScore(int points) 
	{
		if(points == 1){
			return "15";
		} else if (points == 2){
			return "30";
		} else if (points == 3){
			return "40";
		} else if (points == 0){
			return "0";
		} else {
			return "greska";
		}
		
	}
	
	public String getScore() 
	{
		if(player1Points == 3 && player2Points == 3){
			return "Deuce";
		} else if (player1Points == 4 && player2Points == 3 && player1Points > player2Points){
			return "Advantage player1";
		} else if (player1Points == 3 && player2Points == 4 && player1Points < player2Points){
			return "Advantage player2";
		} else if ( player1Points == 4 && player2Points < 3){
			return "Game Player 1";
		} else if (player2Points == 4 && player1Points < 3){
			return "Game Player 2 ";
		} else {
			return  getScore(player1Points) + " - " + getScore(player2Points);
		}
		
		
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
