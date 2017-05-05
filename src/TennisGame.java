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
		
		if(player1Points == 40){
			player1Points = 45; 
		}
		
		if(player1Points == 40){
			player1Points = 41; 
		}
		
		if(player1Points == 45){
			player1Points = 42; 
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
		
		if(player2Points == 40){
			player2Points = 45; 
		}
		
		if(player2Points == 40){
			player2Points = 41; 
		}
		
		if(player2Points == 45){
			player2Points = 42; 
		}
	}
	
	private void checkGameEnded()
	{ 
		// TO BE IMPLEMENTED
	}

	private String getScore(int points) 
	{
		switch (points) {
		case 0:
			return "0";
		case 15:
			return "15";
		case 30:
			return "30";
		case 40:
			return "40";
		case 41:
			return "41";
		case 42:
			return "42";
		case 45:
			return "45";
		

		default:
			return "";
		}
		
	}
	
	public String getScore() 
	{
		String pl1 = getScore(player1Points);
		String pl2 = getScore(player2Points);
		
		if(getScore(player1Points) == "0" && getScore(player2Points) == "0" ){
			return "0 - 0";
		} 
		
		
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
		
		if(getScore(player1Points) == "45" && getScore(player2Points) == "40" ){
			return "advantage player1";
		} else if(getScore(player1Points) == "40" && getScore(player2Points) == "45" ){
			return "advantage player2";
		}
		
		if(getScore(player1Points) == "41" && getScore(player2Points) == "15" ){
			return "game player1";
		} else if(getScore(player1Points) == "15" && getScore(player2Points) == "41" ){
			return "game player2";
		}
		
		if(getScore(player1Points) == "41" && getScore(player2Points) == "30" ){
			return "game player1";
		} else if(getScore(player1Points) == "30" && getScore(player2Points) == "41" ){
			return "game player2";
		}
		
		if(getScore(player1Points) == "42" && getScore(player2Points) == "40" ){
			return "game player1";
		} else if(getScore(player1Points) == "40" && getScore(player2Points) == "42" ){
			return "game player2";
		} else
			return "";
		
		
		
		
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
