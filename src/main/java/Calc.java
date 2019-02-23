import java.util.Scanner;

public class Calc {
    static public void calc() {
        Double d;
        Double d2;

        d = inputDouble("1");
        if (d == null) return;
        d2 = inputDouble("2");
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

        System.out.println(d + operation + d2 + " = " + res);
    }

    private static Double inputDouble(String n) {
        Double d = null;
        for (int i = 1; i < 4; i++) {
            System.out.print("Введите " + n + "-e число : ");
            Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
            if (!sc.hasNextDouble()) { // возвращает истинну если с потока ввода можно считать число
                if (i == 3) {
                    System.out.print("Превышено допустимое количетво попыток ввода");
                    break;
                } else System.out.println("Вы ввели не число, повторите ввод");
            } else {
                d = sc.nextDouble(); // считывает целое число с потока ввода и сохраняем в переменную
                System.out.println("Вы ввели число: " + d);
                break;
            }
        }
        return d;
    }

    private static String inputOperations() {
        String oper = null;
        for (int i = 1; i < 4; i++) {
            System.out.println("Введите знак требуемой операции: + (сложение), - (вычетание), * (умножение), / (деление)");
            //Введите: (+ сложить) (- вычесть) (* умножить) (/ делить)

            Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
            oper = sc.nextLine();
            if (!(oper.equals("+") || oper.equals("-") || oper.equals("/") || oper.equals("*"))) {
                if (i == 3) {
                    System.out.print("Превышено допустимое количетво попыток ввода");
                    break;
                } else System.out.println("Вы ввели не допустимый символ операции, повторите ввод");
            } else {
                System.out.println("Вы ввели : " + oper);
                break;
            }
        }
        return oper;
    }
}
