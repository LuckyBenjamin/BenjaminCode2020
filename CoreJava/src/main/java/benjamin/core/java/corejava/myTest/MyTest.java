package benjamin.core.java.corejava.myTest;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.Map;

/**
 * @ClassName MyTest
 * @Description: {}
 * @Author Benjamin
 * @Date 2020/4/29
 **/
public class MyTest {

    public static void main(String[] args) {
        Test01 test01 = new Test01();
        Map<String, Object> map = test01.goodDetailWrapper(73, 10869, 73, null);
        System.out.println(map);
    }
}

class Test01 {
    public Map<String, Object> goodDetailWrapper(Integer merchantId, Integer goodsId, Integer storeId, String memberCode){
        Integer[] storeSelfPrice = {73,-1};
        System.out.println("IndexV3ServiceImpl # goodDetailWrapper :{}"+JSON.toJSONString(storeSelfPrice));
        if(storeSelfPrice != null && storeSelfPrice.length != 0 && Arrays.asList(storeSelfPrice).contains(merchantId)){
            //return goodDetailV3(merchantId, goodsId, storeId,memberCode);
        }
        //return goodDetail(merchantId,goodsId,memberCode);
        System.out.println("123");
        return null;
    }
}
