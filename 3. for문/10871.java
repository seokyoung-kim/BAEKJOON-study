import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		// 정수 n개의 수열
		int[] a = new int[n];

        // 배열을 n개만큼 입력
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (a[i] < x) {
				System.out.print(a[i] + " ");
			}
		}
	}
}