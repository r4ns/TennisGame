public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		// TO BE IMPLEMENTED
	}

	public void player1Scored() throws TennisGameException 
	{
		player1Points++;
		System.out.print("igrac1 osvaja_poen > ");
	}

	public void player2Scored() throws TennisGameException 
	{
		player2Points++;
		System.out.print("igrac2 osvaja_poen > ");
	}
	
	private void checkGameEnded()
	{ 
		// TO BE IMPLEMENTED
	}

	private String getScore(int points) 
	{
		switch(points){
			case 0: return "0";
			case 1: return "15";
			case 2: return "30";
			case 3: return "40";
			default: return "advantage";
		}
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
