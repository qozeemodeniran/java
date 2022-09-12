package arrays;

public class Multidimensional {
	public static void main(String... args) {
		int[][] EvenOdd = { {2, 4, 6, 8,}, {1, 3, 5, 7} };
		
		// output the third element in the second array (i.e 5)
		int thirdInSecond = EvenOdd[1][2];
//		System.out.println(thirdInSecond);
		
		// iterating a multidemensional array with nested for loop
		for (int i=0; i<EvenOdd.length; i++) {
			for (int j=0; j<EvenOdd[i].length; j++) {
				System.out.println(EvenOdd[i][j]);
			}
		}
	}
}
