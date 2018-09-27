/**
 * 版权： 北京联众信安成都分公司
 * 描述：
 * 创建时间：2018年05月31日
 */
package com.g507.service.test;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Optional;
import java.util.Random;

/**
 * 〈一句话功能简述〉〈功能详细描述〉
 *
 * @author Gooqhy
 * @version [版本号, 2018年05月31日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Java8Tester {
    public static void main(String args[]) {

        for (;;) {
            String nad = "1";
            if (nad == null) {
                break;
            }
        }

        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        date = date.minusMonths(1);
        LocalDate firstDayOfMonth = date.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate firstDayOfMonth1 = date.withDayOfMonth(1);
        LocalDate secondDayOfMonth = date.withDayOfMonth(2);
        LocalDate endDayOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println(date);

        Random r = new Random();

        int n = r.nextInt(500);
        int l= r.nextInt(5);
        Java8Tester java8Tester = new Java8Tester();
        Integer value1 = null;
        Integer value2 = new Integer(10);

        // Optional.ofNullable - 允许传递为 null 参数
        Optional<Integer> a = Optional.ofNullable(value1);

        // Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
        Optional<Integer> b = Optional.of(value2);
        System.out.println(java8Tester.sum(a, b));
    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b) {

        // Optional.isPresent - 判断值是否存在

        System.out.println("第一个参数值存在: " + a.isPresent());
        System.out.println("第二个参数值存在: " + b.isPresent());

        // Optional.orElse - 如果值存在，返回它，否则返回默认值
        Integer value1 = a.orElse(new Integer(0));

        //Optional.get - 获取值，值需要存在
        Integer value2 = b.get();
        return value1 + value2;
    }
}

/*  getYear()    int    获取当前日期的年份
    getMonth()    Month    获取当前日期的月份对象
    getMonthValue()    int    获取当前日期是第几月
    getDayOfWeek()    DayOfWeek    表示该对象表示的日期是星期几
    getDayOfMonth()    int    表示该对象表示的日期是这个月第几天
    getDayOfYear()    int    表示该对象表示的日期是今年第几天
    withYear(int year)    LocalDate    修改当前对象的年份
    withMonth(int month)    LocalDate    修改当前对象的月份
    withDayOfMonth(int dayOfMonth)    LocalDate    修改当前对象在当月的日期
    isLeapYear()    boolean    是否是闰年
    lengthOfMonth()    int    这个月有多少天
    lengthOfYear()    int    该对象表示的年份有多少天（365或者366）
    plusYears(long yearsToAdd)    LocalDate    当前对象增加指定的年份数
    plusMonths(long monthsToAdd)    LocalDate    当前对象增加指定的月份数
    plusWeeks(long weeksToAdd)    LocalDate    当前对象增加指定的周数
    plusDays(long daysToAdd)    LocalDate    当前对象增加指定的天数
    minusYears(long yearsToSubtract)    LocalDate    当前对象减去指定的年数
    minusMonths(long monthsToSubtract)    LocalDate    当前对象减去注定的月数
    minusWeeks(long weeksToSubtract)    LocalDate    当前对象减去指定的周数
    minusDays(long daysToSubtract)    LocalDate    当前对象减去指定的天数
    compareTo(ChronoLocalDate other)    int    比较当前对象和other对象在时间上的大小，返回值如果为正，则当前对象时间较晚，
    isBefore(ChronoLocalDate other)    boolean    比较当前对象日期是否在other对象日期之前
    isAfter(ChronoLocalDate other)    boolean    比较当前对象日期是否在other对象日期之后
    isEqual(ChronoLocalDate other)    boolean    比较两个日期对象是否相等*/