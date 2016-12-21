// чтение символа с клавы
class KbIn {
	public static void main(String[] args) 
		throws java.io IOExeption {

			char ch;

			System.out.print ("Press a key followed by ENTER: ");
			//ввод символа с клавиатуры

			ch = (char) System.in.read(); // получить значение типа char
			 System.out.println ("Your key is: " + ch);

		
        }
}