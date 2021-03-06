package com.eshopping.service;

import com.eshopping.dto.EUDataGridResult;
import com.eshopping.entity.Commodity;

import java.util.List;

/**
 * Created by AnKh on 2017/3/2.
 */
public interface CommodityService {

    void save(Commodity commodity);

    void deleteById(Integer commodityId);

    void updateById(Commodity commodity);

    EUDataGridResult findAll(int pageNums, int rows);

    Commodity findByCommodityId(Integer commodityId);
}
