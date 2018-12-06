package practice;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution2Test {

    @Test
    public void 결과() {
        Solution2 solution = new Solution2();

        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3}};
        int[] Return = {5};
        assertArrayEquals(Return,solution.solution(array,commands));

        int[] array2 = {1,5,2,6,3,7,4};
        int[][] commands2 = {{4,4,1}};
        int[] Return2 = {6};
        assertArrayEquals(Return2,solution.solution(array2,commands2));

        int[] array3 = {1,5,2,6,3,7,4};
        int[][] commands3 = {{1,7,3}};
        int[] Return3 = {3};
        assertArrayEquals(Return3,solution.solution(array3,commands3));

    }
}
