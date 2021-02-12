package org.la.student.noura.clas;

public class Club {
	
	private String  playerName;
	private int  playerNumber;
	private int numberOfGoals;

	
	

	public Club(String n,int b,int m) {
		playerName=n;
		playerNumber=b;
		numberOfGoals=m;
		
	}

	public String getName() {
		return playerName;
	}

	public void show() {
		System.out.println("name: "+playerName+" "+"number Of the player: "+playerNumber+" "+" "+"number of goals: "+numberOfGoals);
	}
	
}
