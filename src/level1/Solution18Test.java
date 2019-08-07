package level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Solution18Test {
	@Test
	public void 결과() {
		Solution18 solution = new Solution18();
		assertEquals(144, solution.solution(121));
		assertEquals(-1, solution.solution(3));
	}
}
