public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	private int point;
	
	public TennisGame() 
	{
		player1Points=0;
		player2Points=0;
		gameEnded=false;
		
	}

	public void player1Scored() throws TennisGameException 
	{
		if(!gameEnded)
			player1Points++;
		
	}

	public void player2Scored() throws TennisGameException 
	{
		if(!gameEnded)
			player2Points++;
	}
	
	private void checkGameEnded()
	{ 
		if(player1Points > 4 && player2Points + 2 == player1Points || player1Points >4 && player1Points+2 == player2Points )
			gameEnded=true;
		else 
			gameEnded=false;
		
	}

	private String getScore(int points) 
	{
		if(points == 0)
			return "0";
		else if(points==1)
			return "15";
		else if(points==2)
			return "30";
		else if(points==3)
			return "40";
		else if(points==4)
			return "deuce";
		else if(points==5)
			return "advantage";
		else
			return "";
	}
	
	public String getScore() 
	{
		if(player1Points < 3 && player2Points < 3)
			return getScore(player1Points) + " - " + getScore(player2Points);
		else if(player1Points > 3 && player2Points > 3 && player1Points == player2Points)
			return getScore(4);
		else if((player1Points ==1 && player2Points == 0 ) || (player1Points == 0 && player2Points == 1 ))
			return getScore(player1Points) + " - " + getScore(player2Points);
		else if((player1Points == 2  && player2Points == 0 ) || (player1Points == 0 && player2Points == 2 ))
			return getScore(player1Points) + " - " + getScore(player2Points);
		else if((player1Points == 3  && player2Points == 0 ) || (player1Points == 0 && player2Points == 3 ))
			return getScore(player1Points) + " - " + getScore(player2Points);
		else if((player1Points == 2  && player2Points == 1 ) || (player1Points == 1 && player2Points == 2 ))
			return getScore(player1Points) + " - " + getScore(player2Points);
		else if((player1Points == 3  && player2Points == 2 ) || (player1Points == 2 && player2Points == 3 ))
			return getScore(player1Points) + " - " + getScore(player2Points);
		else if((player1Points == 3  && player2Points == 1 ) || (player1Points == 1 && player2Points == 3 ))
			return getScore(player1Points) + " - " + getScore(player2Points);
		else if((player1Points == 3  && player2Points == 2 ) || (player1Points == 1 && player2Points == 3 ))
			return getScore(player1Points) + " - " + getScore(player2Points);
		else if(player1Points >3 && player1Points-player2Points ==1)
			return "advantage player1";
		else if(player2Points >3 && player2Points-player1Points ==1)
			return "advantage player2";
		else if(player1Points > 3 && player1Points-player2Points == 2)
			return "game player1";
		else if(player2Points > 3 && player2Points-player1Points == 2)
			return "game player2";
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
