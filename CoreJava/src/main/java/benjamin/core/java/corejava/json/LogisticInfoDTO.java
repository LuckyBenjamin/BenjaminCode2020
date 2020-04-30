package benjamin.core.java.corejava.json;

import lombok.Data;

/**
 * @ClassName LogisticsInfoDTO
 * @DescriptTion :
 * @Auther: wd
 * @Date :2019/3/6 16:21
 */
@Data
public class LogisticInfoDTO {
    /**
     * 快递节点内容
     */
    private String context;
    /**
     * 节点时间
     */
    private String time;

}
