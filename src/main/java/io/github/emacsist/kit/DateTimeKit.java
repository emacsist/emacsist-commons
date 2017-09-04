package io.github.emacsist.kit;

import io.github.emacsist.constants.DateTimePattern;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public final class DateTimeKit {

    private static final ThreadLocal<SimpleDateFormat> sdf = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat();
        }
    };

    public static String format(Date date, DateTimePattern pattern) {
        SimpleDateFormat format = sdf.get();
        format.applyPattern(pattern.formatter());
        return format.format(date);
    }

    public static Date getYesterday() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, -1);
        return calendar.getTime();
    }

    /**
     * 获取过去某时间差的 Date
     *
     * @param during   差距
     * @param timeUnit 单位
     * @return 差距之后的 Date
     */
    public static Date getLastDiffDate(long during, TimeUnit timeUnit) {
        long diff = System.currentTimeMillis() - timeUnit.toMillis(during);
        return new Date(diff);
    }

    public static Date getFutureDiffDate(long during, TimeUnit timeUnit) {
        long diff = System.currentTimeMillis() + timeUnit.toMillis(during);
        return new Date(diff);
    }
}
