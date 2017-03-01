package com.eshopping.dao;

import com.eshopping.entity.CommodityClass;
import com.eshopping.util.Page;


import java.util.List;

/**
 * Created by AnKh on 2017/2/20.
 */
public interface CommodityClassDao {
    int save(CommodityClass commodityclass);//保存商品种类

    CommodityClass findById(Integer commodityClassId);//根据商品种类id查找

    int deleteById(Integer commodityClassId);//根据商品种类id删除

    int updateById(CommodityClass commodityClass);//根据商品种类ID更新

    List<CommodityClass> findAll();//分页查询所有的商品种类

    int findAllCount();//查询所有记录数
}
