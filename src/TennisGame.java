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
			if(player2Points <=3)
				player1Points++;
		}
		checkGameEnded();
	}

	public void player2Scored() throws TennisGameException 
	{
		if(gameEnded==false){
			if(player1Points <=3)
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
		else if(points == 4)
			res="win";
		else if(points == 5)
			res="winwin";
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
		String res="";
		if(getScore(player1Points) == "40" && getScore(player2Points) == "40")
			return "deuce";
		else if(getScore(player1Points)=="win" && getScore(player2Points) == "40"){
			return "advantage igrac1";
		}else if(getScore(player2Points)=="win" && getScore(player1Points) == "40"){
			return "advantage igrac2";
		}else if(getScore(player2Points)=="winwin" && getScore(player1Points) == "40"){
			return "game igrac2";
		}else if(getScore(player1Points)=="winwin" && getScore(player2Points) == "40"){
			return "game igrac1";
		}else if(getScore(player1Points)=="win" && getScore(player2Points) != "40"){
			return "game igrac1";
		}else if(getScore(player2Points)=="win" && getScore(player1Points) != "40"){
			return "game igrac2";
		}
		else
			return getScore(player1Points) + " - " + getScore(player2Points);
	}
}
