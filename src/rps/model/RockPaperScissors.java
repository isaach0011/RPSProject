package rps.model;

public class RockPaperScissors 
{
	private int computerNumber;
	public RockPaperScissors()
	{
		computerNumber = this.computerChoice();
	}
	
	/*
	 * Rock = 1
	 * Paper = 2
	 * Scissors = 3
	 * Simplified for easy logic.
	 */
	public int computerChoice()
	{
		computerNumber = (int)(Math.random() * 3);
		
		return computerNumber;
	}
	
	public int computerAlwaysWins(int playerNumber)
	{
		int compNumber = 0;
		
		if(playerNumber == 3)
		{
			compNumber = 1;
		}
		if(playerNumber == 1)
		{
			compNumber = 2;
		}
		if(playerNumber == 2)
		{
			compNumber = 3;
		}
		
		return compNumber;
	}
	public int playerChoice(String playerChoice)
	{
		int playerNumber = 0;
		if(playerChoice.equalsIgnoreCase("rock"))
		{
			playerNumber = 1;
		}
		else if(playerChoice.equalsIgnoreCase("paper"))
		{
			playerNumber = 2;
		}
		else if(playerChoice.equalsIgnoreCase("scissors"))
		{
			playerNumber = 3;
		}
		
		return playerNumber;
	}
	
	/*
	 * Lose = 0
	 * Win = 1
	 * Tie = 2
	 * 
	 * Rock = 1
	 * Paper = 2
	 * Scissors = 3
	 */
	public int normalMode(String playerChoice)
	{
		int gameOutcome = 0;
		int playerNumber = this.playerChoice(playerChoice);
		//Win
		if(playerNumber == 1 && computerNumber == 2)
		{
			gameOutcome = 1;
		}
		if(playerNumber == 2 && computerNumber == 0)
		{
			gameOutcome = 1;
		}
		if(playerNumber == 3 && computerNumber == 1)
		{
			gameOutcome = 1;
		}
		
		//Lose
		if(playerNumber == 3 && computerNumber == 0)
		{
			gameOutcome = 0;
		}
		if(playerNumber == 1 && computerNumber == 1)
		{
			gameOutcome = 0;
		}
		if(playerNumber == 2 && computerNumber == 2)
		{
			gameOutcome = 0;
		}
		
		//Tie
		if(playerNumber == 1 && computerNumber == 0)
		{
			gameOutcome = 2;
		}
		if(playerNumber == 2 && computerNumber == 1)
		{
			gameOutcome = 2;
		}
		if(playerNumber == 3 && computerNumber == 2)
		{
			gameOutcome = 2;
		}
		
		return gameOutcome;
	}
	
	public int extremeMode(int playerNumber)
	{
		int gameOutcome = 0;
		int computerNumber = this.computerAlwaysWins(playerNumber);
		
		if(playerNumber == 3 && computerNumber == 0)
		{
			gameOutcome = 0;
		}
		if(playerNumber == 1 && computerNumber == 1)
		{
			gameOutcome = 0;
		}
		if(playerNumber == 2 && computerNumber == 2)
		{
			gameOutcome = 0;
		}
		
		return gameOutcome;
	}
	
	public int getComputerNumber()
	{
		return computerNumber;
	}
	
	public String getComputerChoice()
	{
		String computerChoice = "";
		if(computerNumber == 0)
		{
			computerChoice = "rock";
		}
		else if(computerNumber == 1)
		{
			computerChoice = "paper";
		}
		else if(computerNumber == 2)
		{
			computerChoice = "scissors";
		}
		
		return computerChoice;
	}
}
