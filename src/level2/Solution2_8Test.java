package level2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2_8Test {
    @Test
    public void 결과() {
        Solution2_8 solution = new Solution2_8();
        int[] people = { 70,50,80,50 };
        assertEquals(3, solution.solution(people, 100));
    }
}
