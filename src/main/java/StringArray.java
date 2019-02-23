import java.util.Scanner;

public class StringArray {
    static public void stringArray() {
        int size = (Base.inputNumber(null, false)).intValue();
        String[] stringAr = new String[size];
        String oper = null;
        for (int i = 0; i < size; i++) {
            System.out.println("Введите "+ (1+i) +" слово из "+ size);
            Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
            oper = sc.nextLine();
           // System.out.println("Вы ввели: " + oper);
            stringAr[i]= oper;
             }
            int maxString = findMinMax(stringAr);
        System.out.println("Самое длинное слово в массиве: " + stringAr[maxString]+ "\n");
        }

    private static int findMinMax(String[] array) {
       int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > array[indexOfMax].length()) {
                indexOfMax = i;
            } else if (array[i].length() < array[indexOfMin].length()) {
                indexOfMin = i;
            }
        }
       return indexOfMax;
    }

}
