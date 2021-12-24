package com.shop.erp.service;

import com.shop.erp.mapper.RegteMapper;
import com.shop.erp.pojo.Regte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Resource
@Service("/regteService")
public class RegteService {

    @Autowired
    private RegteMapper regteMapper;
    public int insertSelective(Regte record){
     return regteMapper.insertSelective(record);
    }
    public Regte dologin(Regte regte){
       return regteMapper.dologin(regte);
    }


    // TODO: 暂时改一下
    public Regte selectRegte(Regte regte){
        return null;// regteMapper.selectRegte(regte);
    }

    public Regte selectLogin(Regte regte){
        return  regteMapper.dologin(regte);
    }

    public List<Regte> selectRegteList(String username) {
        return regteMapper.selectRegteList(username);
    }

    public int deleteByPrimaryKey(Integer id){
        return regteMapper.deleteByPrimaryKey(id);
    }

}
