import com.flamexander.cloud.client.feign.controller.HomeWork7TestInSpring;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/*
 * Тест проверяет корректность работы метода котрый возвращает новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки.
 */

@RunWith(Parameterized.class)
public class ParamTest {
    private HomeWork7TestInSpring homeWork7TestInSpring;
    private int a,b,c,d;

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1,2,3,4},
                {7,3,4,1},
                {2,4,2,1},
                {4,1,2,1}
        });
    }

    public ParamTest(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Before
    public void init() {
        homeWork7TestInSpring = new HomeWork7TestInSpring();
    }

    @Test
    public void testArray(){
        Assert.assertArrayEquals(new int[]{b,c,d}, homeWork7TestInSpring.ar(new int[]{a,b,c,d}));
    }
}
