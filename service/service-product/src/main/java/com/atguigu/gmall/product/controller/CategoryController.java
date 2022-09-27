package com.atguigu.gmall.product.controller;

import com.atguigu.gmall.common.result.Result;
import com.atguigu.gmall.product.entity.BaseCategory1;
import com.atguigu.gmall.product.entity.BaseCategory2;
import com.atguigu.gmall.product.entity.BaseCategory3;
import com.atguigu.gmall.product.service.BaseCategory1Service;
import com.atguigu.gmall.product.service.BaseCategory2Service;
import com.atguigu.gmall.product.service.BaseCategory3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/product")
public class CategoryController {

    @Autowired
    BaseCategory1Service baseCategory1Service;

    @Autowired
    BaseCategory2Service baseCategory2Service;

    @Autowired
    BaseCategory3Service baseCategory3Service;

    @GetMapping("/getCategory1")
    public Result getCategory1(){

        List<BaseCategory1> list = baseCategory1Service.list();
        return Result.ok(list);
    }

    @GetMapping("/getCategory2/{category2_id}")
    public Result getCategory2(@PathVariable("category2_id")Long cid){

        List<BaseCategory2> list = baseCategory2Service.getCategory2(cid);
        return Result.ok(list);
    }

    @GetMapping("/getCategory3/{category3_id}")
    public Result getCategory3(@PathVariable("category3_id")Long cid){

        List<BaseCategory3> list = baseCategory3Service.getCategory3(cid);
        return Result.ok(list);
    }

}
