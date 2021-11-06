import com.flamexander.cloud.client.feign.controller.HomeWork7TestInSpring;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/*
 * Тест метода который проверяет, имеет ли входной массив хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
 */
@RunWith(Parameterized.class)
public class ParamTestException {
    private HomeWork7TestInSpring homeWork7TestInSpring;
    private int a,b,c,d;

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1,2,3,4},
                {7,3,4,1},
                {2,4,2,1},
                {4,1,2,1},
                {1,2,3,0},
                {1,2,2,5}
        });
    }

    public ParamTestException(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Before
    public void init() {
        homeWork7TestInSpring = new HomeWork7TestInSpring();
    }

    @Test(expected = RuntimeException.class)
    public void testException(){
        Assert.assertArrayEquals(new int[]{c,d}, homeWork7TestInSpring.ar(new int[]{a,b,c,d}));
    }
}
