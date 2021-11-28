import java.util.*;
import java.time.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        String monthString = Integer.toString(month);
        String dayString = Integer.toString(day);
        
        if (month < 10) monthString = "0"+monthString;
        if (day < 10) dayString = "0"+dayString;

        LocalDate dt = LocalDate.parse(year+"-"+monthString+"-"+dayString);
        
        return LocalDate.of(year, month, day).getDayOfWeek().name();
    }

}