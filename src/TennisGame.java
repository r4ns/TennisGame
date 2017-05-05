public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		this.player1Points=0;
		this.player2Points=0;
		this.gameEnded=false;
	}

	public void player1Scored() throws TennisGameException 
	{
		this.player1Points++;
	}

	public void player2Scored() throws TennisGameException 
	{
		this.player2Points++;
	}
	
	private void checkGameEnded()
	{ 
		if((this.player1Points>=4 && this.player1Points-this.player2Points>=2) || (this.player2Points>=4 && this.player2Points-this.player1Points>=2))
		{
			this.gameEnded=true;
		}
	}

	private String getScore(int points) 
	{
		String convPoints="0";
		if(points==1)
		{
			convPoints="15";
		}
		else if(points==2)
		{
			convPoints="30";
		}
		else if(points==3)
		{
			convPoints="40";
		}
		return convPoints;
	}
	
	public String getScore() 
	{
		String rez="";
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
		String igrac1=getScore(this.player1Points);
		String igrac2=getScore(this.player2Points);
		
		if(this.player1Points>=3 && this.player2Points>=3 && igrac1.equals(igrac2))
		{
			rez="deuce";
			checkGameEnded();
		}
		
		if(this.player1Points>=3 && this.player2Points>=3)
		{
			if(this.player1Points-this.player2Points==1)
			{
				rez="advantage igrac1";
			}
			if(this.player2Points-this.player1Points==1)
			{
				rez="advantage igrac2";
			}
			checkGameEnded();
		}
		
		if(this.gameEnded && this.player1Points>this.player2Points)
		{
			rez="pobjedjuje igrac1";
		}
		
		if(this.gameEnded && this.player2Points>this.player1Points)
		{
			rez="pobjedjuje igrac2";
		}
		
		
		if(igrac1.equals("0") && igrac2.equals("0"))
		{
			rez=igrac1 + " - " + igrac2;
		}

		// TO BE IMPLEMENTED
		return rez;
	}
}
