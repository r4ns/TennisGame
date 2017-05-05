public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		// TO BE IMPLEMENTED
		this.player1Points=0;
		this.player2Points=0;
		
	}
	
	public TennisGame(int player1Points,int player2Points) 
	{
		// TO BE IMPLEMENTED
		this.player1Points=player1Points;
		this.player2Points=player2Points;
		
	}

	public void player1Scored() throws TennisGameException 
	{
		// TO BE IMPLEMENTED
		if(player1Points==0)
			player1Points=15;
		else if(player1Points==15)
			player1Points=30;
		else if(player1Points==30)
			player1Points=40;
	}

	public void player2Scored() throws TennisGameException 
	{
		// TO BE IMPLEMENTED
		if(player2Points==0)
			player2Points=15;
		else if(player2Points==15)
			player2Points=30;
		else if(player2Points==30)
			player2Points=40;
	}
	
	private void checkGameEnded()
	{ 
		// TO BE IMPLEMENTED
		//if(player1Points==0 && player2Points  ==)
		
	}

	private String getScore(int points) 
	{
		
		// TO BE IMPLEMENTED
		if(points==0){
			player1Points=0;
			return getScore();
		}
		else if(points==1){
			player1Points=15;
			return getScore();
		}
		else if(points==2){
			player1Points=30;
			return getScore();
		}
		else if(points==3){
			player1Points=40;
			return getScore();
		}
		else if(points==5){
			return "advantage player1";
		}
		else if(points==6){
			player2Points=0;
			return getScore();
		}
		else if(points==7){
			player2Points=15;
			return getScore();
		}
		else if(points==8){
			player2Points=30;
			return getScore();
		}
		else if(points==9){
			player2Points=40;
			return getScore();
		}
		else if(points==10){
			return "advantage player2";
		}else
			return getScore();
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
		
		
		return player1Points+" - "+ player2Points;
	}
}
