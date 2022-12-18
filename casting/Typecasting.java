package casting;

public class Typecasting {
	public static void main(String... args) {
		
//		----------WIDEDNING(Automatic) CASTING: converting smaller data type to larger data type. e.g int to double
		int number_int = 9;
		double number_double = number_int;
		
		System.out.println("------WIDENNING(Manaual) CASTING--------------");
		System.out.println(number_int);
		System.out.println(number_double);
		
//		----------NARROWING(Manual) CASTING: converting larger data type to smaller data type. e.g DOUBLE to INT
		System.out.println("------WIDENNING(Manaual) CASTING--------------");
		double double_number = 101.789d;
		int int_number = (int)double_number;
		
		System.out.println(double_number);
		System.out.println(int_number);
	}
}
