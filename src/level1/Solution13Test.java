package level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Solution13Test {
	@Test
	public void 결과() {
		Solution13 solution = new Solution13();
		assertEquals("BC", solution.solution("AB", 1));
		assertEquals("a", solution.solution("z", 1));
		assertEquals("e F d", solution.solution("a B z", 4));
	}
}
