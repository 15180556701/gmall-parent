package com.atguigu.gmall.product.service;

import com.atguigu.gmall.product.entity.BaseCategory3;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 王子江
* @description 针对表【base_category3(三级分类表)】的数据库操作Service
* @createDate 2022-09-26 21:22:48
*/
public interface BaseCategory3Service extends IService<BaseCategory3> {

    List<BaseCategory3> getCategory3(Long cid);
}
