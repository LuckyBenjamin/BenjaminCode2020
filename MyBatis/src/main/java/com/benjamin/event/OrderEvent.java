package com.benjamin.event;

import com.benjamin.bean.Goods;
import lombok.Data;
import org.springframework.context.ApplicationEvent;

@Data
public class OrderEvent extends ApplicationEvent {
    // 订单数据
    private Goods orders;

    // 0:创建订单 1：发货
    private Integer pushFlag;

    // 推送目的：0：连接器   1.企微  2.全部推送
    private Integer pushToWhere;

    // 付款方式：全部积分付款：0   非全都使用积分付款
    private Integer payStatus;

    public OrderEvent(Object source) {
        super(source);
    }

    public OrderEvent(Object source, Goods orders, Integer pushFlag, Integer pushToWhere, Integer payStatus) {
        super(source);
        this.orders = orders;
        this.pushFlag = pushFlag;
        this.pushToWhere = pushToWhere;
        this.payStatus = payStatus;
    }
}
