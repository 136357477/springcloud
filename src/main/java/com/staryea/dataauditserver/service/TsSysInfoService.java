package com.staryea.dataauditserver.service;


import com.staryea.dataauditserver.dao.TsSysInfoDao;
import com.staryea.dataauditserver.entity.TsSysInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (TsSysInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-03-16 11:23:51
 */
@Service
public class TsSysInfoService {
    @Autowired
    private TsSysInfoDao tsSysInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    public TsSysInfo queryById(String sysId) {
        return tsSysInfoDao.queryById(sysId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    public List<TsSysInfo> queryAllByLimit(int offset, int limit) {
        return this.tsSysInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tsSysInfo 实例对象
     * @return 实例对象
     */
    public TsSysInfo insert(TsSysInfo tsSysInfo) {
        this.tsSysInfoDao.insert(tsSysInfo);
        return tsSysInfo;
    }

    /**
     * 修改数据
     *
     * @param tsSysInfo 实例对象
     * @return 实例对象
     */
    public TsSysInfo update(TsSysInfo tsSysInfo) {
        this.tsSysInfoDao.update(tsSysInfo);
        return this.queryById(tsSysInfo.getSysId());
    }

    /**
     * 通过主键删除数据
     *
     * @param
     * @return 是否成功
     */
    public boolean deleteById(String sysId) {
        return tsSysInfoDao.deleteById(sysId) > 0;
    }

    public List<TsSysInfo> queryAll(TsSysInfo tsSysInfo) {
        return tsSysInfoDao.queryAll(tsSysInfo);
    }
}