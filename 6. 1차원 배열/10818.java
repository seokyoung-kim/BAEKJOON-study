import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 정수의 개수 n
		int n = sc.nextInt();

		// n개의 정수를 공백으로 구분
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		// 최솟값 계산
		int max = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		// 최댓값 계산
		int min = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}

		System.out.println(min + " " + max);

	}
}