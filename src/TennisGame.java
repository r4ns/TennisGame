public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		
		
	}
	public void player1Scored() throws TennisGameException {
		if(gameEnded == true)
		{
			throw new TennisGameException();
		}
		else {
			player1Points += 1;
			checkGameEnded();
		}
	}
	

	public void player2Scored() throws TennisGameException 
	{
		if(gameEnded == true)
		{
			throw new TennisGameException();
		}
		else {
			player2Points+=1;
			checkGameEnded();
		}
	}
	
	private void checkGameEnded()
	{ 
		if(player1Points>=4)
		{
			if((player1Points-player2Points)==2)
			{
				gameEnded=true;
			}
		}
		else if (player2Points>=4)
		{
			if((player2Points-player1Points)==2)
			{
				gameEnded=true;
			}
		}
		else {
			gameEnded=false;
		}
	  
	
	}

	private String getScore(int points) 
	{
		
		if(points == 0){
			return "0";
		}
		else if (points == 1){
			return "15";
		}
		else if (points == 2){
			return "30";
		}
		else if (points == 3){
			return "40";
		}
		else
		    return "";
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
		
		if(player1Points < 3 || player2Points < 3){
			return (getScore(player1Points) + " - " + getScore(player2Points));
		}
		else if((player1Points>=3 && player2Points>=3)&&(player1Points==player2Points))
		{
			return "deuce";
		}
		else if (player1Points==(player2Points-1))
		{
			return "advantage player2";
		}
		else if ((player2Points==(player1Points-1))&&(player1Points>3 && player2Points>3))
		{
			return "advantage player1";
		}
		else if (player2Points>=4 )
		{
			if((player2Points-player1Points)==2)
			{
			   return"game player1";
			}
		}
		else if (player1Points>=4 )
		{
			if((player1Points-player2Points)==2)
			{
			   return"game player2";
			}
		}
		
			return "";
		
		
		
	}
	public int getPlayer1Points() {
		return player1Points;
	}
	public void setPlayer1Points(int player1Points) {
		this.player1Points = player1Points;
	}
	public int getPlayer2Points() {
		return player2Points;
	}
	public void setPlayer2Points(int player2Points) {
		this.player2Points = player2Points;
	}
}
