import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 시험본 과목의 개수 N
		int n = sc.nextInt();

		// 현재 성적 입력
		double[] old = new double[n];
		for (int i = 0; i < n; i++) {
			old[i] = sc.nextInt();
		}

		// 최댓값 M 선택
		double m = old[0];
		for (int i = 0; i < n; i++) {
			if (m < old[i]) {
				m = old[i];
			}
		}
		// 모든 점수 = 점수/M*100
		for (int i = 0; i < n; i++) {
			old[i] = (old[i] / m) * 100;
		}
		
		// 새로운 평균
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += old[i];
		}
		double avg = sum / n;
		
		System.out.println(avg);
	}
}