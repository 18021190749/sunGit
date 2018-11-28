package com.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-07-06 14:24
 */
public class tiime {
    public static List<Date> test(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        List<Date> retVal = new ArrayList<>();
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        for (int i = 0 ;i<=month;i++){
            cal.set(year,i,1);
            try {
                retVal.add(format.parse(format.format(cal.getTime())));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return retVal;
    }

    public static void main(String[] args) {
        test();
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        int dow = cal.get(Calendar.DAY_OF_WEEK);
        int dom = cal.get(Calendar.DAY_OF_MONTH);
        int doy = cal.get(Calendar.DAY_OF_YEAR);

        System.out.println("Current Date: " + cal.getTime());
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
        System.out.println("Day of Week: " + dow);
        System.out.println("Day of Month: " + dom);
        System.out.println("Day of Year: " + doy);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String firstday, lastday;
        // 获取前月的第一天
        Calendar cale = Calendar.getInstance();
        //cale.add(Calendar.MONTH, 0);

        cale.set(2018,1,1);
        //cale.set(Calendar.DAY_OF_MONTH, 1);
        firstday = format.format(cale.getTime());
        try {
            System.out.println(firstday);
            System.out.println(format.parse(firstday));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
