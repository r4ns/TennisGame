public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;

	public TennisGame() 
	{

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
		// TO BE IMPLEMENTED
	}

	private String getScore(int points) 
	{
		// TO BE IMPLEMENTED
		return "";
	}

	public String getScore() 
	{

		if(player1Points==0 && player2Points==0){

			return "0 - 0";
		} else if(player1Points==15 && player2Points==15){

			return "15 - 15";
		}else if(player1Points==30 && player2Points==30){

			return "30 - 30";
		}else if((player1Points>=3 || player2Points>=3) && (player1Points==player2Points)){

			return "deuce";
		} else if(player1Points==15 && player2Points==0){
			
			return "15-0";
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
		return "";
	}
}
