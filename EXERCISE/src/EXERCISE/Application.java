package EXERCISE;

public class Application {
	public static boolean exercise(int k, int[] numbers) {
		for (int i = 0; i < numbers.length;) {

			if (numbers[i] + numbers[i + 1] == k) {

				return true;

			} else if (numbers[i] + numbers[i + 2] == k) {

				return true;

			}

			else if (numbers[i] + numbers[i + 3] == k) {

				return true;
			} else if (numbers[i + 1] + numbers[i + 2] == k) {

				return true;
			} else if (numbers[i + 1] + numbers[i + 3] == k) {

				return true;

			} else if (numbers[i + 2] + numbers[i + 3] == k) {

				return true;
			}else {
				
				return false;

			}}
		return false;

		
		
		 
		
		
		
	

	}
	public static void main(String[] args) {
		int[] numbers = { 10, 7, 3, 8 };
		

			System.out.println(exercise(20, numbers));
		

	}
}