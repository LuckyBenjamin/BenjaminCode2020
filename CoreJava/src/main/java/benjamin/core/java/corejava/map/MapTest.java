package benjamin.core.java.corejava.map;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MapTest
 * @Description: {}
 * @Author Benjamin
 * @Date 2020/4/14
 **/
public class MapTest {
    public static void main(String[] args) throws Exception {
        MapTest mapTest = new MapTest();
        Map<String, Object> test = mapTest.test();
        System.out.println(test);
    }

    private Map<String,Object> test() throws Exception {
        Map map = new HashMap<>();
        map.put("1","123456789");
        map.put("2",111111);
        Integer integer = this.test02();
        System.out.println(integer);
        return map;
    }
    private Integer test02() {
        Integer a = 1;
        return a;
    }

    @Test
    public void NullTest(){
        Map map = new HashMap<>();
        map.put("key1","");
        map.put("key2",null);
        System.out.println(map);
        //{key1=, key2=null}
    }

    @Test
    public void paramsTest(){
        JSONObject row_key = new JSONObject(true);
        row_key.put("CORP_ID", "C10184");
        row_key.put("STORE_ID", "205");
        row_key.put("T_BL_Y", 2020);

        System.out.println(row_key);
        /*JSONObject column = new JSONObject();
        column.put("EMP_ID", user_id);*/

        //String json_text = HbaseClient.getResultColumn(salesEmp, row_key.toJSONString(), column.toJSONString());
    }

}
