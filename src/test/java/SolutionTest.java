import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void addTest() {
        Assertions.assertEquals(Solution.chu(1, 1), 2);
        Assertions.assertEquals(Solution.chu(1, 2), 3);
        Assertions.assertEquals(Solution.chu(-1, 1), 0);
        Assertions.assertEquals(Solution.chu(Integer.MAX_VALUE, Integer.MIN_VALUE), -1);
    }
}
