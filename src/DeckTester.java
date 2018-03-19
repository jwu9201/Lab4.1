/* Lab 4.1
 * By: Jason Wu
 */
public class DeckTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] rank = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suit = {"Diamonds", "Clubs", "Hearts", "Spades"};
		int[] value = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		Deck test = new Deck(rank, suit, value);
		
		test.Shuffle();
		for (int i = 1; i <= 52; i++) {
			System.out.print(i + ".) " + test.Deal().toString() + " ");
			if (i % 4 == 0) {
				System.out.println();
			}
		}
		
		
		
		
	}

}
