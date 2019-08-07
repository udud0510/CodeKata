package level1;

import java.util.Arrays;
import java.util.Collections;

public class Solution17 {

	/*
	 * <정수 내림차순으로 배치하기> 
	 * 함수 solution은 정수 n을 매개변수로 입력받습니다. 
	 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
	 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
	 * 
	 * <제한사항>
	 * n은 1이상 8000000000 이하인 자연수입니다.
	 * 
	 * <입출력 예>
	 * n					return
	 * 118372		873211
	 * 
	 */

	public long solution(long n) {
	      long answer = 0;
	      int len = Long.toString(n).split("").length;
	      
	      String[] array = new String[len];
	      array= Long.toString(n).split("");
	      
	      String tmp="";
	      
	      // 오름차순 정렬이 아닌 내림차순 정렬법
	      Arrays.sort(array, Collections.reverseOrder());
		
	      for(int i=0;i<len;i++) {
		      tmp+=(long) Integer.parseInt(array[i]);
	      }
	      
	      answer=Long.parseLong(tmp);
	      return answer;
	  }
}
