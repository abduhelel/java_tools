import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

/**
 * Time utils
 * @author Aaron
 * @Date   2018-10-16
 */
public class TimeUtils {
    static SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd");
    static Calendar cale =Calendar.getInstance();

    /**
     * 今年
     */
    int year =cale.get(Calendar.YEAR);

    /**
     * 本月
     */
    int month =cale.get(Calendar.MONTH) +1;

    /**
     * 天
     */
    int day =cale.get(Calendar.DATE);

    /**
     * 当前小时
     */
    int hour =cale.get(Calendar.HOUR_OF_DAY);

    /**
     * 当前分钟
     */
    int minute =cale.get(Calendar.MINUTE);

    /**
     * 当前秒
     */
    int second =cale.get(Calendar.SECOND);

    /**
     * 星期
     */
    int week =cale.get(Calendar.DAY_OF_WEEK);

    /**
     * 本月几号
     */
    int numberOfDay =cale.get(Calendar.DAY_OF_MONTH);

    /**
     * 今年第几天
     */
    int dayOfYear =cale.get(Calendar.DAY_OF_YEAR);




    /**
     * getFirstDayOfMonth
     */
    public static String getFirstDayOfMonth() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cale = null;
        cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, 0);
        cale.set(Calendar.DAY_OF_MONTH, 1);
        String firstDay = format.format(cale.getTime());
        return firstDay;
    }

    /**
     * getLastDayOfMonth
     */
    static String getLastDayOfMonth() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cale = null;
        cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, 1);
        cale.set(Calendar.DAY_OF_MONTH, 0);
        String lastDay = format.format(cale.getTime());
        return lastDay;
    }

    /**
     * 获取月末
     *
     * @param startTime
     * @return
     */
    static String getLastDayOfMonth(String startTime) {
        LocalDate monthOfLastDate = LocalDate.parse(startTime, DateTimeFormatter.ofPattern("yyyy-MM-dd")).with(TemporalAdjusters.lastDayOfMonth());
        TemporalAdjusters.firstDayOfMonth();
        String lastData = String.valueOf(monthOfLastDate);
        return lastData;
    }

    /**
     * 获取月初
     *
     * @paramstartTime
     * @return
     */
    static String getFirstDayOfMonth(String startTime) {
    LocalDate monthOfFirstDate =LocalDate.parse(startTime,
    DateTimeFormatter.ofPattern("yyyy-MM-dd")).with(TemporalAdjusters.firstDayOfMonth());
    String firstData =String.valueOf(monthOfFirstDate);
    return firstData;
    }

    /**
     * 获取本年的第一天
     *
     * @returnString
     **/
    public static String getYearStart() {
        return new SimpleDateFormat("yyyy").format(new Date()) +"-01-01";
    }

    /**
     * 获取本年的最后一天
     *
     * @returnString
     **/
    public static String getYearEnd() {
        Calendar calendar =Calendar.getInstance();
        calendar.set(Calendar.MONTH, calendar.getActualMaximum(Calendar.MONTH));
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        Date currYearLast =calendar.getTime();
        return new SimpleDateFormat("yyyy-MM-dd").format(currYearLast) +" 23:59:59";
    }


}
