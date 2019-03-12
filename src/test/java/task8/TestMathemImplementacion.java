package task8;

import org.junit.Test;
import task7.MathemImplementacion;
import static org.junit.Assert.assertEquals;


/**
 * Created by BVV on 11.03.2019
 */

public class TestMathemImplementacion {
    MathemImplementacion  mathemImplementacion = new  MathemImplementacion();
    @Test
    public void testMathematics() {
        Double number1 = 12.34;
        Double number2 = 56.78;

        Double expectedNumberMinus = -44.44;
        Double expectedNumberPlus = 69.12;
        Double expectedNumberMultipl = 700.6652;
        Double expectedNumberDivision = 0.2173300457907714;
        assertEquals("Полученное число не равно -44.44", expectedNumberMinus, mathemImplementacion.minus(number1,number2));
        assertEquals("Полученное число не равно 69.12", expectedNumberPlus, mathemImplementacion.plus(number1,number2));
        assertEquals("Полученное число не равно 700.6652", expectedNumberMultipl, mathemImplementacion.multipl(number1,number2));
        assertEquals("Полученное число не равно 0.2173300457907714", expectedNumberDivision, mathemImplementacion.division(number1,number2));
    }
}
