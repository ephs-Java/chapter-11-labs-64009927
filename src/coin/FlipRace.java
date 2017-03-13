package coin;

public class FlipRace {
	// -----------------------------------------------------------------
	// Flips two coins until one of them comes up heads three times in a row.
	// -----------------------------------------------------------------
	public static void main(String[] args) {

		// Create two separate coin objects

		Coin coin1 = new Coin();
		Coin coin2 = new Coin();

		// Print the flip results (uses Coin's toString method)

		/*
		 * coin1.flip(); coin2.flip();
		 * 
		 * System.out.println("Coin 1: " + coin1); System.out.println("Coin 2: "
		 * + coin2);
		 */

		// stop the flipping once one of the coins gets to heads, 3 times in a
		// row

		int count1 = 0;
		int count2 = 0;
		int three = 3;

		while (count1 < three && count2 < three) {

			coin1.flip();
			coin2.flip();

			System.out.println("Coin 1: " + coin1);
			System.out.println("Coin 2: " + coin2);

			if (coin1.isHeads()) {
				count1++;
			} else {
				count1 = 0;
			}

			if (coin2.isHeads()) {
				count2++;
			} else {
				count2 = 0;
			}

		}

		if (count1 < three)
			System.out.print("Coin 1 got three heads first");
		else if (count2 < three)
			System.out.print("Coin 2 got three heads first.");
		else
			System.out.print("Both got three heads together.");

	}
}