package benjamin.core.java.corejava.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * @ClassName JsonTest
 * @Description: {}
 * @Author Benjamin
 * @Date 2020/3/30
 **/
public class JsonTest {
    public static void main(String[] args) {
        String str = "{\"com\":\"yuantong\",\"ischeck\":\"0\",\"condition\":\"00\",\"data\":[{\"time\":\"2020-04-10 13:28:41\",\"ftime\":\"2020-04-10 13:28:41\",\"context\":\"【潍坊转运中心】 已发出 下一站 【山东省东营市】\"},{\"time\":\"2020-04-10 13:27:22\",\"ftime\":\"2020-04-10 13:27:22\",\"context\":\"【潍坊转运中心公司】 已收入\"},{\"time\":\"2020-04-10 07:27:47\",\"ftime\":\"2020-04-10 07:27:47\",\"context\":\"【济南转运中心】 已发出 下一站 【潍坊转运中心】\"},{\"time\":\"2020-04-10 07:26:04\",\"ftime\":\"2020-04-10 07:26:04\",\"context\":\"【济南转运中心公司】 已收入\"},{\"time\":\"2020-04-09 05:05:01\",\"ftime\":\"2020-04-09 05:05:01\",\"context\":\"【泉州转运中心】 已发出 下一站 【济南转运中心】\"},{\"time\":\"2020-04-09 04:56:53\",\"ftime\":\"2020-04-09 04:56:53\",\"context\":\"【泉州转运中心公司】 已收入\"},{\"time\":\"2020-04-08 23:56:35\",\"ftime\":\"2020-04-08 23:56:35\",\"context\":\"【厦门转运中心】 已发出 下一站 【泉州转运中心】\"},{\"time\":\"2020-04-08 21:35:31\",\"ftime\":\"2020-04-08 21:35:31\",\"context\":\"【厦门转运中心公司】 已打包\"},{\"time\":\"2020-04-08 21:34:08\",\"ftime\":\"2020-04-08 21:34:08\",\"context\":\"【厦门转运中心公司】 已收入\"},{\"time\":\"2020-04-08 18:31:02\",\"ftime\":\"2020-04-08 18:31:02\",\"context\":\"【福建省厦门市湖里区高新】 已发出 下一站 【厦门转运中心】\"},{\"time\":\"2020-04-08 17:24:55\",\"ftime\":\"2020-04-08 17:24:55\",\"context\":\"【福建省厦门市湖里区高新公司】 已收件 取件人: 姜淑峰 (18759232508)\"}],\"nu\":\"YT2048209707804\",\"state\":\"0\",\"message\":\"ok\",\"status\":\"200\"}";
        JSONObject jsonObject = JSONObject.parseObject(str);
        JSONArray data = jsonObject.getJSONArray("data");
        System.out.println(data);



        List<LogisticInfoDTO> result = null;
        try{
            result = JSONObject.parseObject(jsonObject.getJSONArray("data").toString(), List.class);
        }catch (Exception e){
            e.getStackTrace();
        }
        System.out.println(result);

    }
}
