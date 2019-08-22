package level2Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import level2.Solution2_2;

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