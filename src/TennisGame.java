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
		if(!gameEnded)
			player1Points++;
		else
			throw new TennisGameException("Game already ended, player 1 can't score");
	}

	public void player2Scored() throws TennisGameException 
	{
		if(!gameEnded)
			player2Points++;
		else
			throw new TennisGameException("Game already ended, player 2 can't score");
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
		
		checkGameEnded();
		if(gameEnded)
		{
			if(player1Points >= 4 && (player1Points >= player2Points + 2))
				output = "game player1";
			else
				output = "game player2";
		}		
		else {
			if(player1Points == 0 && player2Points == 0)
				output = firstPP + " - " + secondPP;
			else if((player1Points >= 3) && (player2Points >= 3))
					{
						if(player1Points == player2Points + 1)
							output = "adventage player1";
						else if (player2Points == player1Points + 1)
							output = "adventage player2";
						else if (player1Points == player2Points)
							output = "deuce";
					}
			else
				output = firstPP + " - " + secondPP;
		}
		
		return output;
		
	}
}
