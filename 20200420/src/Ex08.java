/* 문제2. 다음식을 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성하자.
 *   A B
 * + B A
 * -----
 *   9 9
 */
public class Ex08 {
	public static void main(String[] args) {
		for(int A=0; A<10; A++) {
			for(int B=0; B<10; B++) {
				if(A+B==9) {
					System.out.println("A = "+A+" B = "+B);
				}
			}
		}
	}
}
