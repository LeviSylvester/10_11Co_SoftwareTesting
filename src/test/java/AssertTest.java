import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class AssertTest {
    @Parameter(0)
    public int a;
    @Parameter(1)
    public int b;
    @Parameter(2)
    public int result;
    @Parameterized.Parameters
    public static Collection<Integer[]> parameters() {
        return Arrays.asList(new Integer[][] {
                {1, 1, 1},
                {2, 4, 8},
                {1, 6, 6},
                {4, 1, 4}
        });
    }
    @Test
    public void TestInmultire() {
        Inmultire i = new Inmultire();
//        assertEquals(result, i.inmultire(a, b));
//        assertEquals(result, i.inmultire(a, b));
//        assertEquals(result, i.inmultire(a, b));
//        assertEquals(result, i.inmultire(a, b));
        assertThat(result)
                .isEqualTo(7)
                .isNotNull();
        //...
    }
}
