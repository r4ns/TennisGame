public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	public TennisGame(){
		
	}
	public TennisGame(int player1Points, int player2Points) 
	{
		this.player1Points= player1Points;
		this.player2Points=player2Points;
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
		if((player1Points>=4 && player1Points - 2 >= player2Points) || (player2Points>=4 && player2Points-2>= player1Points))
			gameEnded = true;
		else 
			gameEnded=false;
	}

	private String getScore(int points) 
	{
		String point="";
		if(points==0)
			point="0";
		else if(points==1)
			point="15";
		else if(points==2)
			point="30";
		else if(points==3)
			point="40";
		
		return point;
		
	}
	
	public String getScore() 
	{
		String rezultat = getScore(player1Points) + " - " + getScore(player2Points);
		if(player1Points == 3 && player2Points == 3)
			rezultat = "Rezultat: deuce";
		if(rezultat == "Rezultat: deuce")
		{
			if(player1Points==4)
				rezultat = "Rezultat: advantage igrac1";
			else if(player2Points==4)
				rezultat = "Rezultat: advantage igrac2";
		}
		if(gameEnded==true)
		{
			if(player1Points>=4)
				rezultat= "Pobedjuje igrac1";
			else if(player2Points>=4)
				rezultat = "Pobedjuje igrac2";
		}
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
		return rezultat;
	}

	public int getPlayer1Points() {
		return player1Points;
	}

	public int getPlayer2Points() {
		return player2Points;
	}

	public void setPlayer1Points(int player1Points) {
		this.player1Points = player1Points;
	}

	public void setPlayer2Points(int player2Points) {
		this.player2Points = player2Points;
	}

	public boolean isGameEnded() {
		return gameEnded;
	}

	public void setGameEnded(boolean gameEnded) {
		this.gameEnded = gameEnded;
	}
}
