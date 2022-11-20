package main;

public class Player {
	
	BetMore_Game Bet = new BetMore_Game();
	
	int score;
	
	public int play(Player player) {
		
		return Bet.pick_card(player);
	}
	
	


	
	
	
}
