package level2Test;

import org.junit.Test;

import level2.Solution2_1;

import static org.junit.Assert.assertEquals;
public class Solution2_1Test {
    @Test
    public void solution() {
        Solution2_1 solution = new Solution2_1();
        assertEquals( "1", solution.solution(1));
        assertEquals( "2",  solution.solution(2));
        assertEquals( "4",  solution.solution(3));
    }
}
