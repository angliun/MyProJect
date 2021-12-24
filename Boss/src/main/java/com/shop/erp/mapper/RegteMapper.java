package com.shop.erp.mapper;

import com.shop.erp.pojo.Regte;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RegteMapper {
    int deleteByPrimaryKey(Integer id);
    @Select("select * from regte where username=#{username} and pwd=#{pwd} and red=#{red}")
    Regte dologin(Regte regte);

    Integer selectCount(String condition);

    int insert(Regte record);


    @Select("select * from regte where name=#{name} and telephone=#{telephone}")
    Regte selectRegtePwd(@Param("name") String telephone,@Param("telephone") String name);

    List<Regte> selectAllRegTe(@Param("startIndex") Integer startIndex, @Param("pageSize") Integer pageSize, @Param("condition") String condition);

    @Select("select * from regte where username=#{username}")
    List<Regte> selectRegteList(@Param("username") String username);

    int insertSelective(Regte record);

    Regte selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Regte record);

    int updateByPrimaryKey(Regte record);

}