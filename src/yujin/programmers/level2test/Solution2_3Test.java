package yujin.programmers.level2test;

import org.junit.Test;

import yujin.programmers.level2.Solution2_3;

import static org.junit.Assert.assertEquals;

public class Solution2_3Test {
    @Test
    public void 결과() {
        Solution2_3 solution = new Solution2_3();
        int[] array = {1, 3,2,5,4};
        int[] array2 = {2,2,3,3};

        assertEquals(3, solution.solution(array,9));
        assertEquals(4, solution.solution(array2,10));
    }
}
