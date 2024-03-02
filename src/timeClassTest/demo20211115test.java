package timeClassTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class demo20211115test {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

//        int year = cal.get(Calendar.YEAR);//获取年份
        int month=cal.get(Calendar.MONTH);//获取月份
//        int day=cal.get(Calendar.DATE);//获取日
//        System.out.println(year);
        System.out.println(month+1);
//        System.out.println(day);
//

//        String startTime =" -01-01";
//        String lastTime= String.valueOf(year)+"-06-01";
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf  = new SimpleDateFormat("YYYY-MM-dd");
        cal.add(Calendar.DATE, 1);// num为增加的天数，可以改变的
        date = cal.getTime();
        System.out.println(date);
        String nowDay = sdf.format(date);
        System.out.println(nowDay);
//        String nowYear = String.valueOf(year)+startTime;
    }
}
