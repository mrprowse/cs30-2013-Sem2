package com.me.mygdxgame;


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
    	/* IF (SCORE > 0) {
    	 * IF(SCORE <= 100)
    		THIS.SCORE += 5
    	}
*/    
        if(score > 0){
            this.score = score;
        }
        else{
            this.score = 0;
        }
}
}
