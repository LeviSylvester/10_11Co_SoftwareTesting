import org.junit.Assert;//see slide on how to import
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.when;

public class MockitoTestImpartire {
    @Mock
    private Impartire i;//deci nu lucram cu obiectul (comentat mai jos), ci cu un obiect Mock


    @Test
    public void testImpartire() {
        //given
//        Impartire i = new Impartire();
        double a = 5;
        double b = 6;


        //when
        when(i.impartire(a, b)).thenReturn(25.0);//se poate pune si verify, ex. vezi foto
        double result = i.impartire(a, b);

        //then
        Assert.assertEquals(30, result, 0);

    }
}
