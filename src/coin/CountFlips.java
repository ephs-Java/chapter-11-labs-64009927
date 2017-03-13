package coin;

public class CountFlips {
	// -----------------------------------------------------------------
	// Flips a coin multiple times and counts the number of heads
	// and tails that result.
	// Output:
	// The number flips: 1000
	// The number of heads: 493
	// The number of tails: 507
	// -----------------------------------------------------------------
	public static void main(String[] args) {

		Coin myCoin = new Coin();
		int heads = 0;
		int tails = 0;
		int count = 1000;

		for (int i = 1; i <= count; i++) {

			myCoin.flip();

			if (myCoin.isHeads()) {
				heads++;
			} else {
				tails++;
			}

		}

		System.out.println("The number of flips: " + count);

		System.out.println("The number of heads: " + heads);

		System.out.println("The number of tails: " + tails);

	}
}
