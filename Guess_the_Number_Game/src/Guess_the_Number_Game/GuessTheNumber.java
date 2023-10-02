/**
 * Created by DHLakshitha on 2/10/23.
 */

package Guess_the_Number_Game;

import java.util.Scanner;

public class GuessTheNumber {
	
	public static void main(String [] args) {
		
		int randomNumber = (int) (Math.random() * 100)+ 1;
		boolean hasWonGame = false;
		
		System.out.println("Now you can randomly chosen a number between 1 and 100");
		System.out.println("If you can! Try to guess it.");
		
		Scanner scanner = new Scanner(System.in);
		
		for ( int i = 10; i > 0; i-- ) {
			System.out.print("You have " + i + " guess(es) left. Try to choose : ");
			int guess = scanner.nextInt();
			
			if ( randomNumber < guess ) {
				System.out.println("It's smaller than " + guess + ".");
			}
			else if ( randomNumber > guess ) {
				System.out.println("It's greater than " + guess + ".");
			}
			else {
				hasWonGame = true;
				break;
			}
		}
		
		if (hasWonGame) {
			System.out.println("That's CORRECT... You WON!!!!");
		}
		else {
			System.out.println("<< GAME OVER >> You LOSE!!!!");
			System.out.println("The number was : " + randomNumber);
		}
	}

}
