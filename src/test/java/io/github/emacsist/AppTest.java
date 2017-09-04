package io.github.emacsist;

import io.github.emacsist.constants.DateTimePattern;
import io.github.emacsist.kit.DateTimeKit;
import io.github.emacsist.kit.FileKit;
import org.junit.Test;

import java.util.Date;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testDateFormat() {
        Date d = new Date();

        System.out.println(DateTimeKit.format(d, DateTimePattern.YYYY_MM_DD_HH_MM_SS));

        System.out.println(DateTimeKit.format(d, DateTimePattern.YYYY_MM_DD_HH_MM));

        System.out.println(DateTimeKit.format(d, DateTimePattern.YYYY_MM_DD));

    }

    @Test
    public void testGetYesterday() {
        System.out.println(DateTimeKit.format(DateTimeKit.getYesterday(), DateTimePattern.YYYY_MM_DD_HH_MM_SS));
    }

    @Test
    public void testExt() {
        System.out.println(FileKit.getExt("hello.world.log"));
        System.out.println(FileKit.getExtWihtouDot("hello.world.log"));
    }
}
