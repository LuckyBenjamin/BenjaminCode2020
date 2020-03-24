package benjamin.core.java.corejava.utilityClass;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UtilsTest
 * @Description: {各种工具类测试}
 * @Author Benjamin
 * @Date 2020/3/10
 **/
@RestController
public class UtilsTest {
    
    /** 
     * @MethodName: Assert_NotNull_Test
     * @Description: notNull(Object object)
     *                当 object 不为 null 时抛出异常，notNull(Object object, String message) 方法允许您通过 message
     *                定制异常信息。和 notNull() 方法断言规则相反的方法是 isNull(Object object)/isNull(Object object,
     *                String message)，它要求入参一定是 null；
     * @Param: []
     * @Return: void
    **/
    @GetMapping("/test1")
    public String Assert_NotNull_Test(){
        String str = "李志斌";
        try {
            Assert.notNull(str,"123");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return UtilsTest.class.getName();
    }
}
