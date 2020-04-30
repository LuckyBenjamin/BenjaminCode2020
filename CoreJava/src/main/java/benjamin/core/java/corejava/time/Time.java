package benjamin.core.java.corejava.time;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Time
 * @Description: {}
 * @Author Benjamin
 * @Date 2020/4/13
 **/
public class Time {
    public static void main(String[] args) {
        SimpleDateFormat DATETIME_FORMAT_DAY_NO = new SimpleDateFormat("yyyyMMdd");
        String format = DATETIME_FORMAT_DAY_NO.format(new Date());
        String substring = format.substring(4, 6);
        System.out.println(format);
        System.out.println(substring);
    }

    @Test
    public void aTest(){
        String str = "0";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            String format = simpleDateFormat.format(new Date(0));
            System.out.println(format);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void GetTimeTest(){
        // Positive example:
        long a = System.currentTimeMillis();
        // Negative example:
        long b = new Date().getTime();

        System.out.println(a);
        System.out.println(b);
    }
}
