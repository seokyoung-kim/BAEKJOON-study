import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		char a = n.charAt(0);
		
		// char값을 int로 캐스팅
		System.out.println((int)a);
	}
}