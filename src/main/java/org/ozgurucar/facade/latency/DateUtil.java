package org.ozgurucar.facade.latency;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static Date getTodaysDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        String dateStr = format.format(new Date());

        Date date;

        {
            try {
                date = format.parse(dateStr);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            return date;
        }
    }

    public static Long calculateDateDifference(Date firstDate, Date lastDate) {

        long dateCoefficient = 24 * 60 * 60 * 1000;

        long first = firstDate.getTime();
        long last = lastDate.getTime();

        return (last / dateCoefficient) - (first / dateCoefficient);
    }

    public static Long datesYear(Date date) {
        String yearStr = new SimpleDateFormat("yyyy").format(date);

        return Long.valueOf(yearStr);
    }

    public static Long datesMonth(Date date) {
        String monthStr = new SimpleDateFormat("MM").format(date);

        return Long.valueOf(monthStr);
    }
}
