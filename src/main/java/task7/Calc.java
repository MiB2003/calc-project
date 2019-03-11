package task7;

import java.util.Scanner;
import static task7.InputData.inputNumber;
import static task7.InputData.inputOperations;

public class Calc {

    static MathemImplementacion mathemImplementacion = new MathemImplementacion();

    static public void calc() {

        Double d;
        Double d2;

        d = inputNumber("1");
        if (d == null) return;
        d2 = inputNumber("2");
        if (d2 == null) return;

        Double res = null;
        String operation = inputOperations();
        switch (operation) {
            case "+":
                res = mathemImplementacion.plus(d, d2);
                break;
            case "-":
                res = mathemImplementacion.minus(d, d2);
                break;
            case "/":
                try {
                    if (d2 != 0) {
                        res = mathemImplementacion.division(d, d2);
                        break;
                    }   else throw new ArithmeticException("Деление на ноль недопустимо!");
                } catch (ArithmeticException ex) {
                    System.out.println(ex.getMessage());
                  return;
                }
            case "*":
                res = mathemImplementacion.multipl(d, d2);
                break;
            default:
                return;
        }
        System.out.printf("%.4f  %s %.4f  = %.4f %n", d, operation, d2, res);
    }
}
