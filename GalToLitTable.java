//таблица преобразования галлонов в литры
class GalToLitTable {
	public static void main (String args[]) {
		double gal, lit;
		int counter;
		// первоначальное значение счетчика 0
		counter = 0;
		for (gal = 1; gal <=100; gal ++) {
			lit = gal * 3.7854; // преобразовать в литры
			System.out.println (gal + "gallons is " + lit + "liters");

			// увеличиваем счетчик на 1
			counter ++;
			if (counter == 10) {
				System.out.println();
				counter = 0; //сбрасываем счетчик на 0
				             // каждые 10 итераций
			}
		}
	}
}