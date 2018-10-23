package yujin.programmers.hash;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2Test {


    @Test
    public void 결과() {
        Solution2 solution = new Solution2();

        String p1[] = {"119", "97674223", "1195524421"};
        String p2[] = {"123", "456", "789"};
        String p3[] = {"12", "123", "1235", "567","88"};


        assertEquals(false, solution.solution(p1));
        assertEquals(true, solution.solution(p2));
        assertEquals(false, solution.solution(p3));

    }

}