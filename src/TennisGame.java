public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;
	
	public TennisGame() 
	{
		
	}
	
	public TennisGame(int player1Points, int player2Points, boolean gameEnded) 
	{
		this.player1Points=player1Points;
		this.player2Points=player2Points;
		this.gameEnded=gameEnded;
	}

	public void player1Scored() throws TennisGameException 
	{
	
		if(gameEnded){
			throw new TennisGameException();
		}
		else
			this.player1Points++;
	}

	public void player2Scored() throws TennisGameException 
	{
		if(gameEnded){
			throw new TennisGameException();
		}
		else
			this.player2Points++;
	}
	
	private void checkGameEnded()
	{ 
		if((this.player1Points>=4 && this.player1Points-this.player2Points>=2) || (this.player2Points>=4 && this.player2Points-this.player1Points>=2)){
			this.gameEnded=true;
		}
		else
			this.gameEnded=false;
	}

	private String getScore(int points) 
	{
		if(points==0)
			return "0";
		else if(points==1)
			return "15";
		else if(points==2)
			return "30";
		else if(points==3)
			return "40";
		else if(points==4)
			return "advantage";
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
		if(this.player1Points==0 && this.player2Points==0){
			return getScore(0)+" - "+getScore(0);
		}
		else if(this.player1Points==1 && this.player2Points==0){
			return getScore(1)+" - "+getScore(0);
		}
		else if(this.player1Points==2 && this.player2Points==0){
			return getScore(2)+" - "+getScore(0);
		}
		else if(this.player1Points==3 && this.player2Points==0){
			return getScore(3)+" - "+getScore(0);
		}
		else if(this.player1Points==0 && this.player2Points==1){
			return getScore(0)+" - "+getScore(1);
		}
		else if(this.player1Points==0 && this.player2Points==2){
			return getScore(0)+" - "+getScore(2);
		}
		else if(this.player1Points==0 && this.player2Points==3){
			return getScore(0)+" - "+getScore(3);
		}
		else if(this.player1Points==1 && this.player2Points==1){
			return getScore(1)+" - "+getScore(1);
		}
		else if(this.player1Points==2 && this.player2Points==1){
			return getScore(2)+" - "+getScore(1);
		}
		else if(this.player1Points==3 && this.player2Points==1){
			return getScore(3)+" - "+getScore(1);
		}
		else if(this.player1Points==1 && this.player2Points==2){
			return getScore(1)+" - "+getScore(2);
		}
		else if(this.player1Points==2 && this.player2Points==2){
			return getScore(2)+" - "+getScore(2);
		}
		else if(this.player1Points==3 && this.player2Points==2){
			return getScore(3)+" - "+getScore(2);
		}
		else if(this.player1Points==1 && this.player2Points==3){
			return getScore(1)+" - "+getScore(3);
		}
		else if(this.player1Points==2 && this.player2Points==3){
			return getScore(2)+" - "+getScore(3);
		}
		else if(this.player1Points>=3 && this.player2Points>=3 && this.player1Points==this.player2Points){
			return "deuce";
		}
		else if(this.player1Points>=3 && this.player2Points>=3 && this.player1Points==this.player2Points+1){
			return "advantage igrac1";
		}
		else if(this.player1Points>=3 && this.player2Points>=3 && this.player2Points==this.player1Points+1){
			return "advantage igrac2";
		}
		else if(this.player1Points>this.player2Points){
			checkGameEnded();
			if(this.gameEnded)
			return "pobedjuje igrac1";
		}
		else if(this.player2Points>this.player1Points){
			checkGameEnded();
			if(this.gameEnded)
			return "pobedjuje igrac2";
		}
		
		// TO BE IMPLEMENTED
		return "";
	}
}
