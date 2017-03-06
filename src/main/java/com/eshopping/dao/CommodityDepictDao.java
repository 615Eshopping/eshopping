package com.eshopping.dao;

import com.eshopping.entity.CommodityDepict;

/**
 * Created by AnKh on 2017/3/6.
 */
public interface CommodityDepictDao {
    int addDepict(CommodityDepict commodityDepict);

    int updateDepict(CommodityDepict commodityDepict);

    int deleteDepict(Integer commodityId);

    CommodityDepict getDepict(Integer commodityId);
}
