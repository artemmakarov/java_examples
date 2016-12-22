// демонстрация цикла while
class WhileDemo {
	public static void main(String[] args) {
		char ch;
		
		// вывести буквы английского алфавита с помощью while
		ch = 'a';
		while (ch <= 'z') {
			System.out.print(ch);
			ch++;
		}
	}
}