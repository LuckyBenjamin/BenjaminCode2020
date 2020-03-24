package com.benjamin.schedule;

import com.benjamin.utils.RetryUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @ClassName ScheduleTest
 * @Description: {}
 * @Author Benjamin
 * @Date 2020/3/19
 **/
@Slf4j
@EnableScheduling
@Component
public class ScheduleTest {

    //@Scheduled(cron = "*/5 * * * * ?")
    public void scheduleTest(){
        try {
            String str = "aaaaaaaaaa";
            String substring = str.substring(1000);
        } catch (Exception e) {
            System.out.println("类名:{}"+RetryUtil.getClassName());
            //log.info("类名:{}",RetryUtil.getClassName());
            //log.info("方法名:{}",RetryUtil.getMethodName());
        }
    }

    /**
     *  得到当前线程方法名
     */
    private static String getMethodName(){
        StringBuilder result = new StringBuilder();
        try{
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[0];
            String methodName = stackTraceElement.getMethodName();
            result.append(methodName);
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }
}
