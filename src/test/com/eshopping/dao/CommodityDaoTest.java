package com.eshopping.dao;

import com.eshopping.entity.Commodity;
import com.eshopping.entity.CommodityClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by AnKh on 2017/2/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class CommodityDaoTest {
    @Autowired
    CommodityDao commodityDao;
    @Test
    public void save() throws Exception {
        Commodity commodity = new Commodity();
        commodity.setCommodityName("test");
        CommodityClass commodityClass = new CommodityClass();
        commodityClass.setCommodityClassId(18);
        commodity.setCommodityClass(commodityClass);
        int i = commodityDao.save(commodity);
        System.out.println(i);
    }

    @Test
    public void deleteById() throws Exception {
        commodityDao.deleteById(25);
    }

    @Test
    public void deleteByCommodityName(){
        commodityDao.deleteByCommodityName("test3");
    }

    @Test
    public void findById() throws Exception {
        Commodity commodity = commodityDao.findById(33);
        System.out.println(commodity);
    }

    @Test
    public void updateById(){
        Commodity commodity = new Commodity();
        commodity.setCommodityName("test2");
        CommodityClass commodityClass = new CommodityClass();
        commodityClass.setCommodityClassId(11);
        commodity.setCommodityClass(commodityClass);
        commodityDao.save(commodity);

        commodity = commodityDao.findById(33);
        commodity.setCommodityName("test3");
        commodityDao.updateById(commodity);

    }

    @Test
    public void updateByCommodityName(){

    }
}