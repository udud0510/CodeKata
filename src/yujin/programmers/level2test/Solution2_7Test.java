package yujin.programmers.level2test;

import org.junit.Test;

import yujin.programmers.level2.Solution2_7;

import static org.junit.Assert.assertArrayEquals;

public class Solution2_7Test {
    @Test
    public void 결과() {
        Solution2_7 solution = new Solution2_7();

        int[] progress = { 93, 30, 55 };
        int[] speeds = { 1, 30, 5 };
        int[] answer = { 2, 1 };

        int[] progress2 = { 40, 93, 30, 55, 60, 65 };
        int[] speeds2 = { 60, 1, 30, 5, 10, 7 };
        int[] answer2 = { 1, 2, 3 };

        assertArrayEquals(answer, solution.solution(progress, speeds));
        assertArrayEquals(answer2, solution.solution(progress2, speeds2));
    }
}
