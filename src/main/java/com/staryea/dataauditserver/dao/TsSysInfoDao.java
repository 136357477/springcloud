package com.staryea.dataauditserver.dao;

import com.staryea.dataauditserver.entity.TsSysInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (TsSysInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-16 11:23:49
 */
@Repository
public interface TsSysInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    TsSysInfo queryById(@Param("sysId") String sysId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TsSysInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tsSysInfo 实例对象
     * @return 对象列表
     */
    List<TsSysInfo> queryAll(TsSysInfo tsSysInfo);

    /**
     * 新增数据
     *
     * @param tsSysInfo 实例对象
     * @return 影响行数
     */
    int insert(TsSysInfo tsSysInfo);

    /**
     * 修改数据
     *
     * @param tsSysInfo 实例对象
     * @return 影响行数
     */
    int update(TsSysInfo tsSysInfo);

    /**
     * 通过主键删除数据
     *
     * @param
     * @return 影响行数
     */
    int deleteById(@Param("sysId") String sysId);

}