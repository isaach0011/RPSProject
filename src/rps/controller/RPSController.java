package rps.controller;

import java.util.Scanner;
import rps.model.RockPaperScissors;

public class RPSController 
{
	private Scanner keyboardInput;
	private String difficultyOption;
	private RockPaperScissors rps;
	
	public RPSController()
	{
		rps = new RockPaperScissors();
		keyboardInput = new Scanner(System.in);
		difficultyOption = "";
	}
	
	public void start()
	{
		this.chooseDifficulty();
		
		if(difficultyOption.equalsIgnoreCase("normal"))
		{
			System.out.println("Rock, Paper, or Scissors?");
			String answer = keyboardInput.nextLine();
			int winOrLose = rps.normalMode(answer);
			if(winOrLose == 0)
			{
				System.out.println("LOSE");
				System.out.println("You guessed " + answer + ".");
				System.out.println("The computer guessed " + rps.getComputerChoice() + ".");
			}
			else if(winOrLose == 1)
			{
				System.out.println("WIN");
				System.out.println("You guessed " + answer + ".");
				System.out.println("The computer guessed " + rps.getComputerChoice() + ".");
			}
			else if(winOrLose == 2)
			{
				System.out.println("TIE");
				System.out.println("You guessed " + answer + ".");
				System.out.println("The computer guessed " + rps.getComputerChoice() + ".");
			}
		}
	}
	
	public void chooseDifficulty()
	{
		System.out.println("Welcome to Rock Paper Scissors.");
		System.out.println("What mode would you like to play?");
		System.out.println("Normal | Extreme");
		difficultyOption = keyboardInput.nextLine();
	}
}
