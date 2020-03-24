package com.benjamin.config;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * @author Shinez
 * @date 2018/4/2 21:28
 */
@Configuration
@Slf4j
public class ThreadPoolConfig {

    @Configuration
    @ConfigurationProperties("thread-pool")
    public static class ThreadPoolProperties {
        private Integer count;

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }
    }

    @Resource
    private ThreadPoolProperties threadPoolProperties;

    @Bean
    public ScheduledThreadPoolExecutor scheduledThreadPoolExecutor() {
        log.info("init schedule thread pool exec count " + threadPoolProperties.getCount());
        return new ScheduledThreadPoolExecutor(threadPoolProperties.getCount(), new ThreadFactoryBuilder()
                .setNameFormat("wechat-loreal-global-pool-%d").build());
    }
}
