public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame()
	{
		
	}
	
	public TennisGame(int player1Points, int player2Points) 
	{
		this.player1Points = player1Points;
		this.player2Points = player2Points;
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
		if(player1Points > player2Points )
			gameEnded = true;
		else 
			gameEnded = false;
	}

	private String getScore(int points) 
	{
		if(points == 0)
			return "0";
		else if(points == 1)
			return "15";
		else if(points == 2)
			return "30";
		else if(points == 3)
			return "40";
		else
			return points + "";

		
	}
	
	public String getScore() 
	{
		String score;
		score = getScore(player1Points) + " ," + getScore(player2Points);
		if(player1Points == 3 && player2Points == 3)
			score= "Rezultat deuce";
		if(score == "Rezultat deuce")
		{
			if(player1Points == 4)
				score = "Rezultat: advantage igrac1";
			else if(player2Points == 4)
				score = "Rezultat: advantage igrac2";
		}
		if(gameEnded == true)
		{
			if(player1Points == 4 )
				score = "Rezultat: pobedjuje igrac1";
			else if(player2Points == 4)
				score = "Rezultat: pobedjuje igrac2";
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
		return "";
	}
	
	
}
