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
		this.checkGameEnded();
		if(!gameEnded)
		{
			this.player1Points++;
		}
		else
		{
			throw new TennisGameException("Game ended!");
		}
		
		
	}

	public void player2Scored() throws TennisGameException 
	{
		this.checkGameEnded();
		if(!gameEnded)
		{
			this.player2Points++;
		}
		else
		{
			throw new TennisGameException("Game ended!");
		}
		
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
		if(!this.gameEnded)
		{
		if(this.player1Points<=3 && this.player2Points<=3)
		{
			if(igrac1.equals(getScore(3)) && igrac2.equals(getScore(3))/* && igrac1.equals(igrac2)*/)
			{
				rez="deuce";
			}
			else if(igrac1.equals(igrac2) /*&& !igrac1.equals(getScore(3)) && !igrac2.equals(getScore(3))*/)
			{
				rez=igrac1 + " - " + igrac2;
			}
			else if(!igrac1.equals(igrac2))
			{
				 rez=igrac1 + " - " + igrac2;
			}
		}
	
		
		else if(igrac1.equals(getScore(3)) || igrac2.equals(getScore(3)))
		{
			if(this.player2Points==4)
			{
				rez="advantage igrac2";
			}
			else if(this.player1Points==4)
			{
				rez="advantage igrac1";
			}
		} 
		
		else if(this.player1Points==4 && this.player2Points==4)
		{ 
			this.player1Points--;
			this.player2Points--;
			rez=this.getScore();
		}
		}
		this.checkGameEnded();
		if(this.gameEnded){
			
			if(this.player2Points>this.player1Points)
			{
				rez="pobjedjuje igrac2";
			}
			else rez="pobjedjuje igrac1";
		}
		
		
		//this.checkGameEnded();
		return rez;
	}
}
