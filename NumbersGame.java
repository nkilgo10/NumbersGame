
import java.util.Random;
import java.util.Scanner;

public class NumbersGame {
	
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner userInput = new Scanner(System.in);
			Random r = new Random();
			
			int mode = 0;
			
					switch(mode)
					{
					case 1:
						System.out.println("Guess a number between 1 and 10");
						 break;
							
					}		
			
				
				int numbertoGuess = 0;
				int guess = userInput.nextInt();
				int answer = r.nextInt(2);
				
				
					 guess = userInput.nextInt();
					if(guess > numbertoGuess)
						System.out.println("You guessed to high");
					
					else if(guess < numbertoGuess)
						System.out.println("You guessed to low");
					
					else
					{
						System.out.println("I can't believe you got it right!!!");
						
					}
						
			if(guess != numbertoGuess)
				System.out.println("Try again next time!");
		
			
			if(answer < 0);
				
		
		}
	}



