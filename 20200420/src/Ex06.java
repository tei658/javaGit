/* 자연수 1부터 시작해서 모든 홀수를 더해나간다.
 * 그리고 그 합이 언제 1000을 넘어서는지, 1000을 넘어선 값은 얼마인지 계산하여 출력하는 프로그램을 작성해보자.
 * 
 */
public class Ex06 {
	public static void main(String[] args) {
		int a = 1;
		int total = 0;
		
		while(total<1000) {
			total+=a;
			a+=2;
		}
		
		System.out.println("total = "+total);
		System.out.println("a = "+(a-2));
	}
}
