public class BeerSong {
	public static void main(String[] args) {
		
		int beerNum = 99;
		String word = "bottles";

		while (beerNum > 0) {
			if (beerNum == 1) {
				word = "bottle";
			}

			System.out.println (beerNum + " " + word + " beer on the wall");

			System.out.println (beerNum + " " + word + " beer");
			System.out.println ("Take one.");
			System.out.println ("Go in a circle!");

			beerNum -= 1;
			if (beerNum > 0) {
				System.out.println (beerNum + " " + word + " beer on the wall");
			} else {
				System.out.println ("No bottles of beer on the wall!");
			}
		}
	}
}