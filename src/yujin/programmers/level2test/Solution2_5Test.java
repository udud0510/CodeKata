package yujin.programmers.level2test;

import org.junit.Test;

import yujin.programmers.level2.Solution2_5;

import static org.junit.Assert.assertArrayEquals;

public class Solution2_5Test {
    @Test
    public void 결과() {
        Solution2_5 solution = new Solution2_5();
        int[]heights = {6,9,5,7,4};
        int[]heights2= {3,9,9,3,5,7,2};
        int[]heights3= {1,5,3,6,7,6,5};

        int[]answer= {0,0,2,2,4};
        int[]answer2= {0,0,0,3,3,3,6};
        int[]answer3= {0,0,2,0,0,5,6};

        assertArrayEquals(answer,solution.solution(heights));
        assertArrayEquals(answer2,solution.solution(heights2));
        assertArrayEquals(answer3,solution.solution(heights3));

    }
}
