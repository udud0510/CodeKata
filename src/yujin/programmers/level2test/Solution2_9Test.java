package yujin.programmers.level2test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import yujin.programmers.level2.Solution2_9;

public class Solution2_9Test {
	@Test
	public void 영어끝말잇기() {
		Solution2_9 solution = new Solution2_9();

		String[] words = { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" };
		String[] words2 = { "hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure",
				"establish", "hang", "gather", "refer", "reference", "estimate", "executive" };
		String[] words3 = { "hello", "one", "even", "never", "now", "world", "draw" };

		int[] result = { 3, 3 };
		int[] result2 = { 0, 0 };
		int[] result3 = { 1, 3 };

		assertEquals(result, solution.solution(3, words));
		assertEquals(result2, solution.solution(5, words2));
		assertEquals(result3, solution.solution(2, words3));
	}

}
