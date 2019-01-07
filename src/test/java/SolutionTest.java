import org.junit.Test;
import task.Solution;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testNormalCondition() {
        assertEquals(9, Solution.solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
    }

    @Test
    public void testEmptyArray() {
        assertEquals(0, Solution.solveSuperMarketQueue(new int[] {}, 1));
    }

    @Test
    public void testSingleTillManyCustomers() {
        assertEquals(15, Solution.solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 1));
    }
    @Test
    public void testRandomValues () {
        assertEquals(23, Solution.solveSuperMarketQueue(new int[] { 1,5,7,4,2,6,7,1,1,5,3,1,1,3,2,4,4,7,7,4,7,3 }, 4));
    }

}