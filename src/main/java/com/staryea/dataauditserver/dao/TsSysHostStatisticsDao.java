package com.staryea.dataauditserver.dao;

import com.staryea.dataauditserver.entity.TsSysHostStatistics;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TsSysHostStatisticsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    TsSysHostStatistics queryById(@Param("sysId") String sysId);

    List<TsSysHostStatistics> queryAllByLimit(@Param("pageOffset") int pageOffset,@Param("pageSize")  int pageSize);

    List<TsSysHostStatistics> queryAll(TsSysHostStatistics tsSysHostStatistics);

    int insertOne(TsSysHostStatistics tsSysHostStatistics);

    boolean deleteById(String sysId);

    int updateOne(TsSysHostStatistics tsSysHostStatistics);

}
