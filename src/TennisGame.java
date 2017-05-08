public class TennisGame 
{	
	private int player1Points;
	private int player2Points;
	private boolean gameEnded;

	
	private String pomocna1;
	private String pomocna2; 
	
	public TennisGame() 
	{
		// TO BE IMPLEMENTED
		this.player1Points=0;
		this.player2Points=4;

	}
	public void player1Scored() throws TennisGameException 
	{
		// TO BE IMPLEMENTED
		player1Points ++;
	}

	public void player2Scored() throws TennisGameException 
	{
		// TO BE IMPLEMENTED
		player2Points ++;
	}

	private void checkGameEnded()
	{ 
		// TO BE IMPLEMENTED
		//if(player1Points==0 && player2Points  ==)
		if(player1Points==0 && player2Points  == 8){
			gameEnded=true;
		}
		else if(player1Points==1 && player2Points  == 8){
			gameEnded = true;
		}
		else if(player1Points==2 && player2Points  == 8){
			gameEnded = true;
		}
		else if(player1Points==3 && player2Points  == 9){
			gameEnded = true;
		}
		
		if(player1Points==4 && player2Points  == 4){
			gameEnded = true;	
		}
		else if(player1Points==4 && player2Points  == 5){	
			gameEnded = true;
		}
		else if(player1Points==4 && player2Points  == 6){
			gameEnded = true;
		}
		else if(player1Points==5 && player2Points  == 7){
			gameEnded = true;
		}
		
		
	}

	private String getScore(int points) 
	{
		
		// TO BE IMPLEMENTED
		if(points == 0){
			pomocna1="0";
		}
		else if(points==1){
			pomocna1="15";
		}
		else if(points==2){
			pomocna1="30";

		}
		else if(points==3){
			pomocna1="40";
		}
		
		if(points==4){
			pomocna2="0";
		}
		else if(points==5){
			pomocna2="15";
		}
		else if(points==6){
			pomocna2="30";

		}
		else if(points==7){
			pomocna2="40";
		}
		
		if(points==8){
			return "advantage player1";
		}
		else if(points==9){
			return "advantage player2";
		}
		
		if(points==10){
			pomocna1="40";
			pomocna2="40";
		}
		
		return pomocna1+ " - " + pomocna2;
	}

	public String getScore() 
	{
		String rezultat="";
		if(player1Points==0){
			rezultat = getScore(0);
		}
		else if(player1Points==1){
			rezultat = getScore(1);
		}
		else if(player1Points==2){
			rezultat = getScore(2);
		}
		else if(player1Points==3){
			rezultat = getScore(3);
		}


		if(player2Points==4){
			rezultat = getScore(4);
		}
		else if(player2Points==5){
			rezultat = getScore(5);
		}
		else if(player2Points==6){
			rezultat = getScore(6);
		}
		else if(player2Points==7){
			rezultat = getScore(7);
		}

		if(player1Points==4 && player2Points ==7){
			rezultat = getScore(8);
		}else if(player1Points==3 && player2Points ==8){
			rezultat = getScore(9);
		}
		
		if(player1Points == 4  && player2Points == 8){
			player1Points=3;
			player2Points=7;
			rezultat = getScore(10);
		}
		checkGameEnded();
		
		if(gameEnded == true){
			if(player1Points>=4){
				rezultat = "game player1";
			}
			if(player2Points>=8){
				rezultat = "game player2";
			}	
		}
		//else if(pl)

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


		return rezultat;
	}
}
