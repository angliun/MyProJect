package com.shop.erp.controller;

import com.shop.erp.mapper.ResumeMapper;
import com.shop.erp.pojo.Resume;
import com.shop.erp.service.ResumeService;
import com.shop.erp.vo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
public class ResumeController {

    @Autowired
    private ResumeMapper resumeMapper;
    @Autowired
    private ResumeService resumeService;

    @PostMapping("/addResume")
    public ResultData addResume (@RequestBody Resume resume){
        int num = resumeService.insertSelective(resume);
        ResultData rd=new ResultData();
        if(num>0){
            rd.setCode("ok");
            rd.setData(num);
            rd.setMessage("添加简历成功。");
        }
        return rd;
    }

    @GetMapping("/getAllResume")
    public ResultData getAllUser(String condition, Integer currentPage, Integer pageSize){
        Integer startIndex=0;
        if (null!=currentPage&&null!=pageSize){
            startIndex=(currentPage-1)*pageSize;
        }
        if (null==condition){
            condition="";
        }
        if (null==pageSize){
            pageSize=10;
        }
        List<Resume> userList = resumeMapper.selectAll(startIndex,pageSize,condition);
        ResultData rd=new ResultData();
        rd.setCode("ok");
        rd.setData(userList);
        rd.setTotal(resumeMapper.selectCount(condition));
        return rd;
    }
    @PostMapping("/selectResume/{real_name}")
    public ResultData selectRegteListByUserName(@PathVariable String real_name){
        ResultData resultData = new ResultData();
        resultData.setCode("ok");
        resultData.setData(resumeService.selectRegteList(real_name));
        return resultData;
    }

    @PutMapping("/updateResume")
    public ResultData updateUserById(@RequestBody Resume resume){
        int num = resumeMapper.updateByPrimaryKeySelective(resume);
        ResultData rd=new ResultData();
        if (num>0){
            rd.setCode("ok");
            rd.setMessage("修改用户数据成功。");
        }
        return rd;
    }

    @DeleteMapping("/deleteResumeById/{id}")
    public ResultData deleteUser(@PathVariable("id") Integer id){
        int num = resumeService.deleteByPrimaryKey(id);
        ResultData rd=new ResultData();
        if (num>0){
            rd.setCode("ok");
            rd.setMessage("删除用户成功。");
        }
        return rd;
    }
}
