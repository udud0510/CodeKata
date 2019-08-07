package level1;

public class Solution18 {

	/*
	 * <정수 제곱근 판별> 
	 * 임의의 정수 n에 대해, n이 어떤 정수 x의 제곱인지 아닌지 판단하려 합니다. 
	 * n이 정수 x의 제곱이라면 x+1의 제곱을 리턴하고,
	 *  n이 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
	 * 
	 * <제한사항> 
	 * n은 1이상, 50000000000000 이하인 정수입니다.
	 * 
	 * <입출력 예> 
	 * n			return
	 * 121	144
	 * 3			-1
	 * 
	 */

	public long solution(long n) {
		double a = 0;
		a = Math.sqrt(n);
		
		int b = (int)a;
		return b==a  ?  (long) Math.pow(a + 1, 2) : -1;
		
	}
}
