package main;
import java.util.*;
public class Shuffle {


		
	public int randomNumber(Player player) {
		
		//This gives you a random number in between 0 (inclusive) and 101 (exclusive)
		Random r = new Random();
		int low = 0;
		int high = 101;
		int result = r.nextInt(high-low) + low;
		
		player.score = result;
		
		return result;
	}
		
	

}
