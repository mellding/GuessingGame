import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int randomNumber = rand.nextInt(100) + 1;
		//System.out.println("randomNumber = " + randomNumber);

		int tryCount = 0;
		while(true) {
			System.out.println("Enter your guess (1-100):");
			int playerGuess = scanner.nextInt();
			tryCount++;
		
			if(playerGuess == randomNumber) {
				System.out.println("Correct, you win!");
				System.out.println("In only " + tryCount + " tries");
				break;
			}else if(randomNumber > playerGuess) {
				System.out.println("Nope, The Number is higher");
			}else {
				System.out.println("Nope, The Number is lower");
			}
		}
	}

}
