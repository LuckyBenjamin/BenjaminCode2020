package benjamin.core.java.corejava.e3;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

/**
 * @ClassName Test
 * @Description: {}
 * @Author Benjamin
 * @Date 2020/4/9
 **/
public class Test {
    private final static String keyStr = "bizvaneEncrypKey";
    public static void main(String[] args) {
        String content = "AA00BCB2E968D385052D023E5E51ACACEF579C28822C38C536F02428521ACE776EFF0DA0C7608637CC4E7FEB9ADC2257";
        try {
            byte[] raw = keyStr.getBytes("utf-8");
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec);
            byte[] contentByte = parseHexStr2Byte(content);
            byte[] decodeResult = cipher.doFinal(contentByte);
            String result = new String(decodeResult,"utf-8");
            System.out.println("解密后的数据为:"+result);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("fanhui-----");
    }

    private static byte[] parseHexStr2Byte(String hexStr){
        if(hexStr.length() < 1) {
            return null;
        }
        byte[] result = new byte[hexStr.length()/2];
        for (int i = 0;i< hexStr.length()/2; i++) {
            int high = Integer.parseInt(hexStr.substring(i*2, i*2+1), 16);
            int low = Integer.parseInt(hexStr.substring(i*2+1, i*2+2), 16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }
}
