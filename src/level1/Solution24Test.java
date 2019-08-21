package level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Solution24Test {
	@Test
	public void 결과() {
		Solution24 solution = new Solution24();
		
		assertEquals("TUE", solution.solution(5,24));
	}
}