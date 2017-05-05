public class TennisGame 
{	
	private int player1Points=0;
	private int player2Points=0;
	private boolean gameEnded=false;
	
	public TennisGame() 
	{
	
	}

	public void player1Scored() throws TennisGameException 
	{
		player1Points++;
		checkGameEnded();
	}

	public void player2Scored() throws TennisGameException 
	{
		player2Points++;
		checkGameEnded();
	}
	
	private void checkGameEnded()
	{ 
		if (player1Points>=4 && player2Points<4){
			gameEnded=true;
		} 
		else if (player1Points>=4 && player2Points>=4 
				&& (player1Points-player2Points==2)) {
			gameEnded=true;
		}
		else if (player2Points>=4 && player1Points<4) {
			gameEnded=true;
		}
		else if (player2Points>=4 && player1Points>=4 
				&& (player2Points-player1Points==2)) {
			gameEnded=true;
		}
		else {
			gameEnded=false;
		}	
	}

	private String getScore(int points) 
	{
		if (points==0) 
			return "0";
		else if (points==1)
			return "15";
		else if (points==2)
			return "30";
		else if (points==3)
			return "40";
		else
		return "";
	}
	
	public String getScore() 
	{
		if (player1Points<4 && player2Points<4) {
			
			return getScore(player1Points) + " - " + getScore(player2Points); 
		}
		
		else if (player1Points>=4 && player2Points>=4) {
			
			if (player1Points==player2Points) {
				
				return "deuce";
			}
			
			else if (player1Points-player2Points==1) {
				
				return "advantage player1";
			}
			
			else if (player2Points-player1Points==1) {
				
				return "advantage player2";
			}
			
			else if (player1Points-player2Points==2) {
				
				return "game player1";
			}
			
			else if (player2Points-player1Points==2) {
				
				return "game player2";
			}
			
			else {
				return "";
			}
			
		}

		return "";
	}
}
