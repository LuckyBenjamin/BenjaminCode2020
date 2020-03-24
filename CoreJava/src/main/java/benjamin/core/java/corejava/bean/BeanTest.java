package benjamin.core.java.corejava.bean;

import com.alibaba.fastjson.JSONArray;
import org.junit.Test;


/**
 * @ClassName BeanTest
 * @Description: {测试bean}
 * @Author Benjamin
 * @Date 2020/3/8
 **/
public class BeanTest {
    /**
     * @MethodName: beanTest
     * @Description: 测试把bean置null
     * @Param: []
     * @Return: void
    **/
    @Test
    public void beanTest(){
        User user = new User();

        System.out.println(user);
    }
}
