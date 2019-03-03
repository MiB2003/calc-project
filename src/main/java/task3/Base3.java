package task3;

import static task3.StartMenu.startMenu;

/**
 * create by Bykov V.V.
 */

public class Base3 {

    public static void main(String[] args) {
        int result=0;
        while (result!=3){
            result = startMenu();
            if (result == 1) Calc.calc();
            if (result == 2) StringArray.stringArray();
        }
    }
}

