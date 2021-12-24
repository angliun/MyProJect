package com.shop.erp.service;
import com.shop.erp.mapper.ResumeMapper;
import com.shop.erp.pojo.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("/ResumeService")
public class ResumeService {
    @Autowired
    private ResumeMapper resumeMapper;
    public int insertSelective(Resume resume){
        return resumeMapper.insertSelective(resume);
    }
    public List<Resume> selectRegteList(String real_name) {
        return resumeMapper.selectRegteList(real_name);
    }
    public int deleteByPrimaryKey(Integer id){
        return resumeMapper.deleteByPrimaryKey(id);
    }
}
