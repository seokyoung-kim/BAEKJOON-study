import java.util.*;

// ArrayList를 이용한 문제풀이

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
		ArrayList<Integer> list1 = new ArrayList<Integer>();

		list1.add(sa);
		list1.add(ju);
		list1.add(ha);

		// 콜라 가격
		int co = sc.nextInt();
		// 사이다 가격
		int ci = sc.nextInt();

		// 세 버거 중 가장 싼 음료의 가격
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list2.add(co);
		list2.add(ci);

		// 가장 싼 세트 메뉴의 가격 출력
		int set = (int) Collections.min(list1) + (int) Collections.min(list2) - 50;
		System.out.println(set);
	}
}