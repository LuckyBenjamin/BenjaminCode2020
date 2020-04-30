package benjamin.core.java.corejava.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MapTest
 * @Description: {Map测试}
 * @Author Benjamin
 * @Date 2020/3/26
 **/
public class MapTest {

    /**
     * @MethodName: HashMapTest
     * @Description: 测试一下
     * @Param: []
     * @Return: void
    **/
    @Test
    public void HashMapTest(){
        Map map = new HashMap();
        map.put("name","李志斌");
        map.put("age",18);
        map.put("sex","123");
        System.out.println(map);
    }
}
