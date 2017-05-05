public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		player1Points=0;
		player2Points=0;
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
		// TO BE IMPLEMENTED
		if(player1Points>=4 && player1Points-player1Points>=2)
		{
			gameEnded=true;
		}
		if(player2Points>=4 && player2Points-player1Points>=2)
		{
			gameEnded=true;
		}
		
		gameEnded=false;
	}

	private String getScore(int points) 
	{
		// TO BE IMPLEMENTED
		if(points==0)
		{
			return "0";
		}
		if(points==1)
		{
			return "15";
		}
		if(points==2)
		{
			return "30";
		}
		if(points==3)
		{
			return "40";
		}
		return "";
	}
	
	public String getScore() 
	{
		// Scores format: "player1Score - player2Score"
		// "0 - 0"
		if(player1Points==0&&player2Points==0)
		{
			return "0 - 0";
		}
		// "15 - 15"
		if(player1Points==1&&player2Points==1)
		{
			return getScore(1)+" - "+getScore(1);
		}
		// "30 - 30"
		if(player1Points==2&&player2Points==2)
		{
			return getScore(2)+" - "+getScore(2);
		}
		// "15 - 0", "0 - 15"
		if(player1Points==1&&player2Points==0)
		{
			return getScore(1)+" - "+getScore(0);
		}
		if(player1Points==0&&player2Points==1)
		{
			return getScore(0)+" - "+getScore(1);
		}
		// "30 - 0", "0 - 30"
		if(player1Points==2&&player2Points==0)
		{
			return getScore(2)+" - "+getScore(0);
		}
		if(player1Points==0&&player2Points==2)
		{
			return getScore(0)+" - "+getScore(2);
		}
		// "40 - 0", "0 - 40"
		if(player1Points==3&&player2Points==0)
		{
			return getScore(3)+" - "+getScore(0);
		}
		if(player1Points==0&&player2Points==3)
		{
			return getScore(0)+" - "+getScore(3);
		}
		// "30 - 15", "15 - 30"
		if(player1Points==2&&player2Points==1)
		{
			return getScore(2)+" - "+getScore(1);
		}
		if(player1Points==1&&player2Points==2)
		{
			return getScore(1)+" - "+getScore(2);
		}
		// "deuce"
		if((player1Points>=3&&player2Points>=3) && player2Points==player1Points)
		{
			return "deuce";
		}
		// "40 - 15", "15 - 40"
		if(player1Points==3&&player2Points==1)
		{
			return getScore(3)+" - "+getScore(1);
		}
		if(player1Points==1&&player2Points==3)
		{
			return getScore(1)+" - "+getScore(3);
		}
		// "40 - 30", "30 - 40"
		if(player1Points==3&&player2Points==2)
		{
			return getScore(3)+" - "+getScore(2);
		}
		if(player1Points==2&&player2Points==3)
		{
			return getScore(2)+" - "+getScore(3);
			
		}
		// "advantage player1"
		if((player1Points>=3&&player2Points>=3) && (player1Points-player2Points==1))
		{
			return "advantage player1";
		}
		// "advantage player2"
		if((player1Points>=3&&player2Points>=3) && (player2Points-player1Points==1))
		{
			return "advantage player2";
		}
		// "game player1"
		if(player1Points>=4 && player1Points-player1Points>=2)
		{
			checkGameEnded();
			if(gameEnded)
			{
				return "game player1";
			}
		}
		// "game player2"
		if(player2Points>=4 && player2Points-player1Points>=2)
		{
			checkGameEnded();
			if(gameEnded)
			{
				return "game player2";
			}
		}
		
		
		return "";
	}
}
