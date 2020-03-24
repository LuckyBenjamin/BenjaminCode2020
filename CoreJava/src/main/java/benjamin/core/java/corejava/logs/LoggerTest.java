package benjamin.core.java.corejava.logs;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @ClassName LoggerTest
 * @Description: {日志测试}
 * @Author Benjamin
 * @Date 2020/3/5
 **/
@Slf4j
public class LoggerTest {

    @Test
    public void logTest() {
        log.info("========info");
        log.debug("=======debug");
    }
}
