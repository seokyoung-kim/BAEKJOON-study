import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[5];

		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();

			if (a[i] < 40) {
				a[i] = 40;
			}
		}

		int sub = 0;
		for (int i = 0; i < 5; i++) {
			sub += a[i];
		}

		int avg = sub / 5;

		System.out.println(avg);
	}
}