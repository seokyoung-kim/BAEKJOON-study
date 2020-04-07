import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스의 개수 t
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int cnt = sc.nextInt();
			String str = sc.next();
			
			String p = "";
			
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < cnt; k++) {
					p += str.charAt(j);
				}
			}
			System.out.println(p);
		}
	}
}