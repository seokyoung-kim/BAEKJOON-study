import java.util.Scanner;

// 배열을 이용한 문제 풀이

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 햄버거 : 상덕버거, 중덕버거, 하덕버거
		// 음료 : 콜라, 사이다

		// 100~2000
		// 상덕버거 가격
		int sa = sc.nextInt();
		// 중덕버거 가격
		int ju = sc.nextInt();
		// 하덕버거 가격
		int ha = sc.nextInt();

		// 세 버거 중 가장 싼 버거의 가격
		int[] cb = { sa, ju, ha };
		int min1 = cb[0];

		for (int i = 0; i < cb.length; i++) {
			if (cb[i] < min1) {
				min1 = cb[i];
			}
		}

		// 콜라 가격
		int co = sc.nextInt();
		// 사이다 가격
		int ci = sc.nextInt();

		// 세 버거 중 가장 싼 음료의 가격
		int[] cd = { co, ci };
		int min2 = cd[0];

		for (int i = 0; i < cd.length; i++) {
			if (cd[i] < min2) {
				min2 = cd[i];
			}
		}

		// 가장 싼 세트 메뉴의 가격 출력
		int set = (min1 + min2) - 50;
		System.out.println(set);
	}
}