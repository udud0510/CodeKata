package yujin.programmers.level2test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import yujin.programmers.level2.Solution2_2;

public class Solution2_2Test {
    @Test

    public void 결과() {
        Solution2_2 solution = new Solution2_2();
        assertTrue("true", solution.solution("()()"));
        assertTrue("true", solution.solution("(())()"));
        assertFalse("false",solution.solution(")()("));
        assertFalse("false",solution.solution("(()("));
    }
}