import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		System.out.println("스위치");
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		switch (input) {
		case 1:
			System.out.println("1 입력");
			break;
		case 2:
			System.out.println("2 입력");
			break;
		case 3:
			System.out.println("3 입력");
			break;
		default:
			System.out.println("올바른 입력이 아닙니다.");
			break;
		}
	}
}
