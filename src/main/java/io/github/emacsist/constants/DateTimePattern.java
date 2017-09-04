package io.github.emacsist.constants;

/**
 * 各种日期格式
 */
public enum DateTimePattern {

    YYYY_MM_DD_HH_MM_SS("yyyy-MM-dd HH:mm:ss"),
    YYYY_MM_DD_HH_MM("yyyy-MM-dd HH:mm"),
    YYYY_MM_DD_HH("yyyy-MM-dd HH"),
    YYYY_MM_DD("yyyy-MM-dd");

    private String formatter;

    public String formatter() {
        return this.formatter;
    }

    DateTimePattern(String formatter) {
        this.formatter = formatter;
    }
}
