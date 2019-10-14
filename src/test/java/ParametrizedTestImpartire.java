//unmodified from Alex:
/*import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class CalculatorTest {
    @Parameter(0)
    public int a;
    @Parameter(1)
    public int b;
    @Parameter(2)
    public int result;
    @Parameterized.Parameters
    public static Collection<Integer[]> parameters() {
        return Arrays.asList(new Integer[][] {
                {1, 1, 2},
                {2, 4, 6},
                {1, 6, 7},
                {4, 1, 5}
        });
    }
    @Test
    public void TestCalculatorSum() {
        Calculator calculator = new Calculator();
        assertEquals(result, calculator.sum(a, b));
    }
}*/

//modified: //continue at home
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class ParametrizedTestImpartire {
    @Parameter(0)
    public int a;
    @Parameter(1)
    public int b;
    @Parameter(2)
    public int result;
    @Parameterized.Parameters
    public static Collection<Double[]> parameters() {
        return Arrays.asList(new Double[][] {
                {1.0, 1.0, 1.0},
                {2.0, 4.0, 0.5},
                {1.0, 6.0, 0.15},
                {4.0, 1.0, 4.0}
        });
    }
    @Test
    public void TestImpartire() {
        Impartire i = new Impartire();
        assertEquals(result, i.impartire(a, b), 0);
    }
}