import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[9];

		for (int i = 0; i < 9; i++) {
			n[i] = sc.nextInt();
		}

		// 최댓값
		int max = n[0];
		for (int i = 0; i < 9; i++) {
			if (max < n[i]) {
				max = n[i];
			}
		}
		System.out.println(max);

		// 최댓값은 몇번째 수?
		for (int i = 0; i < 9; i++) {
			if (max == n[i]) {
				System.out.println(i + 1);
			}
		}
	}
}