import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String nNum = sc.next();
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += Integer.parseInt(Character.toString(nNum.charAt(i)));
		}
		
		System.out.println(sum);
	}
}