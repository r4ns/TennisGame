public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	private String rez;
	
	public TennisGame( int player1Points,int player2Points, boolean gameEnded ) 
	{
		// TO BE IMPLEMENTED
		super();
		this.player1Points=player1Points;
		this.player1Points=player2Points;
		this.gameEnded=gameEnded;
	}
	public TennisGame()
	{
		
	}
	public void player1Scored() throws TennisGameException 
	{
		// TO BE IMPLEMENTED
		if ( gameEnded==true && player1Points==1 ) throw new TennisGameException();
		
		
			
		
	}

	public void player2Scored() throws TennisGameException 
	{
		// TO BE IMPLEMENTED
		if ( gameEnded==true && player2Points==1 ) throw new TennisGameException();
		
	}
	
	private void checkGameEnded()
	{ 
		// TO BE IMPLEMENTED
		if (player1Points >=4 && (player1Points-player2Points)>=2) //ako je prvi igrac pobedio
		{
			gameEnded=true; //ako je true partija je zavrsena
		} else if (player2Points >= 4 && (player2Points-player1Points)>=2 ) //ako je drugi igrac pobedio
		{
			gameEnded=true;
		} else {
			
			gameEnded=false; //partija nije zavrsena
		}
			
	}

	private String getScore(int points) 
	{
		
		// TO BE IMPLEMENTED
		if (points==1)
		{
			rez="15";
			
		} else if (points==2)
		{
			rez="30";
		} else if (points==3)
		{
			rez="40";
		} else if (points==0)
		{
			rez="0";
		}
		return rez;
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
		return  Integer.toString(player1Points) + "-" + Integer.toString(player2Points);
	}
}
