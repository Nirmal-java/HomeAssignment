package week1.homeAssignment;

public class Fibonacci {

	public static void main(String[] args) {

		int f1 = 0, f2 = 1, temp;
		System.out.println("Fibonacci Series for Range 8 : \n");
		for (int i = 1; i <= 8; i++) {
			System.out.print(f1+" ");
			temp = f1;
			f1 = f2;
			f2 = f1 + temp;
		}
	}
}
