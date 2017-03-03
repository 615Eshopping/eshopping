package com.eshopping.service;

import com.eshopping.entity.CommodityClass;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by AnKh on 2017/3/2.
 */

public interface CommodityClassService {

    void save(CommodityClass commodityClass);

    void deleteByCommodityClassId(Integer commodityClassId);

    void updateByCommodityClassId(CommodityClass commodityClass);

    List<CommodityClass> findAll(int pageNums,int rows);

}
