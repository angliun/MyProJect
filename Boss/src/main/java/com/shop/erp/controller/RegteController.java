package com.shop.erp.controller;

import com.shop.erp.mapper.RegteMapper;
import com.shop.erp.pojo.Regte;
import com.shop.erp.service.RegteService;
import com.shop.erp.vo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
public class RegteController {

    @Autowired
    private RegteService regteService;

    @Autowired
    private RegteMapper regteMapper;

    //注册
    @PostMapping("/addRegte")
    public Regte adduser(@RequestBody Regte regte){
        int num = regteService.insertSelective(regte);
        Regte rd=new Regte();
        if(num>0){
            rd.setUsername("ok");
            rd.setPwd("添加用户成功。");
        }
        return rd;
    }

//    @PostMapping("/dologin")
//    public ResultData doLogin(@RequestBody Regte regte){
//        regteService.dologin(regte);
//        ResultData rd=new ResultData();
//        if (null!=regte){
//            rd.setCode("ok");
//            rd.setData(regte);
//            rd.setMessage("数据库中存在该账号密码。");
//        }else {
//            rd.setCode("error");
//            rd.setMessage("账号或密码错误。");
//        }
//        return rd;
//    }

    @PostMapping("/userLogin")
    public ResultData selectLogin(@RequestBody Regte regte){
        Regte regted = regteService.selectLogin(regte);
        ResultData rd=new ResultData();
        if (null!=regted){
            rd.setCode("ok");
            rd.setData(regte);
            rd.setMessage("数据库中存在该账号密码。");

        }else {
            rd.setCode("error");
            rd.setMessage("账号或密码错误。");
        }
       return rd;
    }
    @PostMapping("/selectRegte")
    public ResultData selectRegte(@RequestBody Regte regte){

        Regte regtename = regteService.selectRegte(regte);
        ResultData ref=new ResultData();
        if (null!=regtename){
            ref.setCode("ok");
            ref.setData(regte);
            ref.setMessage("数据库中存在该账号密码。");

        }else {
            ref.setCode("error");
            ref.setMessage("账号或密码错误。");
        }
        return ref;
    }

    @GetMapping("/getAllRegte")
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
        List<Regte> userList = regteMapper.selectAllRegTe(startIndex,pageSize,condition);
        ResultData rd=new ResultData();
        rd.setCode("ok");
        rd.setData(userList);
        rd.setTotal(regteMapper.selectCount(condition));
        return rd;
    }

    @PostMapping("/selectRegte/{username}")
    public ResultData selectRegteListByUserName(@PathVariable String username){
        ResultData resultData = new ResultData();
        resultData.setCode("ok");
        resultData.setData(regteService.selectRegteList(username));
        return resultData;
    }
    @PutMapping("/updateuser")
    public ResultData updateUserById(@RequestBody Regte regte){
        int num = regteMapper.updateByPrimaryKeySelective(regte);
        ResultData rd=new ResultData();
        if (num>0){
            rd.setCode("ok");
            rd.setMessage("修改用户数据成功。");
        }
        return rd;
    }
    @DeleteMapping("/deleteLolById/{id}")
    public ResultData deleteUser(@PathVariable("id") Integer id){
        int num = regteService.deleteByPrimaryKey(id);
        ResultData rd=new ResultData();
        if (num>0){
            rd.setCode("ok");
            rd.setMessage("删除用户成功。");
        }
        return rd;
    }

    @PostMapping("/selectRegtePwd/{name}/{telephone}")
    @ResponseBody
    public ResultData selectRegteListByUserPwd(@PathVariable String name,@PathVariable String telephone){
        ResultData resultData = new ResultData();
        resultData.setCode("ok");
        resultData.setData(regteMapper.selectRegtePwd(name,telephone));
        return resultData;
    }

}
