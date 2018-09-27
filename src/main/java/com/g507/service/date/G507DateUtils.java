/**
 * 版权： 北京联众信安成都分公司
 * 描述： 时间处理
 * 创建时间：2018年05月31日
 */
package com.g507.service.date;

import com.g507.service.test.Java8Tester;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * 〈一句话功能简述〉时间处理〈功能详细描述〉
 *
 * @author Gooqhy
 * @version [版本号, 2018年05月31日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class G507DateUtils {

    /**
     * 默认格式化格式
     */
    public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * 日期格式化格式
     */
    public static final String DEF_DATE_FORMAT = "yyyy-MM-dd";


    public static final DateTimeFormatter YYYY_MM_DD_HH_MM_SS = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static final DateTimeFormatter YYYY_MM_DD = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static final DateTimeFormatter HH_MM_SS = DateTimeFormatter.ofPattern("HH:mm:ss");

    //获取当前毫秒数
    public static long getNowMillis() {
        Clock clock = Clock.systemDefaultZone();
        return clock.millis();
    }

    /**
     * 〈一句话功能简述〉日期转换字符串转换为yyyy-MM-dd的字符串 〈功能详细描述〉
     *
     * @param date 要转换的日期对象
     * @return 转换后的日期字符串
     * @see [类、类#方法、类#成员]
     */
    public static String dateToStr(LocalDate date) {
        return dateToStr(date, DEF_DATE_FORMAT);
    }

    /**
     * 〈一句话功能简述〉日期转换字符串 〈功能详细描述〉
     *
     * @param date    需转换的时间
     * @param pattern 转换的格式
     * @return 转换后的结果
     * @see [类、类#方法、类#成员]
     */
    public static String dateToStr(LocalDate date, String pattern) {
        String dateStr = date.format(DateTimeFormatter.ofPattern(pattern));
        return dateStr;
    }

    /**
     * 〈一句话功能简述〉日期转换字符串转换为yyyy-MM-dd HH:mm:ss的字符串 〈功能详细描述〉
     *
     * @param date 要转换的时间对象
     * @return 转换后的日期字符串
     * @see [类、类#方法、类#成员]
     */
    public static String timeToStr(LocalDateTime date) {
        return timeToStr(date, DEFAULT_DATE_PATTERN);
    }

    /**
     * 〈一句话功能简述〉日期转换字符串 〈功能详细描述〉
     *
     * @param date    需转换的时间
     * @param pattern 转换的格式
     * @return 转换后的结果
     * @see [类、类#方法、类#成员]
     */
    public static String timeToStr(LocalDateTime date, String pattern) {
        String dateStr = date.format(DateTimeFormatter.ofPattern(pattern));
        return dateStr;
    }

    //字符串转时间对象
    public static LocalDateTime strToTime(String str) {
        return LocalDateTime.parse(str, DateTimeFormatter.ofPattern(DEFAULT_DATE_PATTERN));
    }

    //字符串转日期对象
    public static LocalDate strToDate(String str) {
        return LocalDate.parse(str, DateTimeFormatter.ofPattern(DEF_DATE_FORMAT));
    }



    /**
     * @return 返回格式yyyy-MM-dd
     */
    public static String date() {
        return LocalDate.now().format(YYYY_MM_DD);
    }

    /**
     * @return 返回当前年份
     */
    public static int year() {
        return LocalDate.now().getYear();
    }

    /**
     * @return 返回当前月份
     */
    public static int month() {
        return LocalDate.now().getMonthValue();
    }

    /**
     * @return 返回今日是月份中的第几天
     */
    public static int dayOfMonth() {
        return LocalDate.now().getDayOfMonth();
    }

    /**
     * @return 返回今日是一年中的第几天
     */
    public static int dayOfYear() {
        return LocalDate.now().getDayOfYear();
    }

    /**
     * @return 返回今日星期几 1-7
     */
    public static int dayOfWeek() {
        return LocalDate.now().getDayOfWeek().getValue();
    }

    /**
     * @param year
     * @param month
     * @param day
     * @return 返回指定日期
     */
    public static String newDate(int year, int month, int day) {
        return LocalDate.of(year, month, day).toString();
    }

    /**
     * @param year 指定年份
     *             指定年份中的天数
     * @return 根据条件返回日期
     */
    public static String newDate(int year, int dayNum) {
        return LocalDate.ofYearDay(year, dayNum).toString();
    }

    /**
     * @return 返回当前时间 HH:mm:ss.xxx
     */
    public static String time() {
        return LocalTime.now().format(HH_MM_SS);
    }

    /**
     * @return 当前小时
     */
    public static int hour() {
        return LocalTime.now().getHour();
    }

    /**
     * @return 当前分钟
     */
    public static int minute() {
        return LocalTime.now().getMinute();
    }

    /**
     * @return 当前秒
     */
    public static int second() {
        return LocalTime.now().getSecond();
    }

    /**
     * @return 返回格式 yyyy-MM-dd HH:mm:ss
     */
    public static String dateTime() {
        return LocalDateTime.now().format(YYYY_MM_DD_HH_MM_SS);
    }

    /**
     * @param time 从1970-01-01T00:00:00到现在的毫秒数
     */
    public static LocalDateTime parseDateTime(long time) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault());
    }

    /**
     * @param time yyyy-MM-dd HH:mm:ss
     */
    public static LocalDateTime parseDateTime(String time) {
        return LocalDateTime.parse(time, YYYY_MM_DD_HH_MM_SS);
    }

    /**
     * @param time 从1970-01-01T00:00:00到现在的毫秒数
     * @return
     */
    public static LocalDate parseDate(long time) {
        return LocalDate.from(parseDateTime(time));
    }

    /**
     * @param time yyyy-MM-dd
     * @return
     */
    public static LocalDate parseDate(String time) {
        return LocalDate.parse(time, YYYY_MM_DD);
    }

    /**
     * yyyy-MM-dd
     *
     * @param date
     * @return
     */
    public static String format(LocalDate date) {
        return date.format(YYYY_MM_DD);
    }

    /**
     * @param dateTime
     * @return
     */
    public static String format(LocalDateTime dateTime) {
        return dateTime.format(YYYY_MM_DD_HH_MM_SS);
    }

    /**
     * 转化为毫秒，默认为
     *
     * @param date
     * @return
     */
    public static long millis(LocalDate date) {
        return millis(date.atStartOfDay());
    }

    /**
     * 转化为毫秒
     *
     * @param dateTime
     * @return
     */
    public static long millis(LocalDateTime dateTime) {
        return dateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }


    public static void main(String args[]) {
        G507DateUtils G507DateUtils = new G507DateUtils();
        G507DateUtils.testLocalDateTime();
    }

    public void testLocalDateTime() {
        // 获取当前的日期时间
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("当前时间: " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1: " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println("月: " + month + ", 日: " + day + ", 秒: " + seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2);

        // 12 december 2014
        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("date3: " + date3);

        // 22 小时 15 分钟
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4: " + date4);

        // 解析字符串
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5);
    }
}