package level2Test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import level2.Solution2_4;

public class Solution2_4Test {
    @Test
    public void 결과() {
        Solution2_4 solution = new Solution2_4();

        int[] dates = {4,10,15};
        int[] supplies = {20,5,10};

        assertEquals(2,solution.solution(4,dates, supplies, 30));
    }
}