package task3;

import java.util.Scanner;

import static task3.InputData.inputNumber;

public class Calc {
    static public void calc() {
        Double d;
        Double d2;

        d = inputNumber("1", true);
        if (d == null) return;
        d2 = inputNumber("2", true);
        if (d2 == null) return;

        Double res = null;
        String operation = inputOperations();
        switch (operation) {
            case "+":
                res = d + d2;
                break;
            case "-":
                res = d - d2;
                break;
            case "/":
                res = d / d2;
                break;
            case "*":
                res = d * d2;
                break;
            default:
                return;
        }

        System.out.printf("%.4f  %s %.4f  = %.4f %n", d, operation, d2, res);

    }

    private static String inputOperations() {
        String oper = null;
        for (int i = 1; i < 4; i++) {
            System.out.println("Введите знак требуемой операции: + (сложение), - (вычетание), * (умножение), / (деление)");
            Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
            oper = sc.nextLine();
            if (!(oper.equals("+") || oper.equals("-") || oper.equals("/") || oper.equals("*"))) {
                if (i == 3) {
                    System.out.print("Превышено допустимое количетво попыток ввода...");
                    break;
                } else System.out.println("Вы ввели не допустимый символ операции, повторите ввод");
            } else {
                System.out.println("Вы выбрали: " + oper);
                break;
            }
        }
        return oper;
    }
}
