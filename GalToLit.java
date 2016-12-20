// перевод галлона в литры
class GalToLit {
	public static void main (String args[]) {
		double gallons; // обьем жидкости в галлонах
		double liters; // ... в литрах

		gallons = 5; //исходное значение 10 галлонов

		liters = gallons * 3.784; // преобразовать в литры

		System.out.println(gallons + " gallons is " + liters + " liters");
	}
}