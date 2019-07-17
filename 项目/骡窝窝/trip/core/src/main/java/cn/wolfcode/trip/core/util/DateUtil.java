package cn.wolfcode.trip.core.util;

import java.util.Date;

/**
 * 时间判断
 */
public class DateUtil {
        public static long getDateBetween(Date d1, Date d2){
            return Math.abs((d1.getTime() - d2.getTime())/1000);
        }
}
