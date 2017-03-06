package com.eshopping.dao;

import com.eshopping.entity.CommodityDepict;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by AnKh on 2017/3/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class CommodityDepictDaoTest {
    @Autowired
    CommodityDepictDao commodityDepictDao;
    @Test
    public void addDepict() throws Exception {
        CommodityDepict commodityDepict = new CommodityDepict();
        commodityDepict.setCommodityDepict("test");
        commodityDepict.setCommodityId(11);
        commodityDepictDao.addDepict(commodityDepict);
    }

    @Test
    public void updateDepict() throws Exception {

    }

    @Test
    public void deleteDepict() throws Exception {

    }

    @Test
    public void getDepict() throws Exception {

    }

}