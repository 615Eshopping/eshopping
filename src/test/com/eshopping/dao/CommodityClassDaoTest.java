package com.eshopping.dao;

import com.eshopping.entity.Commodity;
import com.eshopping.entity.CommodityClass;
import com.github.pagehelper.PageHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by AnKh on 2017/3/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class CommodityClassDaoTest {
    @Autowired
    CommodityClassDao commodityClassDao;
    @Test
    public void save() throws Exception {
        CommodityClass commodityClass = new CommodityClass();
        commodityClass.setCommodityClassId(1);
        commodityClass.setCommodityClassName("电子游戏");
        commodityClassDao.save(commodityClass);
    }

    @Test
    public void findById() throws Exception {
        CommodityClass commodityClass = commodityClassDao.findById(1);
        System.out.println(commodityClass);
    }

    @Test
    public void deleteById() throws Exception {
        commodityClassDao.deleteById(1);
    }

    @Test
    public void updateById() throws Exception {
        CommodityClass commodityClass = new CommodityClass();
        commodityClass.setCommodityClassId(1);
        commodityClass.setCommodityClassName("电子游戏");
        commodityClassDao.save(commodityClass);
        commodityClass.setCommodityClassName("test");
        commodityClassDao.updateById(commodityClass);

    }

    @Test
    public void findAll() throws Exception {
        PageHelper.startPage(1,5);
        List<CommodityClass> list = commodityClassDao.findAll();
        for(CommodityClass commodityClass:list){
            System.out.println(commodityClass);
        }
    }

    @Test
    public void findAllCount() throws Exception {

    }

}