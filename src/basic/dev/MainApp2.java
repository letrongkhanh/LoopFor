package basic.dev;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		long first = 0, second = 1;

		System.out.println("100 so Fibonacci dau tien:");
		System.out.print(first + " " + second + " ");

		for (int i = 2; i < n; i++) {
			long next = first + second;
			System.out.print(next + " ");
			first = second;
			second = next;
		}
	}

}
