class Vehicle {
	int passenger;  // количество пасажиров транспортного средства
	int fuelcap;    // емкость топливного бака
	int mpg;        // потребление топлива в милях на галлон

	// возвратить дальность действия транспортного средства

	int range() {
		return mpg * fuelcap;
	}

	// рассчитать объём топлива, необходимого 
	// транспортному средству для заданного расстояния

	double fuelneeded(int miles) {
		return (double) miles / mpg ;
	}
}

class CompFuel {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle() ;
		Vehicle sportcar = new Vehicle() ;

		double gallons ;
		int dist = 252 ;

		// присваиваем значения полям в объекте minivan

		minivan.passenger = 7;
		minivan.fuelcap = 16; // 60 литров
		minivan.mpg = 21;

		// присваиваем значение полям в обьекте sportcar

		sportcar.passenger = 2;
		sportcar.fuelcap = 14;  // 52 литра 
		sportcar.mpg = 16;

		gallons = minivan.fuelneeded(dist) ;

		System.out.println ("To go " + dist + " miles minivan needs" + gallons + " gallons of fuel." ) ;

		gallons = sportcar.fuelneeded(dist) ;

		System.out.println ("To go " + dist + " miles sportcar needs" + gallons + " gallons of fuel." ) ;

	}
}