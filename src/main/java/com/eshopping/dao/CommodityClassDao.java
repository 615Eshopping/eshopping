package com.eshopping.dao;

import com.eshopping.entity.CommodityClass;
import com.eshopping.page.Page;

import java.util.List;

/**
 * Created by AnKh on 2017/2/20.
 */
public interface CommodityClassDao {
    void save(CommodityClass commodityclass);//保存商品种类

    List<CommodityClass> findAll(Page page);//分页查询所有的商品种类

    int findAllCount();//查询所有记录数

    List<CommodityClass> findAll();//查询所有的商品种类

    CommodityClass findByID(int commodityClassID);
}
