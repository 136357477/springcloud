package com.staryea.dataauditserver.service;

import com.staryea.dataauditserver.dao.TsSysHostStatisticsDao;
import com.staryea.dataauditserver.entity.TsSysHostStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TsSysHostStatisticsService {
    @Autowired
    private TsSysHostStatisticsDao tsSysHostStatisticsDao;


    public TsSysHostStatistics queryById(String sysId) {
        return this.tsSysHostStatisticsDao.queryById(sysId);
    }

    public List<TsSysHostStatistics> queryAll(TsSysHostStatistics tsSysHostStatistics) {
        return tsSysHostStatisticsDao.queryAll(tsSysHostStatistics);
    }
    public List<TsSysHostStatistics> queryAllByLimit(int pageOffset, int pageSize) {
        return tsSysHostStatisticsDao.queryAllByLimit(pageOffset,pageSize);
    }


    public TsSysHostStatistics insertOne(TsSysHostStatistics tsSysHostStatistics) {
        this.tsSysHostStatisticsDao.insertOne(tsSysHostStatistics);
        return  tsSysHostStatistics;
    }

    public boolean deleteById(String sysId) {
        return tsSysHostStatisticsDao.deleteById(sysId);
    }

    public TsSysHostStatistics updateOne(TsSysHostStatistics tsSysHostStatistics) {
        tsSysHostStatisticsDao.updateOne(tsSysHostStatistics);
        return this.queryById(tsSysHostStatistics.getSysId());
    }


}
