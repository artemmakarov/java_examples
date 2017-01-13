class Bubble {
	public static void main(String[] args) {
		
		int nums[] = {99, -10, 100123, 18, -978, 5623, 583, -7, 345, 91};
		int a,b,t;
		int size;

		size = 10; // количество элементов для сортировки

		//отобразить исходный массив
		System.out.println("Original array is:");
			for(int i = 0; i < size; i++)
				System.out.print(" " + nums[i]);
				System.out.println();

		//реализовать механизм пузырьковой сортировки
			for(a = 1; a < size; a++)
				for(b = size - 1; b >= a; b--) {
					if (nums[b - 1] > nums[b]) {  // если требуемый порядок следования
						t = nums[b - 1];          // не соблюдается, поменять элементы местами
						nums[b -1] = nums[b];
						nums[b] = t;

					}
				}

				// отобразить отсортированный массив

			System.out.println("Sorted array is:");
				for(int i = 0; i < size; i++)
					System.out.print(" " + nums[i]);
					System.out.println();

	}
}