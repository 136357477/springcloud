package com.staryea.dataauditserver.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (TsSysInfo)实体类
 *
 * @author makejava
 * @since 2020-03-16 11:23:49
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TsSysInfo implements Serializable {
    private static final long serialVersionUID = -87416133746940081L;
    /**
     * 系统id
     */
    private String sysId;
    /**
     * 系统名称
     */
    private String sysName;
    /**
     * 系统描述
     */
    private String sysDesc;
    /**
     * 系统访问前缀
     */
    private String sysPrefix;


}