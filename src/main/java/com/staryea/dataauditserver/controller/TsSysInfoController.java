package com.staryea.dataauditserver.controller;

import com.staryea.dataauditserver.entity.PageInfo;
import com.staryea.dataauditserver.entity.TsSysInfo;
import com.staryea.dataauditserver.service.TsSysInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * (TsSysInfo)表控制层
 *
 * @author makejava
 * @since 2020-03-16 11:23:51
 */
@RestController
@RequestMapping("tsSysInfo")
public class TsSysInfoController {
    /**
     * 服务对象
     */
    @Autowired
    private TsSysInfoService tsSysInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param
     * @return 单条数据
     */
    @PostMapping("selectOne")
    public TsSysInfo selectOne(@RequestBody TsSysInfo tsSysInfo) {
        return tsSysInfoService.queryById(tsSysInfo.getSysId());
    }
    @PostMapping("selectAllByList")
    public List<TsSysInfo> queryAllByLimit(@RequestBody PageInfo pageInfo) {
        return tsSysInfoService.queryAllByLimit(pageInfo.getPageOffset(), pageInfo.getPageSize());
    }
    @PostMapping("selectAll")
    public List<TsSysInfo> queryAll(@RequestBody TsSysInfo tsSysInfo){
        return tsSysInfoService.queryAll(tsSysInfo);
    }

    @PostMapping("insertOne")
    public TsSysInfo insertOne(@RequestBody TsSysInfo tsSysInfo){
        return tsSysInfoService.insert(tsSysInfo);
    }
    @PostMapping("updateOne")
    public  TsSysInfo update(@RequestBody TsSysInfo tsSysInfo){
        return  tsSysInfoService.update(tsSysInfo);
    }
    @PostMapping("deleteById")
    public boolean deleteById(@RequestBody TsSysInfo tsSysInfo){
        return tsSysInfoService.deleteById(tsSysInfo.getSysId());
    }

}