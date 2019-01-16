import org.junit.Test;
import task.WhichAreIn;

import static org.junit.Assert.assertArrayEquals;

public class WhichAreInTest {
    @Test
    public void test1() {
        String a[] = new String[] { "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        String c[] = new String[] {"sds"};
        String d[] = new String[]{};
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
        assertArrayEquals(d, WhichAreIn.inArray(c, b));
    }
}
