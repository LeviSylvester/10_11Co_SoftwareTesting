import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestImpartire {
//    @Test(expected = ArithmeticException.class)
//    public void testImpartire() {
//        //given
//        Impartire i = new Impartire();
//        double a = 5;
//        double b = 0;
//
//        //when
//        i.impartire(a, b);
//
//        //daca astept sa vina exceptia, then-ul este defapt exceptia
////        //then
////        Assert.assertEquals(5, result, 0); //delta inseamna precizia la cate zecimale devianta accepta ca egale

    //in mod alternativ exceptia definita prin prin Rule:
//    @Rule
//    public ExpectedException expectedException = ExpectedException.none();//<--pt ca e privat constructorul si nu pot sai fai new ExpectedException();
//
//    @Test
//    public void testImpartire() {
//        //given
//        Impartire i = new Impartire();
//        double a = 5;
//        double b = 0;
//
//        expectedException.expect(ArithmeticException.class);
//
//        //when
//        i.impartire(a, b);
//
//    }

    //alt caz in care vrem ca dupa fiecare test sa verifice o anumita linie (sa revina la starea initiala)
    @Before //sau After dupa Test, sau si Before inainte, si After dupa
    //exista si BeforeClass si AfterClass, care in schimb trebuie sa fie statice, vezi foto
    public void print(){
        System.out.println("Running tests");
    }

    @Test
    public void testImpartire() {
        //given
        Impartire i = new Impartire();
        double a = 5;
        double b = 1;


        //when
        double result = i.impartire(a, b);

        //then
        Assert.assertEquals(5, result, 0);

    }
}