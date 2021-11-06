import com.flamexander.cloud.client.feign.controller.HomeWork7TestInSpring;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/*
 * Тест метода который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы, то метод вернет false.
 */
@RunWith(Parameterized.class)
public class ParamTestNumber {
    private HomeWork7TestInSpring homeWork7TestInSpring;
    private int a,b,c,d;

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1,2,3,4},
                {7,3,4,1},
                {2,4,2,1},
                {4,1,2,1},
                {3,6,2,5}
        });
    }

    public ParamTestNumber(int a, int b, int c, int d) {
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
        Assert.assertTrue(homeWork7TestInSpring.task2(a,b,c,d));
    }
}
