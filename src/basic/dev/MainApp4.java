package basic.dev;

public class MainApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cac so tu 100 den 999 co tong chu so chia het cho 3 la:");
		for (int i = 100; i <= 999; i++) {
			int n = i;
			int sum = 0;
			while (n > 0) {
				sum += n % 10;
				n /= 10;
			}
			if (sum % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}
