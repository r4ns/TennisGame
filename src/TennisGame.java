public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	private int whoWin = 0;
	
	public TennisGame() 
	{
		// TO BE IMPLEMENTED
		player1Points = 0;
		player2Points = 0;
		gameEnded = false;
	}

	public void player1Scored() throws TennisGameException 
	{
		// TO BE IMPLEMENTED
		checkGameEnded();
		if(!gameEnded)
		{
			player1Points++;
		} else
		{
			throw new TennisGameException();
		}
		
	}

	public void player2Scored() throws TennisGameException 
	{
		// TO BE IMPLEMENTED
		
		checkGameEnded();
		if(!gameEnded)
		{
			player2Points++;
		} else
		{
			throw new TennisGameException();
		}
		
	}
	
	private void checkGameEnded()
	{ 
		// TO BE IMPLEMENTED
		if((player1Points > 3 && player1Points-2 >= player2Points))
		{
			gameEnded = true;
			whoWin = 1;
		} else if((player2Points > 3 && player2Points-2 >= player1Points))
		{
			gameEnded = true;
			whoWin = 2;
		} else 
		{
			gameEnded = false;
		}
	}

	private String getScore(int points) 
	{
		// TO BE IMPLEMENTED
		if(points == 0) 
		{
			return "0";
		} else if(points == 1)
		{
			return "15";
		} else if(points == 2)
		{
			return "30";
		} else if(points == 3) 
		{
			return "40";
		} else 
		{
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
		
		// TO BE IMPLEMENTED
		checkGameEnded();
		if (gameEnded && whoWin == 1) 
		{
			return "game player1";
		} else if (gameEnded && whoWin == 2)
		{
			return "game player2";
		} else if (player1Points > 3 && player2Points > 3 && player1Points == player2Points)
		{
			return "deuce";
		} else if (player1Points >= 3 && player2Points >= 3 && player1Points-1 == player2Points)
		{
			return "advantage player1";
		} else if (player1Points >= 3 && player2Points >= 3 && player1Points == player2Points-1)
		{
			return "advantage player2";
		} else
		{
			return getScore(player1Points) + " - " + getScore(player2Points);
		}
	}
}
