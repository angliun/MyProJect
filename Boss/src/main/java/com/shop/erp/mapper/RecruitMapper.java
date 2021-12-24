package com.shop.erp.mapper;

import com.shop.erp.pojo.Recruit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RecruitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Recruit record);

    List<Recruit> selectAllUser(@Param("startIndex") Integer startIndex, @Param("pageSize") Integer pageSize, @Param("condition") String condition);

    Integer selectCount(String condition);

    int insertSelective(Recruit record);

    Recruit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Recruit record);

    int updateByPrimaryKey(Recruit record);

    String updateByPrimaryName(String name);
}