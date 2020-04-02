import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// (0 ≤ h ≤ 23, 0 ≤ m ≤ 59)
		int h = sc.nextInt();
		int m = sc.nextInt();

		if (m >= 45) {
			System.out.println(h);
			System.out.println(m - 45);
		} else {
			if (h == 0) {
				System.out.println(23);
				m += 60;
				System.out.println(m - 45);
			} else {
				System.out.println(h - 1);
				m += 60;
				System.out.println(m - 45);
			}
		}
	}
}