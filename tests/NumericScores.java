import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.corba.se.impl.ior.NewObjectKeyTemplateBase;

// Testing of midgame scores before both players score three times
public class NumericScores {

	@Test
	public void test_StartScore() {
		//Arrange prosao
		TennisGame game = new TennisGame();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Initial score incorrect", "0 - 0", score);	
	}
	
	@Test
	public void test_p1Wins1Point_Score15_0() throws TennisGameException {
		//Arrange prosao
		TennisGame game = new TennisGame();
		//Act
		game.player1Scored();
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored once", "15 - 0", score);	
	}
	
	@Test
	public void test_p1Wins2Points_Score30_0() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();		
		game.player1Scored();
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored twice", "30 - 0", score);	
	}
	
	@Test
	public void test_p1Wins3Points_Score40_0() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored three times", "40 - 0", score);	
	}
	
	@Test
	public void test_p2Wins1Point_Score0_15() throws TennisGameException {
		//Arrange prosao
		TennisGame game = new TennisGame();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player2 scored once", "0 - 15", score);	
	}
	
	@Test
	public void test_p2Wins2Points_Score0_30() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player2Scored();
		game.player2Scored();
		//Act		
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player2 scored twice", "0 - 30", score);	
	}
	
	@Test
	public void test_p2Wins3Points_Score0_40() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when playe2 scored three times", "0 - 40", score);	
	}
	
	@Test
	public void test_p1Wins1Point_p2Wins1Point_Score15_15() throws TennisGameException {
		//Arrange prosao
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when each player scored once", "15 - 15", score);	
	}
	
	@Test
	public void test_p1Wins2Points_p2Wins2Points_Score30_30() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player1Scored();		
		game.player2Scored();
		game.player1Scored();		
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when each player scored two times", "30 - 30", score);	
	}
	
	@Test
	public void test_p1Wins2Points_p2Wins1Point_Score30_15() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored twice and player2 scored once", "30 - 15", score);	
	}

	@Test
	public void test_p1Wins3Points_p2Wins1Point_Score40_15() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();	
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored three times and player2 scored once", "40 - 15", score);	
	}
	
	@Test
	public void test_p1Wins1Point_p2Wins2Points_Score15_30() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored once and player2 scored twice", "15 - 30", score);	
	}
	
	@Test
	public void test_p1Wins1Point_p2Wins3Point_Score15_40() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();		
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored once and player2 scored three times", "15 - 40", score);	
	}
	
	@Test
	public void test_p1Wins2Points_p2Wins3Points_Score30_40() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored twice and player2 scored three times", "30 - 40", score);	
	}
	
	@Test
	public void test_p1Wins3Points_p2Wins2Points_Score40_30() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored three times and player2 scored twice", "40 - 30", score);	
	}
	
	@Test
	public void test_p1Wins3Points_p2Wins2Points_AlternativeSequenceOfWins_Score40_30() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();

		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Incorrect score when player1 scored three times and player2 scored twice. Players win points alternating.", "40 - 30", score);	
	}
	
	@Test 
	public void test_p1WinsAD() throws TennisGameException{
		
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		String expectedScore = "advantage player1";
		String realScore=game.getScore();
		assertEquals(expectedScore,realScore);
		
	}
	
	@Test 
	public void test_p2WinAD() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String expected = "advantage player2";
		String result = game.getScore();
		
		assertEquals(expected, result);
	}
	
	@Test 
	public void test_p2haveAD_p1WinPoints() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player2Scored();
		game.player1Scored();
		
		String expected= "40 - 40";
		String result = game.getScore();
		
		assertEquals(expected, result);	
	}
	
	@Test 
	public void test_p1haveAD_p2WinPoints() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		
		String expected= "40 - 40";
		String result = game.getScore();
		
		assertEquals(expected, result);	
	}
	
	@Test
	public void test_gameWinp1_p2Win_0() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();	
		game.player1Scored();
		
		String expected= "game player1";
		String result = game.getScore();
		assertEquals(expected, result);	
	}

	@Test
	public void test_gameWinp1_p2Win_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();	
		game.player1Scored();
		
		game.player2Scored();
		
		String expected= "game player1";
		String result = game.getScore();
		assertEquals(expected, result);	
	}
	
	@Test
	public void test_gameWinp1_p2Win_30() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();	
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		
		String expected= "game player1";
		String result = game.getScore();
		assertEquals(expected, result);	
	}
	
	@Test
	public void test_gameWinp1_p2Win_40() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();	

		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player1Scored();
		String expected= "game player1";
		String result = game.getScore();
		assertEquals(expected, result);	
	}
	
	@Test
	public void test_gameWinp2_p1Win_0() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();

		String expected= "game player2";
		String result = game.getScore();
		assertEquals(expected, result);	
	}
	
	@Test
	public void test_gameWinp2_p1Win_15() throws TennisGameException{
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String expected= "game player2";
		String result = game.getScore();
		assertEquals(expected, result);	
	}
	
	@Test
	public void test_gameWinp2_p1Win_30() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String expected= "game player2";
		String result = game.getScore();
		assertEquals(expected, result);	
	}
	
	@Test
	public void test_gameWinp2_p1Win_40() throws TennisGameException{
		TennisGame game = new TennisGame();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String expected= "game player2";
		String result = game.getScore();
		assertEquals(expected, result);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
