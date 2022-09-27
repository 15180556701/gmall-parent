package com.atguigu.gmall.product;

import com.atguigu.gmall.product.entity.BaseCategory2;
import com.atguigu.gmall.product.service.BaseCategory2Service;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ProductTest {

    @Autowired
    private BaseCategory2Service baseCategory2Service;

    @Test
    public void test01(){
        List<BaseCategory2> category2 = baseCategory2Service.getCategory2(2L);
        System.out.println(category2);
    }
}
