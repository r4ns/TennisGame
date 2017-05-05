public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		this.player1Points = player1Points = 0;
		this.player2Points = player2Points = 0;
	}


	public void player1Scored() throws TennisGameException 
	{
		if(player1Points == 0){
			player1Points = 15;
			System.out.println("Player 1 has scored");
		} else if (player1Points == 15){
			player1Points = 30;
			System.out.println("Player 1 has scored");
		} else if (player1Points == 30){
			player1Points = 40;
			System.out.println("Player 1 has scored");
		}
		
		
	}

	public void player2Scored() throws TennisGameException 
	{
		if(player2Points == 0){
			player2Points = 15;
			System.out.println("Player 2 has scored");
		} else if (player2Points == 15){
			player2Points = 30;
			System.out.println("Player 2 has scored");
		} else if (player2Points == 30){
			player2Points = 40;
			System.out.println("Player 2 has scored");
		}
	}
	
	private void checkGameEnded()
	{ 
		// TO BE IMPLEMENTED
	}

	private String getScore(int points) 
	{
		return "" + points;
	}
	
	public String getScore() 
	{
		
		if(getScore(player1Points) == "15" && getScore(player2Points) == "0" ){
			return "15 - 0";
		} else if(getScore(player1Points) == "0" && getScore(player2Points) == "15" ){
			return "0 - 15";
		}
		
		if(getScore(player1Points) == "30" && getScore(player2Points) == "0" ){
			return "30 - 0";
		} else if(getScore(player1Points) == "0" && getScore(player2Points) == "30" ){
			return "0 - 30";
		}
		
		if(getScore(player1Points) == "40" && getScore(player2Points) == "0" ){
			return "40 - 0";
		} else if(getScore(player1Points) == "0" && getScore(player2Points) == "40" ){
			return "0 - 40";
		}
		
		
		if(getScore(player1Points) == "15" && getScore(player2Points) == "15" ){
			return "15 - 15";
		} else if(getScore(player1Points) == "30" && getScore(player2Points) == "30" ){
			return "30 - 30";
		} else if(getScore(player1Points) == "40" && getScore(player2Points) == "40"){
			return "deuce";
		}
		
		if(getScore(player1Points) == "30" && getScore(player2Points) == "15" ){
			return "30 - 15";
		} else if(getScore(player1Points) == "15" && getScore(player2Points) == "30" ){
			return "15 - 30";
		}
		
		if(getScore(player1Points) == "40" && getScore(player2Points) == "15" ){
			return "40 - 15";
		} else if(getScore(player1Points) == "15" && getScore(player2Points) == "40" ){
			return "15 - 40";
		}
		
		
		
		return player1Points + " - " + player2Points;
		
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
		
	}
}
