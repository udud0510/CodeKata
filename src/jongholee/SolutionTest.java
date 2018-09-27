package jongholee;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {


    @Test
    public void testX() {
        Solution solution = new Solution();
        assertEquals(12, solution.solution(3, 5));
        assertEquals(3, solution.solution(3, 3));
        assertEquals(12, solution.solution(5, 3));
    }

}