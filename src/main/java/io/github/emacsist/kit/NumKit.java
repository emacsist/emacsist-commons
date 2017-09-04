package io.github.emacsist.kit;

/**
 * 与数字相关的工具类
 */
public final class NumKit {
    public static long getPages(long total, long pageSize) {
        if (pageSize <= 0 || total < 0) {
            return 0L;
        }
        return total % pageSize == 0 ? total / pageSize : total / pageSize + 1;
    }

    /**
     * 如果为空，如果非法的情况（空、不是数字等）则返回0，其他情况返回相应的数字表示
     *
     * @param o
     * @return
     */
    public static long objectToLong(Object o) {
        if (o == null) {
            return 0L;
        }
        String oStr = String.valueOf(o);
        return strToLong(oStr);
    }

    public static long strToLong(String o) {
        if (o == null) {
            return 0L;
        }
        return Long.parseLong(o.trim());
    }

    public static int objectToInt(Object o) {
        if (o == null) {
            return 0;
        }
        String oStr = String.valueOf(o);
        return strToInt(oStr);
    }

    public static int strToInt(String o) {
        if (o == null) {
            return 0;
        }
        return Integer.parseInt(o.trim());
    }

    public static double objectToDouble(Object o) {
        if (o == null) {
            return 0.0D;
        }
        String oStr = String.valueOf(o);
        return strToDouble(oStr);
    }

    public static double strToDouble(String o) {
        if (o == null) {
            return 0.0D;
        }
        return Double.parseDouble(o.trim());
    }

    public static double objectToFloat(Object o) {
        if (o == null) {
            return 0.0F;
        }
        String oStr = String.valueOf(o);
        return strToFloat(oStr);
    }

    public static double strToFloat(String o) {
        if (o == null) {
            return 0.0F;
        }
        return Float.parseFloat(o.trim());
    }
}
