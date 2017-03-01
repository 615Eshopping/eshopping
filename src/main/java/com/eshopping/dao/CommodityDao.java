package com.eshopping.dao;

import com.eshopping.entity.Commodity;
import com.eshopping.entity.CommodityClass;

import com.eshopping.util.Page;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by AnKh on 2017/2/20.
 */
@Repository
public interface CommodityDao {
    int save(Commodity commodity);//保存商品信息

    int deleteById(Integer commodityId);//根据商品id删除商品信息

    //int deleteByCommodityName(String commodityName);//根据商品名称删除商品信息 名称可能重复 没有意义

    Commodity findById(Integer commodityId);//按ID查找

    int updateById(Commodity commodity);//根据商品id更新商品

    //int updateByCommodityName(Commodity commodity);//根据商品名称更新商品 名称可能重复 没有意义

    List<Commodity> findAll();//分页查询所有的商品

    List<Commodity> findByClass(CommodityClass commodityClass);//分页按照商品类别查询

    int findAllCount();//查询所有记录数

    List<Commodity> findByTime(Long time);//按时间倒序查找

    int findAllCount(CommodityClass commodityClass);//查询分类记录数

}
