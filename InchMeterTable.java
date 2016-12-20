//перевод дюймов в метры
class InchMeterTable {
	public static void main(String[] args) {
		double inch, meter;
		int count;

		count = 0;

		for (meter = 1;meter <= 100;meter ++) {
			inch = meter * 39.37;
			System.out.println (meter + " meter is " + inch + " inchs");

			count ++;
			if (count == 12){
				System.out.println();
				count = 0;
			}

		}
	}
}