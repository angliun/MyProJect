package com.shop.erp.mapper;

import com.shop.erp.pojo.Resume;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface ResumeMapper {
    int deleteByPrimaryKey(Integer id);

    List<Resume> selectAll(@Param("startIndex") Integer startIndex, @Param("pageSize") Integer pageSize, @Param("condition") String condition);
    Integer selectCount(String condition);
    int insert(Resume record);
    int insertSelective(Resume resume);
    Resume selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(Resume record);
    int updateByPrimaryKey(Resume record);
    @Select("select * from resume where real_name=#{real_name}")
    List<Resume> selectRegteList(@Param("real_name") String real_name);
}