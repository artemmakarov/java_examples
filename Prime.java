// нахождение простых чисел от 2 до 100
class Prime {
	public static void main(String[] args) {
		int i, j;
		boolean isprime;

		for (i = 2; i < 100; i++) {

			isprime = true;
			// проверим делится ли число без остатка
			for (j = 2; j <i/j; j++) 
			//если делится без остатка то оно простое
			if ((i%j)==0 )isprime = false;

			if (isprime)	
				System.out.println (i +" is prime");

		}
	}
}
