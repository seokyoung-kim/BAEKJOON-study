import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a, b;

		for (int i = 1; i <= t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();

			System.out.print("Case #" + i + ": ");
			System.out.println(a + b);
		}
	}
}