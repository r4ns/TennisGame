public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		player1Points = 0;
		player2Points = 0;
		gameEnded = false;
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
    	
	}

	private String getScore(int points) 
	{
		String convPoints = "";
		switch(points)
		{
		case 1: convPoints = "15";
		break;
		case 2: convPoints = "30";
		break;
		case 3: convPoints = "40";
		break;
		}
		return convPoints;
	}
	
	public String getScore() 
	{
		String output = "";
		if(player1Points >= 4)
		{
			if(player1Points >= player2Points + 2)
				return "game player1";
			
			else if(player1Points == player2Points + 1)
				return "advetage player1";
			
			else return "deuce";
		}
		else
		{
			if(player1Points == player2Points)
				return "deuce";
			else
				return getScore(player1Points) +
		}
		
		return output;
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
