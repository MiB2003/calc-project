package task7;

import static task7.StartMenu.startMenu;

/**
 * create by Bykov V.V.
 */

public class Base7 {

    public static void main(String[] args) {
        int result = 0;
        while (result != 2) {
            result = startMenu();
            if (result == 1) Calc.calc();
        }
    }
}

