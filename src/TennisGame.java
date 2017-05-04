public class TennisGame 
{	
	private int player1Points=0;
	private int player2Points=0;
	private boolean gameEnded;
	
	public TennisGame(){
		
	}
	public TennisGame(int player1Points,int player2Points,boolean gameEnded) 
	{
		this.player1Points=player1Points;
		this.player2Points=player2Points;
		this.gameEnded=gameEnded;
	}

	public void player1Scored() throws TennisGameException 
	{
		player1Points++;
		getScore(player1Points);
		
	}

	public void player2Scored() throws TennisGameException 
	{
		player2Points++;
		getScore(player2Points);
	}
	
	private void checkGameEnded()
	{ 
		if(player1Points==4 && player2Points==2|| player1Points==2 && player2Points==4 || player1Points>4 || player2Points>4){
			gameEnded=true;
		}
		else{
			gameEnded=false;
		}
	}

	private String getScore(int points) 
	{
		if(points==0){
			return "0";
		}
		else if(points==1){
			return "15";
		}
		else if (points==2){
			return "30";
		}
		else if(points==3){
			return "40";
		}
		else if(points==4){
			return "advantage";
		}
		else 
		
		return "game";
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
		if(player1Points==3 && player2Points==3){
			return"deuce";
		}
		else if(player1Points==4 && player2Points==3){
			return "Advantage player1";
		}
		else if(player1Points==3 && player2Points==4){
			return "Advantage player2";
		}
		else{
		return getScore(player1Points)+" - "+ getScore(player2Points);
		}
	}
}
