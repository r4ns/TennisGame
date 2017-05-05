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
    	if((player1Points >= 4 && player1Points >= player2Points + 2) || (player2Points >= 4 && player2Points >= player1Points + 2))
    		gameEnded = true;
	}

	private String getScore(int points) 
	{
		String convPoints = "";
		switch(points)
		{
		case 0: convPoints = "0";
		break;
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
		String firstPP = getScore(player1Points);
		String secondPP = getScore(player2Points);
		String output = "";
		
		if(player1Points == 0 && player2Points == 0)
			output = firstPP + " - " + secondPP;
		if(player1Points >= 4 && (player1Points >= player2Points + 2))
			output = firstPP + " - " + secondPP;
		
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
	}
}
