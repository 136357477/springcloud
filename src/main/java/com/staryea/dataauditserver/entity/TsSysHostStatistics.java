package com.staryea.dataauditserver.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TsSysHostStatistics implements Serializable {
    /**
     * 系统id
     */
    private String sysId;
    /**
     * 系统名称
     */
    private String sysName;
    /**
     * cpu使用情况
     */
    private String cpuUsage;
    /**
     * 内存使用情况
     */
    private String memUsage;
    /**
     * 磁盘使用情况
     */
    private double descUsage;


}
