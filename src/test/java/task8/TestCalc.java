package task8;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import task7.Calc;
import task7.InputData;

import static org.junit.Assert.assertEquals;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;
import static task7.InputData.inputNumber;

/**
 * Created by BVV on 11.03.2019
 */

public class TestCalc {

    @Rule
    public final TextFromStandardInputStream systemInMock
            = emptyStandardInputStream();
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testCalc() {
        String expectedOperations = "-";
        systemInMock.provideLines("-");
        assertEquals("-", expectedOperations, InputData.inputOperations());
        assertEquals("Сообщение на консоле не соответствует ожидаемому", "Введите знак требуемой операции: + (сложение), - (вычетание), * (умножение), / (деление)" +
                "Вы выбрали: -", systemOutRule.getLog().replaceAll("\n|\r\n", ""));
        systemOutRule.clearLog();
        expectedOperations = "+";
        systemInMock.provideLines("+");
        assertEquals("+", expectedOperations, InputData.inputOperations());
        assertEquals("Сообщение на консоле не соответствует ожидаемому", "Введите знак требуемой операции: + (сложение), - (вычетание), * (умножение), / (деление)" +
                "Вы выбрали: +", systemOutRule.getLog().replaceAll("\n|\r\n", ""));
        systemOutRule.clearLog();
        expectedOperations = "/";
        systemInMock.provideLines("/");
        assertEquals("/", expectedOperations, InputData.inputOperations());
        assertEquals("Сообщение на консоле не соответствует ожидаемому", "Введите знак требуемой операции: + (сложение), - (вычетание), * (умножение), / (деление)" +
                "Вы выбрали: /", systemOutRule.getLog().replaceAll("\n|\r\n", ""));
        systemOutRule.clearLog();
        expectedOperations = "*";
        systemInMock.provideLines("*");
        assertEquals("*", expectedOperations, InputData.inputOperations());
        assertEquals("Сообщение на консоле не соответствует ожидаемому", "Введите знак требуемой операции: + (сложение), - (вычетание), * (умножение), / (деление)" +
                "Вы выбрали: *", systemOutRule.getLog().replaceAll("\n|\r\n", ""));
    }
}
