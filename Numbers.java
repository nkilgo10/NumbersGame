import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
	
		Scanner userInput = new Scanner(System.in);
		int mode = 0;
				
				int numberofGuesses = 0;
				int maxnumber = 0;
	
				switch(mode)
				{
				case 1:
					numberofGuesses = 1;
					 maxnumber = 10;
					
					 System.out.println("Guess a number between 1 and 10");
					 break;
						
				}		
			int answer = 5;
			
			int numbertoGuess = 0;
			
			int guess = 0;
			
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





	
			
			
	
	

	



	






	

