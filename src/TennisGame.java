public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	private String player1;
	private String player2;
	
	public TennisGame() 
	{
		player1Points = 0;
		player2Points = 0;
		gameEnded = false;
	}

	public void player1Scored() throws TennisGameException 
	{
		if(gameEnded==false){
			player1Points++;
		}
		checkGameEnded();
	}

	public void player2Scored() throws TennisGameException 
	{
		if(gameEnded==false){
			player2Points++;
		}
		checkGameEnded();
	}
	
	private void checkGameEnded()
	{ 
		if(player1Points >= 4){
			if(player1Points - player2Points == 2)
				gameEnded = true;
		}else if(player2Points >= 4 ){
			if(player2Points - player1Points == 2)
			gameEnded = true;
		}
	}

	private String getScore(int points) 
	{
		String res="";
		if(points == 0)
			res="0";
		else if(points == 1)
			res="15";
		else if(points == 2)
			res="30";
		else if(points == 3)
			res="40";
		else if(points == 4 && gameEnded==true)
			res="game";
		else if(points == 4 && gameEnded==false)
			res="deuce";
		return res;
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

		return getScore(player1Points) + " - " + getScore(player2Points);
	}
}
