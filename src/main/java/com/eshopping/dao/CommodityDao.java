package com.eshopping.dao;

import com.eshopping.entity.Commodity;
import com.eshopping.entity.CommodityClass;
import com.eshopping.page.Page;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by AnKh on 2017/2/20.
 */
public interface CommodityDao {
    void save(Commodity commodity);//保存商品信息

    List<Commodity> findAll(Page page);//分页查询所有的商品

    int findAllCount();//查询所有记录数

    void delete(int commodityID);//删除商品信息

    List<Commodity> findByTime(int num);//按时间倒序查找

    Commodity findByID(int commodityID);//按ID查找

    List<Commodity> findByClass(CommodityClass commodityClass,Page page);

    int findAllCount(CommodityClass commodityClass);//查询分类记录数

}
