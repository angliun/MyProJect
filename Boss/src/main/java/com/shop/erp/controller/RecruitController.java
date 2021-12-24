package com.shop.erp.controller;

import com.shop.erp.mapper.RecruitMapper;
import com.shop.erp.pojo.Recruit;
import com.shop.erp.service.RecruitService;
import com.shop.erp.vo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
public class RecruitController {

    @Autowired
    private RecruitMapper recruitMapper;
    @Autowired
    private RecruitService recruitService;

    @GetMapping("/getalluser")
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
        List<Recruit> userList = recruitMapper.selectAllUser(startIndex,pageSize,condition);
        ResultData rd=new ResultData();
        rd.setCode("ok");
        rd.setData(userList);
        rd.setTotal(recruitMapper.selectCount(condition));
        return rd;
    }
    @PutMapping("/updateuserbyId")
    public ResultData updateUserById(@RequestBody Recruit recruit){
        int num = recruitMapper.updateByPrimaryKeySelective(recruit);
        ResultData rd=new ResultData();
        if (num>0){
            rd.setCode("ok");
            rd.setMessage("修改用户数据成功。");
        }
        return rd;
    }
    @PostMapping("/adduser")
    public ResultData adduser(@RequestBody Recruit recruit){
        int num = recruitMapper.insertSelective(recruit);
        ResultData rd=new ResultData();
        if(num>0){
            rd.setCode("ok");
            rd.setMessage("添加用户成功。");
        }
        return rd;
    }
    @DeleteMapping("/deleteuser/{id}")
    public ResultData deleteUser(@PathVariable("id") Integer id){
        int num = recruitMapper.deleteByPrimaryKey(id);
        ResultData rd=new ResultData();
        if (num>0){
            rd.setCode("ok");
            rd.setMessage("删除用户成功。");
        }
        return rd;
    }


}
