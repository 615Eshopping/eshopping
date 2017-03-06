package com.eshopping.dao;

import com.eshopping.entity.CommodityImage;

/**
 * Created by AnKh on 2017/3/6.
 */
public interface CommodityImageDao {
    int addImage(CommodityImage commodityImage);

    int updateDepict(CommodityImage commodityImage);

    int deleteDepict(Integer commodityId);

    CommodityImage getDepict(Integer commodityId);

}
