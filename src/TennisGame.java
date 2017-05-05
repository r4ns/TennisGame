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
		checkGameEnded();
		if(gameEnded==true){

			throw new TennisGameException();
		} else {

			player1Points++;
			
		}

	}

	public void player2Scored() throws TennisGameException 
	{
		checkGameEnded();
		if(gameEnded==true){

			throw new TennisGameException();
		} else {

			player2Points++;
		}
	}

	private void checkGameEnded()
	{ 
		if((player1Points>=4 && player2Points==player1Points+2) || (player2Points>=4 && player1Points==player2Points+2)){

			gameEnded=true;
		} else {
			
			gameEnded=false;
		}
	}

	private String getScore(int points) 
	{
		if(points==0){
			
			return "0";
		} else if(points == 1 ){
			
			return "15";
			
		} else if(points == 2 ) {
			
			return "30";
		} else if(points == 3) {
			
			return "40";
		}
		
		return"";
		
	}

	public String getScore() 
	{

		if(player1Points==0 && player2Points==0){

			return getScore(0)+ " - " +getScore(0);
			
		} else if(player1Points==1 && player2Points==0){

			return getScore(1)+ " - " +getScore(0);
			
		}else if(player1Points==2 && player2Points==0){

			return getScore(2) + " - " + getScore(0);
			
			
		}else if(player1Points==3 && player2Points==0){

			 return getScore(3) + " - " + getScore(0);
		}else if(player1Points==0 && player2Points==1){

			 return getScore(0) + " - " + getScore(1);
		}else if(player1Points==0 && player2Points==2){

			 return getScore(0) + " - " + getScore(2);
		}else if(player1Points==0 && player2Points==3){

			 return getScore(0) + " - " + getScore(3);
		}  else if(player1Points==1 && player2Points==1){

			 return getScore(1) + " - " + getScore(1);
		} else if(player1Points==2 && player2Points==2){

			 return getScore(2) + " - " + getScore(2);
		} else if(player1Points==2 && player2Points==1){

			 return getScore(2) + " - " + getScore(1);
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
