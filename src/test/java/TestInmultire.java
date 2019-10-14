import org.junit.Assert;
import org.junit.Test;

public class TestInmultire {
    @Test
    public void testInmultire() {
        //given
        Inmultire c = new Inmultire();
        int a = 5;
        int b = 10;

        //when
        int result = c.inmultire(a, b);

        //then
        Assert.assertEquals(50, result);


    }

}
