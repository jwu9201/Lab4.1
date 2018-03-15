import java.util.ArrayList;

public class Deck {
	ArrayList<Card> unDealt;
	ArrayList<Card> Dealt;

	public Deck(String[] rank, String[] suit, int[] value) {
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < suit.length; j++) {
				unDealt.add((new Card(rank[i], suit[j], value[i])));
			}
		}
	}
	
	public boolean isEmpty() {
		if (unDealt.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int size() {
		return (unDealt.size());
	}
	
	public Card Deal() {
		if (unDealt.size() == 0) {
			return null;
		} else {
			Card deal = unDealt.get(0);
			Dealt.add(deal);
			unDealt.remove(0);
			return deal;
		}
	}
	public void Swap(Card card,int pos) {
		unDealt.
	}
	
	public void Shuffle() {
		for (int i = 0; i < Dealt.size(); i++) {
			unDealt.add(Dealt.get(0));
			Dealt.remove(0);
		}
		for (int k = 51; k >= 0; k--) {
			int r = (int)Math.random()*51;
			
		}
	}
}
