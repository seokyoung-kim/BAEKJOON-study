import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 알파벳 소문자로 이루어진 단어 s
		String s = sc.next();

		// 알파벳을 a부터 z까지 증가시킨 후 indexOf로 위치값을 리턴, 없으면 -1을 리턴
		for (char alpha = 'a'; alpha <= 'z'; alpha++) {
			System.out.print(s.indexOf(alpha) + " ");
		}
	}
}