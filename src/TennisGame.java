public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame(){
		
	}
	
	public TennisGame(int player1, int player2, boolean endGame) 
	{
		player1 = this.player1Points;
		player2 = this.player2Points;
		endGame = this.gameEnded;
	}

	public void player1Scored() throws TennisGameException 
	{
		player1Points++;
	}

	public void player2Scored() throws TennisGameException 
	{
		player2Points++;
	}
	
	private void checkGameEnded()
	{ 
		if((player1Points == 4) && (player2Points < 3)){
			gameEnded = true;
		}else if((player1Points == 4) && (player2Points < 3)){
			gameEnded = true;
		}else if((player1Points == 4) && (player2Points == 4) && (player1Points > player2Points)){
			gameEnded = true;
		}else if((player1Points == 4) && (player2Points == 4) && (player2Points > player1Points)){
			gameEnded = true;
		}else
			gameEnded = false;
	}

	private String getScore(int points) 
	{
		if(points == 1)
		return "15";
		else if(points == 2)
			return "30";
		else if(points == 3)
			return "40";
		else if(points == 0)
			return "0";
		else
			return "Greska!";
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

		// TO BE IMPLEMENTED
		if((player1Points == 0) && (player2Points == 0))
			return "0 - 0";
		if((player1Points == 15) && (player2Points == 15))
			return "15 - 15";
		else if((player1Points == 3) &&(player2Points == 3))
		return "duece";
		else if((player1Points == 4) && (player2Points == 3) && (player1Points > player2Points))
			return "advantage player1";
		else if((player1Points == 3) && (player2Points == 4) && (player2Points > player1Points))
			return "advantage player2";
		else if((player1Points == 4) && (player2Points < 3))
			return "game player1";
		else if((player2Points == 4) && (player1Points < 3))
			return "game player2";
		else
			return getScore(player1Points) + " - " + getScore(player2Points);
		
		
	}
}
