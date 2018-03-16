import java.util.ArrayList;

public class Deck {
	ArrayList<Card> unDealt;
	ArrayList<Card> Dealt;

	public Deck(String[] rank, String[] suit, int[] value) {
		ArrayList<Card> unDealt = new ArrayList<Card>();
		ArrayList<Card> Dealt = new ArrayList<Card>();
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
	public void Swap(int pos1,int pos2) {
		Card card = unDealt.get(pos1);
		unDealt.set(pos1, unDealt.get(pos2));
		unDealt.set(pos2, card);
		
	}
	
	public void Shuffle() {
		for (int i = 0; i < Dealt.size(); i++) {
			unDealt.add(Dealt.get(0));
			Dealt.remove(0);
		}
		for (int k = 51; k >= 0; k--) {
			int r = (int)Math.random()*51;
			Swap(r,k);
		}
		for (int k = 51; k >= 0; k--) {
			int pos = k;
			for (int j = k; j >= 0; j--) {
				Card select = unDealt.get(pos);
				if (select.getValue() > unDealt.get(j).getValue()) {
					select = unDealt.get(j);
					pos = j;
				}
			}
			Swap(pos,k);
		}
	}
}
