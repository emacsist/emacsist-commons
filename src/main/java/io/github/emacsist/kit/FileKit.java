package io.github.emacsist.kit;

public final class FileKit {
    /**
     * 获取后缀(包括点号的）
     *
     * @param fileName
     * @return
     */
    public static String getExt(String fileName) {
        final int index = getExtIndex(fileName);
        if (index < 0) {
            return "";
        }
        return fileName.substring(index);
    }

    /**
     * 不包含点号的
     *
     * @param fileName
     * @return
     */
    public static String getExtWihtouDot(String fileName) {
        final int index = getExtIndex(fileName);
        if (index < 0) {
            return "";
        }
        // 检测长度是否会超
        if (index + 1 > fileName.length()) {
            return "";
        }
        return fileName.substring(index + 1);
    }

    private static int getExtIndex(String fileName) {
        if (fileName == null || fileName.trim().equalsIgnoreCase("")) {
            return 0;
        }
        return fileName.lastIndexOf(".");
    }
}
