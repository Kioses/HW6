package main;

public class BetMore_Game {

	Shuffle s = new Shuffle();
	
	
	public int pick_card(Player player) {
		return s.randomNumber(player);
	}
	
}
