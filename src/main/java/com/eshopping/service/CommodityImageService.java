package com.eshopping.service;

import com.eshopping.entity.Commodity;
import com.eshopping.entity.CommodityImage;

/**
 * Created by AnKh on 2017/3/8.
 */
public interface CommodityImageService {
    void save(CommodityImage commodityImage);

    CommodityImage findImageByCommodityId(Integer commodityId);
}