package task8;

import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.DisallowWriteToSystemOut;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static task7.InputData.inputNumber;

/**
 * Created by BVV on 11.03.2019
 */

public class TestNumberInput {

    @Rule
    public final TextFromStandardInputStream systemInMock
            = emptyStandardInputStream();
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testMenuInput() {
        Double expectedNumber = 0.123456789;
        systemInMock.provideLines("0,123456789");
        assertEquals("Введенное число не равно 0.123456789", expectedNumber, inputNumber("1"));
        assertEquals("Сообщение на консоле не соответствует ожидаемому", "Введите 1-e число: Вы ввели число: 0.123456789",
                systemOutRule.getLog().replaceAll("\n|\r\n", ""));
        systemInMock.provideLines("не число");
        assertEquals("Полученный результат не соответствует ожидаемому", null, inputNumber("1"));
    }
}
