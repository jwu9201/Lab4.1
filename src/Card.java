
public class Card {
	String rank;
	String suit;
	int pointValue;

	public Card(String rank, String suit, int pointValue) {
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public void setValue(int pointValue) {
		this.pointValue = pointValue;
	}
	
	public int getValue() {
		return pointValue;
	}
	
	public boolean equals(Card first, Card second) {
		if (first.getValue() == second.getValue()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return (rank + " of " + suit + " with a value of " + pointValue); 
	}
	
}

