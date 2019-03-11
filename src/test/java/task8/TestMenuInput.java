package task8;

import org.junit.*;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import java.io.ByteArrayInputStream;

import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;
import static task7.StartMenu.startMenu;

/**
 * Created by BVV on 11.03.2019
 */

public class TestMenuInput {
    @Rule
    public final TextFromStandardInputStream systemInMock
            = emptyStandardInputStream();
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testMenuInput() {
        systemInMock.provideLines("1");
        int menu = startMenu();
        Assert.assertTrue("Полученное значение не равно 1", menu == 1);

        systemInMock.provideLines("2");
        menu = startMenu();
        Assert.assertTrue("Полученное значение не равно 2", menu == 2);

    }


}
