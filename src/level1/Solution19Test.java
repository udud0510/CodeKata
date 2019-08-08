package level1;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Solution19Test {
	@Test
	public void 결과() {
		Solution19 solution = new Solution19();

		int[] arr = { 4, 3, 2, 1 };
		int[] answer = { 4, 3, 2 };

		int[] arr2 = { 10 };
		int[] answer2 = { -1 };

		int[] arr3 = { 5,1,2,6,8 };
		int[] answer3 = {5,2,6,8 };
		

		assertArrayEquals(answer, solution.solution(arr));
		assertArrayEquals(answer2, solution.solution(arr2));
		assertArrayEquals(answer3, solution.solution(arr3));
	}
}
