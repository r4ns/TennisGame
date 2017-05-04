public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	private String poen;
	
	
	public TennisGame(int player1Points, int player2Points, boolean gameEnded) {
		super();
		this.player1Points = player1Points;
		this.player2Points = player2Points;
		this.gameEnded = gameEnded;
	}
	
	
	public TennisGame() 
	{
		
	}

	public void player1Scored() throws TennisGameException 
	{
		if((player1Points==1 && gameEnded==true)) throw new TennisGameException();
		
	
	}

	public void player2Scored() throws TennisGameException 
	{
		if(player2Points==2 && gameEnded==true) throw new TennisGameException();
	}
	
	private void checkGameEnded()
	{ 
		// TO BE IMPLEMENTED
		if((player1Points>=3) && player1Points==player2Points+1)
		{
			System.out.println("Partija zavrsena. Player1 je pobedio");
			gameEnded=true;
		}
		else if((player2Points>=3) && player2Points==player1Points+1)
		{
			System.out.println("Partija zavrsena. Player2 je pobedio");
			gameEnded=true;
		}
		else
		{
			gameEnded=false;
		}
	}

	private String getScore(int points) 
	{
		// TO BE IMPLEMENTED
		if(points==0)
		{
			poen="0";
		}
		else if(points==1)
		{
			poen="15";
		}
		else if(points==2)
		{
			poen="30";
		}
		else if(points==3)
		{
			poen="40";
		}
		
		return poen;
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
		return Integer.toString(player1Points) + "-" + Integer.toString(player2Points); 
	}
}
