package com.marion.skywalking.controller.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AlarmMessage {

    /**
     * 告警标识
     */
    private int scopeId;

    /**
     * 类型
     */
    private String scope;

    /**
     * 告警的触发详情
     */
    private String name;

    /**
     * 告警服务与告警消息的加密文
     */
    private String id0;

    /**
     * 请求的告警消息的加密文
     */
    private String id1;

    private String ruleName;

    /**
     * 告警信息
     */
    private String alarmMessage;

    /**
     * /告警的生产时间
     */
    private long startTime;

}
