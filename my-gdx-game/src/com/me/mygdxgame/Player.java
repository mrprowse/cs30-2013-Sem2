package com.me.mygdxgame;

//HEEEEELLLLOOOOO
public class Player {
	
	private int coins = 0;
    Bird Player = new Bird(); 
    private int score = 0;
    public static void main(String[] args) {
        
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        if(coins > 0) {
            this.coins = coins;
        }else{
            coins = 0;
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
    	//replace with formula for setting a score.
    	//need counter for moving adds 1 everytime it moves
    	// int score;
    	/* if ( player == alive) {
    	 * 		if(score <= 100) {
    	 * 		This.score += 10
    	 * 		}
    	 * 		else if(score > 100 & score < 500) {
    	 * 		this.score += 50
    	 * 		} else if (score > 500) {
    	 * 		this.score += 100
    	 * 		}
*/   
        if(score > 0){
            this.score = score;
        }
        else{
            this.score = 0;
        }
}
}
