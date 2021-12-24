package com.shop.erp.service;

import com.shop.erp.mapper.RecruitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("/RecruitService")
public class RecruitService {
@Autowired
    private RecruitMapper recruitMapper;

public String updateByPrimaryName(String name){
    return recruitMapper.updateByPrimaryName(name);
}
}


