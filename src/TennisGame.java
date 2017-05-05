public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		this.player1Points = player1Points;
		this.player2Points = player2Points;
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
		// TO BE IMPLEMENTED
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
