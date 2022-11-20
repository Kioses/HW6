package main;
import java.util.Scanner;
public class Game_Chair {
	
	static Player Computer = new Player();
	static Player Player_2 = new Player();
	
	public int Start() {
		return Computer.play(Computer);
	}

	public int Start2() {
		return Player_2.play(Player_2);
	}
	
	public static void FindWinner() {
		System.out.println("Computer: " + Computer.score);
		System.out.println("Player_2: " + Player_2.score);
		
		if (Computer.score > Player_2.score) {
			System.out.println("You lost!");
		} else if (Computer.score == Player_2.score) {
			System.out.println("It's a draw!");
		} else {
			System.out.println("You won!");
		}
	}
	
	
	public static void main(String[] args) {
		
		Game_Chair chair = new Game_Chair();
		
		//Computer starts Playing
		chair.Start();
		
		//Player2 starts playing
		Scanner scanner = new Scanner(System.in);
		System.out.println("You can pick 5 times. Press 1 to continue or 2 to pick again:");
		
		int Versuche = 0;
		String ok = "1";
		String pickAgain = "2";
		
		while (Versuche < 5) {
			System.out.println(chair.Start2());
			String Eingabe = scanner.nextLine();  // Read user input
			if (Eingabe.equals(pickAgain)) {
				Versuche++;
				continue;
			} else if (Eingabe.equals(ok)){
				break;
			}
		}
		
		scanner.close();
		
		FindWinner();
		
	}
	
}
