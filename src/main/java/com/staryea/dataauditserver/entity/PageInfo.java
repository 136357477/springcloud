package com.staryea.dataauditserver.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PageInfo {
    /**
     * 分页启始位置
     * */
    private int pageOffset;
    /**
     * 分页大小
     */
    private int pageSize ;


}
