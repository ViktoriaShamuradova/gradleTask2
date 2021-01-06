package by.epam.task2;

import by.epam.shamuradova.task1.StringUtils;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str) {
        for (String arg : str) {
            boolean isPositive = StringUtils.isPositiveNumber(arg);
            if (!isPositive) {
                return false;
            }
        }
        return true;
    }
}
