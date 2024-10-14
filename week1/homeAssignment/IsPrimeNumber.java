package week1.homeAssignment;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int number = 13;
		for (int i = 2; i <= (number - 1); i++) {
			if (number % i == 0) {
				System.out.println(number + " is not prime");
				break;
			} else {
				if (i == (number - 1))
					System.out.println(number + " is prime");
			}

		}
	}

}
