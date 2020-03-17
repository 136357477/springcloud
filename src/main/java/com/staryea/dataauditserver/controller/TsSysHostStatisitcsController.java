package com.staryea.dataauditserver.controller;

import com.staryea.dataauditserver.entity.PageInfo;
import com.staryea.dataauditserver.entity.TsSysHostStatistics;
import com.staryea.dataauditserver.service.TsSysHostStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tsSysHostInfo")
public class TsSysHostStatisitcsController {
    @Autowired
    TsSysHostStatisticsService tsSysHostStatisticsService;
    @PostMapping("selectOne")
    public TsSysHostStatistics selectOne(@RequestBody TsSysHostStatistics tsSysHostStatistics){
        return tsSysHostStatisticsService.queryById(tsSysHostStatistics.getSysId());
    }
    @PostMapping("selectAll")
    public List<TsSysHostStatistics> selectAll(@RequestBody TsSysHostStatistics tsSysHostStatistics){
        return tsSysHostStatisticsService.queryAll(tsSysHostStatistics);
    }
    @PostMapping("selectAllByLimit")
    public List<TsSysHostStatistics> queryAllByLimit(@RequestBody PageInfo pageInfo){
        return tsSysHostStatisticsService.queryAllByLimit(pageInfo.getPageOffset(),pageInfo.getPageSize());
    }

    @PostMapping("insertOne")
    public TsSysHostStatistics insertOne(@RequestBody TsSysHostStatistics tsSysHostStatistics){
        return tsSysHostStatisticsService.insertOne(tsSysHostStatistics);
    }

    @PostMapping("deleteOne")
    public boolean deleteOne(@RequestBody TsSysHostStatistics tsSysHostStatistics){
        return  tsSysHostStatisticsService.deleteById(tsSysHostStatistics.getSysId());
    }

    @PostMapping("updateOne")
    public TsSysHostStatistics updateOne(@RequestBody TsSysHostStatistics tsSysHostStatistics){
        return tsSysHostStatisticsService.updateOne(tsSysHostStatistics);
    }




}
